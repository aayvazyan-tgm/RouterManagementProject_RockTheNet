package rtn.prototype;

import java.io.IOException;

/**
 * Main class of prototype
 *
 * Program for using the 10 minutes testing time
 * as efficient as possible
 */
public class Main {

    public static void main(String[] args) {
        runShivasoftTutorial();
    }

    private static void runShivasoftTutorial() {
        try {
            SNMPManager.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
