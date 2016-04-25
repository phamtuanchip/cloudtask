package com.cloud.admin.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import javax.sql.DataSource;

import com.cloud.admin.model.Category;
import com.cloud.admin.model.Image;


public class GalleryDAOImpl implements ImageDAO, CategoryDAO {

	
	@Override
	public int insertCategory(Category category) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insertCategory(String name, String description) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCategory(int id, String name, String description) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Category listCategoryById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> listCategory() {
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
	public List<Image> listImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image getImage(int id) {
		// TODO Auto-generated method stub
		SqliteJDBC.connect();
		return new Image();
	}

	@Override
	public void insertImage(Image image) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateImage(Image image) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteImage(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateFileImage(int id, File file) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Image getImageById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Image> SearchImageFullText(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Image> SearchImage(String name, String description,
			String date, String user_Update, String category_Name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSquence() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
