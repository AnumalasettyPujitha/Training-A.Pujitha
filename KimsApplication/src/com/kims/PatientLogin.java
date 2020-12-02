package com.kims;

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

@WebServlet("/PatientLogin")
public class PatientLogin extends HttpServlet {
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
		int id=Integer.parseInt(request.getParameter("id"));
		String password=request.getParameter("password");
		PrintWriter pw=response.getWriter();
		String sql="select * from patient where(id=? AND password=?)";
		try {
			HttpSession hs=request.getSession();
			ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, password);
			hs.setAttribute("pid", id);
			pw.println("<html><body bgcolor='wheat'><center><h1>");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				pw.println("Patient Logged in Successfully");
				pw.println("<br><br><br>");
				pw.println("<a href='patienthome.jsp'>PatientProfile</a>");
			}
			pw.println("</h1></center></body></html>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

}
