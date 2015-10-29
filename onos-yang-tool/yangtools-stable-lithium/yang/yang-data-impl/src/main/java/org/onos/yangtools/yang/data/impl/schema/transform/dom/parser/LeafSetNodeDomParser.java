/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.data.impl.schema.transform.dom.parser;

import org.onos.yangtools.yang.data.api.schema.LeafSetEntryNode;
import org.onos.yangtools.yang.data.impl.schema.transform.ToNormalizedNodeParser;
import org.onos.yangtools.yang.data.impl.schema.transform.base.parser.LeafSetNodeBaseParser;
import org.onos.yangtools.yang.model.api.LeafListSchemaNode;
import org.w3c.dom.Element;

final class LeafSetNodeDomParser extends LeafSetNodeBaseParser<Element> {

    private final LeafSetEntryNodeDomParser leafSetEntryNodeBaseParser;

    LeafSetNodeDomParser(LeafSetEntryNodeDomParser leafSetEntryNodeBaseParser) {
        this.leafSetEntryNodeBaseParser = leafSetEntryNodeBaseParser;
    }

    @Override
    protected ToNormalizedNodeParser<Element, LeafSetEntryNode<?>, LeafListSchemaNode> getLeafSetEntryNodeParser() {
        return leafSetEntryNodeBaseParser;
    }
}
