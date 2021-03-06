/*
 * Copyright (c) 2014 Brocade Communications Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.onos.yangtools.yang.data.impl.test.codecs;

import static org.junit.Assert.*;
import static org.onos.yangtools.yang.data.impl.test.codecs.TypeDefinitionAwareCodecTestHelper.deserializeWithExpectedIllegalArgEx;
import static org.onos.yangtools.yang.data.impl.test.codecs.TypeDefinitionAwareCodecTestHelper.getCodec;

import java.math.BigInteger;

import org.junit.Test;
import org.onos.yangtools.yang.data.api.codec.Uint64Codec;
import org.onos.yangtools.yang.model.util.Uint64;

/**
 * Unit tests for Uint64CodecString.
 *
 * @author Thomas Pantelis
 */
public class Uint64CodecStringTest {

    @SuppressWarnings("unchecked")
    @Test
    public void testSerialize() {
        Uint64Codec<String> codec = getCodec(Uint64.getInstance(), Uint64Codec.class);

        assertEquals("serialize", "123456789", codec.serialize(BigInteger.valueOf( 123456789 )));
        assertEquals("serialize", "", codec.serialize(null));
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testDeserialize() {
        final String hexa = "0X75EDC78edCBA";
        final String octal = "03536670743556272";
        final String integer = "129664115727546";

        Uint64Codec<String> codec = getCodec(Uint64.getInstance(), Uint64Codec.class);

        assertEquals("deserialize", codec.deserialize(hexa), new BigInteger("75EDC78edCBA", 16));
        assertEquals("deserialize", codec.deserialize(octal), new BigInteger(octal, 8));
        assertEquals("deserialize", codec.deserialize(integer), new BigInteger(integer, 10));

        deserializeWithExpectedIllegalArgEx(codec, "12345o");
        deserializeWithExpectedIllegalArgEx(codec, "");
        deserializeWithExpectedIllegalArgEx(codec, null);
    }
}
