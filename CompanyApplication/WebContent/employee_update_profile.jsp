<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<%@ include file="Connection.jsp" %>
<%
int eid=Integer.parseInt(request.getParameter("eid"));
int esal=Integer.parseInt(request.getParameter("esal"));
int experience=Integer.parseInt(request.getParameter("experience"));
int age=Integer.parseInt(request.getParameter("age"));
String address=request.getParameter("address");
String department=request.getParameter("department");

ps=con.prepareStatement("update employee set esal=?,experience=?,age=?,address=?,department=? where eid=?");
ps.setInt(1,esal);
ps.setInt(2,experience);
ps.setInt(3,age);
ps.setString(4,address);
ps.setString(5,department);
ps.setInt(6,eid);

int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("employee_profile.jsp?msg=updated_successfully");
else
	response.sendRedirect("index.html?msg=updated_failed");
%>
</body>
</html>