package rtn.networking.device.juniper_netscreen_5gt;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import rtn.networking.Action;
import rtn.networking.Policy;
import rtn.networking.device.commands.IPullPolicies;

public class PullPolicies implements IPullPolicies {
    private static final Logger logger = LoggerFactory.getLogger(PullPolicies.class);

    private List<Policy> policies;
	/**
	 * @see rtn.networking.device.commands.IResult#getResult()
	 */
   public PullPolicies() {
	this.policies= new ArrayList<Policy>();
}
	@Override
	public Object getResult()
	{
		
		return this.policies;
	}
	
	/**
	 * @see rtn.networking.device.commands.IDevCommand#execute()
	 */
	@Override
	public void execute()
	{
		// TODO Auto-generated method stub
		
	}
}
