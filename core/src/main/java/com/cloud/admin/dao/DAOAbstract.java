package com.cloud.admin.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

public abstract class DAOAbstract<T>  {

	public String dbType;	
	public String drive;
	public String table;
	public String structureCreate;
	public String structureInsert;
	public String structureUpdate;
	public String sqlCreate;
	public String sqlDrop;
	public String sqlSelect;
	public String sqlWhere; 
	
	public abstract int getSequence();
	public abstract  void setDataSource(DataSource dataSource);
	
	public abstract  Connection connect();

	public  abstract void createTable() ; 
	public  abstract void dropTable() ; 
	public abstract  ResultSet select(String sql) ;
	public abstract  ResultSet selectFromTable() ;
	public abstract  T tableToObject(ResultSet rs); 
	
	public abstract  String buildInsert(T obj); 
	public abstract  String buildUpdate(T obj); 
	
}
