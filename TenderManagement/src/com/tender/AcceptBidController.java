package com.tender;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AcceptBidController")
public class AcceptBidController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int bid_id=Integer.parseInt(request.getParameter("id"));
		int tid=Integer.parseInt(request.getParameter("Tid"));
		
		AcceptBidBean abb=new AcceptBidBean();
		boolean status=false;
		
		status=abb.updateStatus(bid_id);
		
		if(status)
			status=abb.updateStatus(bid_id, tid);
		
		if(status)
			response.sendRedirect("Viewbiddingdetails.jsp?msg=successfully_accepted");
		else
			response.sendRedirect("Viewbiddingdetails.jsp?msg=rejected");
	}

}
