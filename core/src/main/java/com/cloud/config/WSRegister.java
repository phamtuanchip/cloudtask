 
package com.cloud.config;

import javax.ws.rs.container.ContainerResponseFilter;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

import com.cloud.ws.rest.GalleryWebservice;
import com.cloud.ws.rest.Webservice;

 
public class WSRegister extends ResourceConfig {

   
    public WSRegister () {
       
    	register(RequestContextFilter.class);
    	//for Rest Service
        register(Webservice.class);
        //register(GalleryWebservice.class);
        register(ContainerResponseFilter.class);
        //for CORS request
        register(CorsResponseFilter.class);
        //for upload
        register(MultiPartFeature.class);
        
    }
}
