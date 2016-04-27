package com.cloud.service.impl;

import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import com.cloud.admin.service.impl.SqliteDAOImpl;
import com.cloud.model.Customer;
import com.cloud.service.CustomerDAO;

public class CustomerDAOImpl extends SqliteDAOImpl<Customer> implements CustomerDAO {

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

	@Override
	public Customer search(Customer obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet select(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer tableToObject(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateToTable(List<Customer> rows) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String buildInsert(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildUpdate(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
