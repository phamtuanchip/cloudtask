package com.cloud.admin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class SqliteDAO<T> extends DAOAbstract {
	public static Connection c ;
	
	public Connection connect() {
		dbType = "sqlite";
		drive  = "D:/projects/cloudtask/db/coffe2.db";
		sqlCreate = "CREATE TABLE IF NOT EXISTS " + table +" "+ structureCreate;
		sqlDrop = "DROP TABLE " + table + ";" ;
		sqlSelect = "SELECT * FROM " + table + ";" ;
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

	
}
