package rtn.networking;

import java.io.IOException;
import java.util.List;

import org.snmp4j.CommunityTarget;
import org.snmp4j.PDU;
import org.snmp4j.Snmp;
import org.snmp4j.Target;
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

public class SNMPManager {
	
	private static SNMPManager instance;
	private Snmp snmp;
	private CommunityTarget target;
	private boolean open;
	
	
	/**
	 * 
	 * @return
	 */
	public static SNMPManager getInstance() {
		if(instance==null) 
			instance=new SNMPManager();
		
		return instance;
	}
	
	/**
	 * 
	 * @param ip
	 * @param com
	 * @return
	 */
	public boolean connect(String ip, String com) {
		if(!open) return false;
		
		Configuration.getInstance().setRemoteip(ip);
		Configuration.getInstance().setCommunity(com);
		
		try {
			TransportMapping transport = new DefaultUdpTransportMapping();
			snmp = new Snmp(transport);
			Address address = GenericAddress.parse(Configuration.getInstance().getRemoteip());
			target = new CommunityTarget();
			
			target.setCommunity(new OctetString(Configuration.getInstance().getCommunity()));
	        target.setAddress(address);
	        target.setRetries(2);
	        target.setTimeout(1500);
	        target.setVersion(SnmpConstants.version2c); 
	        
	        transport.listen();
	        
	        open = true;
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public boolean disconnect() {
		if(!open) return false;
		try {
			snmp.close(); 
			open = false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	
	/**
	 * Returns the table of the oid
	 * @param oid
	 * @return
	 */
	public List<TableEvent> getTable(OID oid) {
		if(!open) return null;
		
		PDUFactory pF = new DefaultPDUFactory (PDU.GETNEXT);
	      
		TableUtils tableUtils = new TableUtils(snmp, pF);
		tableUtils.setMaxNumRowsPerPDU(100);
       
		OID[] columns = new OID[1];
		columns[0] = new VariableBinding(oid).getOid();
       
		List<TableEvent> snmpList =  tableUtils.getTable(target, columns, null, null);
		
		return snmpList;
	}
	
	/**
	 * 
	 * @return
	 */
	public Target getTarget() {
		if(!open) return null;
		
		return target;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getString() {
		String ret = "";
		
		
		return ret;
	}
	
}
