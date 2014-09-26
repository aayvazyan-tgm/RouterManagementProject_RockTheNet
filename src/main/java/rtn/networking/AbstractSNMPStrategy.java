package rtn.networking;

import java.util.List;

public class AbstractSNMPStrategy implements IMonitoringStrategy {


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
