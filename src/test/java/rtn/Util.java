package rtn;

import org.apache.commons.io.IOUtils;
import org.snmp4j.smi.OID;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.function.Consumer;

/**
 * Some helper functions to make making mocks and
 * unittests easier.
 */
public class Util {
    /**
     * Reads OID from resources
     * @param oid
     * @return
     */
    public static String readOID(OID oid){
        String classPath = "rtn/dataunit";
        String oidString = oid.toString();
        String fileName = ((oidString.startsWith(".")?oidString.substring(1):oidString)
                .replace('.', '-'))
                + ".json";

        InputStream inputStream = Util.class.getResourceAsStream(classPath + "/" + fileName);

        try {
            return IOUtils.toString(inputStream);
        } catch (IOException e) {
            org.junit.Assert.fail("[rtn.Util.readOID(OID)] Failed reading File.");
            return "";
        }
    }

    public static String readFile(String filename) {
        final StringBuilder builder = new StringBuilder();
        try {
            Files.lines(FileSystems.getDefault().getPath(filename)).forEach(new Consumer<String>() {
                @Override
                public void accept(String s) {
                    builder.append(s);
                }
            });
        } catch (java.io.IOException e) {
            org.junit.Assert.fail("[rtn.Util.readFile(String)] Failed reading File.");
        }
        return builder.toString();
    }
}
