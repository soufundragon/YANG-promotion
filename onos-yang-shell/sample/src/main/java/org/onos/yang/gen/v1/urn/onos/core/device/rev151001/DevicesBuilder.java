package org.onos.yang.gen.v1.urn.onos.core.device.rev151001;
import org.onos.yangtools.yang.binding.Augmentation;
import org.onos.yangtools.yang.binding.AugmentationHolder;
import org.onos.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.onos.yang.gen.v1.urn.onos.core.device.rev151001.devices.Device;
import org.onos.yangtools.concepts.Builder;
import java.util.List;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices} instances.
 *
 * @see org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices
 *
 */
public class DevicesBuilder implements Builder <org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices> {

    private List<Device> _device;

    Map<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices>>, Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices>> augmentation = Collections.emptyMap();

    public DevicesBuilder() {
    }

    public DevicesBuilder(Devices base) {
        this._device = base.getDevice();
        if (base instanceof DevicesImpl) {
            DevicesImpl impl = (DevicesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices> casted =(AugmentationHolder<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Device> getDevice() {
        return _device;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public DevicesBuilder setDevice(List<Device> value) {
        this._device = value;
        return this;
    }
    
    public DevicesBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices>> augmentationType, Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public DevicesBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public Devices build() {
        return new DevicesImpl(this);
    }

    private static final class DevicesImpl implements Devices {

        public java.lang.Class<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices> getImplementedInterface() {
            return org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices.class;
        }

        private final List<Device> _device;

        private Map<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices>>, Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices>> augmentation = Collections.emptyMap();

        private DevicesImpl(DevicesBuilder base) {
            this._device = base.getDevice();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices>>, Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices>>, Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<Device> getDevice() {
            return _device;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices other = (org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices)obj;
            if (_device == null) {
                if (other.getDevice() != null) {
                    return false;
                }
            } else if(!_device.equals(other.getDevice())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DevicesImpl otherImpl = (DevicesImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices>>, Augmentation<org.onos.yang.gen.v1.urn.onos.core.device.rev151001.Devices>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Devices [");
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
