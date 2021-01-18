package com.companyapp;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	@Id
	@Column(name="dept_id")
	private int dept_id;
	
	@Column(name="dept_name")
	private String departmentName;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="department_id",referencedColumnName="dept_id")
	private Set<Employee> employees;
		
	public Set<Employee> getEmployee() {
		return employees;
	}

	public void setEmployee(Set<Employee> employee) {
		this.employees = employee;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	
}
