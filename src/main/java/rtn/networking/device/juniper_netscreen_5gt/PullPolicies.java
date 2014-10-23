package rtn.networking.device.juniper_netscreen_5gt;

import java.util.ArrayList;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import rtn.networking.Policy;
import rtn.networking.device.commands.IPullPolicies;
/**
 * 
 * @author Djuric Daniel
 * @version 23-10-2014
 */

public class PullPolicies implements IPullPolicies {
    private static final Logger logger = LoggerFactory.getLogger(PullPolicies.class);

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
				py.setId(event.getColumns()[0].getVariable().toString());
				
				py.setInzone(event.getColumns()[1].getVariable().toString()); // source zone
				
				py.setOutzone(event.getColumns()[2].getVariable().toString());
				
				py.setSource(event.getColumns()[3].getVariable().toString());
				
				py.setDestination(event.getColumns()[4].getVariable().toString());
				
				py.setService(event.getColumns()[5].getVariable().toString());
				
				py.setAction(event.getColumns()[6].getVariable().toString());
				
				py.setLog(event.getColumns()[7].getVariable().toString());
				
				py.setDisplayname(event.getColumns()[8].getVariable().toString());
				
				this.policies.add(py);
		}
	}
		
	}

