/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.data.impl.schema.builder.impl;

import java.util.Collections;
import java.util.Map;

import org.onos.yangtools.yang.common.QName;
import org.onos.yangtools.yang.data.api.YangInstanceIdentifier;
import org.onos.yangtools.yang.data.api.schema.NormalizedNode;
import org.onos.yangtools.yang.data.impl.schema.builder.api.NormalizedNodeAttrBuilder;

abstract class AbstractImmutableNormalizedNodeBuilder<I extends YangInstanceIdentifier.PathArgument, V, R extends NormalizedNode<I, ?>>
        implements NormalizedNodeAttrBuilder<I,V,R> {

    private Map<QName, String> attributes = Collections.emptyMap();
    private I nodeIdentifier;
    private V value;

    protected final I getNodeIdentifier() {
        return nodeIdentifier;
    }

    protected final V getValue() {
        return value;
    }

    protected final Map<QName, String> getAttributes() {
        return attributes;
    }

    @Override
    public NormalizedNodeAttrBuilder<I,V,R> withValue(final V value) {
        this.value = value;
        return this;
    }

    @Override
    public NormalizedNodeAttrBuilder<I,V,R> withNodeIdentifier(final I nodeIdentifier) {
        this.nodeIdentifier = nodeIdentifier;
        return this;
    }

    @Override
    public NormalizedNodeAttrBuilder<I,V,R> withAttributes(final Map<QName, String> attributes){
        this.attributes = attributes;
        return this;
    }
}
