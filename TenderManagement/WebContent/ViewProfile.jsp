<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
  background-image: url("https://media1.picsearch.com/is?-gAwHwzQNOOVy0wgxvYnT2RsT5hQ9SMEm9iamw8jD3s&height=209");
  background-repeat: no-repeat;
  background-size: 100%;
}
</style>
</head>
<body align="center">
<h1 style="color:blue">WELCOME TO VIEW PROFILE</h1>
<br><br><br>
<a href="ViewProfile.jsp" style="color:brown">View Profile</a> |
<a href="create_tender.html" style="color:brown">Create Tender</a> |
<a href="Viewbiddingdetails.jsp" style="color:brown">View Bid Details</a> |
<a href="index.html" style="color:brown">Logout</a>
<br><br><br>
<%@ page import="com.tender.CreatePWDBean,com.tender.PWDLoginBean,java.util.*" %>
<table border="2" align="center" width="600" height="200" cellpadding="20">
<tr><td>Id</td><td>Name</td><td>Password</td><td>Email</td><td>Construction_type</td><td>Mobile</td><td>Action</td></tr>
<%
CreatePWDBean cpb=(CreatePWDBean)session.getAttribute("plb");
%>
<tr>
<td><%=cpb.getId() %></td>
<td><%=cpb.getName() %></td>
<td><%=cpb.getPassword() %></td>
<td><%=cpb.getEmail() %></td>
<td><%=cpb.getConstruction_type() %></td>
<td><%=cpb.getMobile() %></td>
<td><form action="./update" method="post" align="center">
<input type="hidden" name="id" value="<%=cpb.getId() %>"/>
<input type="email" name="email" placeholder="enter email"/>
<input type="text" name="mobile" placeholder="enter mobile number"/>
<input type="submit" value="update"/>
</form>
</td>
</tr>
</table>
</body>
</html>