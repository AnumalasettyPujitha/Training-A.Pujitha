<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO DOCTOR HOME</h1></center>
<br><br><br>
<center>
<a href="DoctorHome.html">DoctorHome</a> |
<a href="doctorhome.jsp">Profile</a> |
<a href="DoctorProfileUpdate.html">ProfileUpdate</a> |
<a href="ViewAppointment.jsp">AppointmentDetails</a> |
<a href="index.html">LogOut</a>
<br><br><br>
</center>
<%@page import="com.mvc.RegistrationBean" %>
<%
RegistrationBean rb=(RegistrationBean)session.getAttribute("rbean");
%>
<table border="2" align="center" width="600" height="200" cellpadding="20">
<tr><td>Name</td><td>Email</td><td>Phone</td><td>Specialisation</td></tr>
<tr>
<td><%=rb.getName() %></td>
<td><%=rb.getEmail() %></td>
<td><%=rb.getPhone() %></td>
<td><%=rb.getSpecialisation() %></td>
</tr>
</table>

</body>
</html>