package com.tender;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Blob;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@WebServlet("/BuilderServlet")
@MultipartConfig(fileSizeThreshold=1024*1024*10,maxFileSize=1024*1024*1000,maxRequestSize=1024*1024*1000)
public class BuilderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String builder_name,company_name,tname,construction_type,date,bid_file,path;
		int tid,bid_amount;
		HttpSession session=request.getSession();
		String state=(String)session.getAttribute("status");
		PrintWriter pw=response.getWriter();
		String foldername="resources";
		String uploadpath=request.getServletContext().getRealPath("")+foldername;
		File fi=new File(uploadpath);
		if(!fi.exists()) {
			fi.mkdir();
		}
		Part file=request.getPart("bid_file");
		bid_file=file.getSubmittedFileName();
		path=foldername+File.separator+fi;
		InputStream is=file.getInputStream();
		Files.copy(is,Paths.get(uploadpath+File.separator+bid_file),StandardCopyOption.REPLACE_EXISTING);
		pw.println(path);
		builder_name=(String)session.getAttribute("bname");
		company_name=(String)session.getAttribute("cname");
		tid=Integer.parseInt(request.getParameter("tid"));
		tname=request.getParameter("tname");
		construction_type=request.getParameter("construction_type");
		date=request.getParameter("date");
		bid_amount=Integer.parseInt(request.getParameter("bid_amount"));
		SubmitTender st=new SubmitTender();
		boolean status=false;
		
		if(state.equalsIgnoreCase("Accepted"))
			status=st.registerValidate(builder_name, company_name, tid, tname, construction_type, date, bid_amount, bid_file,path);
		
		if(status)
			response.sendRedirect("builder_home.html");
		else
			response.sendRedirect("index.html");
	}

}
