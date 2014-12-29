package com.nttdata.mobilecheckin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.nttdata.mobilecheckin.service.TaskService;
import com.nttdata.mobilecheckin.service.TaskServiceFactory;

public class TaskServiceFactoryLoader implements TaskServiceFactory {
	@Autowired
	TaskService taskService;
	
	 
 



	public void setTaskService(TaskService taskService) {
		this.taskService = taskService;
	}






	@Override
	public TaskService getTaskService() {
		// TODO Auto-generated method stub
		return taskService;
	}

}
