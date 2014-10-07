package rtn.gui.model;

import java.util.List;

import rtn.networking.Policy;
import rtn.networking.Service;
import rtn.networking.Zone;

public class ActionManager {
	private boolean sendEmail(String recipetend, String message) {
		return false;
	}

	public boolean enableAlarm() {
		return false;
	}

	public boolean disableAlarm() {
		return false;
	}

	public boolean addPolicy(Policy policy) {
        return false;
	}

	public boolean updatePolicy(Policy newPolicy,Policy oldPolicy) {
        return false;
	}

	public boolean deletePolicy(Policy policy) {
        return false;
	}

	public List<Service> getServices() {
		return null;
	}
	
	public List<Zone> getZones() {
		return null;
	}
}
