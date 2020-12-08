package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PatientRegistrationBean {
	private String name,password,gender,address;
	private long mobile;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean registrationValidate(String name,String password,long mobile,String gender,int age,String address) throws SQLException, ClassNotFoundException {
		Connection con=ConnectionEx.connect();
		PreparedStatement ps=con.prepareStatement("insert into patient(name,password,mobile,gender,age,address) values(?,?,?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, password);
		ps.setLong(3, mobile);
		ps.setString(4, gender);
		ps.setInt(5, age);
		ps.setString(6, address);
		int x=ps.executeUpdate();
		if(x!=0)
			return true;
		else
			return false;
	}
}
