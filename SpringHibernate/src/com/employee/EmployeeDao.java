package com.employee;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class EmployeeDao {
	HibernateTemplate template;
	public void setTemplate(HibernateTemplate ht) {
		this.template=ht;
	}
	
}
