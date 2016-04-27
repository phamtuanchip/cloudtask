package com.cloud.service.impl;

import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import com.cloud.admin.model.Customer;
import com.cloud.admin.model.Item;
import com.cloud.admin.service.impl.SqliteDAOImpl;
import com.cloud.model.Bill;
import com.cloud.model.Food;
import com.cloud.model.SetTable;
import com.cloud.service.FoodDAO;


public class FoodDAOImpl extends SqliteDAOImpl<Food> implements FoodDAO{

	 

	@Override
	public Food find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Food obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Food obj) {
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
	public List<Food> listAll() {
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
	public Food search(Food obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet select(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Food tableToObject(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateToTable(List<Food> rows) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void orderIn(Food i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void orederOut(Food i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Food> order() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bill createOder(Customer c, List<Item> order, SetTable t) {
		// TODO Auto-generated method stub
		return null;
	}




}
