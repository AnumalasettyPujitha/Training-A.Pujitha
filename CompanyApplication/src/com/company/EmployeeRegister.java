package com.company;

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

@WebServlet("/EmployeeRegister")
public class EmployeeRegister extends HttpServlet {
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
		String ename=request.getParameter("ename");
		int esal=Integer.parseInt(request.getParameter("esal"));
		int experience=Integer.parseInt(request.getParameter("experience"));
		int age=Integer.parseInt(request.getParameter("age"));
		String gender=request.getParameter("gender");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String password=request.getParameter("password");
		String department=request.getParameter("department");
		PrintWriter pw=response.getWriter();
		
		try {
			ps=con.prepareStatement("insert into employee(ename,esal,experience,age,gender,email,address,password,department) values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, ename);
			ps.setInt(2, esal);
			ps.setInt(3, experience);
			ps.setInt(4, age);
			ps.setString(5, gender);
			ps.setString(6, email);
			ps.setString(7,address);
			ps.setString(8, password);
			ps.setString(9, department);
			
			pw.println("<html><body bgcolor='wheat'><center><h1>");
			
			int x=ps.executeUpdate();
			
			if(x!=0) {
				pw.println(ename+" Registered successfully");
				pw.println("<br>");
				pw.println("<a href='Employee_Login.html'>EmployeeLogin</a><br>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.println("</center></h1></body></html>");
	}

}
