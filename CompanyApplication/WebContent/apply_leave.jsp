<%@ include file="Connection.jsp"%>

<%
String name=request.getParameter("employee_name");
String department=request.getParameter("department");
String reason=request.getParameter("reason");
String dos=request.getParameter("dos");
String doe=request.getParameter("doe");
int due=Integer.parseInt(request.getParameter("due"));

String sql="insert into employee_leave(name,department,reason,dos,doe,due) values(?,?,?,?,?,?)";

ps=con.prepareStatement(sql);
ps.setString(1,(String)session.getAttribute("ename"));
ps.setString(2,(String)session.getAttribute("department"));
ps.setString(3,reason);
ps.setString(4,dos);
ps.setString(5,doe);
ps.setInt(6,due);

int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("EmployeeHome.jsp?msg=registered");
%>
