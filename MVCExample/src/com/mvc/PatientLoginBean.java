package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientLoginBean {
	private int id;
	private String password;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public PatientRegistrationBean loginValidate(int id,String password) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.connect();
		PatientRegistrationBean prb=new PatientRegistrationBean();
		PreparedStatement ps=con.prepareStatement("select * from patient where id=? and password=?");
		ps.setInt(1, id);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			prb.setName(rs.getString("name"));
			prb.setGender(rs.getString("gender"));
			prb.setAge(rs.getInt("age"));
			prb.setMobile(rs.getLong("mobile"));
			prb.setAddress(rs.getString("address"));
			return prb;
		}
		else
			return null;
	}
}
