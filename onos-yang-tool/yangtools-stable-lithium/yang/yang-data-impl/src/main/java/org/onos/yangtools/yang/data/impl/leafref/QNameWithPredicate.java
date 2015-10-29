/**
 * Copyright (c) 2015 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.data.impl.leafref;

import java.util.List;
import org.onos.yangtools.yang.common.QName;
import org.onos.yangtools.yang.common.QNameModule;

public interface QNameWithPredicate {

    static final QNameWithPredicate UP_PARENT = new QNameWithPredicateBuilder(
            null, "..").build();

    static final QNameWithPredicate ROOT = new QNameWithPredicateBuilder(
            null, "").build();

    public List<QNamePredicate> getQNamePredicates();

    public QNameModule getModuleQname();

    public String getLocalName();

    public QName getQName();

}