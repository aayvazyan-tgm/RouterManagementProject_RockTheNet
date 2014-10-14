package rtn.prototype.snmp.trap;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.snmp4j.TransportMapping;
import org.snmp4j.smi.UdpAddress;
import org.snmp4j.transport.DefaultUdpTransportMapping;
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

    private final static Marker setupMarker =
            MarkerFactory.getMarker("setup(TransportMapping)");
    public void setup(TransportMapping transport) {
        logger.debug("Entering: ", setupMarker);
        try {
            trapReceiver.listen(transport);
        } catch (IOException e) {
            logger.error(setupMarker, "IOException", e);
        }
        logger.debug("Leaving: ", setupMarker);
    }

    public static void main(String[] args) throws IOException {
        Injector injector = Guice.createInjector(new Module());
        Main main = injector.getInstance(Main.class);

        main.setup(
                new DefaultUdpTransportMapping(
                        new UdpAddress("localhost/16200")));
    }
}
