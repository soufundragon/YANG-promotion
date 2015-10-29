/*
 * Copyright (c) 2015 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.data.util;

import org.onos.yangtools.yang.common.QName;
import org.onos.yangtools.yang.data.api.YangInstanceIdentifier.NodeIdentifier;
import org.onos.yangtools.yang.data.api.YangInstanceIdentifier.NodeWithValue;
import org.onos.yangtools.yang.data.api.YangInstanceIdentifier.PathArgument;
import org.onos.yangtools.yang.model.api.LeafListSchemaNode;

class UnorderedLeafListMixinContextNode extends AbstractMixinContextNode<NodeIdentifier> {

    private final DataSchemaContextNode<?> innerOp;

    public UnorderedLeafListMixinContextNode(final LeafListSchemaNode potential) {
        super(new NodeIdentifier(potential.getQName()), potential);
        innerOp = new LeafListEntryContextNode(potential);
    }

    @Override
    public DataSchemaContextNode<?> getChild(final PathArgument child) {
        if (child instanceof NodeWithValue) {
            return innerOp;
        }
        return null;
    }

    @Override
    public DataSchemaContextNode<?> getChild(final QName child) {
        if (getIdentifier().getNodeType().equals(child)) {
            return innerOp;
        }
        return null;
    }
}