package org.onos.yang.gen.v1.urn.onos.core.device.rev151001;
import org.onos.yangtools.yang.binding.DataRoot;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;core-device&lt;/b&gt;
 * &lt;br&gt;Source path: &lt;i&gt;META-INF/yang/core-device.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * module core-device {
 *     yang-version 1;
 *     namespace "urn:onos:core:device";
 *     prefix "core-dev";
 *
 *     import ietf-inet-types { prefix "inet"; }
 *     revision 2015-10-01 {
 *         description "";
 *     }
 *
 *     container devices {
 *         list device {
 *             key     container device {
 *                 leaf id {
 *                     type device-id;
 *                 }
 *                 leaf type {
 *                     type support-type;
 *                 }
 *                 leaf manufacturer {
 *                     type string;
 *                 }
 *                 leaf hw-version {
 *                     type string;
 *                 }
 *                 leaf sw-version {
 *                     type string;
 *                 }
 *                 leaf serial-number {
 *                     type string;
 *                 }
 *                 leaf chassis {
 *                     type chassis-idx;
 *                 }
 *             }
 *             uses core-device;
 *         }
 *     }
 *
 *     grouping core-device {
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
 *         }
 *     }
 *
 *     anyxml base identity of core device {
 *         status CURRENT;
 *     }
 * }
 * &lt;/pre&gt;
 *
 */
public interface CoreDeviceData
    extends
    DataRoot
{




    Devices getDevices();

}

