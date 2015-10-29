/*
 * Copyright (c) 2015 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.onos.yangtools.yang.data.impl.schema.transform.base.parser;

import java.util.Map;
import javax.annotation.Nullable;
import org.onos.yangtools.yang.common.QName;
import org.onos.yangtools.yang.data.api.YangInstanceIdentifier;
import org.onos.yangtools.yang.data.api.schema.NormalizedNode;
import org.onos.yangtools.yang.data.impl.schema.builder.api.NormalizedNodeBuilder;
import org.onos.yangtools.yang.data.impl.schema.transform.ToNormalizedNodeParser;

/**
 * Extensible parser allows its subclasses to customize the building process of normalized nodes
 *
 * @param <P>
 * @param <E>
 * @param <N>
 * @param <S>
 */
public interface ExtensibleParser<P extends YangInstanceIdentifier.PathArgument, E, N extends NormalizedNode<P, ?>, S>
        extends ToNormalizedNodeParser<E, N, S> {

    /**
     * Provide building strategy
     */
    BuildingStrategy<P, N> getBuildingStrategy();

    /**
     * Building strategy serves as a set of hooks into the parsing process.
     *
     * @param <P>
     * @param <N>
     */
    interface BuildingStrategy<P extends YangInstanceIdentifier.PathArgument, N extends NormalizedNode<P, ?>> {

        /**
         * Build normalized node from its builder
         *
         * @param builder filled builder for node
         * @return built normalized node or null if the node should not be built
         */
        @Nullable N build(NormalizedNodeBuilder<P, ?, N> builder);

        /**
         * Hook for subclasses to handle attributes associated with current node. This is called before the build method
         * and allows subclasses to react to node's attributes e.g. modification operation
         *
         * @param attributes attributes for node
         * @param containerBuilder builder created for node. Can be modified according to attributes e.g. remove attribute
         */
        void prepareAttributes(Map<QName, String> attributes, NormalizedNodeBuilder<P, ?, N> containerBuilder);
    }
}
