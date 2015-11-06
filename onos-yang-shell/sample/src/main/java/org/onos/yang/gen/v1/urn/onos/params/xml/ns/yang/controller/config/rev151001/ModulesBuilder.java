package org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001;
import org.onos.yangtools.yang.binding.Augmentation;
import org.onos.yangtools.yang.binding.AugmentationHolder;
import org.onos.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.onos.yangtools.concepts.Builder;
import java.util.List;
import org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.Module;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules} instances.
 *
 * @see org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules
 *
 */
public class ModulesBuilder implements Builder <org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules> {

    private List<Module> _module;

    Map<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules>> augmentation = Collections.emptyMap();

    public ModulesBuilder() {
    }

    public ModulesBuilder(Modules base) {
        this._module = base.getModule();
        if (base instanceof ModulesImpl) {
            ModulesImpl impl = (ModulesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules> casted =(AugmentationHolder<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Module> getModule() {
        return _module;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ModulesBuilder setModule(List<Module> value) {
        this._module = value;
        return this;
    }
    
    public ModulesBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules>> augmentationType, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public ModulesBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public Modules build() {
        return new ModulesImpl(this);
    }

    private static final class ModulesImpl implements Modules {

        public java.lang.Class<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules> getImplementedInterface() {
            return org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules.class;
        }

        private final List<Module> _module;

        private Map<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules>> augmentation = Collections.emptyMap();

        private ModulesImpl(ModulesBuilder base) {
            this._module = base.getModule();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<Module> getModule() {
            return _module;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_module == null) ? 0 : _module.hashCode());
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
            if (!org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules other = (org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules)obj;
            if (_module == null) {
                if (other.getModule() != null) {
                    return false;
                }
            } else if(!_module.equals(other.getModule())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ModulesImpl otherImpl = (ModulesImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules>>, Augmentation<org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.Modules>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Modules [");
            boolean first = true;
        
            if (_module != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_module=");
                builder.append(_module);
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
