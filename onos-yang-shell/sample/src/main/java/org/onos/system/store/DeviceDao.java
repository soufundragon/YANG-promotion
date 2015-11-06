package org.onos.system.store;

import java.net.URI;

import org.onlab.packet.ChassisId;
import org.onos.yang.gen.v1.urn.onos.core.binding.rev151001.CoreDeviceStore;
import org.onos.yang.gen.v1.urn.onos.core.device.rev151001.core.device.Device;
import org.onos.yang.gen.v1.urn.onos.yangpromotion.def.l3device.rev151001.l3.device.L3Device;
import org.onos.yangtools.yang.binding.Augmentation;
import org.onos.yangtools.yang.binding.DataObject;
import org.onosproject.net.DefaultAnnotations;
import org.onosproject.net.SparseAnnotations;
import org.onosproject.net.device.DefaultDeviceDescription;
import org.onosproject.net.device.DeviceDescription;
import org.onosproject.net.Device.Type;
import org.onos.yang.gen.v1.urn.onos.core.device.rev151001.CoreDevice;
import org.onos.yang.gen.v1.urn.onos.core.device.rev151001.SupportType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeviceDao extends CoreDeviceStore {

	
	
	private ObjectMapper om = new ObjectMapper();
	
//	public R getAugment(Class<?> clazz){
//		
//		//om.readva
//		
//	}
	
	public void instance2description(DataObject obj, Class clazz) {
		DeviceDescription dd = null;
		
		if(obj instanceof CoreDevice){
			
			CoreDevice coreDevice = (CoreDevice) obj;
			
			Device device = coreDevice.getDevice();
			
			String augment2annotation = augment2annotation(device.getAugmentation(clazz));
			
			SparseAnnotations annotation = DefaultAnnotations.builder()
					.set(L3Device.class.getName(), augment2annotation)
					.build();
			
			dd = new DefaultDeviceDescription(URI.create(device.getId().getValue()),
					typeMatch(device.getType()), device.getManufacturer(), device.getHwVersion(),
					device.getSwVersion(), device.getSerialNumber(), new ChassisId(device.getChassis().getValue()), annotation);
			
			
		}else{
			return;
		}
		
	}

	public String augment2annotation (Augmentation<?> aug){
		
		String writeValueAsString = null;

			try {
				writeValueAsString = om.writeValueAsString(aug);
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
		return writeValueAsString;
	}
	
	
	private static Type typeMatch (SupportType supportType){
		
		switch (supportType) {
		
		case Switch:
			return Type.SWITCH;
		case Router:
			return Type.ROUTER;
		case Roadm:
			return Type.ROADM;
		case Otn:
			return Type.OTN;
		case RoadmOtn:
			return Type.ROADM_OTN;
		case Firewall:
			return Type.FIREWALL;
		case Balancer:
			return Type.BALANCER;
		case Ips:
			return Type.IPS;
		case Ids:
			return Type.IDS;
		case Controller:
			return Type.CONTROLLER;
		case Other:
			return Type.OTHER;
		}
	return null;	
	}

	public void registryMyself(org.onos.system.agent.Agent agent) {
		// TODO Auto-generated method stub
		agent.RegistryStore(this, this.getClass());
	}

}
