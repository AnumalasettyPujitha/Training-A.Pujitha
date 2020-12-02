<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<%@ include file="Connection.jsp" %>
<%
int id=Integer.parseInt(request.getParameter("id"));
String name=request.getParameter("name");
long mobile=Long.parseLong(request.getParameter("mobile"));
String gender=request.getParameter("gender");
int age=Integer.parseInt(request.getParameter("age"));
String address=request.getParameter("address");
ps=con.prepareStatement("update patient set name=?,mobile=?,gender=?,age=?,address=? where id=?");
ps.setString(1,name);
ps.setLong(2,mobile);
ps.setString(3,gender);
ps.setInt(4,age);
ps.setString(5,address);
ps.setInt(6,id);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("patienthome.jsp?msg=Updated");
%>
</body>
</html>