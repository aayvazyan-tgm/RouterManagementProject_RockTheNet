package rtn.networking.device.juniper_netscreen_5gt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.snmp4j.CommunityTarget;
import org.snmp4j.PDU;
import org.snmp4j.Snmp;
import org.snmp4j.TransportMapping;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.transport.DefaultUdpTransportMapping;
import org.snmp4j.util.DefaultPDUFactory;
import org.snmp4j.util.PDUFactory;
import org.snmp4j.util.TableEvent;
import org.snmp4j.util.TableUtils;

import rtn.networking.Configuration;
import rtn.networking.Service;
import rtn.networking.device.commands.IPullServices;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PullServices implements IPullServices
{
    @SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(PullServices.class);
	
	private List<Service> services;
	private Snmp snmp;
	
	public PullServices()
	{
		this.services = new ArrayList<Service>();
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
		Configuration.getInstance().setRemoteip("10.0.100.10/161");
		Configuration.getInstance().setCommunity("5xHIT");
		try
        {
			TransportMapping transport = new DefaultUdpTransportMapping();
	        snmp = new Snmp(transport);
	        Address address = GenericAddress.parse(Configuration.getInstance().getRemoteip());
	        CommunityTarget target = new CommunityTarget();
	        
	        target.setCommunity(new OctetString(Configuration.getInstance().getCommunity()));
	        target.setAddress(address);
	        target.setRetries(2);
	        target.setTimeout(1500);
	        target.setVersion(SnmpConstants.version2c);
	        
	        transport.listen();
	        
	        // table options
	        PDUFactory pF = new DefaultPDUFactory (PDU.GETNEXT);
	       
	        TableUtils tableUtils = new TableUtils(snmp, pF);
	        tableUtils.setMaxNumRowsPerPDU(100);
	       
	        OID[] columns = new OID[1];
	        columns[0] = new VariableBinding(new OID("1.3.6.1.4.1.3224.13.1.1.2")).getOid();
	       
	        List<TableEvent> snmpList =  tableUtils.getTable(target, columns, null, null);
	       
	        for (int j = 0; j < snmpList.size();j++)
	        {
	        	TableEvent event = snmpList.get(j);
	        	if(event.getStatus() != 0) throw new RuntimeException("Fatal error");
	        	this.services.add(new Service(event.getColumns()[0].getVariable().toString()));
	        }
	        snmp.close();
        }
        catch(IOException ex)
        {
        	ex.printStackTrace();
        }
	}
}