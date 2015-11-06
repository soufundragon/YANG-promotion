package org.onos.system.agent;

import java.util.HashMap;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Deactivate;
import org.apache.felix.scr.annotations.Service;
import org.onos.system.event.Notify;
import org.onos.system.service.Servize;
import org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ServiceType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.onos.system.store.Dao;

@Component(immediate = true)
@Service
public class SystemAgentService implements Agent{

	static final HashMap<Class<? extends Dao>, ServiceType> storeMap = new HashMap<Class<? extends Dao>, ServiceType>();
	//HashMap<String, ServiceType> serviceMap = new HashMap<String, ServiceType>();
	//HashMap<String, ServiceType> eventMap = new HashMap<String, ServiceType>();

    private final Logger log = LoggerFactory.getLogger(getClass());
	
    @Activate
    protected void activate() {

        log.info("device agent started");
    }
    
    @Deactivate
    protected void deactivate() {

        log.info("device agent stopped");
    }
	
	public synchronized void RegistryStore(ServiceType store, Class<? extends Dao> clazz) {
		storeMap.put(clazz, store);
	}

	public synchronized ServiceType getStoreDependency(Class<? extends Dao> clazz) {
		return storeMap.get(clazz);
	}

	public synchronized void RegistryService(ServiceType service, Class<? extends Servize> clazz) {
		// TODO Auto-generated method stub
		
	}
	
	public synchronized void RegistryEvent(ServiceType event, Class<? extends Notify> clazz) {
		// TODO Auto-generated method stub
		
	}
	
	public synchronized ServiceType getServiceDependency(Class<? extends Servize> clazz) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public synchronized ServiceType getEventDependency(Class<? extends Notify> clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
