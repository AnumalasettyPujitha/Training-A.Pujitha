package com.companymvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LeaveBean {
	private String name,department,reason,dos,doe;
	private int due;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getDos() {
		return dos;
	}
	public void setDos(String dos) {
		this.dos = dos;
	}
	public String getDoe() {
		return doe;
	}
	public void setDoe(String doe) {
		this.doe = doe;
	}
	public int getDue() {
		return due;
	}
	public void setDue(int due) {
		this.due = due;
	}
	public boolean applyLeaveValidate(String name,String department,String reason,String dos,String doe,int due) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.connect();
		PreparedStatement ps=con.prepareStatement("insert into employee_leave(name,department,reason,dos,doe,due) values(?,?,?,?,?,?)");
		ps.setString(1,name);
		ps.setString(2,department);
		ps.setString(3,reason);
		ps.setString(4,dos);
		ps.setString(5,doe);
		ps.setInt(6,due);
		
		int x=ps.executeUpdate();
		if(x!=0)
			return true;
		else
			return false;
			
	}
}
