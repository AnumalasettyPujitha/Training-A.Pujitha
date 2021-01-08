package com.tender;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DownloadBidFileController")
public class DownloadBidFileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String UPLOAD_DIR="resources";
	public static int BUFFER_SIZE=1024*100;
	public static String filename=null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		filename=request.getParameter("bid_file");
		if(filename==null || filename.equals(""))
		{
			response.sendRedirect("PWDHome.html");
		}
		else
		{
			String applicationpath=getServletContext().getRealPath("");
			String downloadpath=applicationpath+File.separator+UPLOAD_DIR;
			String filepath=downloadpath+File.separator+filename;
			File file=new File(filepath);
			OutputStream outstream=null;
			FileInputStream inputstream=null;
			if(file.exists())
			{
				String mimetype="application/octet-stream";
				response.setContentType(mimetype);
				String headerkey="Content-Disposition";
				String headervalue=String .format("attachment;filename=\"%s\"", file.getName());
				response.setHeader(headerkey, headervalue);
				try
				{
					outstream=response.getOutputStream();
					inputstream=new FileInputStream(file);
					byte[] buffer=new byte[BUFFER_SIZE];
					int bytesread=-1;
					while((bytesread=inputstream.read(buffer))!=-1)
					{
						outstream.write(buffer,0,bytesread);
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				finally
				{
					if(inputstream!=null)
					{
						inputstream.close();
					}
					outstream.flush();
					if(outstream!=null)
					{
						outstream.close();
					}
				}
			}
		}
}

}