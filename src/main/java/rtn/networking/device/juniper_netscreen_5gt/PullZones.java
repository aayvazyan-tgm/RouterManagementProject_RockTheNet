package rtn.networking.device.juniper_netscreen_5gt;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.snmp4j.smi.OID;
import org.snmp4j.util.TableEvent;

import rtn.networking.SNMPManager;
import rtn.networking.Zone;
import rtn.networking.device.commands.IPullZones;

public class PullZones implements IPullZones
{
    @SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(PullZones.class);
    
    private List<Zone> zones;
    private SNMPManager manager;
    
    public PullZones()
    {
    	this.zones = new ArrayList<Zone>();
    	this.manager = new SNMPManager();
    }

	/**
	 * @see rtn.networking.device.commands.IResult#getResult()
	 */
	@Override
	public Object getResult()
	{
		return this.zones;
	}

	/**
	 * @see rtn.networking.device.commands.IDevCommand#execute()
	 */
	@Override
	public void execute()
	{
		OID[] columns = new OID[]{new OID("1.3.6.1.4.1.3224.8.1.1.1.2")};
		List<TableEvent> result = manager.getTable(columns);
		
		for (int i = 0; i < result.size(); i++)
		{
			TableEvent event = result.get(i);
			if(event.getStatus() != 0) throw new RuntimeException("There was an error getting the zones from the device, message was: "+event.getErrorMessage());
			this.zones.add(new Zone(event.getColumns()[0].getVariable().toString()));
		}
	}
}