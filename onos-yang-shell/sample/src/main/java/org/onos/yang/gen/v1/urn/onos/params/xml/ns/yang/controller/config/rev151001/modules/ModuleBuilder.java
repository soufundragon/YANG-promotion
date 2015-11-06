package org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules;
import org.onos.yangtools.yang.binding.Augmentation;
import org.onos.yangtools.yang.binding.AugmentationHolder;
import org.onos.yangtools.yang.binding.DataObject;
import org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.module.Configuration;
import java.util.HashMap;
import org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.module.State;
import org.onos.yangtools.concepts.Builder;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module} instances.
 *
 * @see org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module
 *
 */
public class ModuleBuilder implements Builder <org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module> {

    private Configuration _configuration;
    private ModuleKey _key;
    private java.lang.String _name;
    private State _state;
    private java.lang.Class<? extends org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ModuleType> _type;

    Map<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module>> augmentation = Collections.emptyMap();

    public ModuleBuilder() {
    }

    public ModuleBuilder(Module base) {
        if (base.getKey() == null) {
            this._key = new ModuleKey(
                base.getName(), 
                base.getType()
            );
            this._name = base.getName();
            this._type = base.getType();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
            this._type = _key.getType();
        }
        this._configuration = base.getConfiguration();
        this._state = base.getState();
        if (base instanceof ModuleImpl) {
            ModuleImpl impl = (ModuleImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module> casted =(AugmentationHolder<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public Configuration getConfiguration() {
        return _configuration;
    }
    
    public ModuleKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public State getState() {
        return _state;
    }
    
    public java.lang.Class<? extends org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ModuleType> getType() {
        return _type;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ModuleBuilder setConfiguration(Configuration value) {
        this._configuration = value;
        return this;
    }
    
    public ModuleBuilder setKey(ModuleKey value) {
        this._key = value;
        return this;
    }
    
    public ModuleBuilder setName(java.lang.String value) {
        this._name = value;
        return this;
    }
    
    public ModuleBuilder setState(State value) {
        this._state = value;
        return this;
    }
    
    public ModuleBuilder setType(java.lang.Class<? extends org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ModuleType> value) {
        this._type = value;
        return this;
    }
    
    public ModuleBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module>> augmentationType, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public ModuleBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public Module build() {
        return new ModuleImpl(this);
    }

    private static final class ModuleImpl implements Module {

        public java.lang.Class<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module> getImplementedInterface() {
            return org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module.class;
        }

        private final Configuration _configuration;
        private final ModuleKey _key;
        private final java.lang.String _name;
        private final State _state;
        private final java.lang.Class<? extends org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ModuleType> _type;

        private Map<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module>> augmentation = Collections.emptyMap();

        private ModuleImpl(ModuleBuilder base) {
            if (base.getKey() == null) {
                this._key = new ModuleKey(
                    base.getName(), 
                    base.getType()
                );
                this._name = base.getName();
                this._type = base.getType();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
                this._type = _key.getType();
            }
            this._configuration = base.getConfiguration();
            this._state = base.getState();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public Configuration getConfiguration() {
            return _configuration;
        }
        
        @Override
        public ModuleKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public State getState() {
            return _state;
        }
        
        @Override
        public java.lang.Class<? extends org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ModuleType> getType() {
            return _type;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_configuration == null) ? 0 : _configuration.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_name == null) ? 0 : _name.hashCode());
            result = prime * result + ((_state == null) ? 0 : _state.hashCode());
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
            if (!org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module other = (org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module)obj;
            if (_configuration == null) {
                if (other.getConfiguration() != null) {
                    return false;
                }
            } else if(!_configuration.equals(other.getConfiguration())) {
                return false;
            }
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
            if (_state == null) {
                if (other.getState() != null) {
                    return false;
                }
            } else if(!_state.equals(other.getState())) {
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
                ModuleImpl otherImpl = (ModuleImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Module [");
            boolean first = true;
        
            if (_configuration != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_configuration=");
                builder.append(_configuration);
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
            if (_name != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_name=");
                builder.append(_name);
             }
            if (_state != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_state=");
                builder.append(_state);
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
