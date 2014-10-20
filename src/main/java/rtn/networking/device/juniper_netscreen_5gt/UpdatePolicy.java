package rtn.networking.device.juniper_netscreen_5gt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import rtn.networking.Policy;
import rtn.networking.admin.SSHProtocol;
import rtn.networking.device.commands.IAddPolicy;
import rtn.networking.device.commands.IUpdatePolicy;

/**
 * Updates an already existing policy on the Firewall.
 * 
 * @version 12.10.2014
 */
public class UpdatePolicy implements IUpdatePolicy
{
    private static final Logger logger = LoggerFactory.getLogger(UpdatePolicy.class);

	private Policy policy;
	private SSHProtocol protocol;
	
	public UpdatePolicy()
	{
		this.protocol = new SSHProtocol();
	}
	
	/**
	 * @see rtn.networking.device.commands.IParametrized#setParams(Object...)
	 * Required parameter: Policy
	 */
	@Override
	public void setParams(Object... params)
	{
		if(params == null) return;
		if(!(params[0] instanceof Policy)) return;
		this.policy = (Policy)params[0];
	}

	/**
	 * @see rtn.networking.device.commands.IDevCommand#execute()
	 */
	@Override
	public void execute() throws Exception
	{
		if(policy == null) throw new IllegalArgumentException("Policy can not be null!");
		if(policy.getId() == null ||
		   policy.getId() < 1 ||
		   policy.getInzone() == null ||
		   policy.getOutzone() == null ||
		   policy.getSource() == null ||
		   policy.getSource().length() == 0 ||
		   policy.getDestination() == null ||
		   policy.getDestination().length() == 0 ||
		   policy.getService() == null ||
		   policy.getAction() == null) throw new IllegalArgumentException("Missing parameters");
		
		StringBuilder command = new StringBuilder("set policy id "+policy.getId());
		if(policy.getDisplayname() != null && policy.getDisplayname().length() > 0) command.append(" name "+policy.getDisplayname());
		command.append(" from "+policy.getInzone().getName());
		command.append(" to "+policy.getOutzone().getName());
		command.append(" "+policy.getSource());
		command.append(" "+policy.getDestination());
		command.append(" "+policy.getService().getName());
		command.append(" "+policy.getAction().getName());
		if(policy.isLog()) command.append(" log");
		
		String response = this.protocol.sendCommand(command.toString());
		if(response == null) throw new RuntimeException("Failed sending command");
	}
}