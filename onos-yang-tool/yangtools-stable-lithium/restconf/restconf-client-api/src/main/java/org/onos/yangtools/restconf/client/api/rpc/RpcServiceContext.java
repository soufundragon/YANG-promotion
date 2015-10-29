/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.restconf.client.api.rpc;

import org.onos.yangtools.yang.binding.RpcService;

public interface RpcServiceContext<T extends RpcService> extends AutoCloseable {
	T getRpcService();

	@Override
	void close();
}
