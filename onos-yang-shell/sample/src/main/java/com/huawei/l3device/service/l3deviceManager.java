package com.huawei.l3device.service;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Deactivate;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.ReferenceCardinality;
import org.apache.felix.scr.annotations.Service;
import org.onos.system.agent.Agent;
import org.onos.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv4Address;
import org.onos.yang.gen.v1.urn.onos.core.binding.rev151001.CoreDeviceStore;
import org.onos.yang.gen.v1.urn.onos.core.device.rev151001.ChassisIdx;
import org.onos.yang.gen.v1.urn.onos.core.device.rev151001.DeviceId;
import org.onos.yang.gen.v1.urn.onos.core.device.rev151001.SupportType;
import org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.DeviceBuilder;
import org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.Connection;
import org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3Device;
import org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.L3DeviceBuilder;
import org.onos.yangtools.yang.binding.Augmentation;
import org.onosproject.net.Device;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Component(immediate = true)
@Service
public class l3deviceManager implements l3deviceService{

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Reference(cardinality = ReferenceCardinality.MANDATORY_UNARY)
    protected Agent systemAgentService;
	
    @Activate
    protected void activate() {
    	
        log.info("Started");
    }
    
    @Deactivate
    protected void deactivate() {

        log.info("Stopped");
    }

	public Iterable<Device> getDevices() {

		CoreDeviceStore store = (CoreDeviceStore)systemAgentService.getStoreDependency(CoreDeviceStore.class);
		
		org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.l3.device.L3Device l3Device = 
				new org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.l3.device.L3DeviceBuilder().setIp(new Ipv4Address("100.0.0.1"))
				.setPassword("demo_password").setUser("demo_user").build();

		org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device device = new DeviceBuilder().setId(new DeviceId("demo_deviceId"))
				.setChassis(new ChassisIdx(new java.lang.Long(100))).setHwVersion("demo_version").setManufacturer("demo_manu")
				.setSerialNumber("demo_serial").setSwVersion("demo_version").setType(SupportType.forValue(1))
				.addAugmentation(org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.l3.device.L3Device.class, l3Device).build();
		
		store.instance2description(device, org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.l3.device.L3Device.class);
		
		
		
		return null;
	}
    
    
}
