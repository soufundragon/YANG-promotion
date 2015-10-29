/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.data.impl.schema.transform.dom.parser;

import org.onos.yangtools.yang.data.api.YangInstanceIdentifier;
import org.onos.yangtools.yang.data.api.schema.MapEntryNode;
import org.onos.yangtools.yang.data.api.schema.MapNode;
import org.onos.yangtools.yang.data.impl.schema.transform.ToNormalizedNodeParser;
import org.onos.yangtools.yang.data.impl.schema.transform.base.parser.MapNodeBaseParser;
import org.onos.yangtools.yang.model.api.ListSchemaNode;
import org.w3c.dom.Element;

final class MapNodeDomParser extends MapNodeBaseParser<Element> {

    private final MapEntryNodeDomParser mapEntryParser;

    MapNodeDomParser(final MapEntryNodeDomParser mapEntryParser) {
        this.mapEntryParser = mapEntryParser;
    }

    MapNodeDomParser(MapEntryNodeDomParser mapEntryParser, final BuildingStrategy<YangInstanceIdentifier.NodeIdentifier, MapNode> strategy) {
        super(strategy);
        this.mapEntryParser = mapEntryParser;
    }

    @Override
    protected ToNormalizedNodeParser<Element, MapEntryNode, ListSchemaNode> getListEntryNodeParser() {
        return mapEntryParser;
    }

}
