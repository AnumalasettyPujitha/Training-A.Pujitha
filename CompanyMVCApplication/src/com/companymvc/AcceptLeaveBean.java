package com.companymvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.companymvc.ConnectionEx;

public class AcceptLeaveBean {
	private String manager_name;
	private int leaves,eid,due,id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDue() {
		return due;
	}
	public void setDue(int due) {
		this.due = due;
	}
	public String getManager_name() {
		return manager_name;
	}
	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
	public int getLeaves() {
		return leaves;
	}
	public void setLeaves(int leaves) {
		this.leaves = leaves;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public boolean accept(int eid,int due,String manager_name,int id,int leaves) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.connect();
		PreparedStatement ps=con.prepareStatement("update employee_leave set status=?,manager_name=? where leave_id=?");
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
			return true;
		else
			return false;
	}
}
