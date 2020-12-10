package com.companymvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AcceptLeaveController")
public class AcceptLeaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession hs=request.getSession();
		int id=Integer.parseInt(request.getParameter("id"));
		String manager_name=(String)hs.getAttribute("name");
		int leaves=Integer.parseInt(request.getParameter("leaves"));
		int due=Integer.parseInt(request.getParameter("due"));
		int eid=Integer.parseInt(request.getParameter("eid"));
		
		AcceptLeaveBean alb=new AcceptLeaveBean();
		boolean status=false;
		try {
			status=alb.accept(eid, due, manager_name, id,leaves);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
			response.sendRedirect("ManagerHome.jsp?msg=updated_appointment");
		else
			response.sendRedirect("index.html");
	}

}
