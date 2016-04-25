package com.cloud.admin.dao;

import com.cloud.admin.model.Category;


public interface CategoryDAO extends DAOInterface<Category> {
	public void insertCategory( String name, String description);
	public void updateCategory( int id, String name,String description);
	
}
