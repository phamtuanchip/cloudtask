package com.cloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cloud.admin.service.TaskService;
import com.cloud.admin.service.TaskServiceFactory;

public class ServiceFactoryLoader implements TaskServiceFactory {
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
