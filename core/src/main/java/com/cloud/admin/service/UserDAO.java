package com.cloud.admin.service;

import com.cloud.admin.model.User;

public interface UserDAO {
	public final String TABLE = "users";
	public final String STRUCTURE = "(id integer primary key autoincrement, name varchar(225),"
			+ " note varchar(500), cdate varchar(25), udate varchar(25));";
	public final String UPDATE_S = "(id, name, note, cdate, udate)";
	public final String INSERT_S = "(name, note, cdate, udate)";
	User findByUsername(String username);
}
