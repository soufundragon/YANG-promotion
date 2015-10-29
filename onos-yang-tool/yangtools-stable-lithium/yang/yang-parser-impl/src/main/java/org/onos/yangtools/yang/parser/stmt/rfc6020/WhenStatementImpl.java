/**
 * Copyright (c) 2015 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.parser.stmt.rfc6020;

import org.onos.yangtools.yang.parser.stmt.rfc6020.effective.WhenEffectiveStatementImpl;

import org.onos.yangtools.yang.model.api.RevisionAwareXPath;
import org.onos.yangtools.yang.model.api.Rfc6020Mapping;
import org.onos.yangtools.yang.model.api.meta.EffectiveStatement;
import org.onos.yangtools.yang.model.api.stmt.DescriptionStatement;
import org.onos.yangtools.yang.model.api.stmt.ReferenceStatement;
import org.onos.yangtools.yang.model.api.stmt.WhenStatement;
import org.onos.yangtools.yang.model.util.RevisionAwareXPathImpl;
import org.onos.yangtools.yang.parser.spi.meta.AbstractDeclaredStatement;
import org.onos.yangtools.yang.parser.spi.meta.AbstractStatementSupport;
import org.onos.yangtools.yang.parser.spi.meta.StmtContext;
import org.onos.yangtools.yang.parser.spi.source.SourceException;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class WhenStatementImpl extends AbstractDeclaredStatement<RevisionAwareXPath> implements
        WhenStatement {

    protected WhenStatementImpl(
            StmtContext<RevisionAwareXPath, WhenStatement, ?> context) {
        super(context);
    }

    public static class Definition extends AbstractStatementSupport<RevisionAwareXPath,WhenStatement,EffectiveStatement<RevisionAwareXPath,WhenStatement>> {

        public Definition() {
            super(Rfc6020Mapping.WHEN);
        }

        @Override public RevisionAwareXPath parseArgumentValue(
                StmtContext<?, ?, ?> ctx, String value) throws SourceException {
            return new RevisionAwareXPathImpl(value, false);
        }

        @Override public WhenStatement createDeclared(
                StmtContext<RevisionAwareXPath, WhenStatement, ?> ctx) {
            return new WhenStatementImpl(ctx);
        }

        @Override public EffectiveStatement<RevisionAwareXPath, WhenStatement> createEffective(
                StmtContext<RevisionAwareXPath, WhenStatement, EffectiveStatement<RevisionAwareXPath, WhenStatement>> ctx) {
            return new WhenEffectiveStatementImpl(ctx);
        }
    }

    @Nonnull @Override
    public RevisionAwareXPath getCondition() {
        return argument();
    }

    @Nullable @Override
    public DescriptionStatement getDescription() {
        return firstDeclared(DescriptionStatement.class);
    }

    @Nullable @Override
    public ReferenceStatement getReference() {
        return firstDeclared(ReferenceStatement.class);
    }
}
