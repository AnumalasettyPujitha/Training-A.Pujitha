package com.tender;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/PWDLoginController")
public class PWDLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		String password=request.getParameter("password");
				
		PWDLoginBean plb=new PWDLoginBean();
		HttpSession session=request.getSession();
		CreatePWDBean cpb=plb.loginValidate(id, password);
		
		if((cpb.getName())!=null) {
			response.sendRedirect("PWDHome.html?msg=successfull");
			session.setAttribute("plb",cpb);
			session.setAttribute("construct_type",cpb.getConstruction_type());
		}
		else
			response.sendRedirect("PWDLogin.html?msg=un_successfull");
	}

}
