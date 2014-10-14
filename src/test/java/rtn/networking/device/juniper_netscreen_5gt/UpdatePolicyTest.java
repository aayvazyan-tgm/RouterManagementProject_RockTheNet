package rtn.networking.device.juniper_netscreen_5gt;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import rtn.networking.Action;
import rtn.networking.Configuration;
import rtn.networking.Policy;
import rtn.networking.Service;
import rtn.networking.Zone;
import rtn.networking.admin.SSHProtocol;

public class UpdatePolicyTest
{
	@Spy
	private SSHProtocol protocol;
	
	@InjectMocks
	private UpdatePolicy updatePolicy;
	
	@Before
	public void setUp() throws Exception
	{
		MockitoAnnotations.initMocks(this);
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetParamsNullEmpty() throws Exception
	{
		this.updatePolicy.setParams(null);
		this.updatePolicy.execute();
		this.updatePolicy.setParams();
		this.updatePolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetParamsNonPolicy() throws Exception
	{
		this.updatePolicy.setParams(new UpdatePolicy());
		this.updatePolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetParamsValidPolicy() throws Exception
	{
		this.updatePolicy.setParams(new Policy());
		this.updatePolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteMissingID() throws Exception
	{
		Policy policy = new Policy();
		this.updatePolicy.setParams(policy);
		this.updatePolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteOutOfRangeID() throws Exception
	{
		Policy policy = new Policy();
		this.updatePolicy.setParams(policy);
		policy.setId(-1L);
		this.updatePolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteMissingInzone() throws Exception
	{
		Policy policy = new Policy();
		this.updatePolicy.setParams(policy);
		policy.setId(1L);
		this.updatePolicy.execute();
	}
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteMissingOutzone() throws Exception
	{
		Policy policy = new Policy();
		this.updatePolicy.setParams(policy);
		policy.setId(1L);
		policy.setInzone(new Zone("test"));
		this.updatePolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteMissingSource() throws Exception
	{
		Policy policy = new Policy();
		this.updatePolicy.setParams(policy);
		policy.setId(1L);
		policy.setInzone(new Zone("test"));
		policy.setOutzone(new Zone("test2"));
		this.updatePolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteEmptySource() throws Exception
	{
		Policy policy = new Policy();
		this.updatePolicy.setParams(policy);
		policy.setId(1L);
		policy.setInzone(new Zone("test"));
		policy.setOutzone(new Zone("test2"));
		policy.setSource("");
		this.updatePolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteMissingDestination() throws Exception
	{
		Policy policy = new Policy();
		this.updatePolicy.setParams(policy);
		policy.setId(1L);
		policy.setInzone(new Zone("test"));
		policy.setOutzone(new Zone("test2"));
		policy.setSource("test");
		this.updatePolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteEmptyDestination() throws Exception
	{
		Policy policy = new Policy();
		this.updatePolicy.setParams(policy);
		policy.setId(1L);
		policy.setInzone(new Zone("test"));
		policy.setOutzone(new Zone("test2"));
		policy.setSource("test");
		policy.setDestination("");
		this.updatePolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteMissingService() throws Exception
	{
		Policy policy = new Policy();
		this.updatePolicy.setParams(policy);
		policy.setId(1L);
		policy.setInzone(new Zone("test"));
		policy.setOutzone(new Zone("test2"));
		policy.setSource("test");
		policy.setSource("test");
		policy.setDestination("test");
		this.updatePolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteMissingAction() throws Exception
	{
		Policy policy = new Policy();
		this.updatePolicy.setParams(policy);
		policy.setId(1L);
		policy.setInzone(new Zone("test"));
		policy.setOutzone(new Zone("test2"));
		policy.setSource("test");
		policy.setSource("test");
		policy.setDestination("test");
		policy.setService(new Service("test"));
		this.updatePolicy.execute();
	}
	
	@Test(expected = RuntimeException.class)
	public void testExecuteNonSuccessfulSend() throws Exception
	{
		Configuration.getInstance().setRemoteip(null);
		
		Policy policy = new Policy();
		this.updatePolicy.setParams(policy);
		policy.setId(1L);
		policy.setInzone(new Zone("test"));
		policy.setOutzone(new Zone("test2"));
		policy.setSource("test");
		policy.setSource("test");
		policy.setDestination("test");
		policy.setService(new Service("test"));
		policy.setAction(new Action("test"));
		this.updatePolicy.execute();
	}
	
	@Test
	public void testExecuteSuccessfulSendNoOptional() throws Exception
	{	
		Mockito.doReturn("").when(protocol).sendCommand("set policy id 1 from test to test2 test test test test");
		
		Policy policy = new Policy();
		this.updatePolicy.setParams(policy);
		policy.setId(1L);
		policy.setInzone(new Zone("test"));
		policy.setOutzone(new Zone("test2"));
		policy.setSource("test");
		policy.setSource("test");
		policy.setDestination("test");
		policy.setService(new Service("test"));
		policy.setAction(new Action("test"));
		this.updatePolicy.execute();
	}
	
	@Test
	public void testExecuteSuccessfulSendWithOptional() throws Exception
	{	
		Mockito.doReturn("").when(protocol).sendCommand("set policy id 1 name testing from test to test2 test test test test log");
		
		Policy policy = new Policy();
		this.updatePolicy.setParams(policy);
		policy.setId(1L);
		policy.setDisplayname("testing");
		policy.setInzone(new Zone("test"));
		policy.setOutzone(new Zone("test2"));
		policy.setSource("test");
		policy.setSource("test");
		policy.setDestination("test");
		policy.setService(new Service("test"));
		policy.setAction(new Action("test"));
		policy.setLog(true);
		this.updatePolicy.execute();
	}
}