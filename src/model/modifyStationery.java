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

public class modifyStationery {
	
	private String name="";
	private String id="";
	private String number="";
	private String price="";
	private String supplier="";
	private String sid="";
	
	public modifyStationery(){
		
	}
	public void modifyPrice(String id, String price){
		this.id=id;
		this.price=price;
	}
	public modifyStationery(String id, String number){
		this.id=id;
		this.number=number;
	}
	public modifyStationery(String name, String id, String number, String price,String supplier, String sid){
		this.name=name;
		this.id=id;
		this.number=number;
		this.price=price;
		this.supplier=supplier;
		this.sid=sid;
	}
	
	
	public static List<Map<String, Object>> convertList(ResultSet rs) {
       
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        try {
            ResultSetMetaData md = rs.getMetaData();
            int columnCount = md.getColumnCount();
            while (rs.next()) {
               
                Map<String, Object> rowData = new HashMap<String, Object>();
                for (int i = 1; i <= columnCount; i++) {
                    rowData.put(md.getColumnName(i), rs.getObject(i));
                   
                }
                list.add(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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
	public void addStationeryQuery1() throws Exception {
		//List<Stationery> result = new ArrayList<Stationery>();
		
		Connection conn = DButil.getConnection();
		StringBuilder sb = new StringBuilder();
		
		sb.append("INSERT INTO merchandise");
		sb.append("(id,supplier_id,price,number) VALUES('"+id+"','"+sid+"','"+price+"','"+number+"');");
		//sb.append("INSERT INTO stationery");
		//sb.append("(st_name, idStationery) VALUES('zhangzhe', 3138);");
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		System.out.println(ptmt);
		//ResultSet rs = ptmt.;
		ptmt.execute();
		//List<Map<String, Object>> list = convertList(rs);
		//System.out.println(list.size());
		//if(list.size()!=0){
		//	return true;
		//}
		//else return false;
		
	}
	public void addStationeryQuery2() throws Exception {
		//List<Stationery> result = new ArrayList<Stationery>();
		
		Connection conn = DButil.getConnection();
		StringBuilder sb = new StringBuilder();
		
		//sb.append("INSERT INTO merchandise");
		//sb.append("(id,supplier_id,price,number) VALUES(3218,3231,25,300);");
		sb.append("INSERT INTO stationery");
		sb.append("(st_name, idStationery) VALUES('"+name+"','"+id+"');");
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		System.out.println(ptmt);
		//ResultSet rs = ptmt.;
		ptmt.execute();
		//List<Map<String, Object>> list = convertList(rs);
		//System.out.println(list.size());
		//if(list.size()!=0){
		//	return true;
		//}
		//else return false;
		
	}
	public void addStationeryQuery3() throws Exception {
		//List<Stationery> result = new ArrayList<Stationery>();
		
		Connection conn = DButil.getConnection();
		StringBuilder sb = new StringBuilder();
		
		//sb.append("INSERT INTO merchandise");
		//sb.append("(id,supplier_id,price,number) VALUES(3218,3231,25,300);");
		sb.append("INSERT INTO supplier");
		sb.append("(idSupplier, name) VALUES('"+sid+"','"+supplier+"');");
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		System.out.println(ptmt);
		//ResultSet rs = ptmt.;
		ptmt.execute();
		//List<Map<String, Object>> list = convertList(rs);
		//System.out.println(list.size());
		//if(list.size()!=0){
		//	return true;
		//}
		//else return false;
		
	}
	public void addStationeryQuery4() throws Exception {
		//List<Stationery> result = new ArrayList<Stationery>();
		
		Connection conn = DButil.getConnection();
		StringBuilder sb = new StringBuilder();
		
		//sb.append("INSERT INTO merchandise");
		//sb.append("(id,supplier_id,price,number) VALUES(3218,3231,25,300);");
		sb.append("DELETE from merchandise ");
		sb.append("where id="+id+";");
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		System.out.println(ptmt);
		//ResultSet rs = ptmt.;
		ptmt.execute();
		//List<Map<String, Object>> list = convertList(rs);
		//System.out.println(list.size());
		//if(list.size()!=0){
		//	return true;
		//}
		//else return false;
		
	}
	public void addStationeryQuery5() throws Exception {
		//List<Stationery> result = new ArrayList<Stationery>();
		
		Connection conn = DButil.getConnection();
		StringBuilder sb = new StringBuilder();
		System.out.println("..........");
		//sb.append("INSERT INTO merchandise");
		//sb.append("(id,supplier_id,price,number) VALUES(3218,3231,25,300);");
		sb.append("UPDATE merchandise SET number=number-"+number+" ");
		sb.append("where id='"+id+"';");
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		System.out.println(ptmt);
		//ResultSet rs = ptmt.;
		ptmt.execute();
		//List<Map<String, Object>> list = convertList(rs);
		//System.out.println(list.size());
		//if(list.size()!=0){
		//	return true;
		//}
		//else return false;
		
	}
	public void addStationeryQuery6() throws Exception {
		//List<Stationery> result = new ArrayList<Stationery>();
		
		Connection conn = DButil.getConnection();
		StringBuilder sb = new StringBuilder();
		System.out.println("..........");
		//sb.append("INSERT INTO merchandise");
		//sb.append("(id,supplier_id,price,number) VALUES(3218,3231,25,300);");
		sb.append("UPDATE merchandise SET number=number+"+number+" ");
		sb.append("where id='"+id+"';");
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		System.out.println(ptmt);
		//ResultSet rs = ptmt.;
		ptmt.execute();
		//List<Map<String, Object>> list = convertList(rs);
		//System.out.println(list.size());
		//if(list.size()!=0){
		//	return true;
		//}
		//else return false;
		
	}
	public void addQuery7() throws Exception {
		//List<Stationery> result = new ArrayList<Stationery>();
		
		Connection conn = DButil.getConnection();
		StringBuilder sb = new StringBuilder();
		System.out.println("..........");
		//sb.append("INSERT INTO merchandise");
		//sb.append("(id,supplier_id,price,number) VALUES(3218,3231,25,300);");
		sb.append("UPDATE merchandise SET price="+price+" ");
		sb.append("where id='"+id+"';");
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		System.out.println(ptmt);
		//ResultSet rs = ptmt.;
		ptmt.execute();
		//List<Map<String, Object>> list = convertList(rs);
		//System.out.println(list.size());
		//if(list.size()!=0){
		//	return true;
		//}
		//else return false;
		
	}
	}