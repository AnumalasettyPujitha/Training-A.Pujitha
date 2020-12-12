<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>WELCOME TO EMPLOYEE PROFILE</h1>
<a href="employee_profile.jsp">EmployeeProfile</a> |
<a href="index.html">Logout</a>
</center>
<%@ include file="Connection.jsp" %>
<table border="2" align="center" width="600" height="200" cellpadding="20">
<tr><td>Id</td><td>Name</td><td>Salary</td><td>Experience</td><td>Age</td><td>Gender</td>
<td>Email</td><td>Address</td><td>Department</td><td>No. of leaves remaining</td><td>Action</td></tr>
<%
int eid=(int)session.getAttribute("eid");
String sql="select * from employee where eid=?";
ps=con.prepareStatement(sql);
ps.setInt(1,eid);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getInt(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getInt(3) %></td>
<td><%=rs.getInt(4) %></td>
<td><%=rs.getInt(5) %></td>
<td><%=rs.getString(6) %></td>
<td><%=rs.getString(7) %></td>
<td><%=rs.getString(8) %></td>
<td><%=rs.getString(10) %></td>
<td><%=rs.getInt(11) %></td>
<td><a href="update_employee_profile.jsp?id=<%=rs.getInt(1)%>">Update</a></td>
</tr>
<%} %>
</table>
</body>
</html>