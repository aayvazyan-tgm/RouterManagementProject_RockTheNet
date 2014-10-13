package rtn.networking.device.juniper_netscreen_5gt;

import rtn.networking.Service;
import rtn.networking.device.commands.IPullServices;

public class PullServices implements IPullServices {
	
	private Service service;
	
	public PullServices(Service service) {
		this.service=service;
	}
	/**
	 * @see rtn.networking.device.commands.IResult#getResult()
	 */
	@Override
	public Object getResult()
	{
		// TODO Auto-generated method stub
		return null;
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
