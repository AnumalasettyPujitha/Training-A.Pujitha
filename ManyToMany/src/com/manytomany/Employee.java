package com.manytomany;

import java.util.Set;

public class Employee {
	private int emp_id;
	private String emp_name;
	private String emp_department;
	private Set project;
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_department() {
		return emp_department;
	}
	public void setEmp_department(String emp_department) {
		this.emp_department = emp_department;
	}
	public Set getProject() {
		return project;
	}
	public void setProject(Set project) {
		this.project = project;
	}
}
