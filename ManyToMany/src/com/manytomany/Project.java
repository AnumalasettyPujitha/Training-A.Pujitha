package com.manytomany;

import java.util.Set;

public class Project {
	private int project_id;
	private String project_title;
	private Set employee;
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public String getProject_title() {
		return project_title;
	}
	public void setProject_title(String project_title) {
		this.project_title = project_title;
	}
	public Set getEmployee() {
		return employee;
	}
	public void setEmployee(Set employee) {
		this.employee = employee;
	}
	
}
