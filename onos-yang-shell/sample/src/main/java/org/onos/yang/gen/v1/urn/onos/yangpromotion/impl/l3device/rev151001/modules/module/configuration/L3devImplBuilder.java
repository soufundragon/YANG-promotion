package org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration;
import org.onos.yangtools.yang.binding.Augmentation;
import org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreStore;
import org.onos.yangtools.yang.binding.AugmentationHolder;
import org.onos.yangtools.yang.binding.DataObject;
import org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent;
import java.util.HashMap;
import org.onos.yangtools.concepts.Builder;
import org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreService;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl} instances.
 *
 * @see org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl
 *
 */
public class L3devImplBuilder implements Builder <org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl> {

    private CoreEvent _coreEvent;
    private CoreService _coreService;
    private CoreStore _coreStore;

    Map<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl>>, Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl>> augmentation = Collections.emptyMap();

    public L3devImplBuilder() {
    }

    public L3devImplBuilder(L3devImpl base) {
        this._coreEvent = base.getCoreEvent();
        this._coreService = base.getCoreService();
        this._coreStore = base.getCoreStore();
        if (base instanceof L3devImplImpl) {
            L3devImplImpl impl = (L3devImplImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl> casted =(AugmentationHolder<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public CoreEvent getCoreEvent() {
        return _coreEvent;
    }
    
    public CoreService getCoreService() {
        return _coreService;
    }
    
    public CoreStore getCoreStore() {
        return _coreStore;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public L3devImplBuilder setCoreEvent(CoreEvent value) {
        this._coreEvent = value;
        return this;
    }
    
    public L3devImplBuilder setCoreService(CoreService value) {
        this._coreService = value;
        return this;
    }
    
    public L3devImplBuilder setCoreStore(CoreStore value) {
        this._coreStore = value;
        return this;
    }
    
    public L3devImplBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl>> augmentationType, Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public L3devImplBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public L3devImpl build() {
        return new L3devImplImpl(this);
    }

    private static final class L3devImplImpl implements L3devImpl {

        public java.lang.Class<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl> getImplementedInterface() {
            return org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl.class;
        }

        private final CoreEvent _coreEvent;
        private final CoreService _coreService;
        private final CoreStore _coreStore;

        private Map<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl>>, Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl>> augmentation = Collections.emptyMap();

        private L3devImplImpl(L3devImplBuilder base) {
            this._coreEvent = base.getCoreEvent();
            this._coreService = base.getCoreService();
            this._coreStore = base.getCoreStore();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl>>, Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl>>, Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public CoreEvent getCoreEvent() {
            return _coreEvent;
        }
        
        @Override
        public CoreService getCoreService() {
            return _coreService;
        }
        
        @Override
        public CoreStore getCoreStore() {
            return _coreStore;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_coreEvent == null) ? 0 : _coreEvent.hashCode());
            result = prime * result + ((_coreService == null) ? 0 : _coreService.hashCode());
            result = prime * result + ((_coreStore == null) ? 0 : _coreStore.hashCode());
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
            if (!org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl other = (org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl)obj;
            if (_coreEvent == null) {
                if (other.getCoreEvent() != null) {
                    return false;
                }
            } else if(!_coreEvent.equals(other.getCoreEvent())) {
                return false;
            }
            if (_coreService == null) {
                if (other.getCoreService() != null) {
                    return false;
                }
            } else if(!_coreService.equals(other.getCoreService())) {
                return false;
            }
            if (_coreStore == null) {
                if (other.getCoreStore() != null) {
                    return false;
                }
            } else if(!_coreStore.equals(other.getCoreStore())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                L3devImplImpl otherImpl = (L3devImplImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl>>, Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.L3devImpl>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("L3devImpl [");
            boolean first = true;
        
            if (_coreEvent != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_coreEvent=");
                builder.append(_coreEvent);
             }
            if (_coreService != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_coreService=");
                builder.append(_coreService);
             }
            if (_coreStore != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_coreStore=");
                builder.append(_coreStore);
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
