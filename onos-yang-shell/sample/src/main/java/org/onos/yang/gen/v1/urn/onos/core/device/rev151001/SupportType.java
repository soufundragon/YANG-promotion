package org.onos.yang.gen.v1.urn.onos.core.device.rev151001;


/**
 * The enumeration built-in type represents values from a set of assigned names.
 *
 */
public enum SupportType {
    Switch(0),
    
    Router(1),
    
    Roadm(2),
    
    Otn(3),
    
    RoadmOtn(4),
    
    Firewall(5),
    
    Balancer(6),
    
    Ips(7),
    
    Ids(8),
    
    Controller(9),
    
    Other(10)
    ;


    int value;
    private static final java.util.Map<java.lang.Integer, SupportType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, SupportType> b = com.google.common.collect.ImmutableMap.builder();
        for (SupportType enumItem : SupportType.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private SupportType(int value) {
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
     * @return corresponding SupportType item
     */
    public static SupportType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
