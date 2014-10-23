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
import org.snmp4j.transport.DefaultUdpTransportMapping;
import org.snmp4j.util.DefaultPDUFactory;
import org.snmp4j.util.PDUFactory;
import org.snmp4j.util.TableEvent;
import org.snmp4j.util.TableUtils;

/**
 * Handles Connections and loads tables from the Firewall
 * @author Fabian Freudensprung
 *
 */
public class SNMPManager {
	private static SNMPManager instance;
	private Snmp snmp;
	private CommunityTarget target;
	private boolean open = false;
	
	/**
	 * Returns a SNMPManager instance.
	 * 
	 * @return A SNMPManager instance
	 */
	public static SNMPManager getInstance() {
		if(instance==null) 
			instance=new SNMPManager();
		
		return instance;
	}
	
	/**
	 * Establishes a connection to the device using the Remoteip/Port set in Configuration.
	 * 
	 * @return true if connecting was successful, false if not (host down/not found/general error).
	 */
	@SuppressWarnings("rawtypes")
	public boolean connect() {
		if(open) return true;
		
		String ip = Configuration.getInstance().getRemoteip() + "/" + Configuration.getInstance().getSnmpport();
		String community = Configuration.getInstance().getCommunity();
		
		try {
			TransportMapping transport = new DefaultUdpTransportMapping();
			snmp = new Snmp(transport);
			Address address = GenericAddress.parse(ip);
			target = new CommunityTarget();
			
			target.setCommunity(new OctetString(community));
	        target.setAddress(address);
	        target.setRetries(2);
	        target.setTimeout(1500);
	        target.setVersion(SnmpConstants.version2c); 
	        
	        transport.listen();
	        
	        open = true;
		}
		catch(IOException ioe) {
			return false;
		}
		
		return true;
	}
	
	/**
	 * Disconnects from the device, if a connection is open.
	 * 
	 * @return true, if disconnecting was successful, false if otherwise (no open connection/I/O error)
	 */
	public boolean disconnect() {
		if(!open) return false;
		
		try {
			snmp.close(); 
			open = false;
		} catch (IOException ioe) {
			return false;
		}
		
		return true;
	}
	
	/**
	 * Returns the table using the given OIDs (columns)
	 * 
	 * @param oid The columns to query
	 * @return A List containing TableEvents, on failure null
	 */
	public List<TableEvent> getTable(OID[] oid) {
		if(!this.connect()) return null;
		
		PDUFactory pF = new DefaultPDUFactory (PDU.GETNEXT);
	      
		TableUtils tableUtils = new TableUtils(snmp, pF);
		tableUtils.setMaxNumRowsPerPDU(100);
		
		try{
			List<TableEvent> snmpList =  tableUtils.getTable(target, oid, null, null);
			return snmpList;
		}
		catch(Exception e) {
			return null;
		}
	}
	
	/**
	 * Returns the current target
	 * @return The target
	 */
	public Target getTarget() {
		if(!open) return null;
		
		return target;
	}
}