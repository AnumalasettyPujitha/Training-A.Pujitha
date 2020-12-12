<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO EMPLOYEE LEAVE HOME</h1></center>
<br><br><br>
<center>
<a href="employee_profile.jsp">EmployeeProfile</a> |
<a href="leave.jsp">ApplyLeave</a> |
<a href="index.html">Logout</a>
</center>
<br><br><br>
<form action="apply_leave.jsp" align="center">
<table align="center">
<tr><td></td><td><input type="hidden" name="employee_name" placeholder="Enter employee name"></td></tr>
<tr><td>Reason:</td><td><textarea name="reason" placeholder="Enter Reason"></textarea></td></tr>
<tr><td>Leave Starting Date:</td><td><input type="date" name="dos" placeholder="select date"></td></tr>
<tr><td>Leave Ending Date:</td><td><input type="date" name="doe" placeholder="select date"></td></tr>
<tr><td>Enter Leave Due:</td><td><input type="number" name="due" placeholder="Enter leave due"></td></tr>
<tr><td></td><td><input type="submit" value="Apply"></td></tr>
</table>
</form>
</body>
</html>