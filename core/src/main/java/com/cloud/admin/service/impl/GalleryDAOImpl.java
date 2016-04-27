package com.cloud.admin.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import com.cloud.admin.model.Image;
import com.cloud.admin.service.ImageDAO;


public class GalleryDAOImpl extends SqliteDAOImpl<Image> implements ImageDAO{

	@Override
	public Image find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Image obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Image obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(List<String> selected) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Image> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSequence() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateFileImage(int id, File file) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
	}

	 

	@Override
	public List<Image> SearchImageFullText(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Image> SearchImage(String name, String description, String date, String user_Update,
			String category_Name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image search(Image obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet select(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image tableToObject(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateToTable(List<Image> rows) {
		// TODO Auto-generated method stub
		
	}

  

	 
	
	
}
