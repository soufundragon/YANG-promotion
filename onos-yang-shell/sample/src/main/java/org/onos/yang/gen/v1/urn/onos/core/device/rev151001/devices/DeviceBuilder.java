package org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices;
import org.onos.yangtools.yang.binding.Augmentation;
import org.onos.yangtools.yang.binding.AugmentationHolder;
import org.onos.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.onos.yangtools.concepts.Builder;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device} instances.
 *
 * @see org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device
 *
 */
public class DeviceBuilder implements Builder <org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device> {

    private org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device _device;

    Map<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device>>, Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device>> augmentation = Collections.emptyMap();

    public DeviceBuilder() {
    }
    public DeviceBuilder(org.onos.yang.gen.v1.urn.onos.core.device.rev151001.CoreDevice arg) {
        this._device = arg.getDevice();
    }

    public DeviceBuilder(Device base) {
        this._device = base.getDevice();
        if (base instanceof DeviceImpl) {
            DeviceImpl impl = (DeviceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device> casted =(AugmentationHolder<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.onos.yang.gen.v1.urn.onos.core.device.rev151001.CoreDevice</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.onos.yang.gen.v1.urn.onos.core.device.rev151001.CoreDevice) {
            this._device = ((org.onos.yang.gen.v1.urn.onos.core.device.rev151001.CoreDevice)arg).getDevice();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.onos.yang.gen.v1.urn.onos.core.device.rev151001.CoreDevice] \n" +
              "but was: " + arg
            );
        }
    }

    public org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device getDevice() {
        return _device;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public DeviceBuilder setDevice(org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device value) {
        this._device = value;
        return this;
    }
    
    public DeviceBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device>> augmentationType, Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public DeviceBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public Device build() {
        return new DeviceImpl(this);
    }

    private static final class DeviceImpl implements Device {

        public java.lang.Class<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device> getImplementedInterface() {
            return org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device.class;
        }

        private final org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device _device;

        private Map<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device>>, Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device>> augmentation = Collections.emptyMap();

        private DeviceImpl(DeviceBuilder base) {
            this._device = base.getDevice();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device>>, Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device>>, Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device getDevice() {
            return _device;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_device == null) ? 0 : _device.hashCode());
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
            if (!org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device other = (org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device)obj;
            if (_device == null) {
                if (other.getDevice() != null) {
                    return false;
                }
            } else if(!_device.equals(other.getDevice())) {
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
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device>>, Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device>> e : augmentation.entrySet()) {
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
        
            if (_device != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_device=");
                builder.append(_device);
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
