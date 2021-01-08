package com.tender;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeletePWDController")
public class DeletePWDController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		
		DeletePWDBean dpb=new DeletePWDBean();
		boolean status=false;
		
		status=dpb.deletePWD(id);
		
		if(status)
			response.sendRedirect("view_pwd.jsp?msg=successfully_deleted");
		else
			response.sendRedirect("view_pwd.jsp?msg=not_deleted");
	}

}
