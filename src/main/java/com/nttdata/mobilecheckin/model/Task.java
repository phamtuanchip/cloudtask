package com.nttdata.mobilecheckin.model;

import java.io.Serializable;

public class Task implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2733976798890186613L;
	public   long ID;
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPRI() {
		return PRI;
	}
	public void setPRI(int pRI) {
		PRI = pRI;
	}
	public java.util.Date getDate() {
		return Date;
	}
	public void setDate(java.util.Date date) {
		Date = date;
	}
	public boolean isRemide() {
		return Remide;
	}
	public void setRemide(boolean remide) {
		Remide = remide;
	}
	public String getAdd() {
		return Add;
	}
	public void setAdd(String add) {
		Add = add;
	}
	public String getLat() {
		return Lat;
	}
	public void setLat(String lat) {
		Lat = lat;
	}
	public String getLgn() {
		return Lgn;
	}
	public void setLgn(String lgn) {
		Lgn = lgn;
	}
	public boolean isRemided() {
		return Remided;
	}
	public void setRemided(boolean remided) {
		Remided = remided;
	}
	public   String Name;
	public   int PRI;
	public   java.util.Date Date;
	public   boolean Remide;
	public   String Add;
	public   String Lat;
	public   String Lgn;
	public   boolean Remided;
}
