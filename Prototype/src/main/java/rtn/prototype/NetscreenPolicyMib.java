package rtn.prototype;

import com.google.gson.Gson;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.smi.OID;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * http://www.oidview.com/mibs/3224/NETSCREEN-POLICY-MIB.html
 */
public class NetscreenPolicyMib {

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

        String path = "./NetscreenPolicyMib/";
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
            write(path+oid, json);
            //gson.toJson(event.getResponse());
        }
    }

    // all the oids from mibbrowser
    static final String[] oids = new String[] {
            //netscreenPolicyMibModule
            "1.3.6.1.4.1.3224.10.0",
            "1.3.6.1.4.1.3224.10.1",
            "1.3.6.1.4.1.3224.10.1.1",
            "1.3.6.1.4.1.3224.10.1.1.1",
            "1.3.6.1.4.1.3224.10.1.1.10",
            "1.3.6.1.4.1.3224.10.1.1.11",
            "1.3.6.1.4.1.3224.10.1.1.12",
            "1.3.6.1.4.1.3224.10.1.1.13",
            "1.3.6.1.4.1.3224.10.1.1.14",
            "1.3.6.1.4.1.3224.10.1.1.15",
            "1.3.6.1.4.1.3224.10.1.1.16",
            "1.3.6.1.4.1.3224.10.1.1.17",
            "1.3.6.1.4.1.3224.10.1.1.18",
            "1.3.6.1.4.1.3224.10.1.1.19",
            "1.3.6.1.4.1.3224.10.1.1.2",
            "1.3.6.1.4.1.3224.10.1.1.20",
            "1.3.6.1.4.1.3224.10.1.1.21",
            "1.3.6.1.4.1.3224.10.1.1.22",
            "1.3.6.1.4.1.3224.10.1.1.23",
            "1.3.6.1.4.1.3224.10.1.1.24",
            "1.3.6.1.4.1.3224.10.1.1.25",
            "1.3.6.1.4.1.3224.10.1.1.3",
            "1.3.6.1.4.1.3224.10.1.1.4",
            "1.3.6.1.4.1.3224.10.1.1.5",
            "1.3.6.1.4.1.3224.10.1.1.6",
            "1.3.6.1.4.1.3224.10.1.1.7",
            "1.3.6.1.4.1.3224.10.1.1.8",
            "1.3.6.1.4.1.3224.10.1.1.9",
            "1.3.6.1.4.1.3224.10.2",
            "1.3.6.1.4.1.3224.10.2.1",
            "1.3.6.1.4.1.3224.10.2.1.1",
            "1.3.6.1.4.1.3224.10.2.1.10",
            "1.3.6.1.4.1.3224.10.2.1.11",
            "1.3.6.1.4.1.3224.10.2.1.2",
            "1.3.6.1.4.1.3224.10.2.1.2.1",
            "1.3.6.1.4.1.3224.10.2.1.2.1.1",
            "1.3.6.1.4.1.3224.10.2.1.2.1.10",
            "1.3.6.1.4.1.3224.10.2.1.2.1.11",
            "1.3.6.1.4.1.3224.10.2.1.2",
            "1.3.6.1.4.1.3224.10.2.1.3",
            "1.3.6.1.4.1.3224.10.2.1.4",
            "1.3.6.1.4.1.3224.10.2.1.5",
            "1.3.6.1.4.1.3224.10.2.1.6",
            "1.3.6.1.4.1.3224.10.2.1.7",
            "1.3.6.1.4.1.3224.10.2.1.8",
            "1.3.6.1.4.1.3224.10.2.1.9"
    };
}
