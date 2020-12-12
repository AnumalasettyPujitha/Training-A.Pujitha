<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>WELCOME TO EMPLOYEE UPDATE PROFILE</h1>
<a href="employee_profile.jsp">EmployeeProfile</a> |
<a href="index.html">Logout</a>
</center>
<%@ include file="Connection.jsp" %>
<%
int id=Integer.parseInt(request.getParameter("id"));
ps=con.prepareStatement("select * from employee where eid=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<form action="./employee_update_profile.jsp" align="center">
<table width="500" height="600" align="center">
<tr><td></td><td><input type="hidden" name="eid" value="<%=rs.getInt(1) %>"></td></tr>
<tr><td>Enter Salary:</td><td><input type="number" name="esal" value="<%=rs.getInt(3)%>"></td></tr>
<tr><td>Enter Experience:</td><td><input type="number" name="experience" value="<%=rs.getInt(4)%>"></td></tr>
<tr><td>Enter Age:</td><td><input type="number" name="age" value="<%=rs.getInt(5)%>"></td></tr>
<tr><td>Enter Address:</td><td><input type="text" name="address" value="<%=rs.getString(8)%>"></td></tr>
<tr><td>Select Department:</td>
<td><select name="department" >
<option value="<%=rs.getString(10)%>"><%=rs.getString(10)%></option>
<option value="QA">QA</option>
<option value="Java">Java</option>
<option value="PYTHON">Python</option>
</select>
</td>
</tr>
<tr><td></td><td><input type="submit" value="update"></td></tr>
</table>
</form>
<%} %>
</body>
</html>