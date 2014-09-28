package rtn.prototype;

import java.io.IOException;

/**
 * Main class of prototype
 *
 * Program for using the 10 minutes testing time
 * as efficient as possible
 */
public class Main {
    public static final String URL = "udp:10.0.100.10/161";

    public static void main(String[] args) {
        runShivasoftTutorial();
        runQueryNetscreenPolicyMib();
        runQueryOIDs();
    }

    private static void runShivasoftTutorial() {
        try {
            SNMPManager.run(URL);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void runQueryOIDs() {
        QueryOIDs.run(URL);
    }

    private static void runQueryNetscreenPolicyMib() {
        NetscreenPolicyMib.run(URL);
    }
}