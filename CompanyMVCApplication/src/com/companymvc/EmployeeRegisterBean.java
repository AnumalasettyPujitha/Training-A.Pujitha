package com.companymvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.companymvc.ConnectionEx;

public class EmployeeRegisterBean {
	private String ename,gender,email,address,password,department;
	private int esal,experience,age,leaves_remaning,eid;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public int getLeaves_remaning() {
		return leaves_remaning;
	}
	public void setLeaves_remaning(int leaves_remaning) {
		this.leaves_remaning = leaves_remaning;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean registrationValidate(String ename,int esal,int experience,int age,String gender,String email,String address,String password,String department) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.connect();
		PreparedStatement ps=con.prepareStatement("insert into employee(ename,esal,experience,age,gender,email,address,password,department) values(?,?,?,?,?,?,?,?,?)");
		ps.setString(1, ename);
		ps.setInt(2, esal);
		ps.setInt(3, experience);
		ps.setInt(4, age);
		ps.setString(5, gender);
		ps.setString(6, email);
		ps.setString(7,address);
		ps.setString(8, password);
		ps.setString(9, department);
		
		int x=ps.executeUpdate();
		if(x!=0)
			return true;
		else
			return false;
	}
}
