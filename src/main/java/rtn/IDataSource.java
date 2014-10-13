package rtn;

import rtn.networking.DataLoad;
import rtn.networking.Policy;

import java.util.List;

public interface IDataSource {

	public List getPolicies();

	public DataLoad getThroughput(Policy policy);

}
