package org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services;
import org.onos.yangtools.yang.binding.Augmentation;
import org.onos.yangtools.yang.binding.AugmentationHolder;
import org.onos.yangtools.yang.binding.DataObject;
import org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.service.Instance;
import java.util.HashMap;
import org.onos.yangtools.concepts.Builder;
import java.util.List;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service} instances.
 *
 * @see org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service
 *
 */
public class ServiceBuilder implements Builder <org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service> {

    private List<Instance> _instance;
    private ServiceKey _key;
    private java.lang.Class<? extends org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ServiceType> _type;

    Map<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service>> augmentation = Collections.emptyMap();

    public ServiceBuilder() {
    }

    public ServiceBuilder(Service base) {
        if (base.getKey() == null) {
            this._key = new ServiceKey(
                base.getType()
            );
            this._type = base.getType();
        } else {
            this._key = base.getKey();
            this._type = _key.getType();
        }
        this._instance = base.getInstance();
        if (base instanceof ServiceImpl) {
            ServiceImpl impl = (ServiceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service> casted =(AugmentationHolder<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Instance> getInstance() {
        return _instance;
    }
    
    public ServiceKey getKey() {
        return _key;
    }
    
    public java.lang.Class<? extends org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ServiceType> getType() {
        return _type;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ServiceBuilder setInstance(List<Instance> value) {
        this._instance = value;
        return this;
    }
    
    public ServiceBuilder setKey(ServiceKey value) {
        this._key = value;
        return this;
    }
    
    public ServiceBuilder setType(java.lang.Class<? extends org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ServiceType> value) {
        this._type = value;
        return this;
    }
    
    public ServiceBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service>> augmentationType, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public ServiceBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public Service build() {
        return new ServiceImpl(this);
    }

    private static final class ServiceImpl implements Service {

        public java.lang.Class<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service> getImplementedInterface() {
            return org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service.class;
        }

        private final List<Instance> _instance;
        private final ServiceKey _key;
        private final java.lang.Class<? extends org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ServiceType> _type;

        private Map<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service>> augmentation = Collections.emptyMap();

        private ServiceImpl(ServiceBuilder base) {
            if (base.getKey() == null) {
                this._key = new ServiceKey(
                    base.getType()
                );
                this._type = base.getType();
            } else {
                this._key = base.getKey();
                this._type = _key.getType();
            }
            this._instance = base.getInstance();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<Instance> getInstance() {
            return _instance;
        }
        
        @Override
        public ServiceKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Class<? extends org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ServiceType> getType() {
            return _type;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_instance == null) ? 0 : _instance.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
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
            if (!org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service other = (org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service)obj;
            if (_instance == null) {
                if (other.getInstance() != null) {
                    return false;
                }
            } else if(!_instance.equals(other.getInstance())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
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
                ServiceImpl otherImpl = (ServiceImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Service [");
            boolean first = true;
        
            if (_instance != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_instance=");
                builder.append(_instance);
             }
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
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
