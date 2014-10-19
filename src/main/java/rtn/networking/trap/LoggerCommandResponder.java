package rtn.networking.trap;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.snmp4j.CommandResponder;
import org.snmp4j.CommandResponderEvent;
import org.snmp4j.PDU;

/**
 * Until we have a useful CommandResponder
 */
public class LoggerCommandResponder implements CommandResponder {
    private static final Logger logger = LoggerFactory.getLogger(LoggerCommandResponder.class);
    Gson gson = new Gson();
    /**
     * This method will be called whenever a pdu is received on the given port
     * specified in the listen() method
     */
    @Override
    public synchronized void processPdu(CommandResponderEvent cmdRespEvent) {
        logger.info("Received PDU...");
        PDU pdu = cmdRespEvent.getPDU();
        if (pdu != null) {
            logger.info("Trap Type = " + pdu.getType());
            logger.info("Variables = " + pdu.getVariableBindings());
            logger.info("Json = " + gson.toJson(pdu));
        }
    }
}
