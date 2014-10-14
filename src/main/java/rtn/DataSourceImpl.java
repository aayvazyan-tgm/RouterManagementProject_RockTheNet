package rtn;

import java.util.List;
import java.util.Map;

import rtn.networking.DataLoad;
import rtn.networking.Policy;

public class DataSourceImpl implements IDataSource {
	private Map<Policy, Integer> lastchecks;
	private Map<Policy, DataLoad> lastloads;

	@Override
	public List<Policy> getPolicies()
	{
		return null;
	}

	@Override
	public DataLoad getThroughput(Policy policy)
	{
		return null;
	}
}