<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO DOCTOR HOME</h1></center>
<br><br><br>
<center>
<a href="doctorhome.jsp">Profile</a> |
<a href="index.html">LogOut</a>
<br><br><br>
</center>
<%@ include file="Connection.jsp" %>
<%
int id=Integer.parseInt(request.getParameter("id"));
ps=con.prepareStatement("select * from doctor where id=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<form action="./doctor_update_profile.jsp" align="center">
		<input type="hidden" name="id" value="<%=rs.getInt("id")%>"></input>
		<input type="text" name="name" value="<%=rs.getString("name")%>"></input>
		<input type="email" name="email" value="<%=rs.getString("email")%>"></input>
		<input type="number" name="phone" value="<%=rs.getLong("phone")%>"></input>
		<select name="specialisation">
			<option value="<%=rs.getString("specialisation")%>"><%=rs.getString("specialisation")%></option>
			<option value="DENTIST">DENTIST</option>
			<option value="ENT">ENT</option>
			<option value="CARDIALOGIST">CARDIALOGIST</option>
		</select> 
		<input type="submit" value="Update"></input>
</form>

<%} %>
</body>
</html>