package com.tender;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CreateTenderController")
public class CreateTenderController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		String tname=request.getParameter("tname");
		String starting_date=request.getParameter("starting_date");
		String closing_date=request.getParameter("closing_date");
		String construction_type=(String) session.getAttribute("construct_type");
		int amount=Integer.parseInt(request.getParameter("amount"));
		
		CreateTenderBean ctb=new CreateTenderBean();
		boolean status=false;
		
		status=ctb.createTender(tname, starting_date, closing_date, construction_type, amount);
		
		if(status)
			response.sendRedirect("PWDHome.html?msg=successfully_regstered");
		else
			response.sendRedirect("create_tender.html?msg=not_registered");
	}

}
