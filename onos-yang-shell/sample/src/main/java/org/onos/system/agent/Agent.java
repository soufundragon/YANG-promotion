package org.onos.system.agent;

import org.onos.system.event.Notify;
import org.onos.system.service.Servize;
import org.onos.yang.gen.v1.urn.onos.params.xml.ns.yang.controller.config.rev151001.ServiceType;

import org.onos.system.store.Dao;



public interface Agent {
	
	void RegistryStore(ServiceType store, Class<? extends Dao> clazz);
	
	void RegistryService(ServiceType service, Class<? extends Servize> clazz);
	
	void RegistryEvent(ServiceType event, Class<? extends Notify> clazz);
	
	ServiceType getStoreDependency(Class<? extends Dao> clazz);
	
	ServiceType getServiceDependency(Class<? extends Servize> clazz);

	ServiceType getEventDependency(Class<? extends Notify> clazz);
}
