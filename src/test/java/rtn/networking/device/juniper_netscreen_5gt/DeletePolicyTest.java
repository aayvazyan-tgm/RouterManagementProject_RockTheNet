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

public class DeletePolicyTest
{
	@Spy
	private SSHProtocol protocol;
	
	@InjectMocks
	private DeletePolicy deletePolicy;
	
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
		this.deletePolicy.setParams(null);
		this.deletePolicy.execute();
		this.deletePolicy.setParams();
		this.deletePolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetParamsNonPolicy() throws Exception
	{
		this.deletePolicy.setParams(new DeletePolicy());
		this.deletePolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetParamsValidPolicy() throws Exception
	{
		this.deletePolicy.setParams(new Policy());
		this.deletePolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteMissingID() throws Exception
	{
		Policy policy = new Policy();
		this.deletePolicy.setParams(policy);
		this.deletePolicy.execute();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteOutOfRangeID() throws Exception
	{
		Policy policy = new Policy();
		this.deletePolicy.setParams(policy);
		policy.setId(-1L);
		this.deletePolicy.execute();
	}
	
	@Test(expected = RuntimeException.class)
	public void testExecuteNonSuccessfulSend() throws Exception
	{	
		Configuration.getInstance().setRemoteip(null);
		
		Policy policy = new Policy();
		this.deletePolicy.setParams(policy);
		policy.setId(1L);
		this.deletePolicy.execute();
	}
	
	@Test
	public void testExecuteSuccessfulSendNoOptional() throws Exception
	{	
		Mockito.doReturn("").when(protocol).sendCommand("unset policy id 1");
		
		Policy policy = new Policy();
		this.deletePolicy.setParams(policy);
		policy.setId(1L);
		this.deletePolicy.execute();
	}
}