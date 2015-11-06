package org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001;
import org.onos.yangtools.yang.binding.ChildOf;
import org.onos.yang.gen.v1.urn.onos.core.device.rev151001.CoreDevice;
import org.onos.yangtools.yang.common.QName;
import org.onos.yangtools.yang.binding.Augmentable;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;l3-device&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/l3-device.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * container l3-device {
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
 *         leaf ip {
 *             type ipv4-address;
 *         }
 *         leaf user {
 *             type string;
 *         }
 *         leaf password {
 *             type string;
 *         }
 *         augment \(urn:onos:yangpromotion:def:l3device)device {
 *             status CURRENT;
 *             leaf ip {
 *                 type ipv4-address;
 *             }
 *             leaf user {
 *                 type string;
 *             }
 *             leaf password {
 *                 type string;
 *             }
 *             uses connection;
 *         }
 *     }
 *     uses core-device;
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;l3-device/l3-device&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3DeviceBuilder}.
 * @see org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3DeviceBuilder
 *
 */
public interface L3Device
    extends
    ChildOf<L3DeviceData>,
    Augmentable<org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device>,
    CoreDevice
{



    public static final QName QNAME = org.onos.yangtools.yang.common.QName.cachedReference(org.onos.yangtools.yang.common.QName.create("urn:onos:yangpromotion:def:l3device","2015-10-01","l3-device"));


}

