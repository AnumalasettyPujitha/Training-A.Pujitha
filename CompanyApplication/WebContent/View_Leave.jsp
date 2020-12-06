<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>WELCOME TO MANAGER HOME</h1>
<a href="manager_profile.jsp">ManagerProfile</a> |
<a href="View_Leave.jsp">View Leave</a> |
<a href="index.html">Logout</a>
</center>
<%@ include file="Connection.jsp" %>
<table border="2" align="center" width="600" height="200" cellpadding="20">
<tr>
<td>Employee_Name</td><td>Department</td><td>Reason</td><td>DOS</td><td>DOE</td>
<td>Status</td><td>ManagerName</td><td>Due</td><td>Action</td>
</tr>
<%
int count=0;
String department=(String)session.getAttribute("department");
ps=con.prepareStatement("select * from employee_leave where department=?");
ps.setString(1,department);
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
<td><%=rs.getInt(9) %></td>
<%if(rs.getString(7).equalsIgnoreCase("Accepted")){%>
<td>Accepted</td>
<%}else if(rs.getString(7).equalsIgnoreCase("rejected")){%>
<td>Rejected</td>
<%}else{%>
<td><a href="accept_leave.jsp?id=<%=rs.getInt(1) %>&due=<%=rs.getInt(9)%>">Accept</a></td>
<%} %>
</tr>
<%} %>
</table>
</body>
</html>