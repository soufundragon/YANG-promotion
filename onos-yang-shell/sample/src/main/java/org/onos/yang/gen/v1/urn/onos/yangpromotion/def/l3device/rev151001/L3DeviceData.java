package org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001;
import org.onos.yangtools.yang.binding.DataRoot;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;l3-device&lt;/b&gt;
 * &lt;br&gt;Source path: &lt;i&gt;META-INF/yang/l3-device.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * module l3-device {
 *     yang-version 1;
 *     namespace "urn:onos:yangpromotion:def:l3device";
 *     prefix "l3dev";
 *
 *     import yang-ext { prefix "ext"; }
 *     
 *     import core-device { prefix "core-dev"; }
 *     
 *     import ietf-inet-types { prefix "inet"; }
 *     revision 2015-10-01 {
 *         description "";
 *     }
 *
 *     container l3-device {
 *         container device {
 *             leaf id {
 *                 type device-id;
 *             }
 *             leaf type {
 *                 type support-type;
 *             }
 *             leaf manufacturer {
 *                 type string;
 *             }
 *             leaf hw-version {
 *                 type string;
 *             }
 *             leaf sw-version {
 *                 type string;
 *             }
 *             leaf serial-number {
 *                 type string;
 *             }
 *             leaf chassis {
 *                 type chassis-idx;
 *             }
 *             leaf ip {
 *                 type ipv4-address;
 *             }
 *             leaf user {
 *                 type string;
 *             }
 *             leaf password {
 *                 type string;
 *             }
 *             augment \(urn:onos:yangpromotion:def:l3device)device {
 *                 status CURRENT;
 *                 leaf ip {
 *                     type ipv4-address;
 *                 }
 *                 leaf user {
 *                     type string;
 *                 }
 *                 leaf password {
 *                     type string;
 *                 }
 *                 uses connection;
 *             }
 *         }
 *         uses core-device;
 *     }
 *
 *     grouping connection {
 *         leaf ip {
 *             type ipv4-address;
 *         }
 *         leaf user {
 *             type string;
 *         }
 *         leaf password {
 *             type string;
 *         }
 *     }
 * }
 * &lt;/pre&gt;
 *
 */
public interface L3DeviceData
    extends
    DataRoot
{




    L3Device getL3Device();

}

