package org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001;
import org.onos.yangtools.yang.binding.DataRoot;


/**
 * This module contains the base YANG definitions for NOS configuration subsystem. 
 * The system modeled revolves around two major concepts: modules and services.
 *
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;config&lt;/b&gt;
 * &lt;br&gt;Source path: &lt;i&gt;META-INF/yang/config.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * module config {
 *     yang-version 1;
 *     namespace "urn:onos:params:xml:ns:yang:controller:config";
 *     prefix "config";
 *
 *     revision 2015-10-01 {
 *         description "This module contains the base YANG definitions for NOS configuration subsystem. 
 *                     The system modeled revolves around two major concepts: modules and services.
 *         ";
 *     }
 *
 *     container modules {
 *         list module {
 *             key "type" 
 *         "name"
 *             leaf name {
 *                 type string;
 *             }
 *             leaf type {
 *                 type identityref;
 *             }
 *             choice configuration {
 *                 case l3dev-impl {
 *                     container core-service {
 *                         leaf type {
 *                             type leafref;
 *                         }
 *                         leaf name {
 *                             type leafref;
 *                         }
 *                         uses service-ref {
 *                             refine (urn:onos:yangpromotion:impl:l3device?revision=2015-10-01)type {
 *                                 leaf type {
 *                                     type leafref;
 *                                 }
 *                             }
 *                         }
 *                     }
 *                     container core-store {
 *                         leaf type {
 *                             type leafref;
 *                         }
 *                         leaf name {
 *                             type leafref;
 *                         }
 *                         uses service-ref {
 *                             refine (urn:onos:yangpromotion:impl:l3device?revision=2015-10-01)type {
 *                                 leaf type {
 *                                     type leafref;
 *                                 }
 *                             }
 *                         }
 *                     }
 *                     container core-event {
 *                         leaf type {
 *                             type leafref;
 *                         }
 *                         leaf name {
 *                             type leafref;
 *                         }
 *                         uses service-ref {
 *                             refine (urn:onos:yangpromotion:impl:l3device?revision=2015-10-01)type {
 *                                 leaf type {
 *                                     type leafref;
 *                                 }
 *                             }
 *                         }
 *                     }
 *                 }
 *             }
 *             choice state {
 *             }
 *         }
 *     }
 *     container services {
 *         list service {
 *             key "type"
 *             leaf type {
 *                 type service-type-ref;
 *             }
 *             list instance {
 *                 key "name"
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf provider {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 *
 *     grouping service-ref {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *     }
 *
 *     extension inner-state-bean {
 *         description
 *             "YANG language extension which indicates that a particular
 *                          list located under module's state should be treated as a list
 *                          of child state beans instead of just an ordinary list attribute";
 *         status CURRENT;
 *     }
 *     extension java-class {
 *         description
 *             "YANG language extension carrying the fully-qualified name of
 *                          a Java class. Code generation tools use the provided reference
 *                          to tie a specific construct to its Java representation.";
 *         argument "name";
 *         status CURRENT;
 *     }
 *     extension java-name-prefix {
 *         description
 *             "YANG language extension carrying java simple class name prefix
 *                         that will be taken into account when generating java code from
 *                         identities that are based on module-type.";
 *         argument "java-prefix";
 *         status CURRENT;
 *     }
 *     extension provided-service {
 *         description
 *             "YANG language extension which indicates that a particular
 *                         module provides certain service. This extension can be placed
 *                         on identities that are based on module-type. Zero or more services
 *                         can be provided.
 *                         This extension takes one argument - name - which MUST be the name
 *                         of an identity. Furthermore, this identity MUST be based on
 *                         service-type.";
 *         argument "name";
 *         status CURRENT;
 *     }
 *     extension required-identity {
 *         description
 *             "YANG language extension which indicates that a particular
 *                          leafref, which points to a identityref, should additionally
 *                          require the target node is actually set to a descendant to
 *                          of a particular identity.
 *             
 *                          This is a workaround to two YANG deficiencies:
 *                          1) not being able to leafref instances of identityref
 *                          2) not being able to refine an identityref
 *             
 *                          This extension takes one argument, name, which MUST be the name
 *                          of an identity. Furthermore, that identity MUST be based,
 *                          directly or indirectly, on the identity, which is referenced by
 *                          the leaf reference, which is annotated with this extension.";
 *         argument "name";
 *         status CURRENT;
 *     }
 *
 *     identity module-type {
 *         description
 *             "Module identity base type. All module identities must be derived
 *                         from this type. A module type uniquely defines a single atomic
 *                         component, such as an application. Each such component is assumed
 *                         to have its unique, stable and versioned configuration structure.";
 *         status CURRENT;
 *     }
 *     identity service-type {
 *         description
 *             "Service identity base type. All service identities must be
 *                          derived from this type. A service type uniquely defines a single
 *                          atomic API contract, such as a Java interface, a set of C
 *                          function declarations, or similar.
 *             
 *                          If the service type has a corresponding Java interface, the name
 *                          of that interface should be attached to the derived identity MUST
 *                          include a java-class keyword, whose name argument points to that
 *                          interface.";
 *         status CURRENT;
 *     }
 * }
 * &lt;/pre&gt;
 *
 */
public interface ConfigData
    extends
    DataRoot
{




    /**
     * Top level container encapsulating configuration of all modules.
     *
     */
    Modules getModules();
    
    Services getServices();

}

