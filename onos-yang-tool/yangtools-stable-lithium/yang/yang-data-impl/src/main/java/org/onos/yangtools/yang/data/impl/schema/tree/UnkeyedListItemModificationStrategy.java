/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.data.impl.schema.tree;

import static com.google.common.base.Preconditions.checkArgument;

import org.onos.yangtools.yang.data.api.schema.NormalizedNode;
import org.onos.yangtools.yang.data.api.schema.UnkeyedListEntryNode;
import org.onos.yangtools.yang.data.api.schema.tree.TreeType;
import org.onos.yangtools.yang.data.impl.schema.builder.api.DataContainerNodeBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.ImmutableUnkeyedListEntryNodeBuilder;
import org.onos.yangtools.yang.model.api.ListSchemaNode;

final class UnkeyedListItemModificationStrategy extends AbstractDataNodeContainerModificationStrategy<ListSchemaNode> {
    UnkeyedListItemModificationStrategy(final ListSchemaNode schemaNode, final TreeType treeType) {
        super(schemaNode, UnkeyedListEntryNode.class, treeType);
    }

    @Override
    @SuppressWarnings("rawtypes")
    protected DataContainerNodeBuilder createBuilder(final NormalizedNode<?, ?> original) {
        checkArgument(original instanceof UnkeyedListEntryNode);
        return ImmutableUnkeyedListEntryNodeBuilder.create((UnkeyedListEntryNode) original);
    }
}