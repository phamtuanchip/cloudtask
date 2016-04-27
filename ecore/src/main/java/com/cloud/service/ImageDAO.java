package com.cloud.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import com.cloud.admin.dao.DAOInterface;
import com.cloud.admin.model.Image;


public interface ImageDAO extends DAOInterface<Image> {
		public void updateFileImage(int id, File file) throws FileNotFoundException;
		public Image getImageById(int id );
		public List<Image> SearchImageFullText(String key);
		public List<Image> SearchImage(String name, String description, String date, String user_Update, String category_Name ); 
}
