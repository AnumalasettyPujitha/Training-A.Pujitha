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

<%@ page import="com.companymvc.EmployeeLoginBean" %>
<%
EmployeeLoginBean elb=(EmployeeLoginBean)session.getAttribute("elbean");
%>
<%=elb.getEmail() %>
</body>
</html>