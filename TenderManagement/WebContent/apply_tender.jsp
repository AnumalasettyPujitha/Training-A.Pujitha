<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
body {
  background-image: url("https://media1.picsearch.com/is?-gAwHwzQNOOVy0wgxvYnT2RsT5hQ9SMEm9iamw8jD3s&height=209");
  background-repeat: no-repeat;
  background-size: 100%;
}
</style>
</head>
<body align="center">
<h1 style="color:blue">WELCOME  TO  APPLY  TENDER</h1>
<a href="view_alltenders.jsp" style="color:red">View All Tenders</a> |
<a href="submit_tender.html" style="color:red">Submit Tender</a> |
<a href="index.html" style="color:red">Logout</a>
<br><br><br>
<%
int Tid=Integer.parseInt(request.getParameter("Tid"));
String Tname=request.getParameter("Tname");
String construction_type=request.getParameter("construction_type");
%>
<form action="./apply_bid" method="post" align="center" enctype="multipart/form-data">
<table align="center">
<tr><td></td><td><input type="hidden" name="tid" value="<%=request.getParameter("Tid") %>"/></td></tr>
<tr><td></td><td><input type="hidden" name="tname" value="<%=request.getParameter("Tname") %>"/></td></tr>
<tr><td></td><td><input type="hidden" name="construction_type" value="<%=request.getParameter("construction_type") %>"/></td></tr>
<tr><td>Select Date:</td><td><input type="date" name="date" value="today"/></td></tr>
<tr><td>Enter Bid Amount:</td><td><input type="number" name="bid_amount" placeholder="Enter amount"/></td></tr>
<tr><td>Choose Bid File:</td><td><input type="file" name="bid_file" placeholder="Choose file"/></td></tr>
</table>
<input type="submit" value="apply"/>
</form>
</body>
</html>