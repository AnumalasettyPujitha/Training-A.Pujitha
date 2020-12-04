<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO DOCTOR HOME</h1></center>
<br><br><br>
<center>
<a href="doctorhome.jsp">Profile</a> |
<a href="view_appointment.jsp">AppointmentDetails</a> |
<a href="index.html">LogOut</a>
<br><br><br>
</center>
<%@ include file="Connection.jsp" %>
<table border="2" align="center" width="600" height="200" cellpadding="20">
<tr><td>Id</td><td>Name</td><td>Email</td><td>phone</td><td>Specialisation</td><td>Action</td></tr>
<%
int id=(int)session.getAttribute("did");
String sql="select * from doctor where id=?";
ps=con.prepareStatement(sql);
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getInt(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(4) %></td>
<td><%=rs.getLong(5) %></td>
<td><%=rs.getString(6) %></td>
<td><a href="doctor_profile_update.jsp?id=<%=rs.getInt(1) %>">Update</a></td>
</tr>
<%} %>
</table>
</body>
</html>