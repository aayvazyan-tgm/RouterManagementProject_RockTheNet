package rtn;

import rtn.networking.Policy;
import java.util.List;

public interface ICommandCentre {

	private boolean sendEmail(String recipetend, String message);

	public boolean enableAlarm();

	public boolean disableAlarm();

	public boolean addPolicy(Policy policy);

	public boolean updatePolicy(Policy newPolicy, Policy oldPolicy);

	public boolean deletePolicy(Policy policy);

	public List getServices();

	public List getZones();

}
