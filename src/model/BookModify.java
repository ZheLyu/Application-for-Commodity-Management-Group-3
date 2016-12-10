package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import myDB.DButil;

public class BookModify {
	Book book;
	
	public BookModify(Book b){
		this.book = b;
	}
	
	/**
	 * 
	 * @param title
	 * @return bookid found by name  
	 * @throws SQLException
	 */
	public int delBookNumber(String title) throws SQLException{
		Connection conn = DButil.getConnection();
		StringBuilder sb = new StringBuilder();
		sb.append(" select idBook from ");
		sb.append(" book");
		sb.append(" where title=?");
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		ptmt.setString(1, title);
		System.out.println(title);
		ResultSet rs = ptmt.executeQuery();
		rs.next();
		int id = rs.getInt(1);
		System.out.println(id);
		return id;
	}

}
