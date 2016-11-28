package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import myDB.DButil;

public class ClothModify {
	private Cloth c;
	
	public ClothModify(Cloth cloth){
		this.c= cloth;
	}
	
	public void addCloth() throws Exception{
		Connection conn = DButil.getConnection();
		String sql = ""+
				" insert into Cloth"+
				" type, size, color, id"+
				" values("+
				" ?,?,?,?)";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, c.getType());
		ptmt.setString(2, c.getColor());
		ptmt.setString(3, c.getSize());
		ptmt.setInt(4, c.getIdCloth());

		ptmt.execute();

	}
	
	public void updateCloth() throws Exception{
		Connection conn = DButil.getConnection();
		String sql = ""+
				"Update Cloth"+
				"type, size, color, id"+
				"values("+
				 "?,?,?,?)";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, c.getType());
		ptmt.setString(2, c.getColor());
		ptmt.setString(3, c.getSize());
		ptmt.setInt(4, c.getIdCloth());

		ptmt.execute();
		
	}
	
	public void delCloth(){
		
	}
	
	public List<Cloth>query() throws SQLException{
		Connection conn = DButil.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("slect cl_name,idCloth,type,color form Cloth");//need correct sql
		
		List<Cloth> gs = new ArrayList<Cloth>();
		Cloth g = null;
		
		while(rs.next()){
			g = new Cloth();
			g.setSize(rs.getString("type"));
			g.setColor(rs.getString("color"));
			g.setIdCloth(rs.getInt("idCloth"));
			g.setType(rs.getString("cl_name"));
			//need correct print out
			System.out.println(rs.getString("type"+","));
		}
		return null;
	}
}
