package com.nttdata.mobilecheckin.service;

import java.util.List;

import javax.naming.AuthenticationException;

import com.nttdata.mobilecheckin.model.Task;
import com.nttdata.mobilecheckin.model.User;

public interface TaskService {

	//User API

	public User findByUsername(String username);
	public int save(User user);
	public int update(User user);
	public int delete(String username);
	public List<User> listAll();	

	public User login(User u) throws AuthenticationException;
	
	public User register(User u);
	// Task API
	public Task getTask(long id) ;
	public List<Task> getTasks() ;
	
	public Task update(Task t);
	public List<Task> listTaskBy(Task t);
}
