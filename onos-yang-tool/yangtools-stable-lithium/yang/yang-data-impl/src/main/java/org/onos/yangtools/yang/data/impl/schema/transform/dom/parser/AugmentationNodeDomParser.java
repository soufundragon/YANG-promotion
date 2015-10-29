/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.data.impl.schema.transform.dom.parser;

import com.google.common.base.Preconditions;
import com.google.common.collect.LinkedListMultimap;
import org.onos.yangtools.yang.common.QName;
import org.onos.yangtools.yang.data.api.YangInstanceIdentifier;
import org.onos.yangtools.yang.data.api.schema.AugmentationNode;
import org.onos.yangtools.yang.data.impl.schema.transform.base.parser.AugmentationNodeBaseParser;
import org.onos.yangtools.yang.data.impl.schema.transform.base.parser.NodeParserDispatcher;
import org.onos.yangtools.yang.data.impl.schema.transform.dom.DomUtils;
import org.w3c.dom.Element;

final class AugmentationNodeDomParser extends AugmentationNodeBaseParser<Element> {

    private final NodeParserDispatcher<Element> dispatcher;
    private final boolean strictParsing;

    AugmentationNodeDomParser(final NodeParserDispatcher<Element> dispatcher) {
        this.dispatcher = Preconditions.checkNotNull(dispatcher);
        this.strictParsing = super.strictParsing();
    }

    AugmentationNodeDomParser(final NodeParserDispatcher<Element> dispatcher, final boolean strictParsing) {
        this.dispatcher = Preconditions.checkNotNull(dispatcher);
        this.strictParsing = strictParsing;
    }

    public AugmentationNodeDomParser(final BuildingStrategy<YangInstanceIdentifier.AugmentationIdentifier, AugmentationNode> buildingStrategy,
                                     final NodeParserDispatcher<Element> dispatcher, final boolean strictParsing) {
        super(buildingStrategy);
        this.dispatcher = Preconditions.checkNotNull(dispatcher);
        this.strictParsing = strictParsing;
    }

    @Override
    protected LinkedListMultimap<QName, Element> mapChildElements(Iterable<Element> elements) {
        return DomUtils.mapChildElements(elements);
    }

    @Override
    protected NodeParserDispatcher<Element> getDispatcher() {
        return dispatcher;
    }

    @Override
    protected boolean strictParsing() {
        return strictParsing;
    }
}
