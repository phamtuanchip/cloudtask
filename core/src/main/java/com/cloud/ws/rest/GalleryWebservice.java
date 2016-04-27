package com.cloud.ws.rest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cloud.admin.model.Image;
import com.cloud.admin.service.impl.GalleryDAOImpl;
import com.cloud.model.UploadFile;

@Path("/gallery")
@Component
public class GalleryWebservice {
	private static final String SERVER_UPLOAD_LOCATION_FOLDER = "/uploads";
	@Autowired
	public GalleryDAOImpl galleryService;

	//File Rest API

	public GalleryDAOImpl getGalleryService() {
		return galleryService;
	}

	public void setGalleryService(GalleryDAOImpl galleryService) {
		this.galleryService = galleryService;
	}

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

	 
	//Gallery API
	

	@Path("/image/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Image getImage(@PathParam("id") String id)
	{
		return  galleryService.find(id);
	}
	

	@Path("/image/list")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Image> getListImage()
	{
		ArrayList<Image> list = new ArrayList<Image>();
		list.add(new Image());
		return  list;
	}
	@Path("/image/search")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Image> searchImage(@Context Image b)
	{
		ArrayList<Image> list = new ArrayList<Image>();
		list.add(new Image());
		return  list;
	}

	@Path("/image/delete/{id}")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Image deleteImage(@PathParam("id") String id)
	{
		return  new Image();
	}
	
	@Path("/image/update")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Image updateImage(@Context Image b)
	{
		return b;
	}
	
	@Path("/image/insert")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Image insertImage(@Context Image b)
	{
		return b;
	}
	
	@Path("/image/public/{id}")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Image publicImage(@PathParam("id") long id)
	{
		Image b = new Image();
		 
		return b;
	}
}