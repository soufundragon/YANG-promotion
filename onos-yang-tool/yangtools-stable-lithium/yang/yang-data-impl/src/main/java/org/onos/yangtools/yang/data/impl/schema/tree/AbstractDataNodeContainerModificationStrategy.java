/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.data.impl.schema.tree;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.util.concurrent.ExecutionException;
import org.onos.yangtools.yang.data.api.YangInstanceIdentifier.AugmentationIdentifier;
import org.onos.yangtools.yang.data.api.YangInstanceIdentifier.PathArgument;
import org.onos.yangtools.yang.data.api.schema.NormalizedNode;
import org.onos.yangtools.yang.data.api.schema.tree.TreeType;
import org.onos.yangtools.yang.data.impl.schema.builder.api.DataContainerNodeBuilder;
import org.onos.yangtools.yang.model.api.AugmentationTarget;
import org.onos.yangtools.yang.model.api.DataNodeContainer;
import org.onos.yangtools.yang.model.api.DataSchemaNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Base strategy for applying changes to a ContainerNode, irrespective of its
 * actual type.
 *
 * @param <T> Type of the container node
 */
abstract class AbstractDataNodeContainerModificationStrategy<T extends DataNodeContainer> extends AbstractNodeContainerModificationStrategy {
    private static final Logger LOG = LoggerFactory.getLogger(AbstractDataNodeContainerModificationStrategy.class);
    private final LoadingCache<PathArgument, ModificationApplyOperation> childCache = CacheBuilder.newBuilder()
            .build(new CacheLoader<PathArgument, ModificationApplyOperation>() {
                @Override
                public ModificationApplyOperation load(final PathArgument key) {
                    if (key instanceof AugmentationIdentifier && schema instanceof AugmentationTarget) {
                        return SchemaAwareApplyOperation.from(schema, (AugmentationTarget) schema, (AugmentationIdentifier) key, treeType);
                    }

                    final DataSchemaNode child = schema.getDataChildByName(key.getNodeType());
                    Preconditions.checkArgument(child != null, "Schema %s does not have a node for child %s", schema, key.getNodeType());
                    return SchemaAwareApplyOperation.from(child, treeType);
                }
            });
    private final T schema;
    private final TreeType treeType;

    protected AbstractDataNodeContainerModificationStrategy(final T schema, final Class<? extends NormalizedNode<?, ?>> nodeClass, final TreeType treeType) {
        super(nodeClass, treeType);
        this.schema = Preconditions.checkNotNull(schema,"schema");
        this.treeType = Preconditions.checkNotNull(treeType,"treeType");
    }

    protected final T getSchema() {
        return schema;
    }

    @Override
    public final Optional<ModificationApplyOperation> getChild(final PathArgument identifier) {
        try {
            return Optional.<ModificationApplyOperation> fromNullable(childCache.get(identifier));
        } catch (ExecutionException | UncheckedExecutionException e) {
            LOG.trace("Child {} not present in container schema {} children {}", identifier, this, schema.getChildNodes(), e.getCause());
            return Optional.absent();
        }
    }

    @Override
    @SuppressWarnings("rawtypes")
    protected abstract DataContainerNodeBuilder createBuilder(NormalizedNode<?, ?> original);

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [" + schema + "]";
    }
}
