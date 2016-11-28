package model;

import java.util.ArrayList;
import java.sql.SQLException;
import java.util.*;
import java.util.List;
//import org.apache.commons.lang.StringUtils;  

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
		fail("Not yet implemented");
	}
	
	public void testQuery1() throws Exception {
		fail("Not yet implemented");
		//List<<Map<String, Object>> list = new ArrayList<>();
		QueryTable sd = new QueryTable();
		List<Map<String, Object>> list = sd.query();
		System.out.println(list.size());
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
			
			String id = "3001";
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
		String id = "1002";
		
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
		String id = "2002";
		
		QueryTable sd = new QueryTable();
		List<Map<String, Object>> list = sd.query8(id);
		List<List<String>> result = new ArrayList<>(list.size());
		for(int i = 0; i < list.size(); i++) {
			Map<String, Object> map = list.get(i);
			//map.toString();
			//System.out.println(map);
			List<String> l = new ArrayList<>();
			l.add(map.get("idBook").toString().replace("[", " ").replace("]", " \t"));
			l.add(map.get("title").toString().replace("[", " ").replace("]", " \t"));
			l.add(map.get("isbn").toString().replace("[", " ").replace("]", " \t"));
			l.add(map.get("price").toString().replace("[", " ").replace("]", " \t"));
			l.add(map.get("number").toString().replace("[", " ").replace("]", " \t"));
			l.add(map.get("name").toString().replace("[", " ").replace("]", " \t"));
			result.add(l);
			//l.add(map.g)
			//result.set(i, map.get("idBook"));
			List<Object> o =new ArrayList<>();
			o.add(map.get("idBook"));
//			System.out.print(map.get("idBook") + "\t");
//			System.out.print(map.get("title") + "\t");
//			System.out.print(map.get("isbn") + "\t");
//			
//			System.out.print(map.get("price") + "\t");
//			System.out.print(map.get("number") + "\t");
//			
//			System.out.print(map.get("name") + "\t");
			
			//System.out.println(o);
			
			System.out.println();
			//map.toString();
		
	}
		System.out.println(result);
	}
	
	public void testQuery9 () throws SQLException {
		fail("Not yet implemented");
		String id = "3002";
		String name = "paper"; 
		QueryTable sd = new QueryTable();
		List<Map<String, Object>> list = sd.query9(id, name);
		for(int i = 0; i < list.size(); i++) {
			Map<String, Object> map = list.get(i);
			//map.toString();
			//System.out.println(map);
			System.out.print(map.get("idStationery") + "\t");
			System.out.print(map.get("st_name") + "\t");
			System.out.print(map.get("price") + "\t");
			System.out.print(map.get("number") + "\t");
			
			//System.out.print(map.get("name") + "\t");
			
			
			System.out.println();
			//map.toString();
		
	}
		
	}
	
	public void testQuery10 () throws Exception {
		fail("Not yet implemented");
		String id = "1003";
		String size = "l";
		QueryTable sd = new QueryTable();
		List<Map<String, Object>> list = sd.query10(id, size);
		for(int i = 0; i < list.size(); i++ ) {
			Map<String, Object> map = list.get(i);
			//map.toString();
			//System.out.println(map);
			System.out.print(map.get("idCloth") + "\t");
			System.out.print(map.get("type") + "\t");
			System.out.print(map.get("color") + "\t");
			System.out.print(map.get("size") + "\t");
			System.out.print(map.get("price") + "\t");
			System.out.print(map.get("number") + "\t");
			
			//System.out.print(map.get("name") + "\t");
			
			
			System.out.println();
		}
		
	}
	
	public void testQuery11 () throws SQLException {
		//fail("Not yet implemented");
		String genre = "cs";
		String title = "program";
		QueryTable sd = new QueryTable();
		List<Map<String, Object>> list = sd.query11(genre, title);
		for(int i = 0; i < list.size(); i++) {
			Map<String, Object> map = list.get(i);
			System.out.print(map.get("idBook") + "\t");
			System.out.print(map.get("title") + "\t");
			System.out.print(map.get("genre") + "\t");
			System.out.print(map.get("price") + "\t");
			System.out.print(map.get("number") + "\t");
			
			//System.out.print(map.get("name") + "\t");
			//System.out.print(map.get("st_name"));
			
			System.out.println();
		}
		
	}
	

}
