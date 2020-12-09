<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>WELCOME TO EMPLOYEE PROFILE</h1>
<a href="Employee_Profile.jsp">EmployeeProfile</a> |
<a href="Leave.html">ApplyLeave</a> |
<a href="leave_status.jsp">LeaveStatus</a> |
<a href="index.html">Logout</a>
</center>

<%@ page import="com.companymvc.EmployeeRegisterBean" %>
<%
EmployeeRegisterBean erb=(EmployeeRegisterBean)session.getAttribute("emrbean");
%>
<table border="2" align="center" width="600" height="200" cellpadding="20">
<tr><td>Name</td><td>Salary</td><td>Experience</td><td>Age</td><td>Gender</td>
<td>Email</td><td>Address</td><td>Department</td></tr>
<tr>
<td><%=erb.getEname() %></td>
<td><%=erb.getEsal() %></td>
<td><%=erb.getExperience() %></td>
<td><%=erb.getAge() %></td>
<td><%=erb.getGender() %></td>
<td><%=erb.getEmail() %></td>
<td><%=erb.getAddress() %></td>
<td><%=erb.getDepartment() %></td>
</tr>
</table>
</body>
</html>