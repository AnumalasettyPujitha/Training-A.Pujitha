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
<h1 style="color:blue">WELCOME  TO  VIEW  PROFILE  HOME</h1>
<a href="view_builder_profile.jsp" style="color:red">View Profile</a> |
<a href="view_alltenders.jsp" style="color:red">View All Tenders</a> |
<a href="view_bidder.jsp" style="color:red">View Bidding Details</a> |
<a href="index.html" style="color:red">Logout</a>
<br><br><br>
<%@ page import="com.tender.ApplyBuilder,java.util.*" %>
<table border="2" align="center" width="600" height="200" cellpadding="20">
<tr><td>Bid</td><td>Builder_name</td><td>Company_name</td><td>Email</td><td>Mobile</td><td>Status</td></tr>
<%
ApplyBuilder ab=(ApplyBuilder)session.getAttribute("builderbean");
%>
<tr>
<td><%=ab.getBid() %></td>
<td><%=ab.getBname() %></td>
<td><%=ab.getCname() %></td>
<td><%=ab.getEmail() %></td>
<td><%=ab.getMobile() %></td>
<td><%=ab.getStatus() %></td>
</tr>
</table>
</body>
</html>