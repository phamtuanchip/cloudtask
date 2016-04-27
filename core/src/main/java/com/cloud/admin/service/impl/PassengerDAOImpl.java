package com.cloud.admin.service.impl;

import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import com.cloud.admin.model.Passenger;
import com.cloud.admin.service.PassengerDAO;

public class PassengerDAOImpl extends SqliteDAOImpl<Passenger> implements PassengerDAO {

	@Override
	public int save(Passenger psg) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Passenger get(String lastName, String resvNumber, String flightNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Passenger> getList(String flightNumber, Date flightDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Passenger psg) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Passenger psg) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Passenger find(String id) {
		// TODO Auto-generated method stub
		return null;
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
	public List<Passenger> listAll() {
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
	public Passenger search(Passenger obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet select(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger tableToObject(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateToTable(List<Passenger> rows) {
		// TODO Auto-generated method stub
		
	}
	 

}
