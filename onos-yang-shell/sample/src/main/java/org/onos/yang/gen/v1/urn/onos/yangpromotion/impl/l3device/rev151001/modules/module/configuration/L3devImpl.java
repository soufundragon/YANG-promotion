package org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration;
import org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreStore;
import org.onos.yangtools.yang.binding.DataObject;
import org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.module.Configuration;
import org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent;
import org.onos.yangtools.yang.common.QName;
import org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreService;
import org.onos.yangtools.yang.binding.Augmentable;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;l3-device-impl&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/l3-device-impl.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * case l3dev-impl {
 *     container core-service {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:onos:yangpromotion:impl:l3device?revision=2015-10-01)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 *     container core-store {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:onos:yangpromotion:impl:l3device?revision=2015-10-01)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 *     container core-event {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:onos:yangpromotion:impl:l3device?revision=2015-10-01)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;l3-device-impl/modules/module/configuration/(urn:onos:yangpromotion:impl:l3device?revision=2015-10-01)l3dev-impl&lt;/i&gt;
 *
 */
public interface L3devImpl
    extends
    DataObject,
    Augmentable<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl>,
    Configuration
{



    public static final QName QNAME = org.onos.yangtools.yang.common.QName.cachedReference(org.onos.yangtools.yang.common.QName.create("urn:onos:yangpromotion:impl:l3device","2015-10-01","l3dev-impl"));

    CoreService getCoreService();
    
    CoreStore getCoreStore();
    
    CoreEvent getCoreEvent();

}

