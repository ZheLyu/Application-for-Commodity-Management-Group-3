package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

import myDB.DButil;

public class QueryTable {
	
	public static List<Map<String, Object>> convertList(ResultSet rs) {
        // 新建一个map list集合用于存放多条查询记录
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        try {
            ResultSetMetaData md = rs.getMetaData();// 结果集(rs)的结构信息，比如字段数、字段名等。
            int columnCount = md.getColumnCount();// 取得查询出来的字段个数
            while (rs.next()) {// 迭代rs
                // 新建一个map集合 将查询出内容按照字段名：值 的键值对形式存储在map集合中
                Map<String, Object> rowData = new HashMap<String, Object>();
                for (int i = 1; i <= columnCount; i++) {// 循环所有查询出字段
                    rowData.put(md.getColumnName(i), rs.getObject(i));
                    // getColumnName(i) 获取第i个列名
                    // getObject(i) 获取第i个对象的值
                }
                list.add(rowData);// 将map放入list集合中
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {// 关闭连接
            try {
                if (rs != null)
                    rs.close();
                rs = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

	
	public Map<String, Object> convertMap(ResultSet rs) {
		Map<String, Object> map = new TreeMap<String, Object>();
		try {
			ResultSetMetaData md = rs.getMetaData();
			int columnCount = md.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= columnCount; i++) {
					map.put(md.getColumnName(i), rs.getObject(i));
				}
			}
			return map;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try{
				if(rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
		
	}
	
	/**
	 * Query the id, st_name, price, number, supplier of all stationery
	 * @return
	 * @throws Exception
	 */
	public List<Map<String, Object>> query() throws Exception {
		//List<Stationery> result = new ArrayList<Stationery>();
		
		Connection conn = DButil.getConnection();
		StringBuilder sb = new StringBuilder();
		sb.append("select st_name, idStationery, price, number, name from stationery, merchandise,supplier ");
		//sb.append("select st_name, idStationery, price, number from stationery, merchandise ");
		sb.append("where idStationery = id and supplier_id = idSupplier");
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		ResultSet rs = ptmt.executeQuery();
		
		List<Map<String, Object>> list = convertList(rs);
		return list;
		
//		Stationery s = null;
//		while(rs.next()) {
//			s = new Stationery();
//			s.setSt_name(rs.getString("st_name"));
//			s.setIdStationery(rs.getInt("idStationery"));
//			
//			result.add(s);
//		}
//		return result;

	}
	

	
}
