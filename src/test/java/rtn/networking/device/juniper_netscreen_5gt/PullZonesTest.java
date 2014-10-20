package rtn.networking.device.juniper_netscreen_5gt;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.After;
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
import org.snmp4j.util.TableUtils.TableRequest;

import rtn.networking.SNMPManager;
import rtn.networking.Zone;

public class PullZonesTest
{
	@Spy
	private SNMPManager manager;
	
	@InjectMocks
	private PullZones zones;
	
	@Before
	public void setUp() throws Exception
	{
		MockitoAnnotations.initMocks(this);
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testGetResultNoPreviousExecute()
	{
		assertEquals(((ArrayList<Zone>)this.zones.getResult()).size(), 0);
	}
	
	@Test(expected = NullPointerException.class)
	public void testExecuteEmptyResponse()
	{
		this.zones.execute();
	}
	
	@Test(expected = RuntimeException.class)
	public void testExecuteWithResponseFailure()
	{
		List<TableEvent> mocked = new LinkedList<TableEvent>();
		mocked.add(new TableEvent(Mockito.mock(TableRequest.class), null, 1));
		Mockito.doReturn(mocked).when(manager).getTable(new OID[]{new OID("1.3.6.1.4.1.3224.8.1.1.1.2")});
	
		this.zones.execute();
	}
	
	@Test
	public void testExecuteWithResponseEmpty()
	{
		List<TableEvent> mocked = new LinkedList<TableEvent>();
		Mockito.doReturn(mocked).when(manager).getTable(new OID[]{new OID("1.3.6.1.4.1.3224.8.1.1.1.2")});
		
		this.zones.execute();
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testExecuteWithResponseNonEmpty() throws ParseException
	{
		TableEvent event = Mockito.mock(TableEvent.class);
		VariableBinding vb = Mockito.mock(VariableBinding.class);
		Variable variable = Mockito.mock(Variable.class);
		VariableBinding[] binding = new VariableBinding[]{vb};
		
		Mockito.doReturn("").when(variable).toString();
		Mockito.doReturn(variable).when(vb).getVariable();
		Mockito.doReturn(binding).when(event).getColumns();
		Mockito.doReturn(0).when(event).getStatus();
		
		List<TableEvent> mocked = new LinkedList<TableEvent>();
		mocked.add(event);
		
		Mockito.doReturn(mocked).when(manager).getTable(new OID[]{new OID("1.3.6.1.4.1.3224.8.1.1.1.2")});
		this.zones.execute();
		
		assertEquals(((ArrayList<Zone>)this.zones.getResult()).size(), 1);
	}
}