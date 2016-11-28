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
	public void process1() throws Exception {
		
		m.query();		
	}
	
	/**
	 * Query idBook, title, price, number, supplier of books
	 * @throws Exception 
	 */
	public void process2() throws Exception {
		m.query2();
	}
	
	/**idCloth, type, price, number, supplier name 
	 * of all cloth
	 * 
	 * @throws Exception
	 */
	public void process3() throws Exception {
		List<Map<String, Object>> list = m.query3();
	    list.toString();
	    
	}
	
	/**
	 * Query stationery by st_name
	 * @return
	 * @throws Exception
	 */
	public void process4() throws Exception {
		
		m.query4(name);
	}
	
	/**
	 * Query cloth by type
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public void process5() throws Exception {
		m.query5(type);
	}
	/**
	 * Query stationery by id
	 * @throws Exception
	 */
	public void process6() throws Exception {
		m.query6(id);
	}
	
	/**
	 * query cloth by id
	 * @return
	 * @throws Exception 
	 */
	public void process7() throws Exception {
		m.query7(id);
	}
	/**
	 * query book by id
	 * @throws Exception
	 */
	public void process8() throws Exception {
		m.query8(id);
	}
	/**
	 * query idStationery, st_name , price, number of 
	 * stationery by id and name
	 * @throws SQLException
	 */
	public void process9() throws SQLException {
		m.query9(id, name);
	}
	
	/**
	 * idCloth, type, size, color, price, number
	 * by id and size
	 * @throws Exception
	 */
	public void process10() throws Exception {
		m.query10(id, size);
	}
	
	
	/**
	 * query idBook, genre, title, price, number
	 * by genre and title
	 * @throws SQLException
	 */
	public void process11() throws SQLException {
		m.query11(genre, title);
	}

}
