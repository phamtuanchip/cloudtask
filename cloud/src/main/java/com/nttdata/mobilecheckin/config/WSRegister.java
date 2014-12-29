 
package com.nttdata.mobilecheckin.config;

import javax.ws.rs.container.ContainerResponseFilter;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

import com.nttdata.mobilecheckin.ws.rest.TaskWebservice;

 
public class WSRegister extends ResourceConfig {

   
    public WSRegister () {
       
    	register(RequestContextFilter.class);
    	//for Rest Service
        register(TaskWebservice.class);
        register(ContainerResponseFilter.class);
        //for CORS request
        register(CorsResponseFilter.class);
        //for upload
        register(MultiPartFeature.class);
        
    }
}
