package com.cloud.service.impl;

import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import com.cloud.admin.model.Customer;
import com.cloud.admin.model.Item;
import com.cloud.admin.service.impl.SqliteDAOImpl;
import com.cloud.model.Report;
import com.cloud.model.Information;
import com.cloud.model.Province;
import com.cloud.service.InformationDAO;


public class FoodDAOImpl extends SqliteDAOImpl<Information> implements InformationDAO{

	 

	@Override
	public Information find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Information obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Information obj) {
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
	public List<Information> listAll() {
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
	public Information search(Information obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet select(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Information tableToObject(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateToTable(List<Information> rows) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void orderIn(Information i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void orederOut(Information i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Information> order() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Report createOder(Customer c, List<Item> order, Province t) {
		// TODO Auto-generated method stub
		return null;
	}




}
