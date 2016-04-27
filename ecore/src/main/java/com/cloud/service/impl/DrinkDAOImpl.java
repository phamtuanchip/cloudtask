package com.cloud.service.impl;

import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import com.cloud.admin.model.Customer;
import com.cloud.admin.model.Item;
import com.cloud.admin.service.impl.SqliteDAOImpl;
import com.cloud.model.Report;
import com.cloud.model.Technology;
import com.cloud.model.Province;
import com.cloud.service.TechnologyDAO;


public class DrinkDAOImpl extends SqliteDAOImpl<Technology> implements TechnologyDAO{

 

	@Override
	public Technology find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Technology obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Technology obj) {
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
	public List<Technology> listAll() {
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
	public Technology search(Technology obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet select(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Technology tableToObject(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateToTable(List<Technology> rows) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void orderIn(Technology i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void orederOut(Technology i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Technology> order() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Report createOder(Customer c, List<Item> order, Province t) {
		// TODO Auto-generated method stub
		return null;
	}

 
	
}
