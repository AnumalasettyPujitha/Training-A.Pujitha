<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<%@ include file="Connection.jsp" %>
<%
int id=Integer.parseInt(request.getParameter("id"));
int sal=Integer.parseInt(request.getParameter("sal"));
int experience=Integer.parseInt(request.getParameter("experience"));
int age=Integer.parseInt(request.getParameter("age"));
String address=request.getParameter("address");
String department=request.getParameter("department");

ps=con.prepareStatement("update manager set sal=?,experience=?,age=?,address=?,department=? where id=?");
ps.setInt(1,sal);
ps.setInt(2,experience);
ps.setInt(3,age);
ps.setString(4,address);
ps.setString(5,department);
ps.setInt(6,id);

int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("manager_profile.jsp?msg=updated_successfully");
else
	response.sendRedirect("index.html?msg=updated_failed");
%>
</body>
</html>