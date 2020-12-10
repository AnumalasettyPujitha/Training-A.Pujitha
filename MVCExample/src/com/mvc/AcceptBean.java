package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AcceptBean {
	private String name,status;
	private int aid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public boolean accept(String dname,int aid) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.connect();
		PreparedStatement ps=con.prepareStatement("update appointment set status=?,doctor_name=? where aid=?");
		ps.setString(1,"accepted");
		ps.setString(2, dname);
		ps.setInt(3, aid);
		int x=ps.executeUpdate();
		if(x!=0)
			return true;
		else
			return false;
	}
}
