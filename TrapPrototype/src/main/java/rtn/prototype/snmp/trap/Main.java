package rtn.prototype.snmp.trap;

import org.snmp4j.smi.UdpAddress;

import java.io.IOException;

/**
 * Created by jakob on 10/9/14.
 */
public class Main {
    public static void main(String[] args) {
        TrapReceiver snmp4jTrapReceiver = new TrapReceiver();
        try {
            snmp4jTrapReceiver.listen(new UdpAddress("localhost/162"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
