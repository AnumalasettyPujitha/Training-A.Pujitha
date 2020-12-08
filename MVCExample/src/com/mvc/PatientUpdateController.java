package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/PatientUpdateController")
public class PatientUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		long mobile=Long.parseLong(request.getParameter("mobile"));
		String gender=request.getParameter("gender");
		int age=Integer.parseInt(request.getParameter("age"));
		String address=request.getParameter("address");
		
		PatientUpdateBean pub=new PatientUpdateBean();
		pub.setName(name);
		pub.setMobile(mobile);
		pub.setGender(gender);
		pub.setAge(age);
		pub.setAddress(address);
		
		HttpSession hs=request.getSession();
		hs.setAttribute("pubean", pub);
		int id=(int)hs.getAttribute("id");
		pub.setId(id);
		boolean status=false;
		
		try {
			status=pub.updateValidate(name,mobile,gender,age,address);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status){
			response.sendRedirect("./PatientHome.html");
		}
		else
			response.sendRedirect("./PatientProfileUpdate.html");
	}

}
