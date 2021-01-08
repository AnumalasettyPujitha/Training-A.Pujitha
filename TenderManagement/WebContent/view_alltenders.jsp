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
<h1 style="color:blue">WELCOME  TO  BUILDER  HOME</h1>
<a href="view_builder_profile.jsp" style="color:red">View Profile</a> |
<a href="view_alltenders.jsp" style="color:red">View All Tenders</a> |
<a href="view_bidder.jsp" style="color:red">View Bidding Details</a> |
<a href="index.html" style="color:red">Logout</a>
<br><br><br>
<%@ page import="com.tender.CreateTenderBean,java.util.*" %>
<table border="2" align="center" width="600" height="200" cellpadding="20">
<tr><td>Id</td><td>Name</td><td>Starting_Date</td><td>Closing_Date</td><td>Construction_type</td><td>Amount</td><td>Apply</td></tr>
<%
List<CreateTenderBean> list=new CreateTenderBean().view();
Iterator it=list.iterator();
while(it.hasNext()){
	CreateTenderBean ctb=(CreateTenderBean)it.next();
%>
<tr>
<td><%=ctb.getTid() %></td>
<td><%=ctb.getTname() %></td>
<td><%=ctb.getStarting_date() %></td>
<td><%=ctb.getClosing_date() %></td>
<td><%=ctb.getConstruction_type() %></td>
<td><%=ctb.getAmount() %></td>
<td><a href="apply_tender.jsp?Tid=<%=ctb.getTid() %>&Tname=<%=ctb.getTname() %>&construction_type=<%=ctb.getConstruction_type() %>">Apply</a></td>
</tr>
<%} %>
</table>
</body>
</html>