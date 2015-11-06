package org.onos.yang.gen.v1.urn.onos.core.device.rev151001;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.base.Preconditions;
import org.onos.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri;


public class DeviceId extends Uri
 implements Serializable {
    private static final long serialVersionUID = 4478080796238053694L;


    @ConstructorProperties("value")
    public DeviceId(java.lang.String _value) {
        super(_value);
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public DeviceId(DeviceId source) {
        super(source);
    }
    /**
     * Creates a new instance from Uri
     *
     * @param source Source object
     */
    public DeviceId(Uri source) {
            super(source);
    }

    public static DeviceId getDefaultInstance(String defaultValue) {
        return new DeviceId(defaultValue);
    }








}

