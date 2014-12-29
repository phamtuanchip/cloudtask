package com.nttdata.mobilecheckin.schedule;

import org.springframework.beans.factory.annotation.Autowired;

import com.nttdata.mobilecheckin.service.TaskService;
import com.nttdata.mobilecheckin.service.TaskServiceFactory;

public class RunMeTask {
	
	@Autowired
	private TaskServiceFactory taskServiceF;
	 
	 

	public  TaskService InstanceService(){
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