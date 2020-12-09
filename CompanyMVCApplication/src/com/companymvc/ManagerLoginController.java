package com.companymvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ManagerLoginController")
public class ManagerLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		ManagerLoginBean mlb=new ManagerLoginBean();
		mlb.setEmail(email);
		mlb.setPassword(password);
		
		HttpSession hs=request.getSession();
		ManagerRegisterBean mrb=null;
		
		try {
			mrb=mlb.loginValidate(email, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(mrb!=null) {
			hs.setAttribute("mloginbean", mrb);
			response.sendRedirect("ManagerHome.jsp?msg=loggedin");
		}
		else
			response.sendRedirect("./Manager_Login.html");
	}

}
