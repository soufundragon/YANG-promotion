/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.data.impl.schema.transform.dom.serializer;

import org.onos.yangtools.yang.data.api.schema.LeafSetEntryNode;
import org.onos.yangtools.yang.data.impl.schema.transform.FromNormalizedNodeSerializer;
import org.onos.yangtools.yang.data.impl.schema.transform.base.serializer.LeafSetNodeBaseSerializer;
import org.onos.yangtools.yang.model.api.LeafListSchemaNode;
import org.w3c.dom.Element;

final class LeafSetNodeDomSerializer extends LeafSetNodeBaseSerializer<Element> {
    private final FromNormalizedNodeSerializer<Element, LeafSetEntryNode<?>, LeafListSchemaNode> leafSetEntryNodeSerializer;

    LeafSetNodeDomSerializer(LeafSetEntryNodeDomSerializer leafSetEntryNodeSerializer) {
        this.leafSetEntryNodeSerializer = leafSetEntryNodeSerializer;
    }

    @Override
    protected FromNormalizedNodeSerializer<Element, LeafSetEntryNode<?>, LeafListSchemaNode> getLeafSetEntryNodeSerializer() {
        return leafSetEntryNodeSerializer;
    }
}
