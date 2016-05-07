package com.cloud.admin.service;

import javax.naming.AuthenticationException;

import com.cloud.admin.model.Customer;
import com.cloud.admin.model.User;
import com.cloud.exception.FieldRequireException;

public interface UserDAO {
	public final String DATA = "cloud.db";
	public final String TABLE = "users";
	public final String STRUCTURE = "(id integer primary key autoincrement, name varchar(225),"
			+ " note varchar(500), cdate varchar(25), udate varchar(25), uid varchar(30), pwd varchar(30));";
	public final String UPDATE_S = "(id, name, note, cdate, udate, uid, pwd)";
	public final String INSERT_S = "(name, note, cdate, udate, uid, pwd)";
	public final String WHERE_S = "WHERE id = ";
	User findByUsername(String username);
	public Customer createUser(Customer c, User u);
	public User login(User u) throws FieldRequireException, AuthenticationException ;
	public User logout(User u);
}
