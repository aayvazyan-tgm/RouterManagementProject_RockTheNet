package rtn.gui.model;

import rtn.networking.monitoring.IMonitoringStrategy;
import rtn.networking.MonitoringStrategyFactory;
import java.util.List;

public class DataManager {

	private int lastcheck;

	private IMonitoringStrategy router;

	private IMonitoringStrategy iMonitoringStrategy;

	private MonitoringStrategyFactory monitoringStrategyFactory;

	public List getPolicies() {
		return null;
	}

	public double getThroughput() {
		return 0;
	}

}
