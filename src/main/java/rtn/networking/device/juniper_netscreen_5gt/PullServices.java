package rtn.networking.device.juniper_netscreen_5gt;

import java.util.ArrayList;
import java.util.List;

import rtn.networking.Service;
import rtn.networking.device.commands.IPullServices;

public class PullServices implements IPullServices {
	
	private List<Service> service;
	
	public PullServices(List<Service> service) {
		this.service=service;
	}
	/**
	 * @see rtn.networking.device.commands.IResult#getResult()
	 */
	@Override
	public Object getResult()
	{
		List<Object> result = new ArrayList<Object>(service);
		return result;
	}

	/**
	 * @see rtn.networking.device.commands.IDevCommand#execute()
	 */
	@Override
	public void execute()
	{
		for(int i =0; i<service.size();i++){
			if(service.get(i) == null) throw new IllegalArgumentException("No Service!");
			if(service.get(i).getName() == null) throw new IllegalArgumentException("No Service");
		}

		if(service == null) throw new IllegalArgumentException("Policy can not be null!");
	
		
	}
}
