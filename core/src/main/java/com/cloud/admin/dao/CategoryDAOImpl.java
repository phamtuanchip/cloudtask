package com.cloud.admin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.cloud.admin.model.Category;


public class CategoryDAOImpl extends SqliteDAO<Category>{

	public CategoryDAOImpl() {
		table = "category";
		structure = "(id integer primary key autoincrement, nwhat varchar(125), nwhen varchar(30), nwhere varchar(125), nremind varchar(10), nimage varchar (125), nbinary BLOB, ntime varchar(5) )";
	}
	
	@Override
	public Category find(String id) {
		sql = 
		ResultSet rs = selectFromTable(sql + id) 
		
		return null;
	}

	@Override
	public int save(Category obj) {
		Statement st;
		int status =0;
		try {
			st = connect().createStatement();

			int rc = st.executeUpdate( "INSERT INTO "+table+" "+structure+" VALUES('qwer')" );
			System.out.println( "insert returns " + rc );

			ResultSet rs = st.executeQuery( "SELECT * FROM " + table );
			while ( rs.next() ) {
				int i = rs.getInt(1);
				String  s = rs.getString(2);
				System.out.println( "i=" + i + ", s=" + s );
			}
			rs.close();
			st.close();

			connect().commit();
			connect().close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		// TODO Auto-generated method stub
		return status;
	}

	@Override
	public int update(Category obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(List<String> selected) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Category> listAll() {
		ArrayList<Category> list = new ArrayList<Category>();
		try {
			ResultSet rs = select(sql);
			while (rs.next()) {
				list.add(tableToObject(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int getSequence() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub

	}

	@Override
	public Category tableToObject(ResultSet rs) {
		Category c = null;
		try {
			c = new Category(rs.getLong(0), rs.getString(1));
			c.setNote(rs.getString(2));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return c;
	}
	 
	@Override
	public ResultSet select(String sql) {
		// TODO Auto-generated method stub
		return null;
	}


}
