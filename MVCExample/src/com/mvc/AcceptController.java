package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AcceptController")
public class AcceptController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession hs=request.getSession();
		String dname=(String)hs.getAttribute("dname");
		int id=Integer.parseInt(request.getParameter("id"));
		boolean status=false;
		
		AcceptBean ab=new AcceptBean();
		try {
			status=ab.accept(dname, id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
			response.sendRedirect("./index.html");
		else 
			response.sendRedirect("./PatientHome.html?");
	}

}
