package rtn.networking.device.juniper_netscreen_5gt;

import rtn.networking.Policy;
import rtn.networking.admin.SSHProtocol;
import rtn.networking.device.commands.IDeletePolicy;

public class DeletePolicy implements IDeletePolicy
{
	private Policy policy;
	private SSHProtocol protocol;
	
	public DeletePolicy()
	{
		this.protocol = new SSHProtocol();
	}
	
	@Override
	public void setParams(Object... params)
	{
		if(params == null) return;
		if(!(params[0] instanceof Policy)) return;
		this.policy = (Policy)params[0];
	}

	@Override
	public void execute()
	{
		if(policy == null) throw new IllegalArgumentException("Policy can not be null!");
		if(policy.getId() == null || policy.getId() < 0) throw new IllegalArgumentException("Id is out of range");
		
		String command = "unset policy id "+policy.getId();
		
		String response = this.protocol.sendCommand(command);
		if(response == null) throw new RuntimeException("Failed sending command");
	}
}