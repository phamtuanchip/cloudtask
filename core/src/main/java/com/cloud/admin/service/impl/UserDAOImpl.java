package com.cloud.admin.service.impl;

import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import com.cloud.admin.model.User;
import com.cloud.admin.service.UserDAO;

public class UserDAOImpl extends SqliteDAOImpl<User> implements UserDAO {

	public UserDAOImpl() {
		table = "user";
		structureCreate = "(id integer primary key autoincrement, name varchar(225),"
				+ " note varchar(500), cdate varchar(25), udate varchar(25));";
		structureUpdate = "(id, name, note, cdate, udate)";
		structureInsert = "(name, note, cdate, udate)";
		//createTable();
	}
	@Override
	public User find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(User obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(User obj) {
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
	public List<User> listAll() {
		// TODO Auto-generated method stub
		return null;
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
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User search(User obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet select(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User tableToObject(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateToTable(List<User> rows) {
		// TODO Auto-generated method stub
		
	}

	 
	 

}
