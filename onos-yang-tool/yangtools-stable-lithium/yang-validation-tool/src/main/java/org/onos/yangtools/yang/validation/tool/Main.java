/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.yang.validation.tool;

import java.io.File;
import java.net.URISyntaxException;
import java.util.Arrays;
import org.onos.yangtools.yang.parser.impl.YangParserImpl;

public final class Main {
    private Main() {

    }

    public static void main(final String[] args) throws URISyntaxException {
        final Params params = ParamsUtil.parseArgs(args, Params.getParser());
        final YangParserImpl yangParser = new YangParserImpl();

        if (params.isValid()) {
            final File[] yangModels = params.getYangSourceDir().listFiles();

            try {
                yangParser.parseFiles(Arrays.asList(yangModels));
            } catch (Exception e) {

            }
        }
    }
}
