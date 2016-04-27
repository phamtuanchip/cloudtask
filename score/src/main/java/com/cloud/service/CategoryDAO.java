package com.cloud.service;

import com.cloud.admin.dao.DAOInterface;
import com.cloud.model.Category;


public interface CategoryDAO extends DAOInterface<Category> {
	public void insertCategory( String name, String description);
	public void updateCategory( int id, String name,String description);
	
}
