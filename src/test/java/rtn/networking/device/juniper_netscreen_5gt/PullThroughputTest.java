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
import rtn.networking.SNMPManager;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by Djuric Daniel on 24.10.2014.
 */
public class PullThroughputTest {
    @Spy
    private SNMPManager manager;

    @InjectMocks
    PullThroughput ptp;


    private Map<Long, Integer> throughputs;

    @Before
    public void setUp() throws Exception
    {
        MockitoAnnotations.initMocks(this);
    }

    @Test(expected = NullPointerException.class)
    public void testExecuteEmptyResponse()
    {
        this.ptp.execute();
    }

    @Test(expected = RuntimeException.class)
    public void testExecuteWithResponseFailure()
    {
        List<TableEvent> mocked = new LinkedList<TableEvent>();
        mocked.add(new TableEvent(Mockito.mock(TableUtils.TableRequest.class), null, 1));
        Mockito.doReturn(mocked).when(manager).getTable(new OID[]{
                new OID("1.3.6.1.4.1.3224.10.2.1.6"), //thorughput (byte/s)
                new OID("1.3.6.1.4.1.3224.10.2.1.1"), //policy id
        });

        this.ptp.execute();
    }
    @Test
    public void testExecuteWithResponseEmpty()
    {
        List<TableEvent> mocked = new LinkedList<TableEvent>();
        Mockito.doReturn(mocked).when(manager).getTable(new OID[]{
                new OID("1.3.6.1.4.1.3224.10.2.1.6"), //thorughput (byte/s)
                new OID("1.3.6.1.4.1.3224.10.2.1.1"), //policy id
        });

        this.ptp.execute();
    }

}
