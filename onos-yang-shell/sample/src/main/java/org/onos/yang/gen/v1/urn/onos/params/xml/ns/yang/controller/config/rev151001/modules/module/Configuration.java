package org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.module;
import org.onos.yangtools.yang.binding.DataContainer;
import org.onos.yangtools.yang.common.QName;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;config&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/config.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * choice configuration {
 *     case l3dev-impl {
 *         container core-service {
 *             leaf type {
 *                 type leafref;
 *             }
 *             leaf name {
 *                 type leafref;
 *             }
 *             uses service-ref {
 *                 refine (urn:onos:yangpromotion:impl:l3device?revision=2015-10-01)type {
 *                     leaf type {
 *                         type leafref;
 *                     }
 *                 }
 *             }
 *         }
 *         container core-store {
 *             leaf type {
 *                 type leafref;
 *             }
 *             leaf name {
 *                 type leafref;
 *             }
 *             uses service-ref {
 *                 refine (urn:onos:yangpromotion:impl:l3device?revision=2015-10-01)type {
 *                     leaf type {
 *                         type leafref;
 *                     }
 *                 }
 *             }
 *         }
 *         container core-event {
 *             leaf type {
 *                 type leafref;
 *             }
 *             leaf name {
 *                 type leafref;
 *             }
 *             uses service-ref {
 *                 refine (urn:onos:yangpromotion:impl:l3device?revision=2015-10-01)type {
 *                     leaf type {
 *                         type leafref;
 *                     }
 *                 }
 *             }
 *         }
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;config/modules/module/configuration&lt;/i&gt;
 *
 */
public interface Configuration
    extends
    DataContainer
{



    public static final QName QNAME = org.onos.yangtools.yang.common.QName.cachedReference(org.onos.yangtools.yang.common.QName.create("urn:onos:params:xml:ns:yang:controller:config","2015-10-01","configuration"));


}

