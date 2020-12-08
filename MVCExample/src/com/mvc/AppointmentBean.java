package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AppointmentBean {
	private String patient_name,email,gender,blood_group,specialist,date_of_appointment,time_of_appointment;
	private long phone;
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBlood_group() {
		return blood_group;
	}
	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public String getDate_of_appointment() {
		return date_of_appointment;
	}
	public void setDate_of_appointment(String date_of_appointment) {
		this.date_of_appointment = date_of_appointment;
	}
	public String getTime_of_appointment() {
		return time_of_appointment;
	}
	public void setTime_of_appointment(String time_of_appointment) {
		this.time_of_appointment = time_of_appointment;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public boolean registrationValidate(String patient_name,long phone,String email,String gender,String blood_group,String specialist,String date_of_appointment,String time_of_appointment) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.connect();
		PreparedStatement ps=con.prepareStatement("insert into appointment(patient_name,phone,email,gender,blood_group,specialist,date_of_appointment,time_of_appointment) values(?,?,?,?,?,?,?,?)");
		ps.setString(1, patient_name);
		ps.setLong(2,phone);
		ps.setString(3, email);
		ps.setString(4,gender);
		ps.setString(5, blood_group);
		ps.setString(6, specialist);
		ps.setString(7, date_of_appointment);
		ps.setString(8, time_of_appointment);
		int x=ps.executeUpdate();
		if(x!=0)
			return true;
		else
			return false;
	}
}

