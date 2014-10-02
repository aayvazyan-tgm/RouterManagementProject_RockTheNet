package rtn.networking;

import rtn.networking.monitoring.IMonitoringStrategy;

import java.util.List;

public class AbstractSNMPStrategy implements IMonitoringStrategy {


	/**
	 * @see rtn.networking.monitoring.IMonitoringStrategy#getConnection(java.lang.String)
	 */
	public boolean getConnection(String address) {
		return false;
	}


	/**
	 * @see rtn.networking.monitoring.IMonitoringStrategy#getPolicies()
	 */
	public List getPolicies() {
		return null;
	}


	/**
	 * @see rtn.networking.monitoring.IMonitoringStrategy#getThroughputUpload(rtn.networking.Policy, int)
	 */
	public DataLoad getThroughputUpload(Policy policy, int since) {
		return null;
	}

}
