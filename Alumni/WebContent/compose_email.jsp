<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String pages=request.getParameter("page");
if(pages.equals("alumni")){
%>
<%@include file="alumni.jsp" %>
<%}else if(pages.equals("college")){
%>
<%@include file="college.jsp" %>
<%}else{%>
<%@include file="directorate.jsp" %>
<%} %>
<h1 align="center">Welcome to Email Page</h1>
<%@page import="com.pojo.Alumni" %>
<%Alumni s=new Alumni();%>
<div class="container">
		<div class="row justify-content-center align-items-center"
			style="height: 50vh">
			<div class="col-8">
				<div class="card">
					<div class="card-body">
						<form action="./compose_email" method="post">
							<div class="form-group">
								To: <input type="text" name="composeto"
									class="form-control" placeholder="To email" required="required">
							</div>
							<div class="form-group">
								From: <input type="text" name="from"
									class="form-control" value="<%=s.getEmail()%>" required="required">
							</div>
							<div class="form-group">
								Subject: <input type="text" name="subject"
									class="form-control" placeholder="Subject" required="required">
							</div>
							<div class="form-group">
								Content: <textarea class="form-control" rows="10" cols="10" name="content"></textarea>
							</div>
							<input type="submit" class="btn btn-primary" value="send">
							
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>