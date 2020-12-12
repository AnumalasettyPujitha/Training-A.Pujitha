<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<center>
<center>
<h1>WELCOME TO MANAGER VIEW LEAVE HOME</h1>
<a href="Manager_Profile.jsp">ManagerProfile</a> |
<a href="ViewLeave.jsp">View Leave</a> |
<a href="index.html">Logout</a>
</center>
<%@ page import="com.companymvc.ViewLeaveBean,java.util.*" %>
<table border="2" align="center" width="600" height="200" cellpadding="20">
<tr>
<td>Employee_Name</td><td>Department</td><td>Reason</td><td>DOS</td><td>DOE</td>
<td>Status</td><td>ManagerName</td><td>Due</td><td>Action</td>
</tr>
<%
String department=(String)session.getAttribute("department");
List<ViewLeaveBean> l=new ViewLeaveBean().viewLeave(department);
Iterator it=l.iterator();
while(it.hasNext()){
	ViewLeaveBean vlb=(ViewLeaveBean)it.next();
	int eid=vlb.getEid();
	int leaves=vlb.leaves(eid);
%>
<tr>
<td><%=vlb.getName() %></td>
<td><%=vlb.getDepartment() %></td>
<td><%=vlb.getReason() %></td>
<td><%=vlb.getDos() %></td>
<td><%=vlb.getDoe() %></td>
<td><%=vlb.getStatus() %></td>
<td><%=vlb.getManager_name() %></td>
<td><%=vlb.getDue() %></td>
<%if(vlb.getStatus().equalsIgnoreCase("Accepted")){ %>
<td>Accepted</td>
<%}else if(vlb.getStatus().contains("Rejected")){ %>
<td>Rejected</td>
<%}else{ %>
<td><a href="./accet_leave?id=<%=vlb.getLeave_id() %>&eid=<%=eid%>&due=<%=vlb.getDue()%>&leaves=<%=leaves%>">Accept</a></td>
<%} %>
</tr>
<%} %>
</table>
</body>
</html>