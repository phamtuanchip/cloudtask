package com.cloud.admin.dao;

import java.util.List;

public interface DAOInterface <T> {
	public T search(T obj);
	public T find(String id);
	public int save(T obj);
	public int update(T obj);
	public void delete(String id);
	public void deleteAll(List<String> selected);
	public List<T> listAll();	
	
	public void updateToTable(List<T> rows);
}
