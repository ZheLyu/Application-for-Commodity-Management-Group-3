package myDB;

import java.sql.Connection;

import junit.framework.TestCase;

public class DButilTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testGetConnection() {
		//fail("Not yet implemented");
		Connection conn =DButil.getConnection();
		
	}

}
