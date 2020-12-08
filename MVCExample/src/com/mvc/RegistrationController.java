package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		long phone=Long.parseLong(request.getParameter("phone"));
		String specialisation=request.getParameter("specialisation");
		
		RegistrationBean rb=new RegistrationBean();
		rb.setName(name);
		rb.setEmail(email);
		rb.setPassword(password);
		rb.setPhone(phone);
		rb.setSpecialisation(specialisation);
		
		HttpSession hs=request.getSession();
		hs.setAttribute("rbean", rb);
		boolean status=false;
		
		try {
			status=rb.registrationValidate(name,password,email,phone,specialisation);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status){
			response.sendRedirect("./DoctorLogin.html");
		}
		else
			response.sendRedirect("./DoctorRegistration.html");
	}

}
