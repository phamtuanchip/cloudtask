package com.cloud.admin.dao;

import java.sql.Connection;
import java.sql.ResultSet;

public abstract class DAOAbstract<T> implements DAOInterface<T> {

	public String dbType;	
	public String drive;
	public String table;
	public String structure;
	public String sqlCreate;
	public String sqlSelect;
	public String sqlWhere; 
	
}
