/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.data.impl.schema.transform;

import org.onos.yangtools.yang.data.api.schema.AnyXmlNode;
import org.onos.yangtools.yang.data.api.schema.AugmentationNode;
import org.onos.yangtools.yang.data.api.schema.ChoiceNode;
import org.onos.yangtools.yang.data.api.schema.ContainerNode;
import org.onos.yangtools.yang.data.api.schema.LeafNode;
import org.onos.yangtools.yang.data.api.schema.LeafSetEntryNode;
import org.onos.yangtools.yang.data.api.schema.LeafSetNode;
import org.onos.yangtools.yang.data.api.schema.MapEntryNode;
import org.onos.yangtools.yang.data.api.schema.MapNode;
import org.onos.yangtools.yang.data.api.schema.UnkeyedListNode;
import org.onos.yangtools.yang.model.api.AnyXmlSchemaNode;
import org.onos.yangtools.yang.model.api.AugmentationSchema;
import org.onos.yangtools.yang.model.api.ChoiceSchemaNode;
import org.onos.yangtools.yang.model.api.ContainerSchemaNode;
import org.onos.yangtools.yang.model.api.LeafListSchemaNode;
import org.onos.yangtools.yang.model.api.LeafSchemaNode;
import org.onos.yangtools.yang.model.api.ListSchemaNode;

/**
 * Factory for different normalized node serializers.
 *
 * @param <E>
 *            type of resulting/serialized element from NormalizedNode
 */
public interface FromNormalizedNodeSerializerFactory<E> {
    FromNormalizedNodeSerializer<E, AugmentationNode, AugmentationSchema> getAugmentationNodeSerializer();
    FromNormalizedNodeSerializer<E, ChoiceNode, ChoiceSchemaNode> getChoiceNodeSerializer();
    FromNormalizedNodeSerializer<E, ContainerNode, ContainerSchemaNode> getContainerNodeSerializer();
    FromNormalizedNodeSerializer<E, LeafNode<?>, LeafSchemaNode> getLeafNodeSerializer();
    FromNormalizedNodeSerializer<E, LeafSetEntryNode<?>, LeafListSchemaNode> getLeafSetEntryNodeSerializer();
    FromNormalizedNodeSerializer<E, LeafSetNode<?>, LeafListSchemaNode> getLeafSetNodeSerializer();
    FromNormalizedNodeSerializer<E, MapEntryNode, ListSchemaNode> getMapEntryNodeSerializer();
    FromNormalizedNodeSerializer<E, MapNode, ListSchemaNode> getMapNodeSerializer();
    FromNormalizedNodeSerializer<E, UnkeyedListNode, ListSchemaNode> getUnkeyedListNodeSerializer();
    FromNormalizedNodeSerializer<E, AnyXmlNode, AnyXmlSchemaNode> getAnyXmlNodeSerializer();
}
