package com.nttdata.mobilecheckin.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nttdata.mobilecheckin.service.TaskService;
import com.nttdata.mobilecheckin.service.TaskServiceFactory;
import com.nttdata.mobilecheckin.service.impl.TaskServiceFactoryLoader;

public class RunMeTask {
	
	@Autowired
	private TaskServiceFactory taskServiceF;
	 
	 

	private  TaskService InstanceService(){
		return taskServiceF.getTaskService();
	}

	 
 
	public void printMe() {
		//System.out.println(InstanceService().getTask(1));
		//System.out.println("Spring 3 + Quartz 1.8.6 ~");
	}



	public TaskServiceFactory getTaskServiceF() {
		return taskServiceF;
	}



	public void setTaskServiceF(TaskServiceFactory taskServiceF) {
		this.taskServiceF = taskServiceF;
	}
}