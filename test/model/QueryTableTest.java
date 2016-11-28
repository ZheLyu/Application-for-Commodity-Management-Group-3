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
		
	}
	
	public void testQuery1() throws Exception {
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
	
	public void testQuery2() throws Exception {
		fail("Not yet implemented");
		QueryTable sd = new QueryTable();
		List<Map<String, Object>> list = sd.query2();
		for(int i = 0; i < list.size(); i++) {
			Map<String, Object> map = list.get(i);
			System.out.print(map.get("idBook") + "\t");
			System.out.print(map.get("title") + "\t");
			System.out.print(map.get("price") + "\t");
			System.out.print(map.get("number") + "\t");
			
			System.out.print(map.get("name") + "\t");
			//System.out.print(map.get("st_name"));
			
			System.out.println();
		}
	}
		
		public void testQuery3() throws Exception {
			fail("Not yet implemented");
			QueryTable sd = new QueryTable();
			List<Map<String, Object>> list = sd.query3();
			for(int i = 0; i < list.size(); i++) {
				Map<String, Object> map = list.get(i);
				System.out.print(map.get("idCloth") + "\t");
				System.out.print(map.get("type") + "\t");
				System.out.print(map.get("price") + "\t");
				System.out.print(map.get("number") + "\t");
				
				System.out.print(map.get("name") + "\t");
				//System.out.print(map.get("st_name"));
				
				System.out.println();
			}
	
	}
		
		public void testQuery4() throws Exception {
			fail("Not yet implemented");
			String name = "paper";
			QueryTable sd = new QueryTable();
			List<Map<String, Object>> list = sd.query4(name);
			for(int i = 0; i < list.size(); i++) {
				Map<String, Object> map = list.get(i);
				System.out.print(map.get("idStationery") + "\t");
				System.out.print(map.get("st_name") + "\t");
				System.out.print(map.get("price") + "\t");
				System.out.print(map.get("number") + "\t");
				
				System.out.print(map.get("name") + "\t");
				//System.out.print(map.get("st_name"));
				
				System.out.println();
			
		}
	}
		
		public void testQuery5() throws Exception {
			fail("Not yet implemented");
			
			String name = "shirt";
			QueryTable sd = new QueryTable();
			List<Map<String, Object>> list = sd.query5(name);
			list.toString();
			for(int i = 0; i < list.size(); i++) {
				Map<String, Object> map = list.get(i);
				//map.toString();
				//System.out.println(map);
				System.out.print(map.get("idCloth") + "\t");
				System.out.print(map.get("type") + "\t");
				System.out.print(map.get("price") + "\t");
				System.out.print(map.get("number") + "\t");
				
				System.out.print(map.get("name") + "\t");
				
				
				System.out.println();
				//map.toString();
			
		}
			
	}
		
		public void testQuery6() throws Exception {
			fail("Not yet implemented");
			
			int id = 3001;
			QueryTable sd = new QueryTable();
			List<Map<String, Object>> list = sd.query6(id);
			//list.toString();
			for(int i = 0; i < list.size(); i++) {
				Map<String, Object> map = list.get(i);
				//map.toString();
				//System.out.println(map);
				System.out.print(map.get("idStationery") + "\t");
				System.out.print(map.get("st_name") + "\t");
				System.out.print(map.get("price") + "\t");
				System.out.print(map.get("number") + "\t");
				
				System.out.print(map.get("name") + "\t");
				
				
				System.out.println();
				//map.toString();
			
		}
			
	}
		
	public void testQuery7() throws Exception {
		fail("Not yet implemented");
		int id = 1002;
		
		QueryTable sd = new QueryTable();
		List<Map<String, Object>> list = sd.query7(id);
		for(int i = 0; i < list.size(); i++) {
			Map<String, Object> map = list.get(i);
			//map.toString();
			//System.out.println(map);
			System.out.print(map.get("idCloth") + "\t");
			System.out.print(map.get("type") + "\t");
			System.out.print(map.get("color") + "\t");
			System.out.print(map.get("size") + "\t");
			System.out.print(map.get("price") + "\t");
			System.out.print(map.get("number") + "\t");
			
			System.out.print(map.get("name") + "\t");
			
			
			System.out.println();
			//map.toString();
		
	}
		
	}
	
	public void testQuery8() throws Exception {
		fail("Not yet implemented");
		int id = 2002;
		
		QueryTable sd = new QueryTable();
		List<Map<String, Object>> list = sd.query8(id);
		for(int i = 0; i < list.size(); i++) {
			Map<String, Object> map = list.get(i);
			//map.toString();
			//System.out.println(map);
			System.out.print(map.get("idBook") + "\t");
			System.out.print(map.get("title") + "\t");
			System.out.print(map.get("isbn") + "\t");
			
			System.out.print(map.get("price") + "\t");
			System.out.print(map.get("number") + "\t");
			
			System.out.print(map.get("name") + "\t");
			
			
			System.out.println();
			//map.toString();
		
	}
		
	}
	

}
