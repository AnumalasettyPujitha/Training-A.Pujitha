package com.companymvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ViewLeaveBean {
	private int leave_id,due,eid;
	private String name,department,reason,dos,doe,status,manager_name,email;
	public int getLeave_id() {
		return leave_id;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setLeave_id(int leave_id) {
		this.leave_id = leave_id;
	}
	public int getDue() {
		return due;
	}
	public void setDue(int due) {
		this.due = due;
	}
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getManager_name() {
		return manager_name;
	}
	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<ViewLeaveBean> viewLeave(String department) throws ClassNotFoundException, SQLException{
		Connection con=ConnectionEx.connect();
		PreparedStatement ps=con.prepareStatement("select * from employee_leave where department=?");
		ps.setString(1, department);
		ResultSet rs=ps.executeQuery();
		ArrayList<ViewLeaveBean> al=new ArrayList<>();
		while(rs.next()) {
			ViewLeaveBean vlb=new ViewLeaveBean();
			vlb.setLeave_id(rs.getInt(1));
			vlb.setName(rs.getString(2));
			vlb.setDepartment(rs.getString(3));
			vlb.setReason(rs.getString(4));
			vlb.setDos(rs.getString(5));
			vlb.setDoe(rs.getString(6));
			vlb.setStatus(rs.getString(7));
			vlb.setManager_name(rs.getString(8));
			vlb.setDue(rs.getInt(9));
			vlb.setEmail(rs.getString(10));
			vlb.setEid(rs.getInt(11));
			al.add(vlb);
		}
		return al;
	}
	public int leaves(int id) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.connect();
		PreparedStatement ps=con.prepareStatement("select * from employee where eid=?");
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
			return rs.getInt("leaves_remaining");
		return 0;
	}
}
