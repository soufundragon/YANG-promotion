package org.onos.yang.gen.v1.urn.onos.yang.extension.yang.ext.rev130709;
import org.onos.yangtools.yang.binding.DataObject;
import org.onos.yangtools.yang.common.QName;
import org.onos.yangtools.yang.binding.InstanceIdentifier;


/**
 * A reference to RPC context.
 *
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;yang-ext&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/yang-ext.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * grouping rpc-context-ref {
 *     leaf context-instance {
 *         type instance-identifier;
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;yang-ext/rpc-context-ref&lt;/i&gt;
 *
 */
public interface RpcContextRef
    extends
    DataObject
{



    public static final QName QNAME = org.onos.yangtools.yang.common.QName.cachedReference(org.onos.yangtools.yang.common.QName.create("urn:onos:yang:extension:yang-ext","2013-07-09","rpc-context-ref"));

    /**
     * Pointer to the context.
     *
     */
    InstanceIdentifier<?> getContextInstance();

}

