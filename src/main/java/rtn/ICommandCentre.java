package rtn;

import rtn.networking.Policy;
import java.util.List;

public interface ICommandCentre {
	public boolean enableAlarm();

	public boolean disableAlarm();

	public boolean addPolicy(Policy policy);

	public boolean updatePolicy(Policy newPolicy, Policy oldPolicy);

	public boolean deletePolicy(Policy policy);

	public List getServices();

	public List getZones();
	
	public List getActions();
}