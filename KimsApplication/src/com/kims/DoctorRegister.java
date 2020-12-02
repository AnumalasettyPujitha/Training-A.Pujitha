package com.kims;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/DoctorRegister")
public class DoctorRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con=null;
	PreparedStatement ps=null;
	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/kims";
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
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		long phone=Long.parseLong(request.getParameter("phone"));
		String specialisation=request.getParameter("specialisation");
		PrintWriter pw=response.getWriter();
		String sql="insert into doctor(name,password,email,phone,specialisation) values(?,?,?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, email);
			ps.setLong(4, phone);
			ps.setString(5, specialisation);
			pw.println("<html><body bgcolor='wheat'><center><h1>");
			int x=ps.executeUpdate();
			if(x!=0) {
				pw.println("Doctor Registered Successfully");
				pw.println("<br>");
				pw.println("<a href='index.html'>Back To Home</a>");
			}
			pw.println("</h1></center></body></html>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
