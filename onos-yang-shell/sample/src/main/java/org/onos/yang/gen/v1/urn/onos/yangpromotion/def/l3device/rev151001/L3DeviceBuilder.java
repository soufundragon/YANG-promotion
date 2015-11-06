package org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001;
import org.onos.yangtools.yang.binding.Augmentation;
import org.onos.yangtools.yang.binding.AugmentationHolder;
import org.onos.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device;
import org.onos.yangtools.concepts.Builder;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device} instances.
 *
 * @see org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device
 *
 */
public class L3DeviceBuilder implements Builder <org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device> {

    private Device _device;

    Map<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device>>, Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device>> augmentation = Collections.emptyMap();

    public L3DeviceBuilder() {
    }
    public L3DeviceBuilder(org.onos.yang.gen.v1.urn.onos.core.device.rev151001.CoreDevice arg) {
        this._device = arg.getDevice();
    }

    public L3DeviceBuilder(L3Device base) {
        this._device = base.getDevice();
        if (base instanceof L3DeviceImpl) {
            L3DeviceImpl impl = (L3DeviceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device> casted =(AugmentationHolder<org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device>) base;
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

    public Device getDevice() {
        return _device;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public L3DeviceBuilder setDevice(Device value) {
        this._device = value;
        return this;
    }
    
    public L3DeviceBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device>> augmentationType, Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public L3DeviceBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public L3Device build() {
        return new L3DeviceImpl(this);
    }

    private static final class L3DeviceImpl implements L3Device {

        public java.lang.Class<org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device> getImplementedInterface() {
            return org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device.class;
        }

        private final Device _device;

        private Map<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device>>, Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device>> augmentation = Collections.emptyMap();

        private L3DeviceImpl(L3DeviceBuilder base) {
            this._device = base.getDevice();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device>>, Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device>>, Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public Device getDevice() {
            return _device;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device other = (org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device)obj;
            if (_device == null) {
                if (other.getDevice() != null) {
                    return false;
                }
            } else if(!_device.equals(other.getDevice())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                L3DeviceImpl otherImpl = (L3DeviceImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device>>, Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("L3Device [");
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
