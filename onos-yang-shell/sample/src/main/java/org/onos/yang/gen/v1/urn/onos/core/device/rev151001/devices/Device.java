package org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices;
import org.onos.yangtools.yang.binding.ChildOf;
import org.onos.yang.gen.v1.urn.onos.core.device.rev151001.CoreDevice;
import org.onos.yangtools.yang.common.QName;
import org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices;
import org.onos.yangtools.yang.binding.Augmentable;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;core-device&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/core-device.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * list device {
 *     key     container device {
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
 *     uses core-device;
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;core-device/devices/device&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.DeviceBuilder}.
 * @see org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.DeviceBuilder
 *
 *
 */
public interface Device
    extends
    ChildOf<Devices>,
    Augmentable<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device>,
    CoreDevice
{



    QName QNAME = org.onos.yangtools.yang.common.QName.cachedReference(org.onos.yangtools.yang.common.QName.create("urn:onos:core:device","2015-10-01","device"));


}

