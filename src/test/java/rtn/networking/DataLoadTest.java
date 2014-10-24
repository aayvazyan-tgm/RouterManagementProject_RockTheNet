package rtn.networking;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class DataLoadTest contains tests for the class DataLoad.
 *
 * @generatedBy CodePro at 23.10.14 15:12
 * @author Andreas Willinger
 */
public class DataLoadTest
{
	/**
	 * Run the int getDownload() method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testGetDownload_1()
		throws Exception
	{
		DataLoad fixture = new DataLoad();
		fixture.setDownload(1);
		fixture.setUpload(1);

		int result = fixture.getDownload();
		assertEquals(1, result);
	}

	/**
	 * Run the int getUpload() method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testGetUpload_1()
		throws Exception
	{
		DataLoad fixture = new DataLoad();
		fixture.setDownload(1);
		fixture.setUpload(1);

		int result = fixture.getUpload();
		assertEquals(1, result);
	}

	/**
	 * Run the void setDownload(int) method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testSetDownload_1()
		throws Exception
	{
		DataLoad fixture = new DataLoad();
		fixture.setDownload(1);
		fixture.setUpload(1);
		int download = 1;

		fixture.setDownload(download);
	}

	/**
	 * Run the void setUpload(int) method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testSetUpload_1()
		throws Exception
	{
		DataLoad fixture = new DataLoad();
		fixture.setDownload(1);
		fixture.setUpload(1);
		int upload = 1;

		fixture.setUpload(upload);
	}
}