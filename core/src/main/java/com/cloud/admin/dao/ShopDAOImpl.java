package com.cloud.admin.dao;

import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import com.cloud.admin.model.Shop;

public class ShopDAOImpl extends SqliteDAO<Shop> implements ShopDAO {

	@Override
	public Shop find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Shop obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Shop obj) {
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
	public List<Shop> listAll() {
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
	public Shop search(Shop obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet select(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shop tableToObject(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateToTable(List<Shop> rows) {
		// TODO Auto-generated method stub
		
	}

	 
	 

}
