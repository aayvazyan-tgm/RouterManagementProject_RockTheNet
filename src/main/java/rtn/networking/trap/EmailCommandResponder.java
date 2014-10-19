package rtn.networking.trap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.snmp4j.CommandResponder;
import org.snmp4j.CommandResponderEvent;
import org.snmp4j.PDU;
import rtn.GuiceModule;
import rtn.email.EMail;

/**
 * Sends an Email whenever a firewall rule changes
 */
public class EmailCommandResponder
        implements CommandResponder {
    private static final Logger logger = LoggerFactory.getLogger(EmailCommandResponder.class);
    private Injector injector = Guice.createInjector(new GuiceModule());
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Override
    public void processPdu(CommandResponderEvent event) {
        if(event.getPDU().getType() != PDU.TRAP) {
            return;
        }
        EMail eMail = injector.getInstance(EMail.class);
        eMail.setMessage(gson.toJson(event.getPDU()));
    }
}
