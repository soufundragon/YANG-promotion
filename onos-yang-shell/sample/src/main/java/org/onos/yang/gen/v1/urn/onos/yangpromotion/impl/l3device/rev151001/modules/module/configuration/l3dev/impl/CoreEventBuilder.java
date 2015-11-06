package org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl;
import org.onos.yangtools.yang.binding.Augmentation;
import org.onos.yangtools.yang.binding.AugmentationHolder;
import org.onos.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.onos.yangtools.concepts.Builder;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent} instances.
 *
 * @see org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent
 *
 */
public class CoreEventBuilder implements Builder <org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent> {

    private java.lang.Object _name;
    private java.lang.Class<? extends org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ServiceType> _type;

    Map<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent>>, Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent>> augmentation = Collections.emptyMap();

    public CoreEventBuilder() {
    }
    public CoreEventBuilder(org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ServiceRef arg) {
        this._type = arg.getType();
        this._name = arg.getName();
    }

    public CoreEventBuilder(CoreEvent base) {
        this._name = base.getName();
        this._type = base.getType();
        if (base instanceof CoreEventImpl) {
            CoreEventImpl impl = (CoreEventImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent> casted =(AugmentationHolder<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ServiceRef</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ServiceRef) {
            this._type = ((org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ServiceRef)arg).getType();
            this._name = ((org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ServiceRef)arg).getName();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ServiceRef] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Object getName() {
        return _name;
    }
    
    public java.lang.Class<? extends org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ServiceType> getType() {
        return _type;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public CoreEventBuilder setName(java.lang.Object value) {
        this._name = value;
        return this;
    }
    
    public CoreEventBuilder setType(java.lang.Class<? extends org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ServiceType> value) {
        this._type = value;
        return this;
    }
    
    public CoreEventBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent>> augmentationType, Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public CoreEventBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public CoreEvent build() {
        return new CoreEventImpl(this);
    }

    private static final class CoreEventImpl implements CoreEvent {

        public java.lang.Class<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent> getImplementedInterface() {
            return org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent.class;
        }

        private final java.lang.Object _name;
        private final java.lang.Class<? extends org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ServiceType> _type;

        private Map<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent>>, Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent>> augmentation = Collections.emptyMap();

        private CoreEventImpl(CoreEventBuilder base) {
            this._name = base.getName();
            this._type = base.getType();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent>>, Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent>>, Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Object getName() {
            return _name;
        }
        
        @Override
        public java.lang.Class<? extends org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ServiceType> getType() {
            return _type;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_name == null) ? 0 : _name.hashCode());
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
            if (!org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent other = (org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent)obj;
            if (_name == null) {
                if (other.getName() != null) {
                    return false;
                }
            } else if(!_name.equals(other.getName())) {
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
                CoreEventImpl otherImpl = (CoreEventImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent>>, Augmentation<org.onos.yang.gen.v1.urn.onos.yangpromotion.impl.l3device.rev151001.modules.module.configuration.l3dev.impl.CoreEvent>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("CoreEvent [");
            boolean first = true;
        
            if (_name != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_name=");
                builder.append(_name);
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
