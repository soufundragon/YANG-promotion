/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.data.impl.schema.tree;

import org.onos.yangtools.yang.data.api.schema.LeafSetEntryNode;
import org.onos.yangtools.yang.model.api.LeafListSchemaNode;

final class LeafSetEntryModificationStrategy extends AbstractValueNodeModificationStrategy<LeafListSchemaNode> {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    LeafSetEntryModificationStrategy(final LeafListSchemaNode schema) {
        super(schema, (Class) LeafSetEntryNode.class);
    }
}