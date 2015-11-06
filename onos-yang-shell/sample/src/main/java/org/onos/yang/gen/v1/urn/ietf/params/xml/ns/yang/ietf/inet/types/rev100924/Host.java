package org.onos.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import java.util.Arrays;


/**
 * The union built-in type represents a value that corresponds to one of its member types.
 *
 */
public class Host
 implements Serializable {
    private static final long serialVersionUID = -5855386342011022795L;
    private final IpAddress _ipAddress;
    private final DomainName _domainName;
    private final char[] _value;


    public Host(IpAddress _ipAddress) {
        super();
        this._ipAddress = _ipAddress;
        this._domainName = null;
        this._value = _ipAddress.getValue();
                                    }
    
    public Host(DomainName _domainName) {
        super();
        this._domainName = _domainName;
        this._ipAddress = null;
        this._value = _domainName.getValue().toString().toCharArray();
    }
    
    /**
     * Constructor provided only for using in JMX. Don't use it for
     * construction new object of this union type.
     */
    @ConstructorProperties("value")
    public Host(char[] _value) {
        java.lang.String defVal = new java.lang.String(_value);
        Host defInst = HostBuilder.getDefaultInstance(defVal);
        this._ipAddress = defInst._ipAddress;
        this._domainName = defInst._domainName;
        this._value = _value == null ? null : _value.clone();
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Host(Host source) {
        this._ipAddress = source._ipAddress;
        this._domainName = source._domainName;
        this._value = source._value == null ? null : source._value.clone();
    }


    public IpAddress getIpAddress() {
        return _ipAddress;
    }
    
    public DomainName getDomainName() {
        return _domainName;
    }
    
    public char[] getValue() {
        return _value == null ? null : _value.clone();
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_ipAddress == null) ? 0 : _ipAddress.hashCode());
        result = prime * result + ((_domainName == null) ? 0 : _domainName.hashCode());
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
        Host other = (Host) obj;
        if (_ipAddress == null) {
            if (other._ipAddress != null) {
                return false;
            }
        } else if(!_ipAddress.equals(other._ipAddress)) {
            return false;
        }
        if (_domainName == null) {
            if (other._domainName != null) {
                return false;
            }
        } else if(!_domainName.equals(other._domainName)) {
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
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.onos.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Host.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_ipAddress != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_ipAddress=");
            builder.append(_ipAddress);
         }
        if (_domainName != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_domainName=");
            builder.append(_domainName);
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

