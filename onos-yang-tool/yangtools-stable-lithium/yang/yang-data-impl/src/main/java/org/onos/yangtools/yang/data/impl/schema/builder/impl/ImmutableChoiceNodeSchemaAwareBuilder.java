/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.data.impl.schema.builder.impl;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import org.onos.yangtools.yang.data.api.YangInstanceIdentifier;
import org.onos.yangtools.yang.data.api.schema.ChoiceNode;
import org.onos.yangtools.yang.data.api.schema.DataContainerChild;
import org.onos.yangtools.yang.data.impl.schema.SchemaUtils;
import org.onos.yangtools.yang.data.impl.schema.builder.api.DataContainerNodeBuilder;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.valid.DataNodeContainerValidator;
import org.onos.yangtools.yang.data.impl.schema.builder.impl.valid.DataValidationException;
import org.onos.yangtools.yang.model.api.ChoiceCaseNode;
import org.onos.yangtools.yang.model.api.ChoiceSchemaNode;

public class ImmutableChoiceNodeSchemaAwareBuilder extends ImmutableChoiceNodeBuilder {

    private final ChoiceSchemaNode schema;
    private DataNodeContainerValidator validator;

    protected ImmutableChoiceNodeSchemaAwareBuilder(final ChoiceSchemaNode schema) {
        this.schema = Preconditions.checkNotNull(schema, "Schema was null");
        super.withNodeIdentifier(new YangInstanceIdentifier.NodeIdentifier(schema.getQName()));
    }

    @Override
    public DataContainerNodeBuilder<YangInstanceIdentifier.NodeIdentifier, ChoiceNode> withNodeIdentifier(final YangInstanceIdentifier.NodeIdentifier nodeIdentifier) {
        throw new UnsupportedOperationException("Node identifier created from schema");
    }

    @Override
    public DataContainerNodeBuilder<YangInstanceIdentifier.NodeIdentifier, ChoiceNode> withChild(final DataContainerChild<?, ?> child) {
        if(validator == null) {
            Optional<ChoiceCaseNode> detectedCaseOpt = SchemaUtils.detectCase(schema, child);
            DataValidationException.checkLegalChild(detectedCaseOpt.isPresent(), child.getIdentifier(), schema);
            validator = new DataNodeContainerValidator(detectedCaseOpt.get());
        }

        return super.withChild(validator.validateChild(child));
    }

    @Override
    public ChoiceNode build() {
        // TODO validate when statement
        return super.build();
    }

    public static DataContainerNodeBuilder<YangInstanceIdentifier.NodeIdentifier, ChoiceNode> create(final ChoiceSchemaNode schema) {
        return new ImmutableChoiceNodeSchemaAwareBuilder(schema);
    }
}
