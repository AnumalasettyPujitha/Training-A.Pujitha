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
<h1 style="color:blue">WELCOME  TO  ACCEPT  BUILDERS  PAGE</h1>
<a href="accept_builder.jsp" style="color:red">Accept Builders/Show Builders</a> |
<a href="pwd.html" style="color:red">Create PWD</a> |
<a href="view_pwd.jsp" style="color:red">View PWD</a> |
<a href="view_createdtenders.jsp" style="color:red">View Created Tenders</a> |
<a href="view_bidder.jsp" style="color:red">View Bidding Details</a> |
<a href="index.html" style="color:red">Logout</a>
<br><br><br>
<%@ page import="com.tender.ApplyBuilder,com.tender.BuilderLoginBean,java.util.*" %>
<table border="2" align="center" width="600" height="200" cellpadding="20">
<tr><td>Bid</td><td>Builder_name</td><td>Company_name</td><td>Email</td><td>Mobile</td><td>Status</td></tr>
<%
List<ApplyBuilder> list=new BuilderLoginBean().viewBuilder();
Iterator it=list.iterator();
while(it.hasNext()){
	ApplyBuilder ab=(ApplyBuilder)it.next();
%>
<tr>
<td><%=ab.getBid() %></td>
<td><%=ab.getBname() %></td>
<td><%=ab.getCname() %></td>
<td><%=ab.getEmail() %></td>
<td><%=ab.getMobile() %></td>
<%if(ab.getStatus()==null){ %>
<td><a href="./accept_status?bid=<%=ab.getBid()%>">Accept</a></td>
<%}else{ %>
<td>Accepted</td>
<%} %>
</tr>
<%} %>
</table>
</body>
</html>