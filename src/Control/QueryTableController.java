package Control;

import java.util.List;
import java.util.Map;

import model.QueryTable;


import java.sql.SQLException;

import View.LoginView;


public class QueryTableController {
	
	private QueryTable m = new QueryTable();
	private LoginView l= new LoginView();
	private String name;
	private String id;
	private String type;
	private String genre;
	private String title;
	private String size;
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public QueryTable getM() {
		return m;
	}

	public void setM(QueryTable m) {
		this.m = m;
	}

	public LoginView getL() {
		return l;
	}

	public void setL(LoginView l) {
		this.l = l;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public QueryTableController(QueryTable m, LoginView l) {
		//super();
		this.m = m;
		this.l = l;
	}

	
	public QueryTableController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * return id, st_name, price, number, supplier of all stationery
	 * @throws Exception
	 */
	public String process1() throws Exception {
		
		String a=m.query().toString().replace("[", "").replace("]", "").replace(",", "\t");
		return a;
	}
	
	/**
	 * Query idBook, title, price, number, supplier of books
	 * @throws Exception 
	 */
	public String process2() throws Exception {
		String a=m.query2().toString().replace("[", "").replace("]", "").replace(",", "\t");
		System.out.println(a);
		return a;
	}
	
	/**idCloth, type, price, number, supplier name 
	 * of all cloth
	 * 
	 * @throws Exception
	 */
	public String process3() throws Exception {
	    String a=m.query3().toString().replace("[", "").replace("]", "").replace(",", "\t");
	    return a;
	    
	    
	}
	
	/**
	 * Query stationery by st_name
	 * @return
	 * @throws Exception
	 */
	public String process4() throws Exception {
		
	  String a= m.query4(name).toString();
	  System.out.println(a);
	  return a;
	 
	}
	
	/**
	 * Query cloth by type
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public String process5() throws Exception {
		String a=m.query5(type).toString();
		return a;
	}

	/**
	 * Query stationery by id
	 * @throws Exception
	 */

	public String process6() throws Exception {
		String a=m.query6(id).toString();
		return a;
		
	}
	
	/**
	 * query cloth by id
	 * @return
	 * @throws Exception 
	 */
	public String process7() throws Exception {
		String a=m.query7(id).toString();
		return a;
	}
	/**
	 * query book by id
	 * @throws Exception
	 */
	public String process8() throws Exception {
		String a=m.query8(id).toString();
		return a;
	}
	/**
	 * query idStationery, st_name , price, number of 
	 * stationery by id and name
	 * @throws SQLException
	 */
	public String process9() throws SQLException {
		String a=m.query9(id, name).toString();
		return a;
	}
	
	/**
	 * idCloth, type, size, color, price, number
	 * by id and size
	 * @throws Exception
	 */
	public String  process10() throws Exception {
		String a=m.query10(id, size).toString();
		return a;
	}
	
	
	/**
	 * query idBook, genre, title, price, number
	 * by genre and title
	 * @throws SQLException
	 */
	public String process11() throws SQLException {
		String a=m.query11(genre, title).toString();
		return a;
	}
	
	public String process12() throws SQLException {
		String a = m.query12(name).toString();
		return a;
	}

}
