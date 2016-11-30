package test;

import java.sql.SQLException;

import junit.framework.TestCase;
import model.MerchandiseModify;
import model.Merchansidse;

public class MerchandiseModifyTest extends TestCase {

	Merchansidse m;
	protected void setUp() throws Exception {
		super.setUp();
		m = new Merchansidse();
		m.setIdFactpry(1101);
		m.setMerchansidse(1123);
		m.setPrice(100);
		m.setNumber(50);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testAddMerchandise() throws Exception {
		MerchandiseModify testadd = new MerchandiseModify(m);
		testadd.addMerchandise();
	}

	public void testUpdateMerchandise() throws SQLException {
		MerchandiseModify testupdate = new MerchandiseModify(m);
		testupdate.updateMerchandise();
	}

	public void testDelMerchandise() throws SQLException {		
		MerchandiseModify testdel= new MerchandiseModify(m);
	    testdel.delMerchandise();
	}

}
