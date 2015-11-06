package org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services;
import org.onos.yangtools.yang.binding.Identifier;


public class ServiceKey
 implements Identifier<Service> {
    private static final long serialVersionUID = -1293098346495828801L;
    private final java.lang.Class<? extends org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ServiceType> _type;


    public ServiceKey(java.lang.Class<? extends org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ServiceType> _type) {
    
    
        this._type = _type;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ServiceKey(ServiceKey source) {
        this._type = source._type;
    }


    public java.lang.Class<? extends org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ServiceType> getType() {
        return _type;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        ServiceKey other = (ServiceKey) obj;
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
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.services.ServiceKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
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

