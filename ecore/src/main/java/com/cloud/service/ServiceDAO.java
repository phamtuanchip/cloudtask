package com.cloud.service;

import java.util.List;

import com.cloud.admin.dao.DAOInterface;

import com.cloud.admin.model.Customer;
import com.cloud.admin.model.Item;
import com.cloud.model.Report;
import com.cloud.model.Province;


public interface ServiceDAO<T> extends DAOInterface<T>{
	public void orderIn(T i);
	public void orederOut(T i);
	public List<T> order();
	public Report createOder(Customer c, List<Item> order, Province t) ;
	
}
