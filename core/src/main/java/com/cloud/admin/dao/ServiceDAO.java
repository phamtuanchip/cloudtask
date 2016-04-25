package com.cloud.admin.dao;

import java.util.List;

import com.cloud.admin.model.Bill;
import com.cloud.admin.model.Customer;
import com.cloud.admin.model.Item;
import com.cloud.admin.model.SetTable;


public interface ServiceDAO<T> extends DAOInterface<T>{
	public void orderIn(T i);
	public void orederOut(T i);
	public List<T> order();
	public Bill createOder(Customer c, List<Item> order, SetTable t) ;
	
}
