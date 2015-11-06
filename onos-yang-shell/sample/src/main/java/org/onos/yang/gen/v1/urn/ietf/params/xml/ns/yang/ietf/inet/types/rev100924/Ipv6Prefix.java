package org.onos.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924;
import java.util.regex.Pattern;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.collect.ImmutableList;
import com.google.common.base.Preconditions;
import java.util.List;


/**
 * The ipv6-prefix type represents an IPv6 address prefix.
 *        The prefix length is given by the number following the
 *        slash character and must be less than or equal 128.
 *
 *        A prefix length value of n corresponds to an IP address
 *        mask that has n contiguous 1-bits from the most
 *        significant bit (MSB) and all other bits set to 0.
 *
 *        The IPv6 address should have all bits that do not belong
 *        to the prefix set to zero.
 *
 *        The canonical format of an IPv6 prefix has all bits of
 *        the IPv6 address set to zero that are not part of the
 *        IPv6 prefix.  Furthermore, IPv6 address is represented
 *        in the compressed format described in RFC 4291, Section
 *        2.2, item 2 with the following additional rules: the ::
 *        substitution must be applied to the longest sequence of
 *        all-zero 16-bit chunks in an IPv6 address.  If there is
 *        a tie, the first sequence of all-zero 16-bit chunks is
 *        replaced by ::.  Single all-zero 16-bit chunks are not
 *        compressed.  The canonical format uses lowercase
 *        characters and leading zeros are not allowed.
 *
 */
public class Ipv6Prefix
 implements Serializable {
    private static final long serialVersionUID = 1581919727385448593L;
    private static final Pattern[] patterns;
    public static final List<String> PATTERN_CONSTANTS = ImmutableList.of("^((:|[0-9a-fA-F]{0,4}):)([0-9a-fA-F]{0,4}:){0,5}((([0-9a-fA-F]{0,4}:)?(:|[0-9a-fA-F]{0,4}))|(((25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])))(/(([0-9])|([0-9]{2})|(1[0-1][0-9])|(12[0-8])))$", "^(([^:]+:){6}(([^:]+:[^:]+)|(.*\\..*)))|((([^:]+:)*[^:]+)?::(([^:]+:)*[^:]+)?)(/.+)$");
    
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
    public Ipv6Prefix(java.lang.String _value) {
    
    
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
    public Ipv6Prefix(Ipv6Prefix source) {
        this._value = source._value;
    }

    public static Ipv6Prefix getDefaultInstance(String defaultValue) {
        return new Ipv6Prefix(defaultValue);
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
        Ipv6Prefix other = (Ipv6Prefix) obj;
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
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.onos.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv6Prefix.class.getSimpleName()).append(" [");
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

