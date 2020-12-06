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
<a href="appointment_status.jsp">Appointment Status</a> |
<a href="index.html">LogOut</a>
<br><br><br>
</center>
<%@ include file="Connection.jsp" %>
<table border="2" align="center" width="600" height="200" cellpadding="20">
<tr>
<td>Patient_Name</td><td>Phone</td><td>Email</td><td>Gender</td><td>Blood_group</td><td>Specialist</td>
<td>Date_of_appointment</td><td>Time_of_appointment</td><td>Status</td><td>DoctorName</td>
</tr>
<%
int id=(int)session.getAttribute("pid");
ps=con.prepareStatement("select * from appointment where pid=?");
ps.setInt(1,id);
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
</tr>
<%} %>
</table>
</body>
</html>