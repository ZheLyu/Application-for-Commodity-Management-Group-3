package model;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

import model.QueryTable;
import junit.framework.TestCase;

public class QueryTableTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testQuery() throws Exception {
		//fail("Not yet implemented");
		//List<<Map<String, Object>> list = new ArrayList<>();
		QueryTable sd = new QueryTable();
		List<Map<String, Object>> list = sd.query();
		for(int i = 0; i < list.size(); i++) {
			Map<String, Object> map = list.get(i);
			System.out.print(map.get("idStationery") + "\t");
			System.out.print(map.get("st_name") + "\t");
			System.out.print(map.get("price") + "\t");
			System.out.print(map.get("number") + "\t");
			
			System.out.print(map.get("name") + "\t");
			System.out.print(map.get("st_name"));
			
			System.out.println();
		}
		
//		for(int i = 0; i < sts.size(); i++ ) {
//			System.out.println(sts.get(i).getIdStationery().toString() + sts.get(i).getSt_name().toString());
//		}
		
	}
	
	

}
