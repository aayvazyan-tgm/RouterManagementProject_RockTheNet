package rtn.prototype;

import java.io.IOException;
import java.io.OutputStreamWriter;

import org.apache.log4j.*;

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

        Logger logger = Logger.getLogger("Workflow");
        /* may be removed and replaced by a FileAppender in the future */
        {
            BasicConfigurator.configure();
            ConsoleAppender ca = new ConsoleAppender();
            ca.setWriter(new OutputStreamWriter(System.out));
            ca.setLayout(new PatternLayout("%-5p [%t]: %m%n"));
            logger.addAppender(ca);
        }
        /*
        FileAppender ap;
        try {
            ap = new FileAppender(new SimpleLayout(), m.getLogVerzeichnis()+File.separator+"log.txt", false); //erstellt einene neuen appender fuer log4J welcher in ein File loggt
            BasicConfigurator.configure(ap); //der appender wird dem logger zugewiesen
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        */

        logger.log(Level.INFO, "Starting up");
        try {
            SNMPManager.run();
        } catch (IOException e) {
            logger.log(Level.INFO, "A Unhandled exception occurred while executing the SNMPManager");
            e.printStackTrace();
        }
    }
}
