<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>WELCOME TO EMPLOYEE LEAVE STATUS</h1>
<a href="Employee_Profile.jsp">EmployeeProfile</a> |
<a href="Leave.html">ApplyLeave</a> |
<a href="leave_status.jsp">LeaveStatus</a> |
<a href="index.html">Logout</a>
</center>
<br><br><br>
<%@ page import="com.companymvc.LeaveBean,java.util.*" %>
<table border="2" align="center" width="600" height="200" cellpadding="20">
<tr>
<td>Employee_Name</td><td>Department</td><td>Reason</td><td>DOS</td><td>DOE</td><td>Due</td>
<td>Status</td><td>ManagerName</td><td>Email</td>
</tr>
<%
String email=(String)session.getAttribute("email");
List<LeaveBean> al=new LeaveBean().viewStatus(email);
Iterator it=al.iterator();
while(it.hasNext()){
	LeaveBean lb=(LeaveBean)it.next();
%>
<tr>
<td><%=lb.getName() %></td>
<td><%=lb.getDepartment() %></td>
<td><%=lb.getReason() %></td>
<td><%=lb.getDos() %></td>
<td><%=lb.getDoe() %></td>
<td><%=lb.getDue() %></td>
<td><%=lb.getStatus() %></td>
<td><%=lb.getManager_name() %></td>
<td><%=lb.getEmail() %></td>
</tr>
<%} %>
</table>
</body>
</html>