package rtn.networking.admin;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import rtn.networking.Configuration;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

@RunWith(MockitoJUnitRunner.class)
public class SSHProtocolTest
{
	@Mock
	private Session sessionMock;
	
	@Mock
	private JSch sshMock;
	
	@InjectMocks
	private SSHProtocol protocol;
	
	@Before
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testConnectMissingData()
	{
		assertFalse(new SSHProtocol().connect());
	}
	
	@Test
	public void testConnectMissingPassword()
	{
		Configuration configuration = Configuration.getInstance();
		configuration.setUsername("test");
		configuration.setRemoteip("0.0.0.0");
		configuration.setAdminport(99);
		
		Configuration.setInstance(configuration);
		
		assertFalse(new SSHProtocol().connect());
	}
	
	@Test
	public void testConnectSuccessful()
	{
		Configuration configuration = Configuration.getInstance();
		configuration.setUsername("test");
		configuration.setRemoteip("0.0.0.0");
		configuration.setAdminport(99);
		configuration.setPassword("");
		
		Configuration.setInstance(configuration);
		
		assertTrue(this.protocol.connect());
	}
	
	@Test
	public void testSendCommandNotSuccessfulConnect()
	{
		assertNull(new SSHProtocol().sendCommand("test"));
	}
	
	@Test
	public void testSendCommandSuccesfulCommand()
	{
		//TODO complete
		this.protocol.sendCommand("test");
		//assertEquals(this.protocol.sendCommand("test"), "");
	}
	
	@Test
	public void testDisconnectNull()
	{
		assertTrue(new SSHProtocol().disconnect());
	}
	@Test
	public void testDisconnectNotNull()
	{
		assertTrue(this.protocol.disconnect());
	}
}