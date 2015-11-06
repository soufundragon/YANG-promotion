package org.onos.yang.gen.v1.urn.onos.core.binding.rev151001;
import org.onos.system.store.Dao;
import org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ServiceType;
import org.onos.yangtools.yang.common.QName;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;core-binding&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/core-binding.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * identity core-device-store {
 *     base "()IdentitySchemaNodeImpl[base=null, qname=(urn:onos:params:xml:ns:yang:controller:config?revision=2015-10-01)service-type]";
 *     status CURRENT;
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;core-binding/core-device-store&lt;/i&gt;
 *
 */
public abstract class CoreDeviceStore extends ServiceType implements Dao
 {
    public static final QName QNAME = org.onos.yangtools.yang.common.QName.cachedReference(org.onos.yangtools.yang.common.QName.create("urn:onos:core:binding","2015-10-01","core-device-store"));


    public CoreDeviceStore() {
    
    
    }
    









}

