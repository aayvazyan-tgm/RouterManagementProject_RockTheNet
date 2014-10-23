package rtn.networking;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class ZoneTest contains tests for the class Zone.
 *
 * @generatedBy CodePro at 23.10.14 15:12
 * @author Andreas Willinger
 */
public class ZoneTest
{
	/**
	 * Run the Zone(String) constructor test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testZone_1()
		throws Exception
	{
		String name = "";

		Zone result = new Zone(name);

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
		Zone fixture = new Zone("");

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
		Zone fixture = new Zone("");
		String name = "";

		fixture.setName(name);
	}
}