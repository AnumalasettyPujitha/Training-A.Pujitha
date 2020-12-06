<%@ include file="Connection.jsp"%>

<% 
int id=Integer.parseInt(request.getParameter("id"));
int due=Integer.parseInt(request.getParameter("due"));
String manager_name=(String)session.getAttribute("manager_name");
int leaves=(int)session.getAttribute("leaves");
int eid=(int)session.getAttribute("eid");

ps=con.prepareStatement("update employee_leave set status=?,manager_name=? where leave_id=?");
if(due<=20){
	if((leaves-due)>0){
		ps.setString(1,"Accepted");
	PreparedStatement ps1=con.prepareStatement("update employee set leaves_remaining=leaves_remaining-? where eid=?");
	ps1.setInt(1,due);
	ps1.setInt(2,eid);
	ps1.executeUpdate();
	}
	else
		ps.setString(1,"Rejected:Exceeds No.of leaves");
}
else
	ps.setString(1,"Rejected");
ps.setString(2,manager_name);
ps.setInt(3,id);

int x=ps.executeUpdate();

if(x!=0)
	response.sendRedirect("View_Leave.jsp?msg=Accepted/Rejected");
%>
