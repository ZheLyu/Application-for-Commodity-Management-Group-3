package dao;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import model.Stationery;

public class StaDaoTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testQuery() throws Exception {
		//fail("Not yet implemented");
		List<Stationery> sts = new ArrayList<>();
		StaDao sd = new StaDao();
		sts = sd.query();
		for(int i = 0; i < sts.size(); i++ ) {
			System.out.println(sts.get(i).getSt_name().toString());
		}
	}

}
