package com.companymvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManagerLoginBean {
	private String email,password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public ManagerRegisterBean loginValidate(String email,String password) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.connect();
		ManagerRegisterBean mrb=new ManagerRegisterBean();
		PreparedStatement ps=con.prepareStatement("select * from manager where email=? and password=?");
		ps.setString(1, email);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			mrb.setName(rs.getString("name"));
			mrb.setSal(rs.getInt("sal"));
			mrb.setExperience(rs.getInt("experience"));
			mrb.setAge(rs.getInt("age"));
			mrb.setGender(rs.getString("gender"));
			mrb.setEmail(email);
			mrb.setAddress(rs.getString("address"));
			mrb.setDepartment(rs.getString("department"));
		}
		return mrb;
	}
}
