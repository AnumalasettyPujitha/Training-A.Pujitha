package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PatientUpdateBean {
	private String name,gender,address;
	private long mobile;
	private int age,id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public boolean updateValidate(String name,long mobile,String gender,int age,String address) throws SQLException, ClassNotFoundException {
		Connection con=ConnectionEx.connect();
		PreparedStatement ps=con.prepareStatement("update patient set name=?,mobile=?,gender=?,age=?,address=? where id=?");
		ps.setString(1, name);
		ps.setLong(2, mobile);
		ps.setString(3, gender);
		ps.setInt(4, age);
		ps.setString(5, address);
		ps.setInt(6, getId());
		int x=ps.executeUpdate();
		if(x!=0)
			return true;
		else
			return false;
	}
}

