package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import myDB.DButil;

public class MerchandiseModify {

	private Merchansidse m;
	
	public MerchandiseModify(Merchansidse m){
		this.m = m;
	}
	/**
	 * add record in merchandise table
	 * @throws Exception
	 */
	public void addMerchandise() throws Exception{
		
		Connection conn = DButil.getConnection();
		StringBuilder sb = new StringBuilder();
		sb.append(" insert into merchandise");
		sb.append(" (id,supplier_id,price,number)");
		sb.append(" values(");
		sb.append(" ?,?,?,?)");
		System.out.println(sb);
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		ptmt.setInt(1, m.getIdMerchansidse());
		ptmt.setInt(2, m.getIdFactory());
		ptmt.setInt(3, m.getNumber());
		ptmt.setFloat(4, m.getPrice());
		ptmt.execute();
		
		/**Connection conn = DButil.getConnection();
		String sql = ""+
				" insert into merchandise"+
				" id,supplier_id,price,number"+
				" values("+
				" ?,?,?,?)";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setInt(1, m.getIdMerchansidse());
		ptmt.setInt(2, m.getIdFactory());
		ptmt.setInt(3, m.getNumber());
		ptmt.setFloat(4, m.getPrice());
		ptmt.execute();*/
		System.out.println("successfully add");
	}
	/**
	 * update a record in merchandise 
	 * @throws SQLException
	 */
	public void updateMerchandise() throws SQLException{
		Connection conn = DButil.getConnection();
		String sql = ""+
				" update Merchandise"+
				" set price=?,number=?,"+
				" where id=? and supplier_id=?";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setInt(1, m.getNumber());
		ptmt.setFloat(2, m.getPrice());
		ptmt.setInt(3, m.getIdMerchansidse());
		ptmt.setInt(4, m.getIdFactory());

		ptmt.execute();
		System.out.println("successfully update");	
	}
	
	public void delMerchandise() throws SQLException{
		Connection conn = DButil.getConnection();
		String sql = ""+
				" delete from Merchandise"+
				" where id=? and supplier_id=?";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setInt(1, m.getIdMerchansidse());
		ptmt.setInt(2, m.getIdFactory());
		ptmt.execute();		
		System.out.println("successfully del");
	}
	
}
