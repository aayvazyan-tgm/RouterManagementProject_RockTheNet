package rtn.networking.device.juniper_netscreen_5gt;

import java.util.ArrayList;
import java.util.List;

import rtn.networking.Action;
import rtn.networking.device.commands.IPullActions;

/**
 * Gets all actions available on this device.
 * 
 * @author Andreas Willinger
 *
 */
public class PullActions implements IPullActions
{
    private List<Action> actions;
    
    public PullActions()
    {
    	this.actions = new ArrayList<Action>();
    }

	/**
	 * @see rtn.networking.device.commands.IResult#getResult()
	 */
	@Override
	public Object getResult()
	{
		return this.actions;
	}

	/**
	 * @see rtn.networking.device.commands.IDevCommand#execute()
	 */
	@Override
	public void execute()
	{
		this.actions.add(new Action("permit"));
		this.actions.add(new Action("deny"));
		this.actions.add(new Action("tunnel"));
	}
}