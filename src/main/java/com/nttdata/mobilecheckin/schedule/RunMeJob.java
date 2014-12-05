package com.nttdata.mobilecheckin.schedule;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.nttdata.mobilecheckin.service.TaskService;
import com.nttdata.mobilecheckin.service.TaskServiceFactory;
import com.nttdata.mobilecheckin.service.impl.TaskServiceFactoryLoader;

public class RunMeJob extends QuartzJobBean {
	private RunMeTask runMeTask;
	

	public void setRunMeTask(RunMeTask runMeTask) {
		this.runMeTask = runMeTask;
	}

	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {

		runMeTask.printMe();
		 

	}


}