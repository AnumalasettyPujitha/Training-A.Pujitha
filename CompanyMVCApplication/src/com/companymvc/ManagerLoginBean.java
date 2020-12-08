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
	public boolean loginValidate(String email,String password) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.connect();
		PreparedStatement ps=con.prepareStatement("select * from manager where email=? and password=?");
		ps.setString(1, email);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		return rs.next();
	}
}
