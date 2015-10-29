/**
 * Copyright (c) 2015 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.data.impl.leafref.context.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.Set;
import org.junit.BeforeClass;
import org.junit.Test;
import org.onos.yangtools.yang.common.QName;
import org.onos.yangtools.yang.common.QNameModule;
import org.onos.yangtools.yang.data.impl.leafref.LeafRefContext;
import org.onos.yangtools.yang.data.impl.leafref.LeafRefContextUtils;
import org.onos.yangtools.yang.data.impl.leafref.LeafRefYangSyntaxErrorException;
import org.onos.yangtools.yang.model.api.DataNodeContainer;
import org.onos.yangtools.yang.model.api.DataSchemaNode;
import org.onos.yangtools.yang.model.api.Module;
import org.onos.yangtools.yang.model.api.SchemaContext;
import org.onos.yangtools.yang.model.parser.api.YangSyntaxErrorException;
import org.onos.yangtools.yang.parser.impl.YangParserImpl;

public class LeafRefContextTest {

    private static SchemaContext context;
    private static Module rootMod;
    private static QNameModule root;
    private static LeafRefContext rootLeafRefContext;

    @BeforeClass
    public static void init() throws URISyntaxException, IOException,
            YangSyntaxErrorException, LeafRefYangSyntaxErrorException {

        final File resourceFile = new File(
                LeafRefContextTreeBuilderTest.class
                        .getResource(
                                "/leafref-context-test/correct-modules/leafref-test2.yang")
                        .toURI());

        final File resourceDir = resourceFile.getParentFile();

        final YangParserImpl parser = YangParserImpl.getInstance();
        context = parser.parseFile(resourceFile, resourceDir);

        final Set<Module> modules = context.getModules();
        for (final Module module : modules) {
            if (module.getName().equals("leafref-test2")) {
                rootMod = module;
            }
        }

        root = rootMod.getQNameModule();
        rootLeafRefContext = LeafRefContext.create(context);
    }

    @Test
    public void test() {

        final QName q1 = QName.create(root, "ref1");
        final QName q2 = QName.create(root, "leaf1");
        final QName q3 = QName.create(root, "cont1");
        final QName q4 = QName.create(root, "cont2");
        final QName q5 = QName.create(root, "list1");
        final QName q6 = QName.create(root, "name");

        final DataSchemaNode leafRefNode = rootMod.getDataChildByName(q1);
        final DataSchemaNode targetNode = rootMod.getDataChildByName(q2);
        final DataSchemaNode cont1Node = rootMod.getDataChildByName(q3);
        final DataSchemaNode cont2Node = rootMod.getDataChildByName(q4);
        final DataSchemaNode name1Node = ((DataNodeContainer) ((DataNodeContainer) rootMod
                .getDataChildByName(q3)).getDataChildByName(q5))
                .getDataChildByName(q6);

        assertTrue(LeafRefContextUtils.isLeafRef(leafRefNode,
                rootLeafRefContext));
        assertFalse(LeafRefContextUtils.isLeafRef(targetNode,
                rootLeafRefContext));

        assertTrue(LeafRefContextUtils.hasLeafRefChild(cont1Node,
                rootLeafRefContext));
        assertFalse(LeafRefContextUtils.hasLeafRefChild(leafRefNode,
                rootLeafRefContext));

        assertTrue(LeafRefContextUtils.isReferencedByLeafRef(targetNode,
                rootLeafRefContext));
        assertFalse(LeafRefContextUtils.isReferencedByLeafRef(leafRefNode,
                rootLeafRefContext));

        assertTrue(LeafRefContextUtils.hasChildReferencedByLeafRef(cont2Node,
                rootLeafRefContext));
        assertFalse(LeafRefContextUtils.hasChildReferencedByLeafRef(
                leafRefNode, rootLeafRefContext));

        Map<QName, LeafRefContext> leafRefs = LeafRefContextUtils
                .getAllLeafRefsReferencingThisNode(name1Node,
                        rootLeafRefContext);
        assertEquals(4, leafRefs.size());
        leafRefs = LeafRefContextUtils.getAllLeafRefsReferencingThisNode(
                leafRefNode, rootLeafRefContext);
        assertTrue(leafRefs.isEmpty());
    }
}
