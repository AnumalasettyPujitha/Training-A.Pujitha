package com.companymvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ManagerRegisterController")
public class ManagerRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		int sal=Integer.parseInt(request.getParameter("sal"));
		int experience=Integer.parseInt(request.getParameter("experience"));
		int age=Integer.parseInt(request.getParameter("age"));
		String gender=request.getParameter("gender");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String password=request.getParameter("password");
		String department=request.getParameter("department");
		
		ManagerRegisterBean mrb=new ManagerRegisterBean();
		mrb.setName(name);
		mrb.setSal(sal);
		mrb.setExperience(experience);
		mrb.setAge(age);
		mrb.setGender(gender);
		mrb.setEmail(email);
		mrb.setAddress(address);
		mrb.setPassword(password);
		mrb.setDepartment(department);
		
		HttpSession hs=request.getSession();
		hs.setAttribute("mrbean",mrb);
		boolean status=false;
		
		try {
			status=mrb.registrationValidate(name, sal, experience, age, gender, email, address, password, department);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(status)
			response.sendRedirect("./Manager_Login.html");
		else
			response.sendRedirect("./index.html");
	}

}
