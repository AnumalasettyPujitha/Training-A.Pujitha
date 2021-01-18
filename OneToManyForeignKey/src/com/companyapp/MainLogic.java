package com.companyapp;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.companyapp.Employee;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		
		Department dept1=new Department();
		dept1.setDept_id(4);
		dept1.setDepartmentName("ECE");
		
		Employee emp=new Employee();
		
		emp.setEmpId(101);
		emp.setName("Kamala");
		emp.setSal(21500);
		
		Employee emp1=new Employee();
		
		emp1.setEmpId(102);
		emp1.setName("Kiran");
		emp1.setSal(21000);
		
		Set<Employee> set=new HashSet<Employee>();
		set.add(emp);
		set.add(emp1);
		
		dept1.setEmployee(set);
		
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		se.save(dept1);
		tx.commit();
	}

}
