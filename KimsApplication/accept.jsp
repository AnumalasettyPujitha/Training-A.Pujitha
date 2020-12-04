<%@ include file="Connection.jsp"%>

<% 
int id=Integer.parseInt(request.getParameter("id"));
String doctor_name=(String)session.getAttribute("doctor_name");

ps=con.prepareStatement("update appointment set status=?,doctor_name=? where aid=?");
ps.setString(1,"Accepted");
ps.setString(2,doctor_name);
ps.setInt(3,id);

int x=ps.executeUpdate();

if(x!=0)
	response.sendRedirect("view_appointment.jsp?msg=Acceptd");
%>