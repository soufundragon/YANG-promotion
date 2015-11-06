package org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service;
import org.onos.yangtools.yang.binding.Augmentation;
import org.onos.yangtools.yang.binding.AugmentationHolder;
import org.onos.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.onos.yangtools.concepts.Builder;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance} instances.
 *
 * @see org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance
 *
 */
public class InstanceBuilder implements Builder <org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance> {

    private InstanceKey _key;
    private java.lang.String _name;
    private java.lang.String _provider;

    Map<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance>> augmentation = Collections.emptyMap();

    public InstanceBuilder() {
    }

    public InstanceBuilder(Instance base) {
        if (base.getKey() == null) {
            this._key = new InstanceKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._provider = base.getProvider();
        if (base instanceof InstanceImpl) {
            InstanceImpl impl = (InstanceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance> casted =(AugmentationHolder<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public InstanceKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.String getProvider() {
        return _provider;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public InstanceBuilder setKey(InstanceKey value) {
        this._key = value;
        return this;
    }
    
    public InstanceBuilder setName(java.lang.String value) {
        this._name = value;
        return this;
    }
    
    public InstanceBuilder setProvider(java.lang.String value) {
        this._provider = value;
        return this;
    }
    
    public InstanceBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance>> augmentationType, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public InstanceBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public Instance build() {
        return new InstanceImpl(this);
    }

    private static final class InstanceImpl implements Instance {

        public java.lang.Class<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance> getImplementedInterface() {
            return org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance.class;
        }

        private final InstanceKey _key;
        private final java.lang.String _name;
        private final java.lang.String _provider;

        private Map<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance>> augmentation = Collections.emptyMap();

        private InstanceImpl(InstanceBuilder base) {
            if (base.getKey() == null) {
                this._key = new InstanceKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._provider = base.getProvider();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public InstanceKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.String getProvider() {
            return _provider;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_name == null) ? 0 : _name.hashCode());
            result = prime * result + ((_provider == null) ? 0 : _provider.hashCode());
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
            if (!org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance other = (org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance)obj;
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_name == null) {
                if (other.getName() != null) {
                    return false;
                }
            } else if(!_name.equals(other.getName())) {
                return false;
            }
            if (_provider == null) {
                if (other.getProvider() != null) {
                    return false;
                }
            } else if(!_provider.equals(other.getProvider())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InstanceImpl otherImpl = (InstanceImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Instance [");
            boolean first = true;
        
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
             }
            if (_name != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_name=");
                builder.append(_name);
             }
            if (_provider != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_provider=");
                builder.append(_provider);
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
