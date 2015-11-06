package org.onos.yang.gen.v1.urn.onos.core.device.rev151001;
import org.onos.yangtools.yang.binding.DataObject;
import org.onos.yangtools.yang.common.QName;
import org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;core-device&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/core-device.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * grouping core-device {
 *     container device {
 *         leaf id {
 *             type device-id;
 *         }
 *         leaf type {
 *             type support-type;
 *         }
 *         leaf manufacturer {
 *             type string;
 *         }
 *         leaf hw-version {
 *             type string;
 *         }
 *         leaf sw-version {
 *             type string;
 *         }
 *         leaf serial-number {
 *             type string;
 *         }
 *         leaf chassis {
 *             type chassis-idx;
 *         }
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;core-device/core-device&lt;/i&gt;
 *
 */
public interface CoreDevice
    extends
    DataObject
{



    public static final QName QNAME = org.onos.yangtools.yang.common.QName.cachedReference(org.onos.yangtools.yang.common.QName.create("urn:onos:core:device","2015-10-01","core-device"));

    Device getDevice();

}

