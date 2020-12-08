package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		LoginBean lb=new LoginBean();
		lb.setEmail(email);
		lb.setPassword(password);
		
		HttpSession hs=request.getSession();
		hs.setAttribute("bean", lb);
		hs.setAttribute("email", email);
		hs.setAttribute("specialise", lb.s);
		boolean status=false;
		
		try {
			status=lb.loginValidate(email, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status){
			response.sendRedirect("./DoctorHome.html");
		}
		else
			response.sendRedirect("./DoctorLogin.html");
	}

}
