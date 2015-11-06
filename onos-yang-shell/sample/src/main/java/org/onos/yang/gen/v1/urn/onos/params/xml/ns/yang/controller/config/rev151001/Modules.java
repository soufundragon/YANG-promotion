package org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001;
import org.onos.yangtools.yang.binding.ChildOf;
import org.onos.yangtools.yang.common.QName;
import java.util.List;
import org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module;
import org.onos.yangtools.yang.binding.Augmentable;


/**
 * Top level container encapsulating configuration of all modules.
 *
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;config&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/config.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * container modules {
 *     list module {
 *         key "type" 
 *     "name"
 *         leaf name {
 *             type string;
 *         }
 *         leaf type {
 *             type identityref;
 *         }
 *         choice configuration {
 *             case l3dev-impl {
 *                 container core-service {
 *                     leaf type {
 *                         type leafref;
 *                     }
 *                     leaf name {
 *                         type leafref;
 *                     }
 *                     uses service-ref {
 *                         refine (urn:onos:yangpromotion:impl:l3device?revision=2015-10-01)type {
 *                             leaf type {
 *                                 type leafref;
 *                             }
 *                         }
 *                     }
 *                 }
 *                 container core-store {
 *                     leaf type {
 *                         type leafref;
 *                     }
 *                     leaf name {
 *                         type leafref;
 *                     }
 *                     uses service-ref {
 *                         refine (urn:onos:yangpromotion:impl:l3device?revision=2015-10-01)type {
 *                             leaf type {
 *                                 type leafref;
 *                             }
 *                         }
 *                     }
 *                 }
 *                 container core-event {
 *                     leaf type {
 *                         type leafref;
 *                     }
 *                     leaf name {
 *                         type leafref;
 *                     }
 *                     uses service-ref {
 *                         refine (urn:onos:yangpromotion:impl:l3device?revision=2015-10-01)type {
 *                             leaf type {
 *                                 type leafref;
 *                             }
 *                         }
 *                     }
 *                 }
 *             }
 *         }
 *         choice state {
 *         }
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;config/modules&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ModulesBuilder}.
 * @see org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ModulesBuilder
 *
 */
public interface Modules
    extends
    ChildOf<ConfigData>,
    Augmentable<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules>
{



    public static final QName QNAME = org.onos.yangtools.yang.common.QName.cachedReference(org.onos.yangtools.yang.common.QName.create("urn:onos:params:xml:ns:yang:controller:config","2015-10-01","modules"));

    List<Module> getModule();

}

