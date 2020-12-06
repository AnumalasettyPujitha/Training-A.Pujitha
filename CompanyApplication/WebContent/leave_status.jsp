<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>WELCOME TO EMPLOYEE HOME</h1>
<a href="employee_profile.jsp">EmployeeProfile</a> |
<a href="leave.jsp">ApplyLeave</a> |
<a href="leave_status.jsp">LeaveStatus</a> |
<a href="index.html">Logout</a>
</center>
<%@ include file="Connection.jsp" %>
<table border="2" align="center" width="600" height="200" cellpadding="20">
<tr>
<td>Employee_Name</td><td>Department</td><td>Reason</td><td>DOS</td><td>DOE</td>
<td>Status</td><td>DoctorName</td>
</tr>
<%
int count=0;
String name=(String)session.getAttribute("ename");
ps=con.prepareStatement("select * from employee_leave where name=?");
ps.setString(1,name);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(3) %></td>
<td><%=rs.getString(4) %></td>
<td><%=rs.getString(5) %></td>
<td><%=rs.getString(6) %></td>
<td><%=rs.getString(7) %></td>
<td><%=rs.getString(8) %></td>
</tr>
<%} %>
</table>
</body>
</html>