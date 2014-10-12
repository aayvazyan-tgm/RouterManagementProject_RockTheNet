package rtn;

import rtn.networking.monitoring.IMonitoringStrategy;
import rtn.networking.CommandProxy;
import java.util.List;
import rtn.networking.DataLoad;
import rtn.networking.Policy;

public interface IDataSource {

	private IMonitoringStrategy iMonitoringStrategy;

	private IMonitoringStrategy iMonitoringStrategy;

	private CommandProxy commandProxy;

	public List getPolicies();

	public DataLoad getThroughput(Policy policy);

}
