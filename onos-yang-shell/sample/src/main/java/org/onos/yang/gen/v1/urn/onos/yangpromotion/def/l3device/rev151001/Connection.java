package org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001;
import org.onos.yangtools.yang.binding.DataObject;
import org.onos.yangtools.yang.common.QName;
import org.onos.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv4Address;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;l3-device&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/l3-device.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * grouping connection {
 *     leaf ip {
 *         type ipv4-address;
 *     }
 *     leaf user {
 *         type string;
 *     }
 *     leaf password {
 *         type string;
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;l3-device/connection&lt;/i&gt;
 *
 */
public interface Connection
    extends
    DataObject
{



    public static final QName QNAME = org.onos.yangtools.yang.common.QName.cachedReference(org.onos.yangtools.yang.common.QName.create("urn:onos:yangpromotion:def:l3device","2015-10-01","connection"));

    Ipv4Address getIp();
    
    java.lang.String getUser();
    
    java.lang.String getPassword();

}

