package org.onos.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924;
import java.util.regex.Pattern;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.collect.ImmutableList;
import com.google.common.base.Preconditions;
import java.util.List;


/**
 * The ipv6-address type represents an IPv6 address in full,
 *        mixed, shortened, and shortened-mixed notation.  The IPv6
 *        address may include a zone index, separated by a % sign.
 *
 *        The zone index is used to disambiguate identical address
 *        values.  For link-local addresses, the zone index will
 *        typically be the interface index number or the name of an
 *        interface.  If the zone index is not present, the default
 *        zone of the device will be used.
 *
 *        The canonical format of IPv6 addresses uses the compressed
 *        format described in RFC 4291, Section 2.2, item 2 with the
 *        following additional rules: the :: substitution must be
 *        applied to the longest sequence of all-zero 16-bit chunks
 *        in an IPv6 address.  If there is a tie, the first sequence
 *        of all-zero 16-bit chunks is replaced by ::.  Single
 *        all-zero 16-bit chunks are not compressed.  The canonical
 *        format uses lowercase characters and leading zeros are
 *        not allowed.  The canonical format for the zone index is
 *        the numerical format as described in RFC 4007, Section
 *        11.2.
 *
 */
public class Ipv6Address
 implements Serializable {
    private static final long serialVersionUID = 899442110750920218L;
    private static final Pattern[] patterns;
    public static final List<String> PATTERN_CONSTANTS = ImmutableList.of("^((:|[0-9a-fA-F]{0,4}):)([0-9a-fA-F]{0,4}:){0,5}((([0-9a-fA-F]{0,4}:)?(:|[0-9a-fA-F]{0,4}))|(((25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])))(%[\\p{N}\\p{L}]+)?$", "^(([^:]+:){6}(([^:]+:[^:]+)|(.*\\..*)))|((([^:]+:)*[^:]+)?::(([^:]+:)*[^:]+)?)(%.+)?$");
    
    static {
        final Pattern a[] = new Pattern[PATTERN_CONSTANTS.size()];
        int i = 0;
        for (String regEx : PATTERN_CONSTANTS) {
            a[i++] = Pattern.compile(regEx);
        }
    
        patterns = a;
    }
    private final java.lang.String _value;


    @ConstructorProperties("value")
    public Ipv6Address(java.lang.String _value) {
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
            for (Pattern p : patterns) {
                Preconditions.checkArgument(p.matcher(_value).matches(), "Supplied value \"%s\" does not match required pattern \"%s\"", _value, p);
            }
    
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Ipv6Address(Ipv6Address source) {
        this._value = source._value;
    }

    public static Ipv6Address getDefaultInstance(String defaultValue) {
        return new Ipv6Address(defaultValue);
    }

    public java.lang.String getValue() {
        return _value;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_value == null) ? 0 : _value.hashCode());
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
        Ipv6Address other = (Ipv6Address) obj;
        if (_value == null) {
            if (other._value != null) {
                return false;
            }
        } else if(!_value.equals(other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.onos.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv6Address.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_value != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_value=");
            builder.append(_value);
         }
        return builder.append(']').toString();
    }



}

