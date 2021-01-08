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
<h1 style="color:blue">WELCOME TO PWD HOME</h1>
<br><br><br>
<a href="ViewProfile.jsp" style="color:brown">View Profile</a> |
<a href="create_tender.html" style="color:brown">Create Tender</a> |
<a href="Viewbiddingdetails.jsp" style="color:brown">View Bid Details</a> |
<a href="index.html" style="color:brown">Logout</a>
<br><br><br>
<%@page import="com.tender.SubmitTender,java.util.*" %>
<table border="2" align="center" width="600" height="200" cellpadding="20">
<tr><td>Bid_Id</td><td>Builder_Name</td><td>Company_Name</td><td>Tid</td><td>Tender_Name</td><td>Construction Type</td><td>Date</td><td>Bid_Amount</td><td>BidFile</td><td>Status</td><td>Action</td></tr>
<%
String construct_type=(String)session.getAttribute("construct_type");
List<SubmitTender> list=new SubmitTender().view(construct_type);
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
<td><%=st.getBid_amount() %></td>
<td><a href="./downloadBid_File?bid_file=<%=st.getBid_file() %>"><%=st.getBid_file() %></a></td>
<td><%=st.getStatus() %></td>
<%if(st.getStatus()==null){ %>
<td><a href="./accept_bid?id=<%=st.getBid_id() %>&Tid=<%=st.getTid() %>">Accept</a></td>
<%}else if(st.getStatus().equalsIgnoreCase("Accepted")){ %>
<td>Accepted</td>
<%}else{ %>
<td>Rejected</td>
<%} %>
</tr>
<%} %>
</table>
</body>
</html>