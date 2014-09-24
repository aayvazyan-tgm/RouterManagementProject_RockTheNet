package rtn.prototype;

import java.io.IOException;

/**
 * Main class of prototype
 *
 * Program for using the 10 minutes testing time
 * as efficient as possible
 */
public class Main {
    public static final String URL = "udp:127.0.0.1/161";

    public static void main(String[] args) {
        runShivasoftTutorial();
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
}
