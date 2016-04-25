package com.cloud.admin.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

public interface DAOInterface <T> {
	
	public T find(String id);
	public int save(T obj);
	public int update(T obj);
	public void delete(String id);
	public void deleteAll(List<String> selected);
	public List<T> listAll();	
	
	public int getSequence();
	public void setDataSource(DataSource dataSource);
	
	public Connection connect();

	public void createTable() ; 
	
	public ResultSet select(String sql) ;
	public ResultSet selectFromTable() ;
	public T tableToObject(ResultSet rs); 

}
