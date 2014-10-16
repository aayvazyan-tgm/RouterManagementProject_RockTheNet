package rtn.networking.device.juniper_netscreen_5gt;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import rtn.networking.Action;
import rtn.networking.device.commands.IPullActions;

public class PullActions implements IPullActions
{
    @SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(PullActions.class);
    
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