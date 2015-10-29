/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.data.impl.schema.builder.impl;

import java.util.Map;

import org.onos.yangtools.yang.common.QName;
import org.onos.yangtools.yang.data.api.YangInstanceIdentifier;
import org.onos.yangtools.yang.data.api.schema.DataContainerChild;
import org.onos.yangtools.yang.data.api.schema.UnkeyedListEntryNode;
import org.onos.yangtools.yang.data.impl.schema.builder.api.DataContainerNodeAttrBuilder;
import org.onos.yangtools.yang.data.impl.schema.nodes.AbstractImmutableDataContainerAttrNode;

public class ImmutableUnkeyedListEntryNodeBuilder extends AbstractImmutableDataContainerNodeAttrBuilder<YangInstanceIdentifier.NodeIdentifier, UnkeyedListEntryNode> {

    protected ImmutableUnkeyedListEntryNodeBuilder() {
        super();
    }

    protected ImmutableUnkeyedListEntryNodeBuilder(final int sizeHint) {
        super(sizeHint);
    }

    protected ImmutableUnkeyedListEntryNodeBuilder(final ImmutableUnkeyedListEntryNode node) {
        super(node);
    }

    public static DataContainerNodeAttrBuilder<YangInstanceIdentifier.NodeIdentifier, UnkeyedListEntryNode> create() {
        return new ImmutableUnkeyedListEntryNodeBuilder();
    }

    public static DataContainerNodeAttrBuilder<YangInstanceIdentifier.NodeIdentifier, UnkeyedListEntryNode> create(final int sizeHint) {
        return new ImmutableUnkeyedListEntryNodeBuilder(sizeHint);
    }

    public static DataContainerNodeAttrBuilder<YangInstanceIdentifier.NodeIdentifier, UnkeyedListEntryNode> create(final UnkeyedListEntryNode node) {
        if (!(node instanceof ImmutableUnkeyedListEntryNode)) {
            throw new UnsupportedOperationException(String.format("Cannot initialize from class %s", node.getClass()));
        }
        return new ImmutableUnkeyedListEntryNodeBuilder((ImmutableUnkeyedListEntryNode) node);
    }

    @Override
    public UnkeyedListEntryNode build() {
        return new ImmutableUnkeyedListEntryNode(getNodeIdentifier(), buildValue(), getAttributes());
    }

    protected static final class ImmutableUnkeyedListEntryNode extends AbstractImmutableDataContainerAttrNode<YangInstanceIdentifier.NodeIdentifier> implements UnkeyedListEntryNode {

        ImmutableUnkeyedListEntryNode(
                final YangInstanceIdentifier.NodeIdentifier nodeIdentifier,
                final Map<YangInstanceIdentifier.PathArgument, DataContainerChild<? extends YangInstanceIdentifier.PathArgument, ?>> children,
                final Map<QName, String> attributes) {
            super(children, nodeIdentifier, attributes);
        }
    }
}
