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
<h1 style="color:blue">WELCOME  TO  VIEW  BIDDERS  HOME</h1>
<a href="view_builder_profile.jsp" style="color:red">View Profile</a> |
<a href="view_alltenders.jsp" style="color:red">View All Tenders</a> |
<a href="view_bidder.jsp" style="color:red">View Bidding Details</a> |
<a href="index.html" style="color:red">Logout</a>
<br><br><br>
<%@page import="com.tender.SubmitTender,java.util.*" %>
<table border="2" align="center" width="600" height="200" cellpadding="20">
<tr><td>Bid_Id</td><td>Builder_Name</td><td>Company_Name</td><td>Tid</td><td>Tender_Name</td><td>Construction Type</td><td>Date</td><td>BidFile</td><td>Status</td></tr>
<%
List<SubmitTender> list=new SubmitTender().view();
Iterator it=list.iterator();
while(it.hasNext()){
	SubmitTender st=(SubmitTender)it.next();
%>
<tr>
<td><%=st.getBid_id() %></td>
<td><%=st.getBuilder_name() %></td>
<td><%=st.getCompany_name() %></td>
<td><%=st.getTid() %></td>
<td><%=st.getTname() %></td>
<td><%=st.getConstruction_type() %></td>
<td><%=st.getDate() %></td>
<td><%=st.getBid_file() %></td>
<td><%=st.getStatus() %></td>
</tr>
<%} %>
</table>
</body>
</html>