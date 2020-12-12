<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO PATIENT UPDATE PROFILE</h1></center>
<br><br><br>
<center>
<a href="patienthome.jsp">Profile</a> |
<a href="index.html">LogOut</a>
<br><br><br>
</center>
<%@ include file="Connection.jsp" %>
<%
int id=Integer.parseInt(request.getParameter("id"));
ps=con.prepareStatement("select * from patient where id=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<form action="./patient_update_profile.jsp" align="center">
		<center>
		<input type="hidden" name="id" value="<%=rs.getInt("id")%>"></input>
		<input type="text" name="name" value="<%=rs.getString("name") %>"></input> <br>
		<input type="number" name="mobile" value="<%=rs.getLong("mobile") %>"></input> <br>
		select gender
		<input type="radio" name="gender" value="male">Male</input>
		<input type="radio" name="gender" value="female">Female</input><br>
		<input type="hidden" name="gender" value="<%=rs.getString("gender") %>"></input>
		<input type="number" name="age" value="<%=rs.getInt("age") %>"></input><br>
		enter address<br><textarea rows="10" cols="20" name="address" ></textarea><br>
		<input type="hidden" name="address" value="<%=rs.getString("address") %>"></input><br>
		<input type="submit" value="Update"></input>
		</center>
</form>
<%} %>
</body>
</html>