package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/PatientRegistrationController")
public class PatientRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		long mobile=Long.parseLong(request.getParameter("mobile"));
		String gender=request.getParameter("gender");
		int age=Integer.parseInt(request.getParameter("age"));
		String address=request.getParameter("address");
		
		PatientRegistrationBean prb=new PatientRegistrationBean();
		prb.setName(name);
		prb.setPassword(password);
		prb.setMobile(mobile);
		prb.setGender(gender);
		prb.setAge(age);
		prb.setAddress(address);
		
		HttpSession hs=request.getSession();
		hs.setAttribute("prbean", prb);
		boolean status=false;
		
		try {
			status=prb.registrationValidate(name,password,mobile,gender,age,address);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status){
			response.sendRedirect("./PatientLoginPage.html");
		}
		else
			response.sendRedirect("./PatientRegister.html");
	}

}
