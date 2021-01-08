package com.tender;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/BuilderLoginController")
public class BuilderLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		BuilderLoginBean blb=new BuilderLoginBean();
		blb.setEmail(email);
		blb.setPassword(password);
		
		HttpSession hs=request.getSession();
		ApplyBuilder ab=null;
		
		ab=blb.loginValidate(email, password);
		
		if(ab.getBid()!=0) {
			hs.setAttribute("builderbean", ab);
			hs.setAttribute("bname", ab.getBname());
			hs.setAttribute("cname", ab.getCname());
			hs.setAttribute("status", ab.getStatus());
			response.sendRedirect("builder_home.html?msg=successfully_logged_in");
		}
		else {
			response.sendRedirect("builder_login.html?msg=unsuccessfull");
		}
	}

}
