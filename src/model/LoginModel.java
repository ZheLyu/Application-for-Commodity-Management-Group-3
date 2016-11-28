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

public class LoginModel {
	
	private String ad="";
	private String password="";
	
	public  void setAd(String ad){
		this.ad=ad;
	}
	
	public  void setPassword(String password){
		this.password=password;
	}
	
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
	
	/**
	 * Query the id, st_name, price, number, supplier of all stationery
	 * @return
	 * @throws Exception
	 */
	public boolean query() throws Exception {
		//List<Stationery> result = new ArrayList<Stationery>();
		
		Connection conn = DButil.getConnection();
		StringBuilder sb = new StringBuilder();
		System.out.println(password);
		sb.append("SELECT username,password FROM mydb.administrator ");
		sb.append("where username='"+ad+"' and password='"+password+"'");
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		ResultSet rs = ptmt.executeQuery();
		List<Map<String, Object>> list = convertList(rs);
		System.out.println(list.size());
		if(list.size()!=0){
			return true;
		}
		else return false;
		
	}
	}
