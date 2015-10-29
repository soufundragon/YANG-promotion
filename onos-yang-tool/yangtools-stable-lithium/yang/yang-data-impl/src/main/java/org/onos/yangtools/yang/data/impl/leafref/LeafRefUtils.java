/**
 * Copyright (c) 2015 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.data.impl.leafref;

import java.util.Iterator;
import java.util.LinkedList;
import org.onos.yangtools.yang.common.QName;
import org.onos.yangtools.yang.model.api.ChoiceCaseNode;
import org.onos.yangtools.yang.model.api.ChoiceSchemaNode;
import org.onos.yangtools.yang.model.api.DataNodeContainer;
import org.onos.yangtools.yang.model.api.DataSchemaNode;
import org.onos.yangtools.yang.model.api.LeafListSchemaNode;
import org.onos.yangtools.yang.model.api.LeafSchemaNode;
import org.onos.yangtools.yang.model.api.Module;
import org.onos.yangtools.yang.model.api.SchemaPath;

public class LeafRefUtils {

    /**
     * @param leafRefPath
     * @param contextNodeSchemaPath
     * @return
     */
    public static LeafRefPath createAbsoluteLeafRefPath(
            final LeafRefPath leafRefPath, final SchemaPath contextNodeSchemaPath,
            final Module module) {

        if (leafRefPath.isAbsolute())
            return leafRefPath;

        final LinkedList<QNameWithPredicate> absoluteLeafRefTargetPathList = schemaPathToXPathQNames(
                contextNodeSchemaPath, module);

        final Iterable<QNameWithPredicate> leafRefTargetPathFromRoot = leafRefPath
                .getPathFromRoot();
        final Iterator<QNameWithPredicate> leafRefTgtPathFromRootIterator = leafRefTargetPathFromRoot
                .iterator();

        while (leafRefTgtPathFromRootIterator.hasNext()) {
            final QNameWithPredicate qname = leafRefTgtPathFromRootIterator.next();
            if (qname.equals(QNameWithPredicate.UP_PARENT)) {
                absoluteLeafRefTargetPathList.removeLast();
            } else {
                absoluteLeafRefTargetPathList.add(qname);
            }
        }

        return LeafRefPath.create(absoluteLeafRefTargetPathList, true);
    }

    /**
     * @param currentNodePath
     * @param module
     * @param absoluteLeafRefTargetPathList
     */
    private static LinkedList<QNameWithPredicate> schemaPathToXPathQNames(
            final SchemaPath nodePath, final Module module) {

        final LinkedList<QNameWithPredicate> xpath = new LinkedList<QNameWithPredicate>();

        final Iterator<QName> nodePathIterator = nodePath.getPathFromRoot()
                .iterator();

        DataNodeContainer currenDataNodeContainer = module;
        while (nodePathIterator.hasNext()) {
            final QName qname = nodePathIterator.next();
            final DataSchemaNode child = currenDataNodeContainer
                    .getDataChildByName(qname);

            if (child instanceof DataNodeContainer) {
                if (!(child instanceof ChoiceCaseNode)) {
                    final QNameWithPredicate newQName = new QNameWithPredicateBuilder(
                            qname.getModule(), qname.getLocalName()).build();
                    xpath.add(newQName);
                }
                currenDataNodeContainer = (DataNodeContainer) child;
            } else if (child instanceof ChoiceSchemaNode) {
                if (nodePathIterator.hasNext()) {
                    currenDataNodeContainer = ((ChoiceSchemaNode) child)
                            .getCaseNodeByName(nodePathIterator.next());
                } else {
                    break;
                }
            } else if (child instanceof LeafSchemaNode
                    || child instanceof LeafListSchemaNode) {

                final QNameWithPredicate newQName = new QNameWithPredicateBuilder(
                        qname.getModule(), qname.getLocalName()).build();
                xpath.add(newQName);
                break;

            } else if (child == null) {
                throw new IllegalArgumentException("No child " + qname
                        + " found in node container " + currenDataNodeContainer
                        + " in module " + module.getName());
            } else {
                throw new IllegalStateException(
                        "Illegal schema node type in the path: "
                                + child.getClass());
            }
        }

        return xpath;
    }

    public static LeafRefPath schemaPathToLeafRefPath(final SchemaPath nodePath,
            final Module module) {
        final LinkedList<QNameWithPredicate> xpathQNames = schemaPathToXPathQNames(
                nodePath, module);
        return LeafRefPath.create(xpathQNames, true);
    }

}
