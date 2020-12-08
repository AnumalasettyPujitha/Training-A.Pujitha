<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>WELCOME TO MANAGER Profile</h1>
<a href="Manager_Profile.jsp">ManagerProfile</a> |
<a href="View_Leave.jsp">View Leave</a> |
<a href="index.html">Logout</a>
</center>
<%@page import="com.companymvc.ManagerLoginBean" %>
<%
ManagerLoginBean mlb=(ManagerLoginBean)session.getAttribute("mlbean");
%>
<%=mlb.getEmail() %>
</body>
</html>