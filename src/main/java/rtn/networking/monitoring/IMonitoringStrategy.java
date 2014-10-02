package rtn.networking.monitoring;

import rtn.networking.DataLoad;
import rtn.networking.Policy;

import java.util.List;

public interface IMonitoringStrategy {

	public abstract boolean getConnection(String address);

	public abstract List getPolicies();

	public abstract DataLoad getThroughputUpload(Policy policy, int since);

}
