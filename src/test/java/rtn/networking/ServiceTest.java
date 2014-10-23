package rtn.networking;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class ServiceTest contains tests for the class Service.
 *
 * @generatedBy CodePro at 23.10.14 15:12
 * @author Andreas Willinger
 */
public class ServiceTest
{
	/**
	 * Run the Service(String) constructor test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testService_1()
		throws Exception
	{
		String name = "";

		Service result = new Service(name);

		assertNotNull(result);
		assertEquals("", result.getName());
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testGetName_1()
		throws Exception
	{
		Service fixture = new Service("");

		String result = fixture.getName();
		assertEquals("", result);
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testSetName_1()
		throws Exception
	{
		Service fixture = new Service("");
		String name = "";

		fixture.setName(name);
	}
}