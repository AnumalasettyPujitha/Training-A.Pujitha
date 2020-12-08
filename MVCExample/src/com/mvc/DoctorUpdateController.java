package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/DoctorUpdateController")
public class DoctorUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		long phone=Long.parseLong(request.getParameter("phone"));
		String specialisation=request.getParameter("specialisation");
		
		DoctorUpdateBean dub=new DoctorUpdateBean();
		dub.setName(name);
		dub.setPhone(phone);
		dub.setSpecialisation(specialisation);
		
		HttpSession hs=request.getSession();
		hs.setAttribute("dubean", dub);
		String email=(String)hs.getAttribute("email");
		dub.setEmail(email);
		boolean status=false;
		
		try {
			status=dub.updateValidate(name,phone,specialisation);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status){
			response.sendRedirect("./DoctorHome.html");
		}
		else
			response.sendRedirect("./DoctorProfileUpdate.html");
	}

}
