/*
 * Copyright (c) 2015 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.binding.data.codec.impl;

import org.onos.yangtools.yang.data.api.schema.NormalizedNode;
import org.onos.yangtools.yang.data.impl.schema.ImmutableNormalizedNodeStreamWriter;
import org.onos.yangtools.yang.data.impl.schema.NormalizedNodeResult;

final class NormalizedNodeWriterWithAddChild extends ImmutableNormalizedNodeStreamWriter {

    NormalizedNodeWriterWithAddChild(final NormalizedNodeResult result) {
        super(result);
    }

    void addChild(final NormalizedNode<?, ?> child) {
        this.writeChild(child);
    }
}
