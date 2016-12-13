package model;

import java.sql.SQLException;

import junit.framework.TestCase;

public class ClothModifyTest extends TestCase {

	Cloth cloth;
	
	protected void setUp() throws Exception {
		super.setUp();
		cloth = new Cloth();

		cloth.setIdCloth(1123);
		cloth.setColor("red");
		cloth.setType("coolCloth");
		cloth.setSize("s");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testProcessAdd() throws Exception{
		ClothModify testadd = new ClothModify(cloth);
		testadd.addCloth();
	}
	



	
	public void testProcessDel() throws SQLException{
		ClothModify testdel = new ClothModify(cloth);
		testdel.delCloth();
	}

}
