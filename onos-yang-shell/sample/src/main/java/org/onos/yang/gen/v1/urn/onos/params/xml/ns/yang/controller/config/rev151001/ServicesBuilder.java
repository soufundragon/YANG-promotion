package org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001;
import org.onos.yangtools.yang.binding.Augmentation;
import org.onos.yangtools.yang.binding.AugmentationHolder;
import org.onos.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.onos.yangtools.concepts.Builder;
import org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.Service;
import java.util.List;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services} instances.
 *
 * @see org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services
 *
 */
public class ServicesBuilder implements Builder <org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services> {

    private List<Service> _service;

    Map<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services>> augmentation = Collections.emptyMap();

    public ServicesBuilder() {
    }

    public ServicesBuilder(Services base) {
        this._service = base.getService();
        if (base instanceof ServicesImpl) {
            ServicesImpl impl = (ServicesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services> casted =(AugmentationHolder<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Service> getService() {
        return _service;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ServicesBuilder setService(List<Service> value) {
        this._service = value;
        return this;
    }
    
    public ServicesBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services>> augmentationType, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public ServicesBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public Services build() {
        return new ServicesImpl(this);
    }

    private static final class ServicesImpl implements Services {

        public java.lang.Class<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services> getImplementedInterface() {
            return org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services.class;
        }

        private final List<Service> _service;

        private Map<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services>> augmentation = Collections.emptyMap();

        private ServicesImpl(ServicesBuilder base) {
            this._service = base.getService();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<Service> getService() {
            return _service;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_service == null) ? 0 : _service.hashCode());
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
            if (!org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services other = (org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services)obj;
            if (_service == null) {
                if (other.getService() != null) {
                    return false;
                }
            } else if(!_service.equals(other.getService())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ServicesImpl otherImpl = (ServicesImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Services>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Services [");
            boolean first = true;
        
            if (_service != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_service=");
                builder.append(_service);
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
