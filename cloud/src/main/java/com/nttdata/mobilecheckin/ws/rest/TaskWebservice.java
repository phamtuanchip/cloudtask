package com.nttdata.mobilecheckin.ws.rest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.naming.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nttdata.mobilecheckin.log.LogShow;
import com.nttdata.mobilecheckin.model.Notification;
import com.nttdata.mobilecheckin.model.Task;
import com.nttdata.mobilecheckin.model.UploadFile;
import com.nttdata.mobilecheckin.model.User;
import com.nttdata.mobilecheckin.service.TaskService;
import com.nttdata.mobilecheckin.service.TaskServiceFactory;

@Path("/rest")
@Component
public class TaskWebservice {
	private static final String SERVER_UPLOAD_LOCATION_FOLDER = "/uploads";
	@Autowired
	private TaskServiceFactory taskServiceF;



	private  TaskService InstanceService(){
		return taskServiceF.getTaskService();
	}

	//File Rest API

	@POST
	@Path("file/upload")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.APPLICATION_JSON)
	public UploadFile uploadFile(@Context HttpServletRequest request,
			@FormDataParam("file") InputStream fileInputStream,
			@FormDataParam("file") FormDataContentDisposition contentDispositionHeader) {
		String fileName = GregorianCalendar.getInstance().getTimeInMillis()+"_"+ contentDispositionHeader.getFileName();
		String OS = System.getProperty("os.name");
		String path = "/";
		if(OS.toLowerCase().startsWith("windows")) path = "\\";
		String folderPath = request.getServletContext().getRealPath(SERVER_UPLOAD_LOCATION_FOLDER);
				
				File folder = new File(folderPath);
		if (!folder.exists()) {
			if (folder.mkdir()) {
				System.out.println("Directory is created!");
			}  
		}
		String filePath = folder.getAbsolutePath() + path + fileName;
		System.out.println("upload...." + filePath);
		// save the file to the server
		saveFile(fileInputStream, filePath);
		
		String downloadLink =  request.getRequestURI().replace("upload", "download") +"/" + fileName;

		return new UploadFile(new Date(),"system",filePath, downloadLink); 

	}

	@GET
	@Path("file/download/{file}")
	//@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public Response  downloadFile(@Context HttpServletRequest request, @PathParam(value = "file") String file) {
		String filePath = request.getServletContext().getRealPath(SERVER_UPLOAD_LOCATION_FOLDER)+"/"+ file;
		System.out.println("download .." + filePath);
		File download = new File(filePath);
		ResponseBuilder response = Response.ok((Object)download);
		response.header("Content-Disposition", "attachment; " + file);
		return response.build();

	}

	// save uploaded file to a defined location on the server
	private void saveFile(InputStream uploadedInputStream,
			String serverLocation) {

		try {
			OutputStream outpuStream = new FileOutputStream(new File(serverLocation));
			int read = 0;
			byte[] bytes = new byte[1024];

			outpuStream = new FileOutputStream(new File(serverLocation));
			while ((read = uploadedInputStream.read(bytes)) != -1) {
				outpuStream.write(bytes, 0, read);
			}
			outpuStream.flush();
			outpuStream.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	// User Rest API
	@Path("/user/register")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User register(@Context HttpServletRequest req, @Context HttpHeaders httpHeaders, User userLogin) {

		HttpSession session= req.getSession(true);
		System.out.println("=========userLogin" + userLogin.toString());
		User user = null;
		LogShow.getLogDebug("start check login:"+userLogin.getUsername());
		try{
			user = InstanceService().register(userLogin);
		}catch(Exception ex){
			LogShow.getLogDebug("start check login:"+userLogin.getUsername());
		}
		if(user != null){
			session.setAttribute(user.getUsername(), user.getUsername());
			LogShow.getLogDebug("return id:"+user.getUsername());
			user.setId(user.getUsername());
		} 
		return user;
	}

	@Path("/user/login")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User checkLogin(@Context HttpServletRequest req, @Context HttpHeaders httpHeaders, User userLogin) {

		HttpSession session= req.getSession(true);

		User user = null;
		LogShow.getLogDebug("start check login:"+userLogin.getUsername());
		try{
			user = InstanceService().login(userLogin);
		}catch(Exception ex){
			LogShow.getLogDebug("start check login:"+userLogin.getUsername());
		}
		if(user != null){
			session.setAttribute(user.getUsername(), user.getUsername());
			LogShow.getLogDebug("return id:"+user.getUsername());
			user.setId(user.getUsername());
		} 
		return user;
	}


	@Path("/user/logout")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response checkLogout(@Context HttpServletRequest req, @Context HttpHeaders httpHeaders) {

		HttpSession session= req.getSession(true);
		String id = httpHeaders.getRequestHeader("idUser").get(0);
		LogShow.getLogDebug("start check logout id:"+id);
		String checkUser = "ok";// (String)session.getAttribute(id);
		if (checkUser!=null) {
			LogShow.getLogDebug("start logout:"+checkUser);
			//session.removeAttribute(id);
			String result = "Success";
			return Response.status(200).entity(result).build();
		} else {
			LogShow.getLogDebug("logout failure");
			String result = "Failure";
			return Response.status(201).entity(result).build();
		}
	}

	@GET
	@Path("/user/search")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserInJSON(@Context HttpServletRequest req, @QueryParam("uid") String username) throws AuthenticationException {

		if(getTaskServiceF() != null && username != null && !username.isEmpty()) {
			User user = InstanceService().findByUsername(username);
			LogShow.getLogDebug("start search:"+user);
			HttpSession session= req.getSession(true);
			if(user != null){
				session.setAttribute(username, username);
			}
			return	user;
		}
		return new User();

	}
	@POST
	@Path("/user/update")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createUserInJSON(User u) {

		String result = "User saved : " + u;
		return Response.status(201).entity(result).build();

	}

	@Path("/user/authenticate")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public User authenticate(@QueryParam("username") String username, @QueryParam("password") String password)
	{

		return new User();
	}

	@Path("/task/detail/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Task getTask(@PathParam("id") String username)
	{

		return new Task();
	}

	@Path("/task/create")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Task createTask(Task t)
	{
		Task utask = t;
		utask.setName(t.getName() + "updated");
		System.out.println("test =====");
		return utask;
	}

	@Path("/task/update")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Task updateTask(Task t)
	{
		Task utask = t;
		utask.setName(t.getName() + "updated");
		System.out.println("test =====");
		return utask;
	}


	@Path("/task/list")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Task> getTasks()
	{
		return  InstanceService().getTasks();
	}
	
	//countdown apid
	
	@Path("/task/count")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Task getIncommingTask()
	{
		return  InstanceService().getCountDownTask(new Task(new Date(2015,01,01,00,00)));
	}

	@Path("/task/subscriber")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Notification subscribeTaskNotification(@FormParam("email") String email)
	{
		Notification n = InstanceService().getNotification();
		n.getEmails().add(email);
		return n ;
	}
	
	public TaskServiceFactory getTaskServiceF() {
		return taskServiceF;
	}

	public void setTaskServiceF(TaskServiceFactory taskServiceF) {
		this.taskServiceF = taskServiceF;
	}
	
	
}