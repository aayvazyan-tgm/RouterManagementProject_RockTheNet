package rtn.networking.trap;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.snmp4j.*;
import org.snmp4j.mp.MPv1;
import org.snmp4j.mp.MPv2c;
import org.snmp4j.security.Priv3DES;
import org.snmp4j.security.SecurityProtocols;
import org.snmp4j.util.MultiThreadedMessageDispatcher;
import org.snmp4j.util.ThreadPool;

import java.io.IOException;

public class TrapReceiver {
    private static final Logger logger = LoggerFactory.getLogger(TrapReceiver.class);

    private TransportMapping transport;
    private ThreadPool threadPool;
    private MessageDispatcher mDispathcher;
    private CommunityTarget target;

    @Inject
    public TrapReceiver(CommandResponder commandResponder, TransportMapping transport, CommunityTarget target) {
        this.threadPool = ThreadPool.create("DispatcherPool", 10);
        this.mDispathcher = new MultiThreadedMessageDispatcher(
                threadPool, new MessageDispatcherImpl());

        // add message processing models
        mDispathcher.addMessageProcessingModel(new MPv1());
        mDispathcher.addMessageProcessingModel(new MPv2c());

        // add all security protocols
        SecurityProtocols.getInstance().addDefaultProtocols();
        SecurityProtocols.getInstance().addPrivacyProtocol(new Priv3DES());

        // Create Target
        this.target = target;
        //target.setCommunity(new OctetString("public"));

        Snmp snmp = new Snmp(mDispathcher, transport);
        snmp.addCommandResponder(commandResponder);
    }

    /**
     * Trap Listener
     * 
     * @throws IOException A communication failure
     */
    public synchronized void listen()
            throws IOException {

        transport.listen();
        logger.info("Listening on " + transport.getListenAddress());

        try {
            this.wait();
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}