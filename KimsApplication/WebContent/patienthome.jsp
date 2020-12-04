<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO PATIENT HOME</h1></center>
<br><br><br>
<center>
<a href="patienthome.jsp">Profile</a> |
<a href="appointment.jsp">Appointment</a> |
<a href="index.html">LogOut</a>
<br><br><br>
</center>
<%@ include file="Connection.jsp" %>
<table border="2" align="center" width="600" height="200" cellpadding="20">
<tr><td>Id</td><td>Name</td><td>Mobile</td><td>Gender</td><td>Age</td><td>Address</td><td>Action</td></tr>
<%
int id=(int)session.getAttribute("pid");
String pwd=(String)session.getAttribute("ppwd");
String sql="select * from patient where id=?";
ps=con.prepareStatement(sql);
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getInt(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getLong(4) %></td>
<td><%=rs.getString(5) %></td>
<td><%=rs.getInt(6) %></td>
<td><%=rs.getString(7) %></td>
<td><a href="patient_profile_update.jsp?id=<%=rs.getInt(1)%>">Update</a></td>
</tr>
<%} %>
</table>
</body>
</html>