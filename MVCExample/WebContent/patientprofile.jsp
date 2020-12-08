<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO PATIENT HOME</h1></center>
<br><br><br>
<center>
<a href="PatientHome.html">PatientHome</a> |
<a href="patientprofile.jsp">Profile</a> |
<a href="appointment.jsp">Appointment</a> |
<a href="appointment_status.jsp">Appointment Status</a> |
<a href="index.html">LogOut</a>
<br><br><br>
</center>
<%@page import="com.mvc.PatientLoginBean" %>
<%
PatientLoginBean plb=(PatientLoginBean)session.getAttribute("plbean");
%>
<%=plb.getId() %>
</body>
</html>