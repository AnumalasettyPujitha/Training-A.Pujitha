package com.ex.maven_hibernate;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class EmployeeDaoImp implements EmployeeDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	@Transactional
	public String insertEmployee(Employee emp) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(emp);
		return "done";
	}

	@Override
	@Transactional
	public Employee searchEmployee(int id) {
		// TODO Auto-generated method stub
		Employee emp=hibernateTemplate.get(Employee.class, id);
		return emp;
	}


	@Transactional
	public String updateEmployee(Employee emp) {
		// TODO Auto-generated method stub

	hibernateTemplate.update(emp);
	return "Updated";

	}

	@Override
	@Transactional
	public String deleteEmployee(int eid) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setEid(eid);
		hibernateTemplate.delete(emp);
		return "Deleted";
	}


}
