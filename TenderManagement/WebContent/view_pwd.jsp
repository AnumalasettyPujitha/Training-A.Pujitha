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
<h1 style="color:blue">WELCOME  TO  VIEW  PWD  PAGE</h1>
<a href="accept_builder.jsp" style="color:red">Accept Builders/Show Builders</a> |
<a href="pwd.html" style="color:red">Create PWD</a> |
<a href="view_pwd.jsp" style="color:red">View PWD</a> |
<a href="view_createdtenders.jsp" style="color:red">View Created Tenders</a> |
<a href="view_bidder.jsp" style="color:red">View Bidding Details</a> |
<a href="index.html" style="color:red">Logout</a>
<br><br><br>
<%@ page import="com.tender.CreatePWDBean,java.util.*" %>
<table border="2" align="center" width="600" height="200" cellpadding="20">
<tr><td>Id</td><td>Name</td><td>Password</td><td>Email</td><td>Construction_type</td><td>Mobile</td><td>Action</td></tr>
<%
List<CreatePWDBean> list=new CreatePWDBean().viewPWD();
Iterator it=list.iterator();
while(it.hasNext()){
	CreatePWDBean cpb=(CreatePWDBean)it.next();
%>
<tr>
<td><%=cpb.getId() %></td>
<td><%=cpb.getName() %></td>
<td><%=cpb.getPassword() %></td>
<td><%=cpb.getEmail() %></td>
<td><%=cpb.getConstruction_type() %></td>
<td><%=cpb.getMobile() %></td>
<td><a href="./delete_pwd?id=<%=cpb.getId() %>">Delete</a></td>
</tr>
<%} %>
</table>
</body>
</html>