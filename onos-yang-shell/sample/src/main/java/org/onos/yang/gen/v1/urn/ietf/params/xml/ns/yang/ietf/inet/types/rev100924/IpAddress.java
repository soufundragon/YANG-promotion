package org.onos.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import java.util.Arrays;


/**
 * The union built-in type represents a value that corresponds to one of its member types.
 *
 */
public class IpAddress
 implements Serializable {
    private static final long serialVersionUID = 3033840439936785623L;
    private final Ipv4Address _ipv4Address;
    private final Ipv6Address _ipv6Address;
    private final char[] _value;


    public IpAddress(Ipv4Address _ipv4Address) {
        super();
        this._ipv4Address = _ipv4Address;
        this._ipv6Address = null;
        this._value = _ipv4Address.getValue().toString().toCharArray();
    }
    
    public IpAddress(Ipv6Address _ipv6Address) {
        super();
        this._ipv6Address = _ipv6Address;
        this._ipv4Address = null;
        this._value = _ipv6Address.getValue().toString().toCharArray();
    }
    
    /**
     * Constructor provided only for using in JMX. Don't use it for
     * construction new object of this union type.
     */
    @ConstructorProperties("value")
    public IpAddress(char[] _value) {
        java.lang.String defVal = new java.lang.String(_value);
        IpAddress defInst = IpAddressBuilder.getDefaultInstance(defVal);
        this._ipv4Address = defInst._ipv4Address;
        this._ipv6Address = defInst._ipv6Address;
        this._value = _value == null ? null : _value.clone();
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public IpAddress(IpAddress source) {
        this._ipv4Address = source._ipv4Address;
        this._ipv6Address = source._ipv6Address;
        this._value = source._value == null ? null : source._value.clone();
    }


    public Ipv4Address getIpv4Address() {
        return _ipv4Address;
    }
    
    public Ipv6Address getIpv6Address() {
        return _ipv6Address;
    }
    
    public char[] getValue() {
        return _value == null ? null : _value.clone();
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_ipv4Address == null) ? 0 : _ipv4Address.hashCode());
        result = prime * result + ((_ipv6Address == null) ? 0 : _ipv6Address.hashCode());
        result = prime * result + ((_value == null) ? 0 : Arrays.hashCode(_value));
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        IpAddress other = (IpAddress) obj;
        if (_ipv4Address == null) {
            if (other._ipv4Address != null) {
                return false;
            }
        } else if(!_ipv4Address.equals(other._ipv4Address)) {
            return false;
        }
        if (_ipv6Address == null) {
            if (other._ipv6Address != null) {
                return false;
            }
        } else if(!_ipv6Address.equals(other._ipv6Address)) {
            return false;
        }
        if (_value == null) {
            if (other._value != null) {
                return false;
            }
        } else if(!Arrays.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.onos.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.IpAddress.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_ipv4Address != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_ipv4Address=");
            builder.append(_ipv4Address);
         }
        if (_ipv6Address != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_ipv6Address=");
            builder.append(_ipv6Address);
         }
        if (_value != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_value=");
            builder.append(Arrays.toString(_value));
         }
        return builder.append(']').toString();
    }



}

