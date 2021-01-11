package com.companyapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.companyapp.Employee;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf=new Configuration();
		SessionFactory sf=cf.configure().addAnnotatedClass(Employee.class).buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		
		Department dept1=new Department();
		dept1.setDepartmentId(3);
		dept1.setDepartmentName("MECH");
		se.save(dept1);
		
		Employee emp=new Employee();
		
		emp.setEmpId(107);
		emp.setName("Sai");
		emp.setSal(21500);
		emp.setDepartment(dept1);
		
		se.save(emp);
		tx.commit();
	}

}
