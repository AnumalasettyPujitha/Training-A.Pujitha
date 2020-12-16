package com.jnit;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {
	public static void insert() {
		Scanner sc=new Scanner(System.in);
		String choice;
		do {
			System.out.println("Enter employee details(eid,ename,esal,department,experience)");
			Configuration cf=new Configuration();
			cf.configure("configuration.xml");
			SessionFactory sf=cf.buildSessionFactory();
			Session se=sf.openSession();
			Employee emp=new Employee();
			Transaction tx=se.beginTransaction();
			emp.setId(sc.nextInt());
			emp.setName(sc.next());
			emp.setSal(sc.nextInt());
			emp.setDepartment(sc.next());
			emp.setExperience(sc.nextInt());
			se.save(emp);
			tx.commit();
			System.out.println("Do you want to continue (y/n)");
			choice=sc.next();
		}while(choice.equals("y"));
	}
}
