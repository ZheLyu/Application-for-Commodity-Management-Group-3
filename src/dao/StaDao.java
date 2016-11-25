package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import model.Stationery;
import myDB.DButil;
public class StaDao {
	
	public List<Stationery> query() throws Exception {
		List<Stationery> result = new ArrayList<Stationery>();
		
		Connection conn = DButil.getConnection();
		StringBuilder sb = new StringBuilder();
		sb.append("select st_name, idStationery from stationery ");
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		ResultSet rs = ptmt.executeQuery();
		
		Stationery s = null;
		while(rs.next()) {
			s = new Stationery();
			s.setSt_name(rs.getString("st_name"));
			s.setIdStationery(rs.getInt("idStationery"));
			result.add(s);
		}
		return result;
		
	}

}
