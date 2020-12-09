package com.companymvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeLoginBean {
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
	public EmployeeRegisterBean loginValidate(String email,String password) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.connect();
		EmployeeRegisterBean erb=new EmployeeRegisterBean();
		PreparedStatement ps=con.prepareStatement("select * from employee where email=? and password=?");
		ps.setString(1, email);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			erb.setEname(rs.getString("ename"));
			erb.setEsal(rs.getInt("esal"));
			erb.setExperience(rs.getInt("experience"));
			erb.setAge(rs.getInt("age"));
			erb.setGender(rs.getString("gender"));
			erb.setEmail(email);
			erb.setAddress(rs.getString("address"));
			erb.setDepartment(rs.getString("department"));
		}
		return erb;
	}
}
