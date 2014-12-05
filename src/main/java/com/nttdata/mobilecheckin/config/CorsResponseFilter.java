package com.nttdata.mobilecheckin.config;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

import org.springframework.web.servlet.support.RequestContext;
@Provider
public class CorsResponseFilter implements ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext requestContext,
			ContainerResponseContext responseContext) throws IOException {
		
		MultivaluedMap<String, Object> headers = responseContext.getHeaders();
		
		headers.add("Access-Control-Allow-Origin", "*");
		
		headers.add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
		headers.add("Access-Control-Allow-Headers", "X-Requested-With, Content-Type");
		String requestHeaders =requestContext.getHeaderString("Access-Control-Request-Headers");
		if (requestHeaders != null) {
			headers.add("Access-Control-Allow-Headers", requestHeaders);
		
		}
	}

}
