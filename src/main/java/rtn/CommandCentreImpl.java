package rtn;

import java.util.List;

import rtn.networking.Action;
import rtn.networking.Policy;
import rtn.networking.Service;
import rtn.networking.Zone;

public class CommandCentreImpl implements ICommandCentre
{
	@Override
	public boolean enableAlarm()
	{
		return false;
	}

	@Override
	public boolean disableAlarm()
	{
		return false;
	}

	@Override
	public boolean addPolicy(Policy policy)
	{
		return false;
	}

	@Override
	public boolean updatePolicy(Policy newPolicy, Policy oldPolicy)
	{
		return false;
	}

	@Override
	public boolean deletePolicy(Policy policy)
	{
		return false;
	}

	@Override
	public List<Service> getServices()
	{
		return null;
	}

	@Override
	public List<Zone> getZones()
	{
		return null;
	}

	@Override
	public List<Action> getActions()
	{
		return null;
	}
}