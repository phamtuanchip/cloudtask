package com.cloud.model;

import java.util.Date;

import com.cloud.admin.model.ModelAbstact;



public class Organization extends ModelAbstact {
	/**
	 * 
	 */

	//constructor
	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Organization(long id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public Organization(long id, String name, String description, Date dateCreate) {
		super();
		this.id = id;
		this.name = name;
		this.note = description;
		this.createdDate = dateCreate;
	}


	//getter and setter
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return note;
	}
	public void setDescription(String description) {
		this.note = description;
	}
	public Date getDateCreate() {
		return createdDate;
	}
	public void setDateCreate(Date dateCreate) {
		this.createdDate = dateCreate;
	}


	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description="
				+ note + ", dateCreate=" + createdDate + "]";
	}


}
