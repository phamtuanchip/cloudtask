package com.cloud.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.cloud.admin.service.impl.SqliteDAOImpl;
import com.cloud.model.Category;
import com.cloud.service.CategoryDAO;
import com.fasterxml.jackson.databind.util.ISO8601Utils;


public class CategoryDAOImpl extends SqliteDAOImpl<Category> implements CategoryDAO{

	public CategoryDAOImpl() {
		table = "category";
		structureCreate = "(id integer primary key autoincrement, name varchar(225),"
				+ " note varchar(500), cdate varchar(25), udate varchar(25));";
		structureUpdate = "(id, name, note, cdate, udate)";
		structureInsert = "(name, note, cdate, udate)";
		//createTable();
	}
	
	@Override
	public Category find(String id) {
		sqlWhere = sqlSelect + "where id =" + id;
		ResultSet rs = select(sqlWhere);
		return tableToObject(rs);
	}

	@Override
	public int save(Category obj) {
		Statement st;
		int status =-1;
		try {
			st = connect().createStatement();
			String isql = "INSERT INTO "+table+" "+structureInsert+" VALUES('"+obj.getName()+"', '"+obj.getNote()+"', '"+ISO8601Utils.format(obj.getDateCreate())+"', '"+ISO8601Utils.format(obj.getLastUpdated())+"');";
			System.out.println(isql);
			st.executeUpdate(isql);
			st.close();
			//connect().commit();
			connect().close();
			status =0 ;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return status;
	}

	 
	@Override
	public List<Category> listAll() {
		ArrayList<Category> list = new ArrayList<Category>();
		try {
			ResultSet rs = selectFromTable();
			while (rs.next()) {
				list.add(tableToObject(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	 

	 

	@Override
	public Category tableToObject(ResultSet rs) {
		Category c = null;
		try {
			c = new Category(rs.getLong(1), rs.getString(2));
			c.setNote(rs.getString(3));
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return c;
	}

	@Override
	public Category search(Category obj) {
		sqlWhere = sqlSelect + "where id =" + obj.id + "or name like%(";
		// TODO Auto-generated method stub
		return null;
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
	public int getSequence() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ResultSet select(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	 

	@Override
	public void insertCategory(String name, String description) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCategory(int id, String name, String description) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateToTable(List<Category> rows) {
		// TODO Auto-generated method stub
		
	}

 

	 

}
