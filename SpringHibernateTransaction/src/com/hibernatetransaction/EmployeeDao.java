package com.hibernatetransaction;

public interface EmployeeDao {
	String insertEmployee(Employee emp);
	Employee searchEmployee(int eid);
	String updateEmployee(Employee emp);
	String deleteEmployee(int eid);
}
