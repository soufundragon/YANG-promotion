package org.onos.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.base.Preconditions;
import java.math.BigInteger;
import java.util.List;
import com.google.common.collect.Range;


/**
 * The port-number type represents a 16-bit port number of an
 *        Internet transport layer protocol such as UDP, TCP, DCCP, or
 *        SCTP.  Port numbers are assigned by IANA.  A current list of
 *        all assignments is available from &lt;http://www.iana.org/&gt;.
 *
 *        Note that the port number value zero is reserved by IANA.  In
 *        situations where the value zero does not make sense, it can
 *        be excluded by subtyping the port-number type.
 *
 *        In the value set and its semantics, this type is equivalent
 *        to the InetPortNumber textual convention of the SMIv2.
 *
 */
public class PortNumber
 implements Serializable {
    private static final long serialVersionUID = -5341082755708920855L;
    private final java.lang.Integer _value;

    private static void check_valueRange(final int value) {
        if (value >= 0 && value <= 65535) {
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
    }

    @ConstructorProperties("value")
    public PortNumber(java.lang.Integer _value) {
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
    public PortNumber(PortNumber source) {
        this._value = source._value;
    }

    public static PortNumber getDefaultInstance(String defaultValue) {
        return new PortNumber(Integer.valueOf(defaultValue));
    }

    public java.lang.Integer getValue() {
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
        PortNumber other = (PortNumber) obj;
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
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.onos.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.PortNumber.class.getSimpleName()).append(" [");
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
    ret.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(65535L)));
        return ret;
    }

}

