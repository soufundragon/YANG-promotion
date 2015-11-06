package org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules;
import org.onos.yangtools.yang.binding.Identifier;


public class ModuleKey
 implements Identifier<Module> {
    private static final long serialVersionUID = 8138550303713343285L;
    private final java.lang.String _name;
    private final java.lang.Class<? extends org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ModuleType> _type;


    public ModuleKey(java.lang.String _name, java.lang.Class<? extends org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ModuleType> _type) {
    
    
        this._name = _name;
        this._type = _type;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ModuleKey(ModuleKey source) {
        this._name = source._name;
        this._type = source._type;
    }


    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.Class<? extends org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ModuleType> getType() {
        return _type;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_name == null) ? 0 : _name.hashCode());
        result = prime * result + ((_type == null) ? 0 : _type.hashCode());
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ModuleKey other = (ModuleKey) obj;
        if (_name == null) {
            if (other._name != null) {
                return false;
            }
        } else if(!_name.equals(other._name)) {
            return false;
        }
        if (_type == null) {
            if (other._type != null) {
                return false;
            }
        } else if(!_type.equals(other._type)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.modules.ModuleKey.class.getSimpleName()).append(" [");
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
        return builder.append(']').toString();
    }



}

