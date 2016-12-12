package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import myDB.DButil;
/**
 * add, delete, update operations on cloth table 
 *
 */
public class ClothModify {
	private Cloth c;
	
	public ClothModify(Cloth cloth){
		this.c= cloth;
	}
	/**
	 * add record in cloth table 
	 * @throws Exception
	 */
	public void addCloth() throws Exception{
		Connection conn = DButil.getConnection();
		
		StringBuilder sb = new StringBuilder();
		sb.append(" insert into cloth");
		sb.append(" (type,size,color,idCloth)");
		sb.append(" values(");
		sb.append(" ?,?,?,?)");
		
		/**String sql = ""+
				" insert into cloth"+
				" (type,size,color,idCloth)"+
				" values("+
				"?,?,?,?)";*/
		
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		ptmt.setString(1, c.getType());
		System.out.println(c.getSize());
		ptmt.setString(2, c.getSize());
		ptmt.setString(3, c.getColor());
		ptmt.setInt(4, c.getIdCloth());
		System.out.println(sb); 
		ptmt.execute();
		System.out.println("successfully add");

	}
/**
 * update a record of cloth table 
 * @throws SQLException
 */
	public void updateCloth() throws SQLException{
		Connection conn = DButil.getConnection();
		String sql = ""+
				" update mydb.Cloth"+
				" set type=?,size=?,color=?,"+
				" where idCloth=?";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, c.getType());
		ptmt.setString(2, c.getColor());
		ptmt.setString(3, c.getSize());
		ptmt.setInt(4, c.getIdCloth());
		ptmt.execute();
		System.out.println("successfully update");	
	}
	/**
	 * delete a  record of cloth table 
	 * @throws SQLException
	 */
	public void delCloth() throws SQLException{
		Connection conn = DButil.getConnection();
		
		StringBuilder sb = new StringBuilder();
		sb.append(" delet from cloth");
		sb.append(" where type=?");

		
		/**String sql = ""+
				" delete from Cloth"+
				" where idCloth=?";*/
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		ptmt.execute();		
		System.out.println("successfully del");
	}



	public int delClothNumber(String title) throws SQLException{
		Connection conn = DButil.getConnection();
		StringBuilder sb = new StringBuilder();
		sb.append(" select idBook from ");
		sb.append(" cloth");
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