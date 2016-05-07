package com.cloud.admin.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cloud.admin.dao.DAOAbstract;
import com.cloud.admin.dao.DAOInterface;
import com.cloud.admin.model.ModelAbstact;
import com.fasterxml.jackson.databind.util.ISO8601Utils;

public abstract class SqliteDAOImpl<T> extends DAOAbstract implements DAOInterface<T> {
	private Connection c ;
	public static String SPACE = " " ;
	public static String SYNTAX = "', '";
	public static String CLOSE ="');";
	
	public Connection connect() {
		dbType = "sqlite";
		sqlCreate = "CREATE TABLE IF NOT EXISTS " + table +" "+ structureCreate;
		sqlDrop = "DROP TABLE " + table + ";" ;
		sqlSelect = "SELECT * FROM " + table + ";" ;
		sqlWhere = "SELECT * FROM " + table + " where id = " ;
		try {
			if(c == null || c.isClosed())
				Class.forName("org.sqlite.JDBC");
				// Note: /test.db is the test.db in the *current* working directory
				c = DriverManager.getConnection("jdbc:"+dbType+":" + drive,"","");
				//c.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return c;
	}
	 
	public void createTable()  {
		Statement st;
		
		try {
			st = connect().createStatement();
			System.out.println(sqlCreate);
			st.executeUpdate(sqlCreate);
			st.close();
			//connect().commit();
			connect().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void dropTable()  {
		Statement st;
		
		try {
			st = connect().createStatement();
			System.out.println(sqlDrop);
			st.executeUpdate(sqlDrop);
			st.close();
			//connect().commit();
			connect().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public ResultSet selectFromTable(){
		Statement st;
		try {
			st = connect().createStatement();
			System.out.println(sqlSelect);
			ResultSet rs = st.executeQuery(sqlSelect);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<T> listAll() {
		ArrayList<T> list = new ArrayList<T>();
		try {
			ResultSet rs = selectFromTable();
			while (rs.next()) {
				list.add((T)tableToObject(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public T find(String id) {
		sqlWhere += id;
		ResultSet rs = select(sqlWhere);
		return (T) tableToObject(rs);
	}
	
	public ResultSet select(String sql) {
		Statement st;
		try {
			st = connect().createStatement();
			System.out.println(sql);
			ResultSet rs = st.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return null;
	 }

	public String buildInsert(ModelAbstact obj) {
		StringBuffer sb = new StringBuffer("INSERT INTO");
		sb.append(SPACE).append(table).append(SPACE).append(structureInsert).append(SPACE).append("VALUES('").append(obj.getName()).append(SYNTAX)
		.append(obj.getNote()).append(SYNTAX).append(ISO8601Utils.format(obj.getCreatedDate())).append(SYNTAX).append(ISO8601Utils.format(obj.getLastUpdated()));
		return sb.toString();
	}
	public String buildUpdate(ModelAbstact obj) {
		StringBuffer sb = new StringBuffer("UPDATE TABLE");
		sb.append(SPACE).append(table).append(SPACE).append(structureInsert).append(SPACE).append("VALUES('").append(obj.getName()).append(SYNTAX)
		.append(obj.getNote()).append(SYNTAX).append(ISO8601Utils.format(obj.getCreatedDate()));
		return sb.toString();
	}
}
