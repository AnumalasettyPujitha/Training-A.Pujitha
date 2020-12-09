<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO PATIENT HOME</h1></center>
<br><br><br>
<center>
<a href="PatientHome.html">PatientHome</a> |
<a href="patientprofile.jsp">Profile</a> |
<a href="PatientProfileUpdate.html">ProfileUpdate</a> |
<a href="appointment.html">Appointment</a> |
<a href="appointment_status.jsp">Appointment Status</a> |
<a href="index.html">LogOut</a>
<br><br><br>
</center>
<%@page import="com.mvc.PatientRegistrationBean" %>
<%
PatientRegistrationBean prb=(PatientRegistrationBean)session.getAttribute("parbean");
%>

<table border="2" align="center" width="600" height="200" cellpadding="20">
<tr><td>Name</td><td>Mobile</td><td>Gender</td><td>Age</td><td>Address</td></tr>
<tr>
<td><%=prb.getName() %></td>
<td><%=prb.getMobile() %></td>
<td><%=prb.getGender() %></td>
<td><%=prb.getAge() %></td>
<td><%=prb.getAddress() %></td>
</tr>
</table>
</body>
</html>