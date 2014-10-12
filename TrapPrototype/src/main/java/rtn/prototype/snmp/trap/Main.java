package rtn.prototype.snmp.trap;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.snmp4j.TransportMapping;
import org.snmp4j.smi.UdpAddress;
import org.snmp4j.transport.DefaultUdpTransportMapping;
import rtn.prototype.snmp.trap.guice.Module;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by jakob on 10/9/14.
 */
public class Main {
    @Inject private Logger logger;
    private TrapReceiver trapReceiver;

    @Inject
    public Main(TrapReceiver trapReceiver) {
        this.trapReceiver = trapReceiver;
    }

    public void setup(TransportMapping transport) {
        logger.entering(Main.class.getCanonicalName(), "setup");
        try {
            trapReceiver.listen(transport);
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.exiting(Main.class.getCanonicalName(), "setup");
    }

    public static void main(String[] args) throws IOException {
        Injector injector = Guice.createInjector(new Module());
        Main main = injector.getInstance(Main.class);

        main.setup(
                new DefaultUdpTransportMapping(
                        new UdpAddress("localhost/16200")));
    }
}
