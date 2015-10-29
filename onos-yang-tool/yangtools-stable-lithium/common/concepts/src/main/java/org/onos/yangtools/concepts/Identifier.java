/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.concepts;

import java.io.Serializable;

/**
 * General identifier interface. It is primarily a marker for all things that
 * identify concepts -- such as names, addresses, classes, etc. We do not
 * require too much, just that the identifiers are serializable (and this
 * transferable).
 */
public interface Identifier extends Serializable, Immutable {

}

