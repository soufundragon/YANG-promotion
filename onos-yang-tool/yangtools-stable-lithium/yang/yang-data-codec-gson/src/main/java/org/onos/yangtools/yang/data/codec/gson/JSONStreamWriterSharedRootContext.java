/*
 * Copyright (c) 2015 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.data.codec.gson;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;

final class JSONStreamWriterSharedRootContext extends JSONStreamWriterRootContext {
    JSONStreamWriterSharedRootContext(final URI namespace) {
        super(namespace);
    }

    @Override
    protected void emitEnd(final JsonWriter writer) throws IOException {
        // NOOP
    }
}
