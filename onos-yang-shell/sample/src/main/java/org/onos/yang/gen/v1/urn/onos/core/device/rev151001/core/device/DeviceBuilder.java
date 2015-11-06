package org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device;
import org.onos.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.onos.yang.gen.v1.urn.onos.core.device.rev151001.DeviceId;
import org.onos.yangtools.concepts.Builder;
import org.onos.yang.gen.v1.urn.onos.core.device.rev151001.ChassisIdx;
import com.google.common.collect.Range;
import org.onos.yangtools.yang.binding.Augmentation;
import org.onos.yangtools.yang.binding.DataObject;
import org.onos.yang.gen.v1.urn.onos.core.device.rev151001.SupportType;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device} instances.
 *
 * @see org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device
 *
 */
public class DeviceBuilder implements Builder <org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device> {

    private ChassisIdx _chassis;
    private java.lang.String _hwVersion;
    private DeviceId _id;
    private java.lang.String _manufacturer;
    private java.lang.String _serialNumber;
    private java.lang.String _swVersion;
    private SupportType _type;

    Map<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device>>, Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device>> augmentation = Collections.emptyMap();

    public DeviceBuilder() {
    }

    public DeviceBuilder(Device base) {
        this._chassis = base.getChassis();
        this._hwVersion = base.getHwVersion();
        this._id = base.getId();
        this._manufacturer = base.getManufacturer();
        this._serialNumber = base.getSerialNumber();
        this._swVersion = base.getSwVersion();
        this._type = base.getType();
        if (base instanceof DeviceImpl) {
            DeviceImpl impl = (DeviceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device> casted =(AugmentationHolder<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ChassisIdx getChassis() {
        return _chassis;
    }
    
    public java.lang.String getHwVersion() {
        return _hwVersion;
    }
    
    public DeviceId getId() {
        return _id;
    }
    
    public java.lang.String getManufacturer() {
        return _manufacturer;
    }
    
    public java.lang.String getSerialNumber() {
        return _serialNumber;
    }
    
    public java.lang.String getSwVersion() {
        return _swVersion;
    }
    
    public SupportType getType() {
        return _type;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    private static void checkChassisRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥4294967295]].", value));
    }
    
    public DeviceBuilder setChassis(ChassisIdx value) {
        if (value != null) {
            checkChassisRange(value.getValue());
        }
        this._chassis = value;
        return this;
    }
    /**
     * @deprecated This method is slated for removal in a future release. See BUG-1485 for details.
     */
    @Deprecated
    public static List<Range<BigInteger>> _chassis_range() {
        final List<Range<BigInteger>> ret = new java.util.ArrayList<>(1);
        ret.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
        return ret;
    }
    
    public DeviceBuilder setHwVersion(java.lang.String value) {
        this._hwVersion = value;
        return this;
    }
    
    public DeviceBuilder setId(DeviceId value) {
        if (value != null) {
        }
        this._id = value;
        return this;
    }
    
    public DeviceBuilder setManufacturer(java.lang.String value) {
        this._manufacturer = value;
        return this;
    }
    
    public DeviceBuilder setSerialNumber(java.lang.String value) {
        this._serialNumber = value;
        return this;
    }
    
    public DeviceBuilder setSwVersion(java.lang.String value) {
        this._swVersion = value;
        return this;
    }
    
    public DeviceBuilder setType(SupportType value) {
        this._type = value;
        return this;
    }
    
    public DeviceBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device>> augmentationType, Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public DeviceBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public Device build() {
        return new DeviceImpl(this);
    }

    private static final class DeviceImpl implements Device {

        public java.lang.Class<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device> getImplementedInterface() {
            return org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device.class;
        }

        private final ChassisIdx _chassis;
        private final java.lang.String _hwVersion;
        private final DeviceId _id;
        private final java.lang.String _manufacturer;
        private final java.lang.String _serialNumber;
        private final java.lang.String _swVersion;
        private final SupportType _type;

        private Map<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device>>, Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device>> augmentation = Collections.emptyMap();

        private DeviceImpl(DeviceBuilder base) {
            this._chassis = base.getChassis();
            this._hwVersion = base.getHwVersion();
            this._id = base.getId();
            this._manufacturer = base.getManufacturer();
            this._serialNumber = base.getSerialNumber();
            this._swVersion = base.getSwVersion();
            this._type = base.getType();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device>>, Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device>>, Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ChassisIdx getChassis() {
            return _chassis;
        }
        
        @Override
        public java.lang.String getHwVersion() {
            return _hwVersion;
        }
        
        @Override
        public DeviceId getId() {
            return _id;
        }
        
        @Override
        public java.lang.String getManufacturer() {
            return _manufacturer;
        }
        
        @Override
        public java.lang.String getSerialNumber() {
            return _serialNumber;
        }
        
        @Override
        public java.lang.String getSwVersion() {
            return _swVersion;
        }
        
        @Override
        public SupportType getType() {
            return _type;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_chassis == null) ? 0 : _chassis.hashCode());
            result = prime * result + ((_hwVersion == null) ? 0 : _hwVersion.hashCode());
            result = prime * result + ((_id == null) ? 0 : _id.hashCode());
            result = prime * result + ((_manufacturer == null) ? 0 : _manufacturer.hashCode());
            result = prime * result + ((_serialNumber == null) ? 0 : _serialNumber.hashCode());
            result = prime * result + ((_swVersion == null) ? 0 : _swVersion.hashCode());
            result = prime * result + ((_type == null) ? 0 : _type.hashCode());
            result = prime * result + ((augmentation == null) ? 0 : augmentation.hashCode());
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device other = (org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device)obj;
            if (_chassis == null) {
                if (other.getChassis() != null) {
                    return false;
                }
            } else if(!_chassis.equals(other.getChassis())) {
                return false;
            }
            if (_hwVersion == null) {
                if (other.getHwVersion() != null) {
                    return false;
                }
            } else if(!_hwVersion.equals(other.getHwVersion())) {
                return false;
            }
            if (_id == null) {
                if (other.getId() != null) {
                    return false;
                }
            } else if(!_id.equals(other.getId())) {
                return false;
            }
            if (_manufacturer == null) {
                if (other.getManufacturer() != null) {
                    return false;
                }
            } else if(!_manufacturer.equals(other.getManufacturer())) {
                return false;
            }
            if (_serialNumber == null) {
                if (other.getSerialNumber() != null) {
                    return false;
                }
            } else if(!_serialNumber.equals(other.getSerialNumber())) {
                return false;
            }
            if (_swVersion == null) {
                if (other.getSwVersion() != null) {
                    return false;
                }
            } else if(!_swVersion.equals(other.getSwVersion())) {
                return false;
            }
            if (_type == null) {
                if (other.getType() != null) {
                    return false;
                }
            } else if(!_type.equals(other.getType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DeviceImpl otherImpl = (DeviceImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device>>, Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Device [");
            boolean first = true;
        
            if (_chassis != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_chassis=");
                builder.append(_chassis);
             }
            if (_hwVersion != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_hwVersion=");
                builder.append(_hwVersion);
             }
            if (_id != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_id=");
                builder.append(_id);
             }
            if (_manufacturer != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_manufacturer=");
                builder.append(_manufacturer);
             }
            if (_serialNumber != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_serialNumber=");
                builder.append(_serialNumber);
             }
            if (_swVersion != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_swVersion=");
                builder.append(_swVersion);
             }
            if (_type != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_type=");
                builder.append(_type);
             }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
