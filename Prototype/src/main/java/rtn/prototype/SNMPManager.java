package rtn.prototype;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.snmp4j.*;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.*;
import org.snmp4j.transport.DefaultUdpTransportMapping;

import java.io.IOException;

/**
 * SNMPManager from tutorial with minor changes
 *
 * @author Jitendra Zaa
 * http://www.shivasoft.in/blog/java/snmp/create-snmp-client-in-java-using-snmp4j/
 */
public class SNMPManager {

    private Snmp snmp = null;
    private String address = null;

    /**
    * Constructor
    * @param add
    */
    public SNMPManager(String add)
    {
        address = add;
    }

    public static void run(String url) throws IOException {
        Logger logger = Logger.getLogger("Workflow");
        /**
        * Port 161 is used for Read and Other operations
        * Port 162 is used for the trap generation
        */
        SNMPManager client = new SNMPManager(url);

        logger.log(Level.INFO, "Starting client...");
        client.start();
        logger.log(Level.INFO, "Client started");
        /**
        * OID - .1.3.6.1.2.1.1.1.0 => SysDec
        * OID - .1.3.6.1.2.1.1.5.0 => SysName
        * => MIB explorer will be usefull here, as discussed in previous article
        */
        String sysDescr = client.getAsString(new OID(".1.3.6.1.2.1.1.1.0"));
        System.out.println(sysDescr);
        logger.log(Level.DEBUG, "response to OID received: "+sysDescr);
    }

    /**
    * Start the Snmp session. If you forget the listen() method you will not
    * get any answers because the communication is asynchronous
    * and the listen() method listens for answers.
    * @throws IOException
    */
    public void start() throws IOException {
        TransportMapping transport = new DefaultUdpTransportMapping();
        snmp = new Snmp(transport);
        // Do not forget this line!
        transport.listen();
    }

    /**
    * Method which takes a single OID and returns the response from the agent as a String.
    * @param oid
    * @return
    * @throws IOException
    */
    public String getAsString(OID oid) throws IOException {
        ResponseEvent event = get(new OID[] { oid });
        return event.getResponse().get(0).getVariable().toString();
    }

    /**
    * This method is capable of handling multiple OIDs
    * @param oids
    * @return
    * @throws IOException
    */
    public ResponseEvent get(OID oids[]) throws IOException {
        PDU pdu = new PDU();
        for (OID oid : oids) {
            pdu.add(new VariableBinding(oid));
        }
        pdu.setType(PDU.GET);
        ResponseEvent event = snmp.send(pdu, getTarget(), null);
        if(event != null) {
            return event;
        }
        throw new RuntimeException("GET timed out");
    }

    /**
    * This method returns a Target, which contains information about
    * where the data should be fetched and how.
    * @return
    */
    public Target getTarget() {
        Address targetAddress = GenericAddress.parse(address);
        CommunityTarget target = new CommunityTarget();
        target.setCommunity(new OctetString("public"));
        target.setAddress(targetAddress);
        target.setRetries(2);
        target.setTimeout(1500);
        target.setVersion(SnmpConstants.version2c);
        return target;
    }
}
