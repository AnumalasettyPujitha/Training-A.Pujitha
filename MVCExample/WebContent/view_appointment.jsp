<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<a href="view_appointment.jsp">AppointmentDetails</a> |
<a href="index.html">LogOut</a>
<br><br><br>
</center>
<%@ page import="com.mvc.AppointmentBean"%>
<%
AppointmentBean ab=(AppointmentBean)session.getAttribute("abbean");
%>
<%=ab.getEmail() %>
</body>
</html>