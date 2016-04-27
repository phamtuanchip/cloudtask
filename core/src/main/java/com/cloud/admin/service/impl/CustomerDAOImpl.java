package com.cloud.admin.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import com.cloud.admin.model.Customer;
import com.cloud.admin.model.User;
import com.cloud.admin.service.CustomerDAO;
import com.fasterxml.jackson.databind.util.ISO8601Utils;

public class CustomerDAOImpl extends SqliteDAOImpl<Customer> implements CustomerDAO {

	public CustomerDAOImpl() {
		table = TABLE;
		drive = DATA;
		structureCreate = STRUCTURE ;
		structureUpdate = UPDATE_S;
		structureInsert = INSERT_S;
		//createTable();
	}

	@Override
	public int save(Customer obj) {
		Statement st;
		int status =-1;
		try {
			st = connect().createStatement();
			String isql = buildInsert(obj); 
			System.out.println(isql);
			st.executeUpdate(isql);
			st.close();
			//connect().commit();
			connect().close();
			status =0 ;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return status;
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
	public int getSequence() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub

	}

	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User search(Customer obj) {
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
		Customer c = null;
		try {
			c = new User(rs.getLong(1), rs.getString(2));
			c.setNote(rs.getString(3));
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return c;
	}

	@Override
	public void updateToTable(List<Customer> rows) {
		// TODO Auto-generated method stub

	}

	@Override
	public String buildInsert(Customer obj) {
		StringBuffer sb = new StringBuffer(super.buildInsert(obj));
		sb.append(SYNTAX).append(obj.getAddress())
		.append(SYNTAX).append(obj.getSex())
		.append(SYNTAX).append(obj.getPhone())
		.append(SYNTAX).append(obj.getEmail())
		.append(SYNTAX).append(obj.getCard())
		.append(SYNTAX).append(obj.getTaxNum())
		.append(SYNTAX).append(obj.getType())
		.append(SYNTAX).append(obj.getDob())
		.append(SYNTAX).append(obj.getUid()).append(SPACE).append(CLOSE);
		return sb.toString();
	}

	@Override
	public String buildUpdate(Customer obj) {
		// TODO Auto-generated method stub
		return null;
	}

	 



}
