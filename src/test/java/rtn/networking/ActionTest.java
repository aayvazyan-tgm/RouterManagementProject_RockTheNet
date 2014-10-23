package rtn.networking;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class ActionTest contains tests for the class Action.
 *
 * @generatedBy CodePro at 23.10.14 15:12
 * @author Andreas Willinger
 */
public class ActionTest
{
	/**
	 * Run the Action(String) constructor test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testAction_1()
		throws Exception
	{
		String name = "";
		Action result = new Action(name);

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
		Action fixture = new Action("");
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
		Action fixture = new Action("");
		String name = "";

		fixture.setName(name);
	}
}