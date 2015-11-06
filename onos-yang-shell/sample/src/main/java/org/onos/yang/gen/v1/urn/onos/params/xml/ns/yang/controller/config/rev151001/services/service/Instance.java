package org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service;
import org.onos.yangtools.yang.binding.ChildOf;
import org.onos.yangtools.yang.common.QName;
import org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service;
import org.onos.yangtools.yang.binding.Augmentable;
import org.onos.yangtools.yang.binding.Identifiable;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;config&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/config.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * list instance {
 *     key "name"
 *     leaf name {
 *         type string;
 *     }
 *     leaf provider {
 *         type leafref;
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;config/services/service/instance&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.InstanceBuilder}.
 * @see org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.InstanceBuilder
 * @see org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.InstanceKey
 *
 */
public interface Instance
    extends
    ChildOf<Service>,
    Augmentable<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance>,
    Identifiable<InstanceKey>
{



    public static final QName QNAME = org.onos.yangtools.yang.common.QName.cachedReference(org.onos.yangtools.yang.common.QName.create("urn:onos:params:xml:ns:yang:controller:config","2015-10-01","instance"));

    java.lang.String getName();
    
    java.lang.String getProvider();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     */
    InstanceKey getKey();

}

