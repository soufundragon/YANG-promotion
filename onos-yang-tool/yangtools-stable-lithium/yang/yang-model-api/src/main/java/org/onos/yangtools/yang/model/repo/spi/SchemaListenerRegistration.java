/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.model.repo.spi;

import com.google.common.annotations.Beta;
import org.onos.yangtools.concepts.ListenerRegistration;

/**
 * Registration of a SchemaSourceListener.
 */
@Beta
public interface SchemaListenerRegistration extends ListenerRegistration<SchemaSourceListener> {

}
