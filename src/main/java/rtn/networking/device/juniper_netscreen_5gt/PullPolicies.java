package rtn.networking.device.juniper_netscreen_5gt;

import java.util.ArrayList;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.snmp4j.smi.OID;
import org.snmp4j.util.TableEvent;
import rtn.networking.*;
import rtn.networking.device.commands.IPullPolicies;
/**
 * 
 * @author Djuric Daniel
 * @version 23-10-2014
 */

public class PullPolicies implements IPullPolicies {
    private static final Logger logger = LoggerFactory.getLogger(PullPolicies.class);
	private SNMPManager manager = SNMPManager.getInstance();
    private List<Policy> policies;
	/**
	 * @see rtn.networking.device.commands.IResult#getResult()
	 */
   public PullPolicies() {
	this.policies= new ArrayList<Policy>();
}	
   	/**
   	 * @return Returns an Object with the Results
   	 */
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
		OID[] columns = new OID[]{
				new OID("1.3.6.1.4.1.3224.10.1.1.1"), //ID
				new OID("1.3.6.1.4.1.3224.10.1.1.3"), // SOURCE ZONE
				new OID("1.3.6.1.4.1.3224.10.1.1.4 "), // DESTINATION ZONE
				new OID("1.3.6.1.4.1.3224.10.1.1.5 "), // SOURCE ADRESS
				new OID("1.3.6.1.4.1.3224.10.1.1.6 "), // DESTINATION ADDRESS
				new OID("1.3.6.1.4.1.3224.10.1.1.7 "), // SERVICE
				new OID("1.3.6.1.4.1.3224.10.1.1.8 "), // ACTION
				new OID("1.3.6.1.4.1.3224.10.1.1.15 "), // LOG
				new OID("1.3.6.1.4.1.3224.10.1.1.24 ")};//THUROPUS
		List<TableEvent> result = manager.getTable(columns);
		
		
		for (int i = 0; i < result.size(); i++)
		{
			TableEvent event = result.get(i);
			
			if(event.getStatus() != 0) throw new RuntimeException("There was an error getting the services from the device, message was: "+event.getErrorMessage());
			Policy py = new Policy();
			py.setId(Long.parseLong(event.getColumns()[0].getVariable().toString()));

			Zone inZone=new Zone(event.getColumns()[1].getVariable().toString());
			py.setInzone(inZone); // source zone
			Zone outZone=new Zone(event.getColumns()[2].getVariable().toString());
			py.setOutzone(outZone);

			py.setSource(event.getColumns()[3].getVariable().toString());

			py.setDestination(event.getColumns()[4].getVariable().toString());

			Service service=new Service(event.getColumns()[5].getVariable().toString());

			py.setService(service);
			Action action = new Action(event.getColumns()[6].getVariable().toString());
			py.setAction(action);

			boolean log=Boolean.parseBoolean(event.getColumns()[7].getVariable().toString());
			py.setLog(log);

			py.setDisplayname(event.getColumns()[8].getVariable().toString());

			this.policies.add(py);
		}
	}
		
	}

