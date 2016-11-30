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
		String sql = ""+
				" insert into Cloth"+
				" type,size,color,idCloth"+
				" values("+
				" ?,?,?,?)";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, c.getType());
		ptmt.setString(2, c.getColor());
		ptmt.setString(3, c.getSize());
		ptmt.setInt(4, c.getIdCloth());
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
				" update Cloth"+
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
		String sql = ""+
				" delete from Cloth"+
				" where idCloth=?";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setInt(1, c.getIdCloth());
		ptmt.execute();		
		System.out.println("successfully del");
	}
	


}
