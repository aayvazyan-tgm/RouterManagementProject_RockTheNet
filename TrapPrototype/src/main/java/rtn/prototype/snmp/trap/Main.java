package rtn.prototype.snmp.trap;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.snmp4j.CommunityTarget;
import org.snmp4j.PDU;
import org.snmp4j.Snmp;
import org.snmp4j.TransportMapping;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.*;
import org.snmp4j.transport.DefaultUdpTransportMapping;
import rtn.GuiceModule;
import rtn.prototype.snmp.trap.guice.Module;

import java.io.IOException;

/**
 * A prototype for evaluating how to use SNMP traps.
 */
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    private TrapReceiver trapReceiver;

    @Inject
    public Main(TrapReceiver trapReceiver) {
        this.trapReceiver = trapReceiver;
    }

    /**
     * Opens a trap listening port
     *
     * @param listenTo Port
     */
    public void listen(TransportMapping listenTo) {
        logger.debug("Entering: listen(TransportMapping)");
        try {
            trapReceiver.listen(listenTo);
        } catch (IOException e) {
            logger.error("IOException", e);
        }
        logger.debug("Leaving: listen(TransportMapping)");
    }

    /**
     * Fakes a trap
     *
     * thx to hannes.koller
     * https://stackoverflow.com/q/3354091
     */
    public void sendTestTrap() throws IOException {
        logger.debug("Entering: #setup()");

        Injector injector = Guice.createInjector(new GuiceModule());

        PDU trap = new PDU();
        trap.setType(PDU.TRAP);  // its a trap

        OID oid = new OID("1.2.3.4.5");
        trap.add(new VariableBinding(SnmpConstants.snmpTrapOID, oid));
        trap.add(new VariableBinding(SnmpConstants.sysUpTime, new TimeTicks(5000))); // put your uptime here
        trap.add(new VariableBinding(SnmpConstants.sysDescr, new OctetString("System Description")));

        //Add Payload
        Variable var = new OctetString("some string");
        trap.add(new VariableBinding(oid, var));

        // Specify receiver
        Address targetaddress = new UdpAddress("localhost/16200");  // TODO "soft code" this
        CommunityTarget communityTarget = new CommunityTarget();
        communityTarget.setCommunity(new OctetString("public"));
        communityTarget.setVersion(SnmpConstants.version2c);
        communityTarget.setAddress(targetaddress);

        // Send
        Snmp snmp = new Snmp(new DefaultUdpTransportMapping());
        snmp.send(trap, communityTarget, null, null);

        logger.debug("Leaving: #setup()");
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new Module());
        Main main = injector.getInstance(Main.class);

        TrapPrototypeLogFactory.override();

        Thread listenerThread = new Thread(()-> {
            logger.debug("Run it");
            try {
                main.listen(new DefaultUdpTransportMapping(
                        new UdpAddress("localhost/16200")));
            } catch (IOException logged) {
                logger.error("Unable to bind to port.", logged);
                System.exit(1);
            }
        });
        listenerThread.start();
        logger.debug("It's not blocking!");

        try {
            main.sendTestTrap();
        } catch (IOException logged) {
            logger.error("Main#setup() failed", logged);
        }

        logger.debug("Letting the listener listen for a while.");
        try {
            //noinspection InfiniteLoopStatement
            for(int i = 1; i<=10; i++) {
                Thread.sleep(1000);
                logger.debug(String.valueOf(i));
            }
        } catch (InterruptedException logged) {
            logger.info("Sleep interrupted.", logged);
        } finally {
            listenerThread.interrupt();
        }

        logger.debug("Leaving: #main()");
    }
}
