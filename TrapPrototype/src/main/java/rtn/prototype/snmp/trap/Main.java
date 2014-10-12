package rtn.prototype.snmp.trap;

import org.snmp4j.smi.UdpAddress;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by jakob on 10/9/14.
 */
public class Main {
    final static Logger LOG = Logger.getLogger(Main.class.getCanonicalName());
    public static void main(String[] args) {
        LOG.entering(Main.class.getCanonicalName(), "main", "String[]");
        TrapReceiver snmp4jTrapReceiver = new TrapReceiver();
        try {
            snmp4jTrapReceiver.listen(new UdpAddress("localhost/16200"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        LOG.exiting(Main.class.getCanonicalName(), "main", "String[]");
    }
}
