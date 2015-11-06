package org.onos.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924;


/**
 * The enumeration built-in type represents values from a set of assigned names.
 *
 */
public enum IpVersion {
    /**
     * An unknown or unspecified version of the Internet protocol.
     *
     */
    Unknown(0),
    
    /**
     * The IPv4 protocol as defined in RFC 791.
     *
     */
    Ipv4(1),
    
    /**
     * The IPv6 protocol as defined in RFC 2460.
     *
     */
    Ipv6(2)
    ;


    int value;
    private static final java.util.Map<java.lang.Integer, IpVersion> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, IpVersion> b = com.google.common.collect.ImmutableMap.builder();
        for (IpVersion enumItem : IpVersion.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private IpVersion(int value) {
        this.value = value;
    }

    /**
     * @return integer value
     */
    public int getIntValue() {
        return value;
    }

    /**
     * @param valueArg
     * @return corresponding IpVersion item
     */
    public static IpVersion forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
