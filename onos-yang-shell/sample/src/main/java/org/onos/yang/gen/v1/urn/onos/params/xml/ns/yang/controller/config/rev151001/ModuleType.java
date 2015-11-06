package org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001;
import org.onos.yangtools.yang.common.QName;
import org.onos.yangtools.yang.binding.BaseIdentity;


/**
 * Module identity base type. All module identities must be derived from this type.
 * A module type uniquely defines a single atomic component, such as an 
 * application. Each such component is assumed to have its unique, stable and 
 * versioned configuration structure.
 *
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;config&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/config.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * identity module-type {
 *     description
 *         "Module identity base type. All module identities must be derived
 *                     from this type. A module type uniquely defines a single atomic
 *                     component, such as an application. Each such component is assumed
 *                     to have its unique, stable and versioned configuration structure.";
 *     status CURRENT;
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;config/module-type&lt;/i&gt;
 *
 */
public abstract class ModuleType extends BaseIdentity
 {
    public static final QName QNAME = org.onos.yangtools.yang.common.QName.cachedReference(org.onos.yangtools.yang.common.QName.create("urn:onos:params:xml:ns:yang:controller:config","2015-10-01","module-type"));


    public ModuleType() {
    
    
    }
    









}

