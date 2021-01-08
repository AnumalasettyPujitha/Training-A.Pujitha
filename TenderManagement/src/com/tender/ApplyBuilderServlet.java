package com.tender;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


@WebServlet("/ApplyBuilderServlet")
public class ApplyBuilderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String bname,cname,email,password,status;
		long mobile;
		bname=request.getParameter("bname");
		cname=request.getParameter("cname");
		email=request.getParameter("email");
		password=request.getParameter("password");
		mobile=Long.parseLong(request.getParameter("mobile"));
		
		ApplyBuilder st=new ApplyBuilder();
		boolean state=false;
		
		state=st.registerValidate(bname, cname, email, password, mobile);
		
		if(state)
			response.sendRedirect("builder_login.html");
		else
			response.sendRedirect("builder_home.html");
	}

}
