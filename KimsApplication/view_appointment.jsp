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
<tr>
<td>Patient_Name</td><td>Phone</td><td>Email</td><td>Gender</td><td>Blood_group</td><td>Specialist</td>
<td>Date_of_appointment</td><td>Time_of_appointment</td><td>Status</td><td>DoctorName</td>
<td>Action</td>
</tr>
<%
String specialist=(String)session.getAttribute("dspecialist");
ps=con.prepareStatement("select * from appointment where specialist=?");
ps.setString(1,specialist);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getString(2) %></td>
<td><%=rs.getLong(3) %></td>
<td><%=rs.getString(4) %></td>
<td><%=rs.getString(5) %></td>
<td><%=rs.getString(6) %></td>
<td><%=rs.getString(7) %></td>
<td><%=rs.getString(8) %></td>
<td><%=rs.getString(9) %></td>
<td><%=rs.getString(10) %></td>
<td><%=rs.getString(11) %></td>
<%if(rs.getString(10).equalsIgnoreCase("Accepted")){%>
<td>Accepted</td>
<%}else{ %>
<td><a href="accept.jsp?id=<%=rs.getInt(1) %>">Accept</a></td>
<%} %>
</tr>
<%} %>
</table>
</body>
</html>