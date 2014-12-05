package com.nttdata.mobilecheckin.service.impl;

import java.io.IOException;
import java.util.List;

import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nttdata.mobilecheckin.log.LogShow;
import com.nttdata.mobilecheckin.mappers.UserMapper;
import com.nttdata.mobilecheckin.model.User;
import com.nttdata.mobilecheckin.service.TaskService;
import com.sun.jmx.snmp.tasks.Task;
import com.sun.jmx.snmp.tasks.TaskServer;

public class TaskServiceImpl implements TaskService{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	@Override
	public User findByUsername(String username) {

		String query = "select USERNAME, PASSWORD, ROLE from USERS where USERNAME = ?";
		
		User user = (User)jdbcTemplate.queryForObject(query, new Object[]{username}, new UserMapper());

		return user;
	}

	@Override
	public int save(User user) {
		String query = "insert into USERS (USERNAME, PASSWORD, ROLE) VALUE (?,?,?)";
		
		Object[] args = new Object[]{user.getUsername(), user.getPassword(),user.getRoleString()};
		
		int out = jdbcTemplate.update(query, args);
		
		return out;
		
	}

	@Override
	public int update(User user) {
		String query = "update USERS set (PASSWORD = ?, ROLE = ?) where USERNAME = ? ";
		Object[] args = new Object[]{user.getPassword(), user.getRoleString(), user.getUsername()};
		
		int out = jdbcTemplate.update(query, args);
		
		return out;
	}

	@Override
	public int delete(String username){
		
		String query="delete from USERS where USERNAME=?";
		
		try{
			jdbcTemplate.execute(query);
		}catch(Exception e){
			LogShow.getLogDebug(e.getMessage());
			return 0;
		}
		return 1;
	}

	@Override
	public List<User> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User login(User u) throws AuthenticationException {
		String SQL = "select * from USERS where USERNAME = ? and PASSWORD = ?";
		User user = (User)jdbcTemplate.queryForObject(SQL, 
				new Object[]{u.getUsername(), u.getPassword()}, new UserMapper());

		return user;
	}


	@Override
	public com.nttdata.mobilecheckin.model.Task getTask(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<com.nttdata.mobilecheckin.model.Task> getTasks() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public com.nttdata.mobilecheckin.model.Task update(
			com.nttdata.mobilecheckin.model.Task t) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<com.nttdata.mobilecheckin.model.Task> listTaskBy(
			com.nttdata.mobilecheckin.model.Task t) {
		// TODO Auto-generated method stub
		return null;
	}

	 

}
