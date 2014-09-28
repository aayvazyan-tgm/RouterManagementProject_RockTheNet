package rtn.networking.device.juniper_netscreen_5gt;

import rtn.networking.IMonitoringStrategy;
import rtn.networking.AbstractSNMPStrategy;
import java.util.List;
import rtn.networking.DataLoad;
import rtn.networking.Policy;

public class SNMPStrategy extends AbstractSNMPStrategy implements IMonitoringStrategy {

	private boolean isv3Available() {
		return false;
	}


	/**
	 * @see rtn.networking.IMonitoringStrategy#getConnection(java.lang.String)
	 */
	public boolean getConnection(String address) {
		return false;
	}


	/**
	 * @see rtn.networking.IMonitoringStrategy#getPolicies()
	 */
	public List getPolicies() {
		return null;
	}


	/**
	 * @see rtn.networking.IMonitoringStrategy#getThroughputUpload(rtn.networking.Policy, int)
	 */
	public DataLoad getThroughputUpload(Policy policy, int since) {
		return null;
	}

}