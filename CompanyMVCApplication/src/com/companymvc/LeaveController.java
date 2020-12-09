package com.companymvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LeaveController")
public class LeaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("employee_name");
		String department=request.getParameter("department");
		String reason=request.getParameter("reason");
		String dos=request.getParameter("dos");
		String doe=request.getParameter("doe");
		int due=Integer.parseInt(request.getParameter("due"));

		LeaveBean lb=new LeaveBean();
		lb.setName(name);
		lb.setDepartment(department);
		lb.setReason(reason);
		lb.setDos(dos);
		lb.setDoe(doe);
		lb.setDue(due);
		
		HttpSession hs=request.getSession();
		hs.setAttribute("lbean",lb);
		boolean status=false;
		
		try {
			status=lb.applyLeaveValidate(name, department, reason, dos, doe, due);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(status)
			response.sendRedirect("EmployeeHome.jsp?msg=applied_for_leave");
		else
			response.sendRedirect("./Leave.html");
	}

}
