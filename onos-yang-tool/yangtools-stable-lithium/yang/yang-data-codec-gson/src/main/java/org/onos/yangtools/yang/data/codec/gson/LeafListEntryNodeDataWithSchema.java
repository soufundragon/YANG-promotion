/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.data.codec.gson;

import java.io.IOException;

import org.onos.yangtools.yang.data.api.schema.stream.NormalizedNodeStreamWriter;
import org.onos.yangtools.yang.model.api.DataSchemaNode;

class LeafListEntryNodeDataWithSchema extends SimpleNodeDataWithSchema {
    public LeafListEntryNodeDataWithSchema(final DataSchemaNode dataSchemaNode) {
        super(dataSchemaNode);
    }

    @Override
    public void write(final NormalizedNodeStreamWriter writer) throws IOException {
        writer.leafSetEntryNode(getValue());
    }
}
