package rtn.prototype;

import com.google.gson.Gson;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.smi.OID;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Query a list of OIDs and prints results
 */
public class QueryOIDs {

    /**
     * Write String to disk
     * @param file File path
     * @param content String
     */
    public static void write(String file, String content) {
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Could not write to Disk: " + content);
        }
    }

    /**
     * Query all the OIDs
     * @param url URL of the SNMP device
     */
    public static void run(String url) {
        SNMPManager client = new SNMPManager(url);
        Gson gson = new Gson();

        String path = "../src/test/resources/rtn/dataunit/";
        File file = new File(path);
        file.mkdirs();

        try {
            client.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < oids.length; i++) {
            System.out.println("[" + i + " / " + oids.length + "]");
            String oid = oids[i];
            System.out.println("OID: " + oid);

            ResponseEvent event = null;
            try {
                event = client.get(new OID[]{new OID(oid)});
            } catch (IOException | RuntimeException e) {
                e.printStackTrace();
                continue;
            }

            if(event == null) continue;

            String json = gson.toJson(event);
            String filepath = path
                    + ((oid.startsWith(".")?oid.substring(1):oid)
                    .replace('.', '-'))
                    + ".json";
            write(filepath, json);
            //gson.toJson(event.getResponse());
        }
    }

    // all the oids from mibbrowser
    static final String[] oids = new String[] {
            //iso.org.dod.internet.mgmt.mib-2
            ".1.3.6.1.2.1",
            // system
            ".1.3.6.1.2.1.1",
            ".1.3.6.1.2.1.1.1.0",
            ".1.3.6.1.2.1.1.2.0",
            ".1.3.6.1.2.1.1.3.0",
            ".1.3.6.1.2.1.1.4.0",
            ".1.3.6.1.2.1.1.5.0",
            ".1.3.6.1.2.1.1.6.0",
            ".1.3.6.1.2.1.1.7.0",
            // interface
            ".1.3.6.1.2.1.2",
            ".1.3.6.1.2.1.2.1.0",
            ".1.3.6.1.2.1.2.2",
            ".1.3.6.1.2.1.2.2.1",
            ".1.3.6.1.2.1.2.2.1.1",
            ".1.3.6.1.2.1.2.2.1.2",
            ".1.3.6.1.2.1.2.2.1.3",
            ".1.3.6.1.2.1.2.2.1.4",
            ".1.3.6.1.2.1.2.2.1.5",
            ".1.3.6.1.2.1.2.2.1.6",
            ".1.3.6.1.2.1.2.2.1.7",
            ".1.3.6.1.2.1.2.2.1.8",
            ".1.3.6.1.2.1.2.2.1.9",
            ".1.3.6.1.2.1.2.2.1.10",
            ".1.3.6.1.2.1.2.2.1.11",
            ".1.3.6.1.2.1.2.2.1.12",
            ".1.3.6.1.2.1.2.2.1.13",
            ".1.3.6.1.2.1.2.2.1.14",
            ".1.3.6.1.2.1.2.2.1.15",
            ".1.3.6.1.2.1.2.2.1.16",
            ".1.3.6.1.2.1.2.2.1.17",
            ".1.3.6.1.2.1.2.2.1.18",
            ".1.3.6.1.2.1.2.2.1.19",
            ".1.3.6.1.2.1.2.2.1.20",
            ".1.3.6.1.2.1.2.2.1.21",
            ".1.3.6.1.2.1.2.2.1.22",
            // at
            ".1.3.6.1.2.1.3",
            ".1.3.6.1.2.1.3.1",
            ".1.3.6.1.2.1.3.1.1",
            ".1.3.6.1.2.1.3.1.2",
            ".1.3.6.1.2.1.3.1.3",
            // ip
            ".1.3.6.1.2.1.4",
            ".1.3.6.1.2.1.4.1.0",
            ".1.3.6.1.2.1.4.2.0",
            ".1.3.6.1.2.1.4.3.0",
            ".1.3.6.1.2.1.4.4.0",
            ".1.3.6.1.2.1.4.5.0",
            ".1.3.6.1.2.1.4.6.0",
            ".1.3.6.1.2.1.4.7.0",
            ".1.3.6.1.2.1.4.8.0",
            ".1.3.6.1.2.1.4.9.0",
            ".1.3.6.1.2.1.4.10.0",
            ".1.3.6.1.2.1.4.11.0",
            ".1.3.6.1.2.1.4.12.0",
            ".1.3.6.1.2.1.4.13.0",
            ".1.3.6.1.2.1.4.14.0",
            ".1.3.6.1.2.1.4.15.0",
            ".1.3.6.1.2.1.4.16.0",
            ".1.3.6.1.2.1.4.17.0",
            ".1.3.6.1.2.1.4.18.0",
            ".1.3.6.1.2.1.4.19.0",
            //  ipAddrTable
            ".1.3.6.1.2.1.4.20.0",
            ".1.3.6.1.2.1.4.20.1",
            ".1.3.6.1.2.1.4.20.1.1",
            ".1.3.6.1.2.1.4.20.1.2",
            ".1.3.6.1.2.1.4.20.1.3",
            ".1.3.6.1.2.1.4.20.1.4",
            ".1.3.6.1.2.1.4.20.1.5",
            //  ipRouteTable
            ".1.3.6.1.2.1.4.21",
            ".1.3.6.1.2.1.4.21.1",
            ".1.3.6.1.2.1.4.21.1.1",
            ".1.3.6.1.2.1.4.21.1.2",
            ".1.3.6.1.2.1.4.21.1.3",
            ".1.3.6.1.2.1.4.21.1.4",
            ".1.3.6.1.2.1.4.21.1.5",
            ".1.3.6.1.2.1.4.21.1.6",
            ".1.3.6.1.2.1.4.21.1.7",
            ".1.3.6.1.2.1.4.21.1.8",
            ".1.3.6.1.2.1.4.21.1.9",
            ".1.3.6.1.2.1.4.21.1.10",
            ".1.3.6.1.2.1.4.21.1.11",
            ".1.3.6.1.2.1.4.21.1.12",
            ".1.3.6.1.2.1.4.21.1.13",
            //  ipNetToMediaTable
            ".1.3.6.1.2.1.4.22",
            ".1.3.6.1.2.1.4.22.1",
            ".1.3.6.1.2.1.4.22.1.1",
            ".1.3.6.1.2.1.4.22.1.2",
            ".1.3.6.1.2.1.4.22.1.3",
            ".1.3.6.1.2.1.4.22.1.4",
            //  ipRoutingDiscards
            ".1.3.6.1.2.1.4.23.0",
            // icmp
            ".1.3.6.1.2.1.5",
            ".1.3.6.1.2.1.5.1.0",
            ".1.3.6.1.2.1.5.2.0",
            ".1.3.6.1.2.1.5.3.0",
            ".1.3.6.1.2.1.5.4.0",
            ".1.3.6.1.2.1.5.5.0",
            ".1.3.6.1.2.1.5.6.0",
            ".1.3.6.1.2.1.5.7.0",
            ".1.3.6.1.2.1.5.8.0",
            ".1.3.6.1.2.1.5.9.0",
            ".1.3.6.1.2.1.5.10.0",
            ".1.3.6.1.2.1.5.11.0",
            ".1.3.6.1.2.1.5.12.0",
            ".1.3.6.1.2.1.5.13.0",
            ".1.3.6.1.2.1.5.14.0",
            ".1.3.6.1.2.1.5.15.0",
            ".1.3.6.1.2.1.5.16.0",
            ".1.3.6.1.2.1.5.17.0",
            ".1.3.6.1.2.1.5.18.0",
            ".1.3.6.1.2.1.5.19.0",
            ".1.3.6.1.2.1.5.20.0",
            ".1.3.6.1.2.1.5.21.0",
            ".1.3.6.1.2.1.5.22.0",
            ".1.3.6.1.2.1.5.23.0",
            ".1.3.6.1.2.1.5.24.0",
            ".1.3.6.1.2.1.5.25.0",
            ".1.3.6.1.2.1.5.26.0",
            // tcp
            ".1.3.6.1.2.1.6",
            ".1.3.6.1.2.1.6.1.0",
            ".1.3.6.1.2.1.6.2.0",
            ".1.3.6.1.2.1.6.3.0",
            ".1.3.6.1.2.1.6.4.0",
            ".1.3.6.1.2.1.6.5.0",
            ".1.3.6.1.2.1.6.6.0",
            ".1.3.6.1.2.1.6.7.0",
            ".1.3.6.1.2.1.6.8.0",
            ".1.3.6.1.2.1.6.9.0",
            ".1.3.6.1.2.1.6.10.0",
            ".1.3.6.1.2.1.6.11.0",
            ".1.3.6.1.2.1.6.12.0",
            ".1.3.6.1.2.1.6.13.0",
            ".1.3.6.1.2.1.6.13.1",
            ".1.3.6.1.2.1.6.13.1.1",
            ".1.3.6.1.2.1.6.13.1.2",
            ".1.3.6.1.2.1.6.13.1.3",
            ".1.3.6.1.2.1.6.13.1.4",
            ".1.3.6.1.2.1.6.13.1.5",
            ".1.3.6.1.2.1.6.14.0",
            ".1.3.6.1.2.1.6.15.0",
            // udp
            ".1.3.6.1.2.1.7",
            ".1.3.6.1.2.1.7.1.0",
            ".1.3.6.1.2.1.7.2.0",
            ".1.3.6.1.2.1.7.3.0",
            ".1.3.6.1.2.1.7.4.0",
            ".1.3.6.1.2.1.7.5.0",
            ".1.3.6.1.2.1.7.5.1",
            ".1.3.6.1.2.1.7.5.1.1",
            ".1.3.6.1.2.1.7.5.1.2",
            ".1.3.6.1.2.1.8",
            ".1.3.6.1.2.1.8.1.0",
            ".1.3.6.1.2.1.8.2.0",
            ".1.3.6.1.2.1.8.3.0",
            ".1.3.6.1.2.1.8.4.0",
            ".1.3.6.1.2.1.8.5",
            ".1.3.6.1.2.1.8.5.1",
            ".1.3.6.1.2.1.8.5.1.1",
            ".1.3.6.1.2.1.8.5.1.2",
            ".1.3.6.1.2.1.8.5.1.3",
            ".1.3.6.1.2.1.8.5.1.4",
            ".1.3.6.1.2.1.8.5.1.5",
            ".1.3.6.1.2.1.8.5.1.6",
            ".1.3.6.1.2.1.8.5.1.7",
            ".1.3.6.1.2.1.8.5.1.8",
            ".1.3.6.1.2.1.8.5.1.9",
            ".1.3.6.1.2.1.8.5.1.10",
            ".1.3.6.1.2.1.8.5.1.11",
            ".1.3.6.1.2.1.8.5.1.12",
            ".1.3.6.1.2.1.8.5.1.13",
            ".1.3.6.1.2.1.8.5.1.14",
            ".1.3.6.1.2.1.8.5.1.15",
            ".1.3.6.1.2.1.8.6.0",
            // transmission
            ".1.3.6.1.2.1.10",
            // snmp
            ".1.3.6.1.2.1.11",
            ".1.3.6.1.2.1.11.1.0",
            ".1.3.6.1.2.1.11.2.0",
            ".1.3.6.1.2.1.11.3.0",
            ".1.3.6.1.2.1.11.4.0",
            ".1.3.6.1.2.1.11.5.0",
            ".1.3.6.1.2.1.11.6.0",
            ".1.3.6.1.2.1.11.7.0",
            ".1.3.6.1.2.1.11.8.0",
            ".1.3.6.1.2.1.11.9.0",
            ".1.3.6.1.2.1.11.10.0",
            ".1.3.6.1.2.1.11.11.0",
            ".1.3.6.1.2.1.11.12.0",
            ".1.3.6.1.2.1.11.13.0",
            ".1.3.6.1.2.1.11.14.0",
            ".1.3.6.1.2.1.11.15.0",
            ".1.3.6.1.2.1.11.16.0",
            ".1.3.6.1.2.1.11.17.0",
            ".1.3.6.1.2.1.11.18.0",
            ".1.3.6.1.2.1.11.19.0",
            ".1.3.6.1.2.1.11.20.0",
            ".1.3.6.1.2.1.11.21.0",
            ".1.3.6.1.2.1.11.22.0",
            ".1.3.6.1.2.1.11.23.0",
            ".1.3.6.1.2.1.11.24.0",
            ".1.3.6.1.2.1.11.25.0",
            ".1.3.6.1.2.1.11.26.0",
            ".1.3.6.1.2.1.11.27.0",
            ".1.3.6.1.2.1.11.28.0",
            ".1.3.6.1.2.1.11.29.0",
            ".1.3.6.1.2.1.11.30.0",
            // host
            ".1.3.6.1.2.1.25",
            //  hrSystem
            ".1.3.6.1.2.1.25.1",
            ".1.3.6.1.2.1.25.1.1.0",
            ".1.3.6.1.2.1.25.1.2.0",
            ".1.3.6.1.2.1.25.1.3.0",
            ".1.3.6.1.2.1.25.1.4.0",
            ".1.3.6.1.2.1.25.1.5.0",
            ".1.3.6.1.2.1.25.1.6.0",
            ".1.3.6.1.2.1.25.1.7.0",
            //  hrStorage
            ".1.3.6.1.2.1.25.2",
            ".1.3.6.1.2.1.25.2.1",
            ".1.3.6.1.2.1.25.2.2.0",
            ".1.3.6.1.2.1.25.2.3",
            ".1.3.6.1.2.1.25.2.3.1",
            ".1.3.6.1.2.1.25.2.3.1.1",
            ".1.3.6.1.2.1.25.2.3.1.2",
            ".1.3.6.1.2.1.25.2.3.1.3",
            ".1.3.6.1.2.1.25.2.3.1.4",
            ".1.3.6.1.2.1.25.2.3.1.5",
            ".1.3.6.1.2.1.25.2.3.1.6",
            ".1.3.6.1.2.1.25.2.3.1.7",
            //  hrDevice
            ".1.3.6.1.2.1.25.3",
            ".1.3.6.1.2.1.25.3.1",
            ".1.3.6.1.2.1.25.3.2",
            ".1.3.6.1.2.1.25.3.2.1",
            ".1.3.6.1.2.1.25.3.2.1.1",
            ".1.3.6.1.2.1.25.3.2.1.2",
            ".1.3.6.1.2.1.25.3.2.1.3",
            ".1.3.6.1.2.1.25.3.2.1.4",
            ".1.3.6.1.2.1.25.3.2.1.5",
            ".1.3.6.1.2.1.25.3.2.1.6",
            ".1.3.6.1.2.1.25.3.3",
            ".1.3.6.1.2.1.25.3.3.1",
            ".1.3.6.1.2.1.25.3.3.1.1",
            ".1.3.6.1.2.1.25.3.3.1.2",
            ".1.3.6.1.2.1.25.3.4",
            ".1.3.6.1.2.1.25.3.4.1",
            ".1.3.6.1.2.1.25.3.4.1.1",
            ".1.3.6.1.2.1.25.3.5",
            ".1.3.6.1.2.1.25.3.5.1",
            ".1.3.6.1.2.1.25.3.5.1.1",
            ".1.3.6.1.2.1.25.3.5.1.2",
            ".1.3.6.1.2.1.25.3.6",
            ".1.3.6.1.2.1.25.3.6.1",
            ".1.3.6.1.2.1.25.3.6.1.1",
            ".1.3.6.1.2.1.25.3.6.1.2",
            ".1.3.6.1.2.1.25.3.6.1.3",
            ".1.3.6.1.2.1.25.3.6.1.4",
            ".1.3.6.1.2.1.25.3.7",
            ".1.3.6.1.2.1.25.3.7.1",
            ".1.3.6.1.2.1.25.3.7.1.1",
            ".1.3.6.1.2.1.25.3.7.1.2",
            ".1.3.6.1.2.1.25.3.7.1.3",
            ".1.3.6.1.2.1.25.3.7.1.4",
            ".1.3.6.1.2.1.25.3.7.1.5",
            ".1.3.6.1.2.1.25.3.8",
            ".1.3.6.1.2.1.25.3.8.1",
            ".1.3.6.1.2.1.25.3.8.1.1",
            ".1.3.6.1.2.1.25.3.8.1.2",
            ".1.3.6.1.2.1.25.3.8.1.3",
            ".1.3.6.1.2.1.25.3.8.1.4",
            ".1.3.6.1.2.1.25.3.8.1.5",
            ".1.3.6.1.2.1.25.3.8.1.6",
            ".1.3.6.1.2.1.25.3.8.1.7",
            ".1.3.6.1.2.1.25.3.8.1.8",
            ".1.3.6.1.2.1.25.3.8.1.9",
            ".1.3.6.1.2.1.25.3.9",
            //  hrSWRun
            ".1.3.6.1.2.1.25.4",
            ".1.3.6.1.2.1.25.4.1.0",
            ".1.3.6.1.2.1.25.4.2",
            ".1.3.6.1.2.1.25.4.2.1",
            ".1.3.6.1.2.1.25.4.2.1.1",
            ".1.3.6.1.2.1.25.4.2.1.2",
            ".1.3.6.1.2.1.25.4.2.1.3",
            ".1.3.6.1.2.1.25.4.2.1.4",
            ".1.3.6.1.2.1.25.4.2.1.5",
            ".1.3.6.1.2.1.25.4.2.1.6",
            ".1.3.6.1.2.1.25.4.2.1.7",
            //  hrSWRunPerf
            ".1.3.6.1.2.1.25.5",
            ".1.3.6.1.2.1.25.5.1",
            ".1.3.6.1.2.1.25.5.1.1",
            ".1.3.6.1.2.1.25.5.1.1.1",
            ".1.3.6.1.2.1.25.5.1.1.2",
            //  hrSWInstalled
            ".1.3.6.1.2.1.25.6",
            ".1.3.6.1.2.1.25.6.1.0",
            ".1.3.6.1.2.1.25.6.2.0",
            ".1.3.6.1.2.1.25.6.3",
            ".1.3.6.1.2.1.25.6.3.1",
            ".1.3.6.1.2.1.25.6.3.1.1",
            ".1.3.6.1.2.1.25.6.3.1.2",
            ".1.3.6.1.2.1.25.6.3.1.3",
            ".1.3.6.1.2.1.25.6.3.1.4",
            ".1.3.6.1.2.1.25.6.3.1.5",
            //  hrMIBAdminInfo
            ".1.3.6.1.2.1.25.7",
            ".1.3.6.1.2.1.25.7.1",
            ".1.3.6.1.2.1.25.7.2",
            ".1.3.6.1.2.1.25.7.2.1",
            ".1.3.6.1.2.1.25.7.3",
            ".1.3.6.1.2.1.25.7.3.1",
            ".1.3.6.1.2.1.25.7.3.2",
            ".1.3.6.1.2.1.25.7.3.3",
            ".1.3.6.1.2.1.25.7.3.4",
            ".1.3.6.1.2.1.25.7.3.5",
            ".1.3.6.1.2.1.25.7.3.6"
    };
}
