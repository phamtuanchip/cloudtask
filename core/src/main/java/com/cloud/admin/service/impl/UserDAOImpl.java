package com.cloud.admin.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.naming.AuthenticationException;
import javax.sql.DataSource;

import com.cloud.admin.model.Customer;
import com.cloud.admin.model.User;
import com.cloud.admin.service.UserDAO;
import com.cloud.exception.FieldRequireException;
import com.cloud.exception.NoUserException;
import com.fasterxml.jackson.databind.util.ISO8601Utils;

public class UserDAOImpl extends SqliteDAOImpl<User> implements UserDAO {

	public UserDAOImpl() {
		table = TABLE;
		drive = DATA;
		structureCreate = STRUCTURE ;
		structureUpdate = UPDATE_S;
		structureInsert = INSERT_S;
		//sqlWhere = WHERE_S;
		//createTable();
	}
	
	@Override
	public int save(User obj) {
		Statement st;
		int status =-1;
		try {
			st = connect().createStatement();
			String  
			isql = new StringBuffer(buildInsert(obj)).append(SYNTAX).append(obj.getUsername())
			.append(SYNTAX)
			.append(obj.getPassword())
			.append(CLOSE).toString();
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
		if(obj.getId() > 0)
			try {
				throw new NoUserException(String.valueOf(obj.id));
			} catch (NoUserException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return find(String.valueOf(obj.getId()));
	}

	@Override
	public ResultSet select(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User tableToObject(ResultSet rs) {
		User c = null;
		try {
			c = new User(rs.getLong(1), rs.getString(2));
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
	public void updateToTable(List<User> rows) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String buildInsert(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildUpdate(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User login(User u) throws FieldRequireException, AuthenticationException {
		// TODO Auto-generated method stub
		if(u.getUsername().isEmpty()) throw new FieldRequireException("Username isEmpty");
		else if (u.getPassword().isEmpty()) throw new FieldRequireException("Password isEmpty");
		return search(u);
	}

	@Override
	public User logout(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer createUser(Customer c, User u) {
		// TODO Auto-generated method stub
		c.setUid(String.valueOf(u.getId()));
		return c;
	}

	@Override
	public String buildWhere(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	 
	 

}
