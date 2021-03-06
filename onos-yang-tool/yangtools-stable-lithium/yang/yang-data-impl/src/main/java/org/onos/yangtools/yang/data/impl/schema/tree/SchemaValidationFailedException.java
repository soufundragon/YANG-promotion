/*
 * Copyright (c) 2015 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.onos.yangtools.yang.data.impl.schema.tree;

/**
 * SchemaValidationFailedException is thrown when an attempt is made to modify the data tree and the modification
 * does not match the schema context
 */
public class SchemaValidationFailedException extends IllegalArgumentException {

    private static final long serialVersionUID = 1L;

    public SchemaValidationFailedException(String message){
        super(message);
    }

    public SchemaValidationFailedException(String message, Throwable cause){
        super(message, cause);
    }

}
