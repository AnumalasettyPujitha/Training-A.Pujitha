<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<%@ include file="Connection.jsp" %>
<%
int id=Integer.parseInt(request.getParameter("id"));
String name=request.getParameter("name");
String email=request.getParameter("email");
long phone=Long.parseLong(request.getParameter("phone"));
String specialisation=request.getParameter("specialisation");
ps=con.prepareStatement("update doctor set name=?,email=?,phone=?,specialisation=? where id=?");
ps.setString(1,name);
ps.setString(2,email);
ps.setLong(3,phone);
ps.setString(4,specialisation);
ps.setInt(5,id);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("doctorhome.jsp?msg=Updated");
%>
</body>
</html>