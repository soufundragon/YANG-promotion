package org.onos.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import java.util.Arrays;


/**
 * The union built-in type represents a value that corresponds to one of its member types.
 *
 */
public class IpPrefix
 implements Serializable {
    private static final long serialVersionUID = 4870886602207064041L;
    private final Ipv4Prefix _ipv4Prefix;
    private final Ipv6Prefix _ipv6Prefix;
    private final char[] _value;


    public IpPrefix(Ipv4Prefix _ipv4Prefix) {
        super();
        this._ipv4Prefix = _ipv4Prefix;
        this._ipv6Prefix = null;
        this._value = _ipv4Prefix.getValue().toString().toCharArray();
    }
    
    public IpPrefix(Ipv6Prefix _ipv6Prefix) {
        super();
        this._ipv6Prefix = _ipv6Prefix;
        this._ipv4Prefix = null;
        this._value = _ipv6Prefix.getValue().toString().toCharArray();
    }
    
    /**
     * Constructor provided only for using in JMX. Don't use it for
     * construction new object of this union type.
     */
    @ConstructorProperties("value")
    public IpPrefix(char[] _value) {
        java.lang.String defVal = new java.lang.String(_value);
        IpPrefix defInst = IpPrefixBuilder.getDefaultInstance(defVal);
        this._ipv4Prefix = defInst._ipv4Prefix;
        this._ipv6Prefix = defInst._ipv6Prefix;
        this._value = _value == null ? null : _value.clone();
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public IpPrefix(IpPrefix source) {
        this._ipv4Prefix = source._ipv4Prefix;
        this._ipv6Prefix = source._ipv6Prefix;
        this._value = source._value == null ? null : source._value.clone();
    }


    public Ipv4Prefix getIpv4Prefix() {
        return _ipv4Prefix;
    }
    
    public Ipv6Prefix getIpv6Prefix() {
        return _ipv6Prefix;
    }
    
    public char[] getValue() {
        return _value == null ? null : _value.clone();
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_ipv4Prefix == null) ? 0 : _ipv4Prefix.hashCode());
        result = prime * result + ((_ipv6Prefix == null) ? 0 : _ipv6Prefix.hashCode());
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
        IpPrefix other = (IpPrefix) obj;
        if (_ipv4Prefix == null) {
            if (other._ipv4Prefix != null) {
                return false;
            }
        } else if(!_ipv4Prefix.equals(other._ipv4Prefix)) {
            return false;
        }
        if (_ipv6Prefix == null) {
            if (other._ipv6Prefix != null) {
                return false;
            }
        } else if(!_ipv6Prefix.equals(other._ipv6Prefix)) {
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
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.onos.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.IpPrefix.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_ipv4Prefix != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_ipv4Prefix=");
            builder.append(_ipv4Prefix);
         }
        if (_ipv6Prefix != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_ipv6Prefix=");
            builder.append(_ipv6Prefix);
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

