package com.manytomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		
		Project p1=new Project();
		p1.setProject_id(1);
		p1.setProject_title("Tender Management");
		
		Project p2=new Project();
		p2.setProject_id(2);
		p2.setProject_title("Smart Society");
		
		Employee emp1=new Employee();
		emp1.setEmp_id(101);
		emp1.setEmp_name("Raju");
		emp1.setEmp_department("IT");
		
		Set set=new HashSet();
		set.add(p1);
		set.add(p2);
		emp1.setProject(set);
		
		Employee emp2=new Employee();
		emp2.setEmp_id(102);
		emp2.setEmp_name("Rama");
		emp2.setEmp_department("Testing");
		emp2.setProject(set);
		
		se.save(emp1);
		se.save(emp2);
		tx.commit();
	}

}
