<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO PATIENT APPOINTMENT STATUS</h1></center>
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
<br><br><br>
<%@ page import="com.mvc.AppointmentBean,java.util.*" %>
<table border="2" align="center" width="600" height="200" cellpadding="20">
<tr>
<td>Patient_Name</td><td>Phone</td><td>Email</td><td>Gender</td><td>Blood_group</td><td>Specialist</td>
<td>Date_of_appointment</td><td>Time_of_appointment</td><td>Status</td><td>DoctorName</td>
</tr>
<%
int id=(int)session.getAttribute("id");
List<AppointmentBean> l=new AppointmentBean().status(id);
Iterator it=l.iterator();
while(it.hasNext()){
	AppointmentBean ab=(AppointmentBean)it.next();
%>
<tr>
<td><%=ab.getPatient_name() %></td>
<td><%=ab.getPhone() %></td>
<td><%=ab.getEmail() %></td>
<td><%=ab.getGender() %></td>
<td><%=ab.getBlood_group() %></td>
<td><%=ab.getSpecialist() %></td>
<td><%=ab.getDate_of_appointment() %></td>
<td><%=ab.getTime_of_appointment() %></td>
<td><%=ab.getStatus() %></td>
<td><%=ab.getDoctor_name() %></td>
</tr>
<%} %>
</body>
</html>