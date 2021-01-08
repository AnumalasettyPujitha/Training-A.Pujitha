package com.tender;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AcceptStatusController")
public class AcceptStatusController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int bid=Integer.parseInt(request.getParameter("bid"));
		
		AcceptStatusBean ab=new AcceptStatusBean();
		boolean b=false;
		
		b=ab.updateStatus(bid);
		
		if(b)
			response.sendRedirect("index.html");
		else
			response.sendRedirect("accept_builder.jsp");
	}

}
