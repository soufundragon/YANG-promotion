/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.binding.generator.util.generated.type.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.onos.yangtools.binding.generator.util.Types;
import org.onos.yangtools.sal.binding.model.api.AccessModifier;
import org.onos.yangtools.sal.binding.model.api.AnnotationType;
import org.onos.yangtools.sal.binding.model.api.MethodSignature.Parameter;
import org.onos.yangtools.sal.binding.model.api.Type;

public class MethodSignatureImplTest {

    MethodSignatureImpl signature1, signature2, signature3, signature4;
    int hash1, hash4;

    @Before
    public void setup() {
        Type type = Types.STRING;
        String name = "customMethod";
        List<AnnotationType> annotations = new ArrayList<>();
        String comment = "This is just a comment";
        AccessModifier accessModifier = AccessModifier.PUBLIC;
        Type returnType = Types.STRING;
        List<Parameter> params = new ArrayList<>();
        boolean isFinal = false;
        boolean isAbstract = false;
        boolean isStatic = false;

        signature1 = new MethodSignatureImpl(type, name, annotations, comment,
                accessModifier, returnType, params, isFinal, isAbstract,
                isStatic);
        signature2 = new MethodSignatureImpl(type, name, annotations, comment,
                accessModifier, returnType, params, isFinal, isAbstract,
                isStatic);
        returnType = null;
        signature3 = new MethodSignatureImpl(type, name, annotations, comment,
                accessModifier, returnType, params, isFinal, isAbstract,
                isStatic);
        name = null;
        signature4 = new MethodSignatureImpl(type, name, annotations, comment,
                accessModifier, returnType, params, isFinal, isAbstract,
                isStatic);

        hash1 = signature1.hashCode();
        hash4 = signature4.hashCode();
    }

    @Test
    public void testToString() {
        String toString = signature1.toString();
        assertTrue(toString.contains("MethodSignatureImpl"));
    }

    @Test
    public void testHashCode() {
        assertEquals(hash1, hash1);
        assertTrue(!(hash1 == hash4));
    }

    @Test
    public void testEquals() {
        assertTrue(signature1.equals(signature1));
        assertTrue(signature1.equals(signature2));
        assertFalse(signature1.equals(signature3));
        assertFalse(signature3.equals(signature1));
        assertFalse(signature1.equals(null));
        assertFalse(signature1.equals(signature4));
        assertFalse(signature4.equals(signature1));
        assertFalse(signature1.equals(Types.STRING));
    }

}
