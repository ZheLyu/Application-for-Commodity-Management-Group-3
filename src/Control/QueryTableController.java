package Control;

import java.util.List;
import java.util.Map;

import model.QueryTable;
import View.LoginView;



public class QueryTableController {
	
	private QueryTable m = new QueryTable();
	private LoginView l= new LoginView();
	private String name;
	private String id;
	private String type;
	
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
	
	public void process6() throws Exception {
		m.query6(id);
		
	}

}
