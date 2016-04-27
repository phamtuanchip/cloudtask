package com.cloud.service;

import com.cloud.admin.dao.DAOInterface;
import com.cloud.model.Human;


public interface HumanDAO extends DAOInterface<Human> {
	 
	public final String DATA = "evaluation.db";
	public final String TABLE = "h";
	public final String STRUCTURE = "(id integer primary key autoincrement, name varchar(225),"
			+ " note varchar(500), cdate varchar(25), udate varchar(25));";
	public final String UPDATE_S = "(id, name, note, cdate, udate)";
	public final String INSERT_S = "(name, note, cdate, udate)";
}
