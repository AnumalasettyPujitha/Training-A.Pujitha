package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/PatientLoginController")
public class PatientLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		String password=request.getParameter("password");
		
		PatientLoginBean plb=new PatientLoginBean();
		plb.setId(id);
		plb.setPassword(password);
		
		HttpSession hs=request.getSession();
		hs.setAttribute("plbean", plb);
		hs.setAttribute("id",id);
		boolean status=false;
		
		try {
			status=plb.loginValidate(id, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status){
			response.sendRedirect("./PatientHome.html");
		}
		else
			response.sendRedirect("./PatientLogin.html");
	}

}
