package com.cloud.admin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class SqliteDAO<T> extends DAOAbstract<T> {
	public static Connection c ;
	
	public Connection connect() {
		if(c == null)
		try {
			Class.forName("org.sqlite.JDBC");
			// Note: /test.db is the test.db in the *current* working directory
			c = DriverManager.getConnection("jdbc:"+dbType+":" + drive,"","");
			c.setAutoCommit(false);
			
		} catch ( ClassNotFoundException e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(1);
			try {
				if ( c != null && ! c.isClosed() ) {
					c.rollback();
					c.close();
				}
			} catch ( SQLException sql ) { 
				sql.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}
	
	public void createTable()  {
		Statement st;
		try {
			st = connect().createStatement();
			st.execute(sqlCreate);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public ResultSet selectFromTable(){
		Statement st;
		try {
			st = connect().createStatement();
			ResultSet rs = st.executeQuery(sqlSelect);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
}
