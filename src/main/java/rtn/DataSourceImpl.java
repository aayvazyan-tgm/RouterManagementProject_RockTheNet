package rtn;

import java.util.List;
import java.util.Map;

import rtn.networking.CommandProxy;
import rtn.networking.Configuration;
import rtn.networking.DataLoad;
import rtn.networking.Policy;
import rtn.networking.device.commands.IPullPolicies;
import rtn.networking.device.commands.IPullThroughput;

public class DataSourceImpl implements IDataSource {
	private Map<Policy, Integer> lastchecks;
	private Map<Policy, DataLoad> lastloads;

	@Override
	public List<Policy> getPolicies()
	{
		try {
			IPullPolicies ipp=(IPullPolicies)CommandProxy.getCommand("PullPolicies", Configuration.getInstance().getDevice());
			try {
				ipp.execute();
				List<Policy> l= (List<Policy>) ipp.getResult();
				return l;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public DataLoad getThroughput()
	{
		try {
			IPullThroughput ipt =(IPullThroughput)CommandProxy.getCommand("PullThroughPut",  
					Configuration.getInstance().getDevice());
			try {
				ipt.execute();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}