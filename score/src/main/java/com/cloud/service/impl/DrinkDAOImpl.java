package com.cloud.service.impl;

import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import com.cloud.admin.model.Item;
import com.cloud.admin.service.impl.SqliteDAOImpl;
import com.cloud.model.Bill;
import com.cloud.model.Customer;
import com.cloud.model.Drink;
import com.cloud.model.SetTable;
import com.cloud.service.DrinkDAO;


public class DrinkDAOImpl extends SqliteDAOImpl<Drink> implements DrinkDAO{

 

	@Override
	public Drink find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Drink obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Drink obj) {
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
	public List<Drink> listAll() {
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
	public Drink search(Drink obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet select(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Drink tableToObject(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateToTable(List<Drink> rows) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void orderIn(Drink i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void orederOut(Drink i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Drink> order() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bill createOder(Customer c, List<Item> order, SetTable t) {
		// TODO Auto-generated method stub
		return null;
	}

 
	
}
