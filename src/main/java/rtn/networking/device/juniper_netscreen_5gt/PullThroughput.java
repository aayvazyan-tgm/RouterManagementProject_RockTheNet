package rtn.networking.device.juniper_netscreen_5gt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.snmp4j.smi.OID;
import org.snmp4j.util.TableEvent;
import rtn.networking.*;
import rtn.networking.device.commands.IPullThroughput;

public class PullThroughput implements IPullThroughput {
    private static final Logger logger = LoggerFactory.getLogger(PullThroughput.class);

   // private List<> //;
    private SNMPManager manager = SNMPManager.getInstance();
    private Map<Long, Integer> throughputs;

    public PullThroughput(){
        this.throughputs = new HashMap<Long, Integer>();
    }

	/**
	 * @see rtn.networking.device.commands.IResult#getResult()
	 */
	@Override
	public Object getResult()
	{
		return this.throughputs;
	}

	/**
	 * @see rtn.networking.device.commands.IDevCommand#execute()
	 */
	@Override
	public void execute() {

        OID[] columns = new OID[]{
                new OID("1.3.6.1.4.1.3224.10.2.1.6"), //thorughput (byte/s)
                new OID("1.3.6.1.4.1.3224.10.2.1.1"), //policy id
        };
        List<TableEvent> result = manager.getTable(columns);
        for (int i = 0; i < result.size(); i++) {
            TableEvent event = result.get(i);


            if (event.getStatus() != 0)
                throw new RuntimeException("There was an error getting the services from the device, message was: " + event.getErrorMessage());

            Integer load  =Integer.parseInt(event.getColumns()[0].getVariable().toString());
            Long policyID = Long.parseLong(event.getColumns()[1].getVariable().toString());

            this.throughputs.put(policyID, load);
        }

    }
		
	}


