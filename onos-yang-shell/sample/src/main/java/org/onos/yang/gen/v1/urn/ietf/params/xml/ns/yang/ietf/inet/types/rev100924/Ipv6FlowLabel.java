package org.onos.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.base.Preconditions;
import java.math.BigInteger;
import java.util.List;
import com.google.common.collect.Range;


/**
 * The flow-label type represents flow identifier or Flow Label
 *        in an IPv6 packet header that may be used to discriminate
 *        traffic flows.
 *
 *        In the value set and its semantics, this type is equivalent
 *        to the IPv6FlowLabel textual convention of the SMIv2.
 *
 */
public class Ipv6FlowLabel
 implements Serializable {
    private static final long serialVersionUID = -7589288865525379836L;
    private final java.lang.Long _value;

    private static void check_valueRange(final long value) {
        if (value >= 0L && value <= 1048575L) {
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥1048575]].", value));
    }

    @ConstructorProperties("value")
    public Ipv6FlowLabel(java.lang.Long _value) {
        if (_value != null) {
            check_valueRange(_value);
            }
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Ipv6FlowLabel(Ipv6FlowLabel source) {
        this._value = source._value;
    }

    public static Ipv6FlowLabel getDefaultInstance(String defaultValue) {
        return new Ipv6FlowLabel(Long.valueOf(defaultValue));
    }

    public java.lang.Long getValue() {
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
        Ipv6FlowLabel other = (Ipv6FlowLabel) obj;
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
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.onos.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv6FlowLabel.class.getSimpleName()).append(" [");
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
    public static List<Range<BigInteger>> range() {
    List<Range<BigInteger>> ret = new java.util.ArrayList<>(1);
    ret.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(1048575L)));
        return ret;
    }

}

