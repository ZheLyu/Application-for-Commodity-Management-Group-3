package myDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import View.MainView;

public class DButil {
	
	static String nameOfDb = "dbproject"; 
	static String password = "lz19931214" ;
	
	private static final String PATH = "com.mysql.jdbc.DBUtil";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/" + nameOfDb +"?autoReconnect=true&useSSL=false";
	private static final String USER = "root";
	private static final String PASSWORD = password;
	
	private static Connection conn = null;
	
	static {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connected to MySQL driver successfully ");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static Connection getConnection() {
		
		return conn;
		
	}
	
//	public static void main(String[] args) {
//		
//		Connection conn = DButil.getConnection();
//		
//	}

}

