package rtn.mock;

import com.google.gson.Gson;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.Variable;
import rtn.Util;

import java.util.ArrayList;

/**
 * Class for creating ResponseEvents
 */
public class MockResponseEvents {
    private OID[] oids;
    private ArrayList<Variable> variables;
    static Gson gson;

    static {
        gson = new Gson();
    }

    private MockResponseEvents(){

    }

    /**
     * Reads data for given OID from resources
     *
     * @param oid oid
     * @return ResponseEvent
     */
    public static ResponseEvent getResponseEvent(OID oid) {
        String json = Util.readOID(oid);

        ResponseEvent event = gson.fromJson(json, ResponseEvent.class);

        return event;
    }
}
