package com.cloud.admin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqliteJDBC {
	public static Connection connect() {
		Connection c = null;
		try {
			Class.forName("org.sqlite.JDBC");
			// Note: /test.db is the test.db in the *current* working directory
			c = DriverManager.getConnection("jdbc:sqlite:gallery.db","","");
			c.setAutoCommit(false);

			Statement st = c.createStatement();
			int rc = st.executeUpdate( "INSERT INTO x(b) VALUES('qwer')" );
			System.out.println( "insert returns " + rc );

			ResultSet rs = st.executeQuery( "SELECT * FROM x" );
			while ( rs.next() ) {
				int i = rs.getInt(1);
				String  s = rs.getString(2);
				System.out.println( "i=" + i + ", s=" + s );
			}
			rs.close();
			st.close();

			c.commit();
			c.close();
		} catch ( Exception e ) {
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
		}
		return c;
	}

}
