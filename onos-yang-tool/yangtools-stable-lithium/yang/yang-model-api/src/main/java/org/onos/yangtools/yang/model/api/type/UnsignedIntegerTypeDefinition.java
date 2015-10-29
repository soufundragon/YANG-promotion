/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.model.api.type;

import java.util.List;

import org.onos.yangtools.yang.model.api.TypeDefinition;

/**
 * 
 * Contains the method for getting detail data about unsigned integer.
 * 
 * Specifically it is the method for getting the range value.
 * 
 */
public interface UnsignedIntegerTypeDefinition extends TypeDefinition<UnsignedIntegerTypeDefinition> {

    /**
     * Returns range data of the instance of the type
     * <code>UnsignedIntegerTypeDefinition</code>.
     * 
     * @return list of <code>RangeConstraint</code> which represents the YANG
     *         <code>range</code> substatement arguments.
     */
    List<RangeConstraint> getRangeConstraints();
}
