package rtn.networking.device.juniper_netscreen_5gt;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import rtn.networking.Action;
import rtn.networking.Policy;
import rtn.networking.Service;
import rtn.networking.Zone;
import rtn.networking.admin.SSHProtocol;

public class AddPolicyTest
{
	@Spy
	private SSHProtocol protocol;
	
	@InjectMocks
	private AddPolicy addPolicy;
	
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
		this.addPolicy.setParams(null);
		this.addPolicy.execute();
		this.addPolicy.setParams();
		this.addPolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetParamsNonPolicy() throws Exception
	{
		this.addPolicy.setParams(new AddPolicy());
		this.addPolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetParamsValidPolicy() throws Exception
	{
		this.addPolicy.setParams(new Policy());
		this.addPolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteMissingInzone() throws Exception
	{
		Policy policy = new Policy();
		this.addPolicy.setParams(policy);
		this.addPolicy.execute();
	}
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteMissingOutzone() throws Exception
	{
		Policy policy = new Policy();
		this.addPolicy.setParams(policy);
		policy.setInzone(new Zone("test"));
		this.addPolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteMissingSource() throws Exception
	{
		Policy policy = new Policy();
		this.addPolicy.setParams(policy);
		policy.setInzone(new Zone("test"));
		policy.setOutzone(new Zone("test2"));
		this.addPolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteEmptySource() throws Exception
	{
		Policy policy = new Policy();
		this.addPolicy.setParams(policy);
		policy.setInzone(new Zone("test"));
		policy.setOutzone(new Zone("test2"));
		policy.setSource("");
		this.addPolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteMissingDestination() throws Exception
	{
		Policy policy = new Policy();
		this.addPolicy.setParams(policy);
		policy.setInzone(new Zone("test"));
		policy.setOutzone(new Zone("test2"));
		policy.setSource("test");
		this.addPolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteEmptyDestination() throws Exception
	{
		Policy policy = new Policy();
		this.addPolicy.setParams(policy);
		policy.setInzone(new Zone("test"));
		policy.setOutzone(new Zone("test2"));
		policy.setSource("test");
		policy.setDestination("");
		this.addPolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteMissingService() throws Exception
	{
		Policy policy = new Policy();
		this.addPolicy.setParams(policy);
		policy.setInzone(new Zone("test"));
		policy.setOutzone(new Zone("test2"));
		policy.setSource("test");
		policy.setSource("test");
		policy.setDestination("test");
		this.addPolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteMissingAction() throws Exception
	{
		Policy policy = new Policy();
		this.addPolicy.setParams(policy);
		policy.setInzone(new Zone("test"));
		policy.setOutzone(new Zone("test2"));
		policy.setSource("test");
		policy.setSource("test");
		policy.setDestination("test");
		policy.setService(new Service("test"));
		this.addPolicy.execute();
	}
	
	@Test(expected = RuntimeException.class)
	public void testExecuteNonSuccessfulSend() throws Exception
	{	
		Policy policy = new Policy();
		this.addPolicy.setParams(policy);
		policy.setInzone(new Zone("test"));
		policy.setOutzone(new Zone("test2"));
		policy.setSource("test");
		policy.setSource("test");
		policy.setDestination("test");
		policy.setService(new Service("test"));
		policy.setAction(new Action("test"));
		this.addPolicy.execute();
	}
	
	@Test
	public void testExecuteSuccessfulSendNoOptional() throws Exception
	{	
		Mockito.doReturn("").when(protocol).sendCommand("set policy from test to test2 test test test test");
		
		Policy policy = new Policy();
		this.addPolicy.setParams(policy);
		policy.setInzone(new Zone("test"));
		policy.setOutzone(new Zone("test2"));
		policy.setSource("test");
		policy.setSource("test");
		policy.setDestination("test");
		policy.setService(new Service("test"));
		policy.setAction(new Action("test"));
		this.addPolicy.execute();
	}
	
	@Test
	public void testExecuteSuccessfulSendWithOptional() throws Exception
	{	
		Mockito.doReturn("").when(protocol).sendCommand("set policy name testing from test to test2 test test test test log");
		
		Policy policy = new Policy();
		this.addPolicy.setParams(policy);
		policy.setDisplayname("testing");
		policy.setInzone(new Zone("test"));
		policy.setOutzone(new Zone("test2"));
		policy.setSource("test");
		policy.setSource("test");
		policy.setDestination("test");
		policy.setService(new Service("test"));
		policy.setAction(new Action("test"));
		policy.setLog(true);
		this.addPolicy.execute();
	}
}