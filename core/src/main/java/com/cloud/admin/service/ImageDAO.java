package com.cloud.admin.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import com.cloud.admin.model.Image;

public interface ImageDAO  {
	public final String TABLE = "image";
	public final String STRUCTURE = "(id integer primary key autoincrement, name varchar(225),"
			+ " note varchar(500), cdate varchar(25), udate varchar(25));";
	public final String UPDATE_S = "(id, name, note, cdate, udate)";
	public final String INSERT_S = "(name, note, cdate, udate)";
	
	public void updateFileImage(int id, File file) throws FileNotFoundException;
	public List<Image> SearchImageFullText(String key);
	public List<Image> SearchImage(String name, String description, String date, String user_Update,
			String category_Name);
}
