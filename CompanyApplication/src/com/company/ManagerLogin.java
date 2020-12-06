package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ManagerLogin")
public class ManagerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con=null;
	PreparedStatement ps=null;
	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/company";
		String username="root";
		String password="root";
		try {
			con=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		PrintWriter pw=response.getWriter();
		String sql="select * from manager where(email=? AND password=?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			HttpSession hs=request.getSession();
			pw.println("<html><body bgcolor='wheat'><center><h1>");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				pw.println("Manager Logged in Successfully");
				hs.setAttribute("mid", rs.getInt(1));
				hs.setAttribute("department", rs.getString("department"));
				hs.setAttribute("manager_name", rs.getString("name"));
				pw.println("<br>");
				response.sendRedirect("ManagerHome.jsp?msg=logged in");
			}
			pw.println("</h1></center></body></html>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
