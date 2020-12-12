package com.companymvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/EmployeeLoginController")
public class EmployeeLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		EmployeeLoginBean elb=new EmployeeLoginBean();
		elb.setEmail(email);
		elb.setPassword(password);
		
		HttpSession hs=request.getSession();
		EmployeeRegisterBean erb=null;
		
		try {
			erb=elb.loginValidate(email, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(erb!=null) {
			hs.setAttribute("emrbean", erb);
			hs.setAttribute("ename", erb.getEname());
			hs.setAttribute("department", erb.getDepartment());
			hs.setAttribute("email",email);
			hs.setAttribute("eid", erb.getEid());
			hs.setAttribute("leaves", erb.getLeaves_remaning());
			response.sendRedirect("EmployeeHome.jsp?msg=loggedin");
		}
		else
			response.sendRedirect("./Employee_Login.html");
	}

}
