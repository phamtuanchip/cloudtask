package com.cloud.admin.service;

import com.cloud.admin.model.User;

public interface CustomerDAO {
	public final String DATA = "cloud.db";
	public final String TABLE = "customers";
	public final String STRUCTURE = "(id integer primary key autoincrement, name varchar(225),"
			+ " note varchar(500), cdate varchar(25), udate varchar(25), addr varchar(500), sex varchar(10), phone varchar(20), email varchar(255), card varchar(100), taxnum varchar(100), type int, dob varchar(25), uid varchar(100));";
	public final String UPDATE_S = "(id, name, note, cdate, udate, addr, sex, phone, email, card, taxnum, type, dob, uid)";
	public final String INSERT_S = "(name, note, cdate, udate, addr, sex, phone, email, card, taxnum, type, dob, uid)";
	User findByUsername(String username);
}
