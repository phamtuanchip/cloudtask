package com.cloud.admin.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public abstract class ModelAbstact implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4200931835369510004L;
	public long id;
	public String name;
	public Date createdDate;
	public Date lastUpdated;
	public String note;
	
	public ModelAbstact() {
		// TODO Auto-generated constructor stub
	}
	
	public ModelAbstact(long id, String name) {
		this.id = id;
		this.name = name;
		this.createdDate = new Date();
		this.lastUpdated = new Date(); 
	}
	public long getId() {
		return id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setProperties(HashMap<String, String> properties) {
		this.properties = properties;
	}

	
	
	public HashMap<String, String> properties ;
	
	public Map<String, String> getProperties(){
		return properties;
	}
	
	public String addProperty(String p) {
		properties.put(p, null);
		return p;
	}
	
	public String setValue(String p, String v) {
		properties.put(p, v);
		return v;
	}
}
