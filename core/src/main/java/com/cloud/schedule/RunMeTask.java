package com.cloud.schedule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;

import org.cometd.annotation.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.cloud.admin.cometd.StockPriceEmitter;
import com.cloud.admin.model.Notification;
import com.cloud.admin.model.Type;
import com.cloud.service.TaskService;
import com.cloud.service.TaskServiceFactory;

import org.cometd.annotation.Service;
import org.cometd.annotation.Session;
import org.cometd.bayeux.server.BayeuxServer;
import org.cometd.bayeux.server.ConfigurableServerChannel;
import org.cometd.bayeux.server.LocalSession;
import org.cometd.bayeux.server.ServerChannel;



public class RunMeTask {
	
	@Autowired
	private TaskServiceFactory taskServiceF;
	 
	@Inject
	private BayeuxServer bayeuxServer;
	@Session
	private LocalSession sender;


	public  TaskService InstanceService(){
		return taskServiceF.getTaskService();
	}

	 
	public void printMe() {
		 
            // Create the channel name using the stock symbol
            String channelName = "/stock/" + Type.NOTIFICATION_TASK;
            
            // Initialize the channel, making it persistent and lazy
            bayeuxServer.createIfAbsent(channelName, new ConfigurableServerChannel.Initializer()
            {
                public void configureChannel(ConfigurableServerChannel channel)
                {
                    channel.setPersistent(true);
                    channel.setLazy(true);
                }
            });

            // Convert the Update business object to a CometD-friendly format
            Map<String, Object> data = new HashMap<String, Object>(4);
            data.put("symbol", Type.NOTIFICATION_TASK);
            data.put("oldValue", new Notification());
            data.put("newValue", new Notification(Type.NOTIFICATION_TASK));

            // Publish to all subscribers
            ServerChannel channel = bayeuxServer.getChannel(channelName);
            channel.publish(sender, data, null);
            System.out.println("Success " + channelName);
		
	}



	public TaskServiceFactory getTaskServiceF() {
		return taskServiceF;
	}



	public void setTaskServiceF(TaskServiceFactory taskServiceF) {
		this.taskServiceF = taskServiceF;
	}
}