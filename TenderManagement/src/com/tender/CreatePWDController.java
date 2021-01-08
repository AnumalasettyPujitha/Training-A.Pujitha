package com.tender;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CreatePWDController")
public class CreatePWDController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name,password,construction_type;
		name=request.getParameter("name");
		password=request.getParameter("password");
		construction_type=request.getParameter("ctype");
		
		CreatePWDBean cpb=new CreatePWDBean();
		boolean status=false;
		
		status=cpb.registerValidate(name, password, construction_type);
		
		if(status)
			response.sendRedirect("admin_home.html");
		else
			response.sendRedirect("index.html");
	}

}
