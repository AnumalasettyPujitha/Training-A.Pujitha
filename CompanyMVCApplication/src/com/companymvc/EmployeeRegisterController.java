package com.companymvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/EmployeeRegisterController")
public class EmployeeRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ename=request.getParameter("ename");
		int esal=Integer.parseInt(request.getParameter("esal"));
		int experience=Integer.parseInt(request.getParameter("experience"));
		int age=Integer.parseInt(request.getParameter("age"));
		String gender=request.getParameter("gender");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String password=request.getParameter("password");
		String department=request.getParameter("department");
		
		EmployeeRegisterBean erb=new EmployeeRegisterBean();
		erb.setEname(ename);
		erb.setEsal(esal);
		erb.setExperience(experience);
		erb.setAge(age);
		erb.setGender(gender);
		erb.setEmail(email);
		erb.setAddress(address);
		erb.setPassword(password);
		erb.setDepartment(department);
		
		HttpSession hs=request.getSession();
		hs.setAttribute("erbean", erb);
		boolean status=false;
		
		try {
			status=erb.registrationValidate(ename, esal, experience, age, gender, email, address, password, department);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
			response.sendRedirect("./Employee_Login.html");
		else
			response.sendRedirect("./index.html");
	}

}
