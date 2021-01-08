<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<%
String name=request.getParameter("admin_name");
System.out.println(name);
String password=request.getParameter("password");
if(name.equalsIgnoreCase("admin") && password.equals("admin")){
response.sendRedirect("admin_home.html?msg=successful"); 
}
else{
	response.sendRedirect("admin_login.jsp?msg=un_successful");
}%>
</body>
</html>
