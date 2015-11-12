package org.onos.system.store;

import org.onos.system.agent.Registrable;
import org.onos.yangtools.yang.binding.DataObject;

public interface Dao extends Registrable {
	void instance2description(DataObject obj, Class clazz);
}
