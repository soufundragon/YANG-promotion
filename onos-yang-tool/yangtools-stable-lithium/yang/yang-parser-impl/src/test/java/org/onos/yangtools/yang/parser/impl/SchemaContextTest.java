/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.parser.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

import com.google.common.collect.ImmutableSet;

import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.onos.yangtools.yang.common.SimpleDateFormatUtil;
import org.onos.yangtools.yang.model.api.Module;
import org.onos.yangtools.yang.model.api.ModuleIdentifier;
import org.onos.yangtools.yang.model.api.SchemaContext;

public class SchemaContextTest {
    @Mock
    private Module oldModule;

    @Mock
    private Module newModule;

    private Map<ModuleIdentifier, String> sources;

    private URI ns;
    private Date oldDate;
    private Date newDate;

    @Before
    public void setUp() throws ParseException, URISyntaxException {
        MockitoAnnotations.initMocks(this);

        ns = new URI("http://abc");
        oldDate = SimpleDateFormatUtil.getRevisionFormat().parse("2014-07-20");
        newDate = SimpleDateFormatUtil.getRevisionFormat().parse("2014-07-22");

        doReturn("abc").when(oldModule).getName();
        doReturn(oldDate).when(oldModule).getRevision();
        doReturn(ns).when(oldModule).getNamespace();
        doReturn("abc").when(newModule).getName();
        doReturn(newDate).when(newModule).getRevision();
        doReturn(ns).when(newModule).getNamespace();

        sources = Collections.emptyMap();
    }

    @Test
    public void testModuleOrdering() {
        SchemaContext sc;
        Module m;

        sc = new SchemaContextImpl(ImmutableSet.of(newModule, oldModule), sources);
        m = sc.findModuleByName("abc", null);
        assertEquals(newDate, m.getRevision());
        m = sc.findModuleByNamespaceAndRevision(ns, null);
        assertEquals(newDate, m.getRevision());

        sc = new SchemaContextImpl(ImmutableSet.of(oldModule, newModule), sources);
        m = sc.findModuleByName("abc", null);
        assertEquals(newDate, m.getRevision());
        m = sc.findModuleByNamespaceAndRevision(ns, null);
        assertEquals(newDate, m.getRevision());
    }


}
