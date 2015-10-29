/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.onos.yangtools.yang.model.api;

import java.net.URI;
import java.util.Date;

import org.onos.yangtools.yang.common.QNameModule;


public interface ModuleIdentifier {
    /**
     * Returns a {@link QNameModule}, which contains the namespace and
     * the revision of the module.
     *
     * @return QNameModule identifier.
     */
    QNameModule getQNameModule();

    /**
     * Returns the name of the module which is specified as argument of YANG
     * {@link Module <b><font color="#FF0000">module</font></b>} keyword
     *
     * @return string with the name of the module
     */
    String getName();

    /**
     * Returns the namespace of the module which is specified as argument of
     * YANG {@link Module <b><font color="#00FF00">namespace</font></b>}
     * keyword. If you need both namespace and revision, please consider using
     * {@link #getQNameModule()}.
     *
     * @return URI format of the namespace of the module
     */
    URI getNamespace();

    /**
     * Returns the revision date for the module. If you need both namespace and
     * revision, please consider using {@link #getQNameModule()}.
     *
     * @return date of the module revision which is specified as argument of
     *         YANG {@link Module <b><font color="#339900">revison</font></b>}
     *         keyword
     */
    Date getRevision();
}
