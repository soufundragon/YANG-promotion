package org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001;
import org.onos.yangtools.yang.common.QName;
import org.onos.yangtools.yang.binding.BaseIdentity;


/**
 * Service identity base type. All service identities must be derived from this 
 * type. A service type uniquely defines a single atomic API contract, such as a 
 * Java interface, a set of C function declarations, or similar. If the service 
 * type has a corresponding Java interface, the name of that interface should be 
 * attached to the derived identity MUST include a java-class keyword, whose name 
 * argument points to that interface.
 *
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;config&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/config.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * identity service-type {
 *     description
 *         "Service identity base type. All service identities must be
 *                      derived from this type. A service type uniquely defines a single
 *                      atomic API contract, such as a Java interface, a set of C
 *                      function declarations, or similar.
 *         
 *                      If the service type has a corresponding Java interface, the name
 *                      of that interface should be attached to the derived identity MUST
 *                      include a java-class keyword, whose name argument points to that
 *                      interface.";
 *     status CURRENT;
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;config/service-type&lt;/i&gt;
 *
 */
public abstract class ServiceType extends BaseIdentity
 {
    public static final QName QNAME = org.onos.yangtools.yang.common.QName.cachedReference(org.onos.yangtools.yang.common.QName.create("urn:onos:params:xml:ns:yang:controller:config","2015-10-01","service-type"));


    public ServiceType() {
    
    
    }
    









}

