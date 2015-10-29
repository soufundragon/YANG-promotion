/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.data.impl.schema;

import javax.xml.transform.dom.DOMSource;
import org.onos.yangtools.yang.data.api.YangInstanceIdentifier;
import org.onos.yangtools.yang.data.api.schema.AnyXmlNode;
import org.onos.yangtools.yang.data.api.schema.AugmentationNode;
import org.onos.yangtools.yang.data.api.schema.ChoiceNode;
import org.onos.yangtools.yang.data.api.schema.ContainerNode;
import org.onos.yangtools.yang.data.api.schema.LeafNode;
import org.onos.yangtools.yang.data.api.schema.LeafSetEntryNode;
import org.onos.yangtools.yang.data.api.schema.LeafSetNode;
import org.onos.yangtools.yang.data.api.schema.MapEntryNode;
import org.onos.yangtools.yang.data.api.schema.MapNode;
import org.onos.yangtools.yang.data.api.schema.OrderedMapNode;
import org.onos.yangtools.yang.data.api.schema.UnkeyedListEntryNode;
import org.onos.yangtools.yang.data.api.schema.UnkeyedListNode;
import org.onos.yangtools.yang.data.impl.schema.builder.api.CollectionNodeBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.api.DataContainerNodeAttrBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.api.DataContainerNodeBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.api.ListNodeBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.api.NormalizedNodeAttrBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableAnyXmlNodeBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableAnyXmlNodeSchemaAwareBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableAugmentationNodeBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableAugmentationNodeSchemaAwareBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableChoiceNodeBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableChoiceNodeSchemaAwareBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableContainerNodeBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableContainerNodeSchemaAwareBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableLeafNodeBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableLeafNodeSchemaAwareBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableLeafSetEntryNodeBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableLeafSetEntryNodeSchemaAwareBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableLeafSetNodeBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableLeafSetNodeSchemaAwareBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableMapEntryNodeBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableMapEntryNodeSchemaAwareBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableMapNodeBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableMapNodeSchemaAwareBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableOrderedLeafSetNodeBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableOrderedLeafSetNodeSchemaAwareBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableOrderedMapNodeBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableOrderedMapNodeSchemaAwareBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableUnkeyedListEntryNodeBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableUnkeyedListNodeBuilder;
import org.onos.yangtools.yang.model.api.AnyXmlSchemaNode;
import org.onos.yangtools.yang.model.api.AugmentationSchema;
import org.onos.yangtools.yang.model.api.ChoiceSchemaNode;
import org.onos.yangtools.yang.model.api.ContainerSchemaNode;
import org.onos.yangtools.yang.model.api.LeafListSchemaNode;
import org.onos.yangtools.yang.model.api.LeafSchemaNode;
import org.onos.yangtools.yang.model.api.ListSchemaNode;

public final class Builders {

    private Builders() {
        throw new UnsupportedOperationException("Utilities class should not be instantiated");
    }

    public static <T> NormalizedNodeAttrBuilder<YangInstanceIdentifier.NodeIdentifier, T, LeafNode<T>> leafBuilder() {
        return ImmutableLeafNodeBuilder.create();
    }

    public static <T> NormalizedNodeAttrBuilder<YangInstanceIdentifier.NodeIdentifier, T, LeafNode<T>> leafBuilder(
            final LeafSchemaNode schema) {
        return ImmutableLeafNodeSchemaAwareBuilder.create(schema);
    }

    public static <T> NormalizedNodeAttrBuilder<YangInstanceIdentifier.NodeWithValue, T, LeafSetEntryNode<T>> leafSetEntryBuilder() {
        return ImmutableLeafSetEntryNodeBuilder.create();
    }

    public static <T> NormalizedNodeAttrBuilder<YangInstanceIdentifier.NodeWithValue, T, LeafSetEntryNode<T>> leafSetEntryBuilder(
            final LeafListSchemaNode schema) {
        return ImmutableLeafSetEntryNodeSchemaAwareBuilder.create(schema);
    }

    public static <T> NormalizedNodeAttrBuilder<YangInstanceIdentifier.NodeIdentifier, DOMSource, AnyXmlNode> anyXmlBuilder() {
        return ImmutableAnyXmlNodeBuilder.create();
    }

    public static <T> NormalizedNodeAttrBuilder<YangInstanceIdentifier.NodeIdentifier, DOMSource, AnyXmlNode> anyXmlBuilder(
            final AnyXmlSchemaNode schema) {
        return ImmutableAnyXmlNodeSchemaAwareBuilder.create(schema);
    }

    public static <T> ListNodeBuilder<T,LeafSetEntryNode<T>> leafSetBuilder() {
        return ImmutableLeafSetNodeBuilder.create();
    }

    public static <T> ListNodeBuilder<T,LeafSetEntryNode<T>>  orderedLeafSetBuilder() {
        return ImmutableOrderedLeafSetNodeBuilder.create();
    }

