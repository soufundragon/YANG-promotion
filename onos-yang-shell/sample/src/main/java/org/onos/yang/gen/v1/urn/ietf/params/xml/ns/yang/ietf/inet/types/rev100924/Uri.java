package org.onos.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.base.Preconditions;


/**
 * The uri type represents a Uniform Resource Identifier
 *        (URI) as defined by STD 66.
 *
 *        Objects using the uri type MUST be in US-ASCII encoding,
 *        and MUST be normalized as described by RFC 3986 Sections
 *        6.2.1, 6.2.2.1, and 6.2.2.2.  All unnecessary
 *        percent-encoding is removed, and all case-insensitive
 *        characters are set to lowercase except for hexadecimal
 *        digits, which are normalized to uppercase as described in
 *        Section 6.2.2.1.
 *
 *        The purpose of this normalization is to help provide
 *        unique URIs.  Note that this normalization is not
 *        sufficient to provide uniqueness.  Two URIs that are
 *        textually distinct after this normalization may still be
 *        equivalent.
 *
 *        Objects using the uri type may restrict the schemes that
 *        they permit.  For example, 'data:' and 'urn:' schemes
 *        might not be appropriate.
 *
 *        A zero-length URI is not a valid URI.  This can be used to
 *        express 'URI absent' where required.
 *
 *        In the value set and its semantics, this type is equivalent
 *        to the Uri SMIv2 textual convention defined in RFC 5017.
 *
 */
public class Uri
 implements Serializable {
    private static final long serialVersionUID = -8010068495094688589L;
    private final java.lang.String _value;


    @ConstructorProperties("value")
    public Uri(java.lang.String _value) {
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Uri(Uri source) {
        this._value = source._value;
    }

    public static Uri getDefaultInstance(String defaultValue) {
        return new Uri(defaultValue);
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
        Uri other = (Uri) obj;
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
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.onos.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri.class.getSimpleName()).append(" [");
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

