/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onos.yangtools.sal.java.api.generator.test;

import static org.junit.Assert.assertTrue;
import static org.onos.yangtools.sal.java.api.generator.test.CompilationTestUtils.BASE_PKG;
import static org.onos.yangtools.sal.java.api.generator.test.CompilationTestUtils.COMPILER_OUTPUT_PATH;
import static org.onos.yangtools.sal.java.api.generator.test.CompilationTestUtils.FS;
import static org.onos.yangtools.sal.java.api.generator.test.CompilationTestUtils.GENERATOR_OUTPUT_PATH;
import static org.onos.yangtools.sal.java.api.generator.test.CompilationTestUtils.NS_BAR;
import static org.onos.yangtools.sal.java.api.generator.test.CompilationTestUtils.NS_BAZ;
import static org.onos.yangtools.sal.java.api.generator.test.CompilationTestUtils.NS_FOO;
import static org.onos.yangtools.sal.java.api.generator.test.CompilationTestUtils.assertFilesCount;
import static org.onos.yangtools.sal.java.api.generator.test.CompilationTestUtils.assertImplementsIfc;
import static org.onos.yangtools.sal.java.api.generator.test.CompilationTestUtils.cleanUp;
import static org.onos.yangtools.sal.java.api.generator.test.CompilationTestUtils.getSourceFiles;
import static org.onos.yangtools.sal.java.api.generator.test.CompilationTestUtils.testAugmentation;
import static org.onos.yangtools.sal.java.api.generator.test.CompilationTestUtils.testCompilation;
import com.google.common.collect.ImmutableSet;
import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;
import org.junit.Test;
import org.onos.yangtools.sal.binding.model.api.Type;
import org.onos.yangtools.sal.java.api.generator.GeneratorJavaFile;
import org.onos.yangtools.yang.model.api.SchemaContext;

public class AugmentToUsesInAugmentCompilationTest extends BaseCompilationTest {

    @Test
    public void testAugmentToUsesInAugment() throws Exception {
        final File sourcesOutputDir = new File(GENERATOR_OUTPUT_PATH + FS + "augment-uses-to-augment");
        assertTrue("Failed to create test file '" + sourcesOutputDir + "'", sourcesOutputDir.mkdir());
        final File compiledOutputDir = new File(COMPILER_OUTPUT_PATH + FS + "augment-uses-to-augment");
        assertTrue("Failed to create test file '" + compiledOutputDir + "'", compiledOutputDir.mkdir());

        final List<File> sourceFiles = getSourceFiles("/compilation/augment-uses-to-augment");
        final SchemaContext context = parser.parseFiles(sourceFiles);
        final List<Type> types = bindingGenerator.generateTypes(context);
        final GeneratorJavaFile generator = new GeneratorJavaFile(ImmutableSet.copyOf(types));
        generator.generateToFile(sourcesOutputDir);

        // Test if all sources are generated from 'module foo'
        File fooParent = new File(sourcesOutputDir, NS_FOO);
        assertFilesCount(fooParent, 4);
        assertTrue(new File(fooParent, "IgpLinkAttributes.java").exists());
        assertTrue(new File(fooParent, "Link1.java").exists());
        assertTrue(new File(fooParent, "Link1Builder.java").exists());

        // Test if all sources are generated from 'module bar'
        File barParent = new File(sourcesOutputDir, NS_BAR);
        assertFilesCount(barParent, 7);
        assertTrue(new File(barParent, "BarData.java").exists());
        assertTrue(new File(barParent, "NetworkTopology.java").exists());
        assertTrue(new File(barParent, "NetworkTopologyBuilder.java").exists());
        assertTrue(new File(barParent, "Link.java").exists());
        assertTrue(new File(barParent, "LinkAttributes.java").exists());

        File networkParent = new File(barParent, "network");
        assertFilesCount(networkParent, 1);
        File topologyParent = new File(networkParent, "topology");
        assertFilesCount(topologyParent, 3);
        assertTrue(new File(topologyParent, "Topology.java").exists());
        assertTrue(new File(topologyParent, "TopologyBuilder.java").exists());
        assertTrue(new File(topologyParent, "TopologyKey.java").exists());

        File linkParent = new File(barParent, "link");
        assertFilesCount(linkParent, 3);
        assertTrue(new File(linkParent, "Link.java").exists());
        assertTrue(new File(linkParent, "LinkBuilder.java").exists());
        assertTrue(new File(linkParent, "LinkKey.java").exists());

        // Test if all sources are generated from 'module baz'
        File bazParent = new File(sourcesOutputDir, NS_BAZ);
        assertFilesCount(bazParent, 4);
        assertTrue(new File(bazParent, "IgpLinkAttributes1.java").exists());
        assertTrue(new File(bazParent, "IgpLinkAttributes1Builder.java").exists());
        assertTrue(new File(bazParent, "LinkAttributes.java").exists());

        // Test if sources are compilable
        testCompilation(sourcesOutputDir, compiledOutputDir);

        ClassLoader loader = new URLClassLoader(new URL[] { compiledOutputDir.toURI().toURL() });

        try {
            Class<?> link1Class = Class.forName(BASE_PKG + ".urn.onos.foo.rev131008.Link1", true, loader);
            String augmentableNode = BASE_PKG + ".urn.onos.bar.rev131008.link.Link";
            testAugmentation(link1Class, augmentableNode);

            Class<?> igpLinkAttributesClass = Class.forName(BASE_PKG
                    + ".urn.onos.foo.rev131008.IgpLinkAttributes", true, loader);
            assertImplementsIfc(link1Class, igpLinkAttributesClass);
        } catch (ClassNotFoundException e) {
            throw new AssertionError("Class for augment wasn't generated");
        }

        try {
            Class<?> igpLinkAttributes1Class = Class.forName(BASE_PKG
                    + ".urn.onos.baz.rev131008.IgpLinkAttributes1", true, loader);
            String augmentableNode = BASE_PKG + ".urn.onos.foo.rev131008.igp.link.attributes.IgpLinkAttributes";
            testAugmentation(igpLinkAttributes1Class, augmentableNode);

            Class<?> linkAttributesClass = Class.forName(BASE_PKG + ".urn.onos.baz.rev131008.LinkAttributes",
                    true, loader);
            assertImplementsIfc(igpLinkAttributes1Class, linkAttributesClass);
        } catch (ClassNotFoundException e) {
            throw new AssertionError("Class for augment wasn't generated");
        }

        cleanUp(sourcesOutputDir, compiledOutputDir);
    }

}
