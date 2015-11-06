package org.onos.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924;
import java.util.regex.Pattern;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.collect.ImmutableList;
import com.google.common.base.Preconditions;
import java.math.BigInteger;
import java.util.List;
import com.google.common.collect.Range;


/**
 * The domain-name type represents a DNS domain name.  The
 *        name SHOULD be fully qualified whenever possible.
 *
 *        Internet domain names are only loosely specified.  Section
 *        3.5 of RFC 1034 recommends a syntax (modified in Section
 *        2.1 of RFC 1123).  The pattern above is intended to allow
 *        for current practice in domain name use, and some possible
 *        future expansion.  It is designed to hold various types of
 *        domain names, including names used for A or AAAA records
 *        (host names) and other records, such as SRV records.  Note
 *        that Internet host names have a stricter syntax (described
 *        in RFC 952) than the DNS recommendations in RFCs 1034 and
 *        1123, and that systems that want to store host names in
 *        schema nodes using the domain-name type are recommended to
 *        adhere to this stricter standard to ensure interoperability.
 *
 *        The encoding of DNS names in the DNS protocol is limited
 *        to 255 characters.  Since the encoding consists of labels
 *        prefixed by a length bytes and there is a trailing NULL
 *        byte, only 253 characters can appear in the textual dotted
 *        notation.
 *
 *        The description clause of schema nodes using the domain-name
 *        type MUST describe when and how these names are resolved to
 *        IP addresses.  Note that the resolution of a domain-name value
 *        may require to query multiple DNS records (e.g., A for IPv4
 *        and AAAA for IPv6).  The order of the resolution process and
 *        which DNS record takes precedence can either be defined
 *        explicitely or it may depend on the configuration of the
 *        resolver.
 *
 *        Domain-name values use the US-ASCII encoding.  Their canonical
 *        format uses lowercase US-ASCII characters.  Internationalized
 *        domain names MUST be encoded in punycode as described in RFC
 *        3492
 *
 */
public class DomainName
 implements Serializable {
    private static final long serialVersionUID = -7890312374818160504L;
    private static final Pattern[] patterns;
    public static final List<String> PATTERN_CONSTANTS = ImmutableList.of("^((([a-zA-Z0-9_]([a-zA-Z0-9\\-_]){0,61})?[a-zA-Z0-9]\\.)*([a-zA-Z0-9_]([a-zA-Z0-9\\-_]){0,61})?[a-zA-Z0-9]\\.?)|\\.$");
    
    static {
        final Pattern a[] = new Pattern[PATTERN_CONSTANTS.size()];
        int i = 0;
        for (String regEx : PATTERN_CONSTANTS) {
            a[i++] = Pattern.compile(regEx);
        }
    
        patterns = a;
    }
    private final java.lang.String _value;

    private static void check_valueLength(final String value) {
        final int length = value.length();
        if (length >= 1 && length <= 253) {
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[1‥253]].", value));
    }

    @ConstructorProperties("value")
    public DomainName(java.lang.String _value) {
        if (_value != null) {
            check_valueLength(_value);
            }
    
    
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
    public DomainName(DomainName source) {
        this._value = source._value;
    }

    public static DomainName getDefaultInstance(String defaultValue) {
        return new DomainName(defaultValue);
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
        DomainName other = (DomainName) obj;
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
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.onos.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.DomainName.class.getSimpleName()).append(" [");
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

    /**
     * @deprecated This method is slated for removal in a future release. See BUG-1485 for details.
     */
    @Deprecated
    public static List<Range<BigInteger>> length() {
        List<Range<BigInteger>> ret = new java.util.ArrayList<>(1);
        ret.add(Range.closed(BigInteger.ONE, BigInteger.valueOf(253L)));
        return ret;
    }


}

