package com.cloud.admin.dao;

import java.util.List;

import javax.sql.DataSource;

import com.cloud.admin.model.Customer;

public class CustomerDAOImpl implements CustomerDAO  {

	@Override
	public Customer find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Customer obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Customer obj) {
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
	public List<Customer> listAll() {
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
	
}
