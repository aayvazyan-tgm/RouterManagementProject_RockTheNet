package rtn.networking.device.juniper_netscreen_5gt;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.Variable;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.util.TableEvent;
import org.snmp4j.util.TableUtils;
import rtn.networking.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Djuric Daniel on 24.10.2014.
 */
public class PullPoliciesTest {

    @Spy
    private SNMPManager manager;

    @InjectMocks
    private PullPolicies pullPolicy;
    private List<Policy> policy;

    @Before
    public void setUp() throws Exception
    {
        MockitoAnnotations.initMocks(this);

    }

    @Test
    public void testnogetresult(){

        List<PullPolicies> result = (ArrayList<PullPolicies>)this.pullPolicy.getResult();

        assertEquals(result.size(), 0);
    }
   /* @SuppressWarnings("unchecked")
    @Test
    public void testGetResultExecute(){
        this.pullPolicy.execute();
        List<Policy> result = (ArrayList<Policy>)this.pullPolicy.getResult();

        assertEquals(result.size(), 0);

    }*/
    @Test
    public void testGetResultNoPreviousExecute(){
        assertEquals(((ArrayList<Policy>)this.pullPolicy.getResult()).size(), 0);
    }

    @Test(expected = RuntimeException.class)
    public void testExecuteWithResponseFailure()
    {
        List<TableEvent> mocked = new LinkedList<TableEvent>();
        mocked.add(new TableEvent(Mockito.mock(TableUtils.TableRequest.class), null, 1));
        Mockito.doReturn(mocked).when(manager).getTable(new OID[]{
                new OID("1.3.6.1.4.1.3224.10.1.1.1"), //ID
                new OID("1.3.6.1.4.1.3224.10.1.1.3"), // SOURCE ZONE
                new OID("1.3.6.1.4.1.3224.10.1.1.4 "), // DESTINATION ZONE
                new OID("1.3.6.1.4.1.3224.10.1.1.5 "), // SOURCE ADRESS
                new OID("1.3.6.1.4.1.3224.10.1.1.6 "), // DESTINATION ADDRESS
                new OID("1.3.6.1.4.1.3224.10.1.1.7 "), // SERVICE
                new OID("1.3.6.1.4.1.3224.10.1.1.8 "), // ACTION
                new OID("1.3.6.1.4.1.3224.10.1.1.15 "), // LOG
                new OID("1.3.6.1.4.1.3224.10.1.1.24 ")}); // NAME

        this.pullPolicy.execute();
    }

    @Test
    public void testExecuteWithResponseEmpty()
    {
        List<TableEvent> mocked = new LinkedList<TableEvent>();
        Mockito.doReturn(mocked).when(manager).getTable(new OID[]{
                new OID("1.3.6.1.4.1.3224.10.1.1.1"), //ID
                new OID("1.3.6.1.4.1.3224.10.1.1.3"), // SOURCE ZONE
                new OID("1.3.6.1.4.1.3224.10.1.1.4 "), // DESTINATION ZONE
                new OID("1.3.6.1.4.1.3224.10.1.1.5 "), // SOURCE ADRESS
                new OID("1.3.6.1.4.1.3224.10.1.1.6 "), // DESTINATION ADDRESS
                new OID("1.3.6.1.4.1.3224.10.1.1.7 "), // SERVICE
                new OID("1.3.6.1.4.1.3224.10.1.1.8 "), // ACTION
                new OID("1.3.6.1.4.1.3224.10.1.1.15 "), // LOG
                new OID("1.3.6.1.4.1.3224.10.1.1.24 ")}); // NAME

        this.pullPolicy.execute();

    }

    @Test
    public void testconstructor(){
        this.policy = new ArrayList<Policy>();
    }
}



