<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO APPOINTMENT HOME</h1></center>
<br><br><br>
<center>
<a href="patienthome.jsp">Profile</a> |
<a href="appointment.jsp">Appointment</a> |
<a href="index.html">LogOut</a>
<br><br><br>
<form action="apply_appointment.jsp" align="center">
<input type="text" name="patient_name" placeholder="Enter patient name"><br>
<input type="number" name="phone" placeholder="Enter phone number"><br>
<input type="email" name="email" placeholder="Enter Email"><br>
<input type="radio" name="gender" value="male">Male
<input type="radio" name="gender" value="female">Female<br>
<select name="blood_group">
<option value="A+">A+</option>
<option value="B+">B+</option>
<option value="AB+">AB+</option>
<option value="O+">O+</option>
<option value="A-">A-</option>
<option value="B-">B-</option>
<option value="AB-">AB-</option>
<option value="O-">O-</option>
</select><br>
<select name="specialist">
		<option value="DENTIST">DENTIST</option>
		<option value="ENT">ENT</option>
		<option value="CARDIALOGIST">CARDIALOGIST</option>
</select> <br>
<input type="date" name="date_of_appointment" placeholder="select date"><br>
<input type="text" name="time_of_appointment" placeholder="enter time"><br>
<input type="submit" value="Apply">
</center>
</form>
</body>
</html>