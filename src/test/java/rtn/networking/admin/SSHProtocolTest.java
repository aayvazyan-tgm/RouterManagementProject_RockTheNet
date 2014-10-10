package rtn.networking.admin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.net.ServerSocket;
import java.util.Arrays;

import org.apache.sshd.SshServer;
import org.apache.sshd.common.NamedFactory;
import org.apache.sshd.server.Command;
import org.apache.sshd.server.CommandFactory;
import org.apache.sshd.server.PasswordAuthenticator;
import org.apache.sshd.server.keyprovider.SimpleGeneratorHostKeyProvider;
import org.apache.sshd.server.session.ServerSession;
import org.apache.sshd.server.sftp.SftpSubsystem;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import rtn.networking.Configuration;

public class SSHProtocolTest
{
	private SSHProtocol protocol;
	private SshServer serverMock;
	
	private int port;

	@Before
	public void setUp() throws Exception
	{
		// find unused port
		ServerSocket s = new ServerSocket(0);
        this.port = s.getLocalPort();
        s.close();
        
		this.serverMock = SshServer.setUpDefaultServer();
		this.serverMock.setPort(this.port);

		this.serverMock.setKeyPairProvider(new SimpleGeneratorHostKeyProvider("hostkey.ser"));
		this.serverMock.setPasswordAuthenticator(new PasswordAuthenticator() {
			public boolean authenticate(String username, String password, ServerSession session) {
				if(username.equals("test") && password.equals("test")) return true;
				return false;
			}
		});
		
		this.serverMock.setSubsystemFactories(Arrays.<NamedFactory<Command>>asList(new SftpSubsystem.Factory()));
		this.serverMock.setCommandFactory(new CommandFactory()
		{
			@Override
			public Command createCommand(String command)
			{
				return new SSHCommand(command);
			}
		});
		
		this.serverMock.start();
		this.protocol = new SSHProtocol();
	}
	
	@After
	public void tearDown() throws Exception
	{
		if(this.serverMock != null) this.serverMock.stop(true);
	}
	
	@Test
	public void testConnectMissingData()
	{
		Configuration.setInstance(new Configuration());
		assertFalse(new SSHProtocol().connect());
	}
	
	@Test
	public void testConnectMissingPassword() throws Exception
	{
		Configuration configuration = Configuration.getInstance();
		configuration.setUsername("test");
		configuration.setRemoteip("127.0.0.1");
		configuration.setAdminport(this.port);
		configuration.setPassword("");
		
		Configuration.setInstance(configuration);
		
		assertFalse(new SSHProtocol().connect());
	}
	
	@Test
	public void testConnectSuccessful()  throws Exception
	{
		Configuration configuration = Configuration.getInstance();
		configuration.setUsername("test");
		configuration.setRemoteip("127.0.0.1");
		configuration.setAdminport(this.port);
		configuration.setPassword("test");
		
		Configuration.setInstance(configuration);
		
		assertTrue(new SSHProtocol().connect());
	}
	
	@Test
	public void testSendCommandNotSuccessfulConnect()
	{
		assertNull(new SSHProtocol().sendCommand("test"));
	}
	
	@Test
	public void testSendCommandSuccessfulNormal() throws Exception
	{
		Configuration configuration = Configuration.getInstance();
		configuration.setUsername("test");
		configuration.setRemoteip("127.0.0.1");
		configuration.setAdminport(this.port);
		configuration.setPassword("test");
		
		Configuration.setInstance(configuration);
		
		assertEquals(this.protocol.sendCommand("test"), "test");
	}
	
	@Test
	public void testSendCommandSuccessfulErrorStream() throws Exception
	{
		Configuration configuration = Configuration.getInstance();
		configuration.setUsername("test");
		configuration.setRemoteip("127.0.0.1");
		configuration.setAdminport(this.port);
		configuration.setPassword("test");
		
		Configuration.setInstance(configuration);
		
		assertEquals(this.protocol.sendCommand("error"), "error");
	}
	
	@Test
	public void testDisconnectNull()
	{
		assertTrue(new SSHProtocol().disconnect());
	}
	@Test
	public void testDisconnectNotNull() throws Exception
	{		
		Configuration configuration = Configuration.getInstance();
		configuration.setUsername("test");
		configuration.setRemoteip("127.0.0.1");
		configuration.setAdminport(this.port);
		configuration.setPassword("test");
		
		Configuration.setInstance(configuration);
		
		this.protocol.connect();
		
		assertTrue(this.protocol.disconnect());
	}
}