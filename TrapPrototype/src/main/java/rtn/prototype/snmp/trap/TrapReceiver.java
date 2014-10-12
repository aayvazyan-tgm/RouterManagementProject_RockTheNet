package rtn.prototype.snmp.trap;

import org.slf4j.LoggerFactory;
import org.snmp4j.*;
import org.snmp4j.mp.MPv1;
import org.snmp4j.mp.MPv2c;
import org.snmp4j.security.Priv3DES;
import org.snmp4j.security.SecurityProtocols;
import org.snmp4j.smi.OctetString;
import org.snmp4j.util.MultiThreadedMessageDispatcher;
import org.snmp4j.util.ThreadPool;

import java.io.IOException;

public class TrapReceiver implements CommandResponder {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(Main.class);

    /**
     * Trap Listner
     */
    public synchronized void listen(TransportMapping transport)
            throws IOException {

        ThreadPool threadPool = ThreadPool.create("DispatcherPool", 10);
        MessageDispatcher mDispathcher = new MultiThreadedMessageDispatcher(
                threadPool, new MessageDispatcherImpl());

        // add message processing models
        mDispathcher.addMessageProcessingModel(new MPv1());
        mDispathcher.addMessageProcessingModel(new MPv2c());

        // add all security protocols
        SecurityProtocols.getInstance().addDefaultProtocols();
        SecurityProtocols.getInstance().addPrivacyProtocol(new Priv3DES());

        // Create Target
        CommunityTarget target = new CommunityTarget();
        target.setCommunity(new OctetString("public"));

        Snmp snmp = new Snmp(mDispathcher, transport);
        snmp.addCommandResponder(this);

        transport.listen();
        logger.info("Listening on " + transport.getListenAddress());

        try {
            this.wait();
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * This method will be called whenever a pdu is received on the given port
     * specified in the listen() method
     */
    public synchronized void processPdu(CommandResponderEvent cmdRespEvent) {
        logger.info("Received PDU...");
        PDU pdu = cmdRespEvent.getPDU();
        if (pdu != null) {
            logger.info("Trap Type = " + pdu.getType());
            logger.info("Variables = " + pdu.getVariableBindings());
        }
    }
}