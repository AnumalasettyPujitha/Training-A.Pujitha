<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO VIEW APPOINTMENT HOME</h1></center>
<br><br><br>
<center>
<a href="DoctorHome.html">DoctorHome</a> |
<a href="doctorprofile.jsp">Profile</a> |
<a href="DoctorProfileUpdate.html">ProfileUpdate</a> |
<a href="ViewAppointment.jsp">AppointmentDetails</a> |
<a href="index.html">LogOut</a>
<br><br><br>
</center>
<%@ page import="com.mvc.ViewAppointmentBean,java.util.*" %>
<table border="2" align="center" width="600" height="200" cellpadding="20">
<tr>
<td>Patient_Name</td><td>Phone</td><td>Email</td><td>Gender</td><td>Blood_group</td><td>Specialist</td>
<td>Date_of_appointment</td><td>Time_of_appointment</td><td>Status</td><td>DoctorName</td><td>Action</td>
</tr>
<%
String specialist=(String)session.getAttribute("specialist");
List<ViewAppointmentBean> l=new ViewAppointmentBean().status(specialist);
Iterator it=l.iterator();
while(it.hasNext()){
	ViewAppointmentBean vab=(ViewAppointmentBean)it.next();
%>
<tr>
<td><%=vab.getPatient_name() %></td>
<td><%=vab.getPhone() %></td>
<td><%=vab.getEmail() %></td>
<td><%=vab.getGender() %></td>
<td><%=vab.getBlood_group() %></td>
<td><%=vab.getSpecialist() %></td>
<td><%=vab.getDate_of_appointment() %></td>
<td><%=vab.getTime_of_appointment() %></td>
<td><%=vab.getStatus() %></td>
<td><%=vab.getDoctor_name() %></td>
<%if(vab.getStatus().equalsIgnoreCase("Accepted")){ %>
<td>Accepted</td>
<%}else{ %>
<td><a href="./accet_appointment?id=<%=vab.getId() %>">Accept</a></td>
<%} %>
</tr>
<%} %>
</table>
</body>
</html>