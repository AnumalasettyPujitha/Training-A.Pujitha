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
<%@page import="com.companymvc.ManagerRegisterBean" %>
<%
ManagerRegisterBean mrb=(ManagerRegisterBean)session.getAttribute("mloginbean");
%>
<table border="2" align="center" width="600" height="200" cellpadding="20">
<tr><td>Name</td><td>Salary</td><td>Experience</td><td>Age</td><td>Gender</td>
<td>Email</td><td>Address</td><td>Department</td></tr>
<tr>
<td><%=mrb.getName() %></td>
<td><%=mrb.getSal() %></td>
<td><%=mrb.getExperience() %></td>
<td><%=mrb.getAge() %></td>
<td><%=mrb.getGender() %></td>
<td><%=mrb.getEmail() %></td>
<td><%=mrb.getAddress() %></td>
<td><%=mrb.getDepartment() %></td>
</tr>
</table>

</body>
</html>