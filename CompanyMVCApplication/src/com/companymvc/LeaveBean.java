package com.companymvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.companymvc.ConnectionEx;

public class LeaveBean {
	private String name,department,reason,dos,doe;
	private int id,due,eid;
	private String manager_name,status,email;
	public String getEmail() {
		return email;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public String getManager_name() {
		return manager_name;
	}
	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public boolean applyLeaveValidate(String name,String department,String reason,String dos,String doe,int due,String email,int eid) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.connect();
		PreparedStatement ps=con.prepareStatement("insert into employee_leave(name,department,reason,dos,doe,due,email,eid) values(?,?,?,?,?,?,?,?)");
		ps.setString(1,name);
		ps.setString(2,department);
		ps.setString(3,reason);
		ps.setString(4,dos);
		ps.setString(5,doe);
		ps.setInt(6,due);
		ps.setString(7, email);
		ps.setInt(8, eid);
		
		int x=ps.executeUpdate();
		if(x!=0)
			return true;
		else
			return false;
			
	}
	public List<LeaveBean> viewStatus(String email) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.connect();
		PreparedStatement ps=con.prepareStatement("select * from employee_leave where email=?");
		ps.setString(1, email);
		ResultSet rs=ps.executeQuery();
		ArrayList<LeaveBean> al=new ArrayList<>();
		while(rs.next()) {
			LeaveBean lb=new LeaveBean();
			lb.setName(rs.getString(2));
			lb.setDepartment(rs.getString(3));
			lb.setReason(rs.getString(4));
			lb.setDos(rs.getString(5));
			lb.setDoe(rs.getString(6));
			lb.setStatus(rs.getString(7));
			lb.setManager_name(rs.getString(8));
			lb.setDue(rs.getInt(9));
			lb.setEmail(rs.getString(10));
			lb.setEid(rs.getInt(11));
			al.add(lb);
		}
		return al;
	}
}
