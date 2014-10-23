package rtn.networking.device.juniper_netscreen_5gt;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.snmp4j.smi.OID;
import org.snmp4j.util.TableEvent;

import rtn.networking.SNMPManager;
import rtn.networking.Service;
import rtn.networking.device.commands.IPullServices;

/**
 * Gets all services available on this device.
 * 
 * @author Andreas Willinger
 */
public class PullServices implements IPullServices
{
    @SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(PullServices.class);
    
	private List<Service> services;
	private SNMPManager manager;
	
	public PullServices()
	{
		this.services = new ArrayList<Service>();
		this.manager = new SNMPManager();
	}
	
	/**
	 * @see rtn.networking.device.commands.IResult#getResult()
	 */
	@Override
	public Object getResult()
	{
		return services;
	}

	/**
	 * @see rtn.networking.device.commands.IDevCommand#execute()
	 */
	@Override
	public void execute()
	{
		OID[] columns = new OID[]{new OID("1.3.6.1.4.1.3224.13.1.1.2")};
		List<TableEvent> result = manager.getTable(columns);
		
		for (int i = 0; i < result.size(); i++)
		{
			TableEvent event = result.get(i);
			if(event.getStatus() != 0) throw new RuntimeException("There was an error getting the services from the device, message was: "+event.getErrorMessage());
			this.services.add(new Service(event.getColumns()[0].getVariable().toString()));
		}
	}
}