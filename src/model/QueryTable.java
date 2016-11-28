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
        // �½�һ��map list�������ڴ�Ŷ�����ѯ��¼
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        try {
            ResultSetMetaData md = rs.getMetaData();// �����(rs)�Ľṹ��Ϣ�������ֶ������ֶ����ȡ�
            int columnCount = md.getColumnCount();// ȡ�ò�ѯ�������ֶθ���
            while (rs.next()) {// ����rs
                // �½�һ��map���� ����ѯ�����ݰ����ֶ�����ֵ �ļ�ֵ����ʽ�洢��map������
                Map<String, Object> rowData = new HashMap<String, Object>();
                for (int i = 1; i <= columnCount; i++) {// ѭ�����в�ѯ���ֶ�
                    rowData.put(md.getColumnName(i), rs.getObject(i));
                    // getColumnName(i) ��ȡ��i������
                    // getObject(i) ��ȡ��i�������ֵ
                }
                list.add(rowData);// ��map����list������
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {// �ر�����
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
	
//	public List<Map<String, Object>> query(Integer id) {
//		Connection conn = DButil.getConnection();
//		StringBuilder sb = new StringBuilder();
//		sb = 
//		
//		return list;
//		
//	}
	
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
	
	/**
	 * 
	 * @return idBook, title, price, number, supplier of books
	 * @throws Exception
	 */
	public List<Map<String, Object>> query2() throws Exception {
		
		Connection conn = DButil.getConnection();
		StringBuilder sb = new StringBuilder();
		//sb.append("select st_name, idStationery, price, number, name from stationery, merchandise,supplier ");
		//sb.append("select st_name, idStationery, price, number from stationery, merchandise ");
		sb.append("select idBook, title, price, number, name from book, merchandise, supplier");
		sb.append(" where idBook = id and supplier_id = idSupplier");
		//sb.append("where idStationery = id and supplier_id = idSupplier");
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		ResultSet rs = ptmt.executeQuery();
		
		List<Map<String, Object>> list = convertList(rs);
		return list;
		
	}
	/**
	 * 
	 * @return idCloth, type, price, number, supplier name of all cloth
	 * @throws Exception
	 */
	public List<Map<String, Object>> query3() throws Exception {
		Connection conn = DButil.getConnection();
		StringBuilder sb = new StringBuilder();
		//sb.append("select st_name, idStationery, price, number, name from stationery, merchandise,supplier ");
		sb.append("select distinct idCloth, type, price, number, name from cloth, merchandise, supplier ");
		//sb.append("select idBook, title, price, number, name from book, merchandise, supplier");

		sb.append(" where idCloth = id and supplier_id = idSupplier");
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		ResultSet rs = ptmt.executeQuery();
		
		List<Map<String, Object>> list = convertList(rs);
		
		return list;
	}
	/**
	 * Query stationery by st_name
	 * @return
	 * @throws Exception
	 */
	public List<Map<String, Object>> query4(String name) throws Exception {
		Connection conn = DButil.getConnection();
		StringBuilder sb = new StringBuilder();
		sb.append("select st_name, idStationery, price, number, name from stationery, merchandise,supplier ");
		//sb.append("select st_name, idStationery, price, number from stationery, merchandise ");
		sb.append(" where st_name REGEXP ? and idStationery = id and supplier_id = idSupplier");
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		ptmt.setString(1,   name );
		ResultSet rs = ptmt.executeQuery();
		
		List<Map<String, Object>> list = convertList(rs);
		return list;
		
	}
	/**
	 * Query cloth by type
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public List<Map<String, Object>> query5(String type) throws Exception {
		
		Connection conn = DButil.getConnection();
		StringBuilder sb = new StringBuilder();
		sb.append("select distinct idCloth, type, price, number, name from cloth, merchandise, supplier ");
		//sb.append("select idBook, title, price, number, name from book, merchandise, supplier");

		sb.append(" where type REGEXP ? and idCloth = id and supplier_id = idSupplier");
		//sb.append("select st_name, idStationery, price, number from stationery, merchandise ");
		//sb.append(" where st_name REGEXP ? and idStationery = id and supplier_id = idSupplier");
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		ptmt.setString(1,   type );
		ResultSet rs = ptmt.executeQuery();
		
		List<Map<String, Object>> list = convertList(rs);
		return list;
	}
	
	
	/**
	 * Query stationery by id
	 * @param Stringid
	 * @return
	 * @throws Exception
	 */
	public List<Map<String, Object>> query6(String Stringid) throws Exception {
		int id = Integer.parseInt(Stringid);
		Connection conn = DButil.getConnection();
		StringBuilder sb = new StringBuilder();
		sb.append(" select * from ");
		sb.append("(select st_name, idStationery, price, number, name from stationery, merchandise,supplier ");
		//sb.append("select st_name, idStationery, price, number from stationery, merchandise ");
		sb.append(" where  idStationery = id and supplier_id = idSupplier ) AS T ");
		sb.append(" where T.idStationery = ? ");
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		ptmt.setInt(1,   id );
		ResultSet rs = ptmt.executeQuery();
		
		List<Map<String, Object>> list = convertList(rs);
		return list;
		
	}
	
	/**
	 * query cloth by id
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public List<Map<String, Object>> query7(int id) throws Exception {
		Connection conn = DButil.getConnection();
		StringBuilder sb = new StringBuilder();
		sb.append(" select * from ");
		sb.append("(select type,color, size, idCloth, price, number, name from cloth, merchandise,supplier ");
		//sb.append("select st_name, idStationery, price, number from stationery, merchandise ");
		sb.append(" where  idCloth = id and supplier_id = idSupplier ) AS T ");
		sb.append(" where T.idCloth = ? ");
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		ptmt.setInt(1,   id );
		ResultSet rs = ptmt.executeQuery();
		
		List<Map<String, Object>> list = convertList(rs);
		return list;
		
	}
	
	public List<Map<String, Object>> query8(int id) throws Exception {
		
		Connection conn = DButil.getConnection();
		StringBuilder sb = new StringBuilder();
		sb.append(" select * from ");
		sb.append(" (select idBook, isbn, title, price, number, name from book, merchandise, supplier");
		sb.append(" where idBook = id and supplier_id = idSupplier) AS T ");
		sb.append(" where T.idBook = ? ");
		//sb.append("(select type,color, size, idCloth, price, number, name from cloth, merchandise,supplier ");
		//sb.append("select st_name, idStationery, price, number from stationery, merchandise ");
//		sb.append(" where  idCloth = id and supplier_id = idSupplier ) AS T ");
//		sb.append(" where T.idCloth = ? ");
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		ptmt.setInt(1,   id );
		ResultSet rs = ptmt.executeQuery();
		
		List<Map<String, Object>> list = convertList(rs);
		return list;
	}

	
}