package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DoctorUpdateBean {
	private String name,specialisation,email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private long phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialisation() {
		return specialisation;
	}
	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public boolean updateValidate(String name,long phone,String specialisation) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.connect();
		PreparedStatement ps=con.prepareStatement("update doctor set name=?,phone=?,specialisation=? where email=?");
		ps.setString(1, name);
		ps.setLong(2, phone);
		ps.setString(3, specialisation);
		ps.setString(4, getEmail());
		int x=ps.executeUpdate();
		if(x!=0)
			return true;
		else
			return false;
	}
}

