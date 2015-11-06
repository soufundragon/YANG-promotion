package org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.l3.device;
import org.onos.yangtools.yang.binding.DataObject;
import org.onos.yangtools.concepts.Builder;
import org.onos.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv4Address;


/**
 * Class that builds {@link org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.l3.device.L3Device} instances.
 *
 * @see org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.l3.device.L3Device
 *
 */
public class L3DeviceBuilder implements Builder <org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.l3.device.L3Device> {

    private Ipv4Address _ip;
    private java.lang.String _password;
    private java.lang.String _user;


    public L3DeviceBuilder() {
    }
    public L3DeviceBuilder(org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.Connection arg) {
        this._ip = arg.getIp();
        this._user = arg.getUser();
        this._password = arg.getPassword();
    }

    public L3DeviceBuilder(L3Device base) {
        this._ip = base.getIp();
        this._password = base.getPassword();
        this._user = base.getUser();
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.Connection</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.Connection) {
            this._ip = ((org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.Connection)arg).getIp();
            this._user = ((org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.Connection)arg).getUser();
            this._password = ((org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.Connection)arg).getPassword();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.Connection] \n" +
              "but was: " + arg
            );
        }
    }

    public Ipv4Address getIp() {
        return _ip;
    }
    
    public java.lang.String getPassword() {
        return _password;
    }
    
    public java.lang.String getUser() {
        return _user;
    }

    public L3DeviceBuilder setIp(Ipv4Address value) {
        if (value != null) {
        }
        this._ip = value;
        return this;
    }
    
    public L3DeviceBuilder setPassword(java.lang.String value) {
        this._password = value;
        return this;
    }
    
    public L3DeviceBuilder setUser(java.lang.String value) {
        this._user = value;
        return this;
    }

    public L3Device build() {
        return new L3DeviceImpl(this);
    }

    private static final class L3DeviceImpl implements L3Device {

        public java.lang.Class<org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.l3.device.L3Device> getImplementedInterface() {
            return org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.l3.device.L3Device.class;
        }

        private final Ipv4Address _ip;
        private final java.lang.String _password;
        private final java.lang.String _user;


        private L3DeviceImpl(L3DeviceBuilder base) {
            this._ip = base.getIp();
            this._password = base.getPassword();
            this._user = base.getUser();
        }

        @Override
        public Ipv4Address getIp() {
            return _ip;
        }
        
        @Override
        public java.lang.String getPassword() {
            return _password;
        }
        
        @Override
        public java.lang.String getUser() {
            return _user;
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_ip == null) ? 0 : _ip.hashCode());
            result = prime * result + ((_password == null) ? 0 : _password.hashCode());
            result = prime * result + ((_user == null) ? 0 : _user.hashCode());
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.l3.device.L3Device.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.l3.device.L3Device other = (org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.l3.device.L3Device)obj;
            if (_ip == null) {
                if (other.getIp() != null) {
                    return false;
                }
            } else if(!_ip.equals(other.getIp())) {
                return false;
            }
            if (_password == null) {
                if (other.getPassword() != null) {
                    return false;
                }
            } else if(!_password.equals(other.getPassword())) {
                return false;
            }
            if (_user == null) {
                if (other.getUser() != null) {
                    return false;
                }
            } else if(!_user.equals(other.getUser())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("L3Device [");
            boolean first = true;
        
            if (_ip != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ip=");
                builder.append(_ip);
             }
            if (_password != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_password=");
                builder.append(_password);
             }
            if (_user != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_user=");
                builder.append(_user);
             }
            return builder.append(']').toString();
        }
    }

}