    public static <T> ListNodeBuilder<T,LeafSetEntryNode<T>> orderedLeafSetBuilder(final LeafListSchemaNode schema) {
        return ImmutableOrderedLeafSetNodeSchemaAwareBuilder.<T>create(schema);
    }

    public static <T> ListNodeBuilder<T,LeafSetEntryNode<T>> leafSetBuilder(final LeafSetNode<T> node) {
        return ImmutableLeafSetNodeBuilder.create(node);
    }

    public static <T> ListNodeBuilder<T,LeafSetEntryNode<T>> leafSetBuilder(final LeafListSchemaNode schema) {
        return ImmutableLeafSetNodeSchemaAwareBuilder.<T>create(schema);
    }

    public static <T> ListNodeBuilder<T,LeafSetEntryNode<T>> leafSetBuilder(final LeafListSchemaNode schema, final LeafSetNode<T> node) {
        return ImmutableLeafSetNodeSchemaAwareBuilder.<T>create(schema, node);
    }

    public static DataContainerNodeAttrBuilder<YangInstanceIdentifier.NodeIdentifier, ContainerNode> containerBuilder() {
        return ImmutableContainerNodeBuilder.create();
    }

    public static DataContainerNodeAttrBuilder<YangInstanceIdentifier.NodeIdentifier, ContainerNode> containerBuilder(final ContainerNode node) {
        return ImmutableContainerNodeBuilder.create(node);
    }

    public static DataContainerNodeAttrBuilder<YangInstanceIdentifier.NodeIdentifier, ContainerNode> containerBuilder(
            final ContainerSchemaNode schema) {
        return ImmutableContainerNodeSchemaAwareBuilder.create(schema);
    }

    public static DataContainerNodeAttrBuilder<YangInstanceIdentifier.NodeIdentifier, ContainerNode> containerBuilder(
            final ContainerSchemaNode schema, final ContainerNode node) {
        return ImmutableContainerNodeSchemaAwareBuilder.create(schema, node);
    }

    public static DataContainerNodeAttrBuilder<YangInstanceIdentifier.NodeIdentifierWithPredicates, MapEntryNode> mapEntryBuilder() {
        return ImmutableMapEntryNodeBuilder.create();
    }

    public static DataContainerNodeAttrBuilder<YangInstanceIdentifier.NodeIdentifierWithPredicates, MapEntryNode> mapEntryBuilder(
            final ListSchemaNode schema) {
        return ImmutableMapEntryNodeSchemaAwareBuilder.create(schema);
    }

    public static CollectionNodeBuilder<MapEntryNode, MapNode> mapBuilder() {
        return ImmutableMapNodeBuilder.create();
    }

    public static CollectionNodeBuilder<MapEntryNode, OrderedMapNode> orderedMapBuilder() {
        return ImmutableOrderedMapNodeBuilder.create();
    }

    public static CollectionNodeBuilder<MapEntryNode, OrderedMapNode> orderedMapBuilder(final ListSchemaNode schema) {
        return ImmutableOrderedMapNodeSchemaAwareBuilder.create(schema);
    }

    public static CollectionNodeBuilder<UnkeyedListEntryNode, UnkeyedListNode> unkeyedListBuilder() {
        return ImmutableUnkeyedListNodeBuilder.create();
    }

    public static CollectionNodeBuilder<MapEntryNode, MapNode> mapBuilder(final MapNode node) {
        return ImmutableMapNodeBuilder.create(node);
    }

    public static CollectionNodeBuilder<MapEntryNode, MapNode> mapBuilder(final ListSchemaNode schema) {
        return ImmutableMapNodeSchemaAwareBuilder.create(schema);
    }

    public static CollectionNodeBuilder<MapEntryNode, MapNode> mapBuilder(final ListSchemaNode schema, final MapNode node) {
        return ImmutableMapNodeSchemaAwareBuilder.create(schema, node);
    }

    public static DataContainerNodeBuilder<YangInstanceIdentifier.AugmentationIdentifier, AugmentationNode> augmentationBuilder() {
        return ImmutableAugmentationNodeBuilder.create();
    }

    public static DataContainerNodeBuilder<YangInstanceIdentifier.AugmentationIdentifier, AugmentationNode> augmentationBuilder(final AugmentationSchema schema) {
        return ImmutableAugmentationNodeSchemaAwareBuilder.create(schema);
    }

    public static DataContainerNodeBuilder<YangInstanceIdentifier.NodeIdentifier, ChoiceNode> choiceBuilder() {
        return ImmutableChoiceNodeBuilder.create();
    }

    public static DataContainerNodeBuilder<YangInstanceIdentifier.NodeIdentifier, ChoiceNode> choiceBuilder(final ChoiceSchemaNode schema) {
        return ImmutableChoiceNodeSchemaAwareBuilder.create(schema);
    }

    public static DataContainerNodeAttrBuilder<YangInstanceIdentifier.NodeIdentifier, UnkeyedListEntryNode> unkeyedListEntryBuilder() {
        return ImmutableUnkeyedListEntryNodeBuilder.create();
    }

}
