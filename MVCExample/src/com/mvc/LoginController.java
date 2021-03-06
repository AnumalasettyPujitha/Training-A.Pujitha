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
		hs.setAttribute("email", email);
		RegistrationBean rb=null;
		
		try {
			rb=lb.loginValidate(email, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(rb!=null){
			hs.setAttribute("rbean", rb);
			hs.setAttribute("specialist",rb.getSpecialisation());
			hs.setAttribute("dname", rb.getName());
			response.sendRedirect("./DoctorHome.html?msg=Logged_in");
		}
		else
			response.sendRedirect("./DoctorLogin.html?msg=failed_to_login");
	}

}
