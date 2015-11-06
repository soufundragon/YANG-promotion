package org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001;
import org.onos.yangtools.yang.binding.DataObject;
import org.onos.yangtools.yang.common.QName;


/**
 * Type of references to a particular service instance. This type can be used when 
 * defining module configuration to refer to a particular service instance. 
 * Containers using this grouping should not define anything else. The run-time 
 * implementation is expected to inject a reference to the service as the value of 
 * the container.
 *
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;config&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/config.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * grouping service-ref {
 *     leaf type {
 *         type leafref;
 *     }
 *     leaf name {
 *         type leafref;
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;config/service-ref&lt;/i&gt;
 *
 */
public interface ServiceRef
    extends
    DataObject
{



    public static final QName QNAME = org.onos.yangtools.yang.common.QName.cachedReference(org.onos.yangtools.yang.common.QName.create("urn:onos:params:xml:ns:yang:controller:config","2015-10-01","service-ref"));

    /**
     * Type of the service being referenced. Users of this grouping should refine this 
     * leaf with required-identity pointing to the actual service-type which is 
     * actually required.
     *
     */
    java.lang.Class<? extends org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ServiceType> getType();
    
    java.lang.Object getName();

}

