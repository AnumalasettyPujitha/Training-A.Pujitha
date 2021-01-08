package com.tender;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		String email=request.getParameter("email");
		long mobile=Long.parseLong(request.getParameter("mobile"));
		
		UpdateBean ub=new UpdateBean();
		boolean status=false;
		
		status=ub.update(id, email, mobile);
		
		if(status)
			response.sendRedirect("ViewProfile.jsp?msg=Successfull");
		else
			response.sendRedirect("ViewProfile.jsp?msg=Un_Successfull");
	}

}
