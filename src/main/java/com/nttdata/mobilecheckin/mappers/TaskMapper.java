package com.nttdata.mobilecheckin.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nttdata.mobilecheckin.model.Task;

public class TaskMapper implements RowMapper<Task>{
	
	
	 
		
	public static final String ID = "id";
	public static final String Name = "Name";
	public static final String PRI = "" ;
	public static final String Date = "";
	public static final String Remide = "isReminder";
	public static final String Add = "role";
	public static final String Lat = "role";
	public static final String Lgn = "role";
	public static final String 	Remided = "role";

		
	@Override
	public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
		Task t = new Task();
		t.setID(rs.getLong(ID));
		t.setName(rs.getString(Name));
		t.setPRI(rs.getInt(PRI));
		t.setDate(rs.getDate(Date));
		t.setRemide(rs.getBoolean(Remide));
		t.setAdd(rs.getString(Add));
		t.setLat(rs.getString(Lat));
		t.setLgn(rs.getString(Lgn));
		t.setRemided(rs.getBoolean(Remided));
		return t;
	}

}
