<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>WELCOME TO MANAGER PROFILE</h1>
<a href="manager_profile.jsp">ManagerProfile</a> |
<a href="index.html">Logout</a>
</center>
<%@ include file="Connection.jsp" %>
<table border="2" align="center" width="600" height="200" cellpadding="20">
<tr><td>Id</td><td>Name</td><td>Salary</td><td>Experience</td><td>Age</td><td>Gender</td>
<td>Email</td><td>Address</td><td>Department</td><td>Action</td></tr>
<%
int mid=(int)session.getAttribute("mid");
String sql="select * from manager where id=?";
ps=con.prepareStatement(sql);
ps.setInt(1,mid);
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
<td><a href="update_manager_profile.jsp?id=<%=rs.getInt(1) %>">Update</a></td>
</tr>
<%} %>
</table>
</body>
</html>