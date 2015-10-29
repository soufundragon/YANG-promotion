/*
 * Copyright (c) 2015 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.parser.spi.meta;

import javax.annotation.Nullable;
import org.onos.yangtools.yang.model.api.meta.DeclaredStatement;
import org.onos.yangtools.yang.model.api.meta.EffectiveStatement;
import org.onos.yangtools.yang.model.api.meta.IdentifierNamespace;

public interface StatementNamespace<K, D extends DeclaredStatement<?>,E extends EffectiveStatement<?,D>>  extends IdentifierNamespace<K, E>  {
    @Override
    @Nullable E get(K key);

    interface TreeScoped<K, D extends DeclaredStatement<?>,E extends EffectiveStatement<?,D>> extends StatementNamespace<K,D,E> {
        TreeScoped<K,D,E> getParentContext();
    }

    interface TreeBased<K,D extends DeclaredStatement<?>,E extends EffectiveStatement<?,D>> {

    }
}
