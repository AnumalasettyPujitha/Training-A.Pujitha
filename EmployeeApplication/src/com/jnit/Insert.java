package com.jnit;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Insert {
	public static void insert() {
		Scanner sc=new Scanner(System.in);
		Session se=Config.config();
		String choice;
		do {
			System.out.println("Enter employee details(eid,ename,esal,department,experience)");
			Employee emp=new Employee();
			Transaction tx=se.beginTransaction();
			emp.setId(sc.nextInt());
			emp.setName(sc.next());
			emp.setSal(sc.nextInt());
			emp.setDepartment(sc.next());
			emp.setExperience(sc.nextInt());
			Object s=se.save(emp);
			if(s!=null)
				System.out.println("Record inserted");
			tx.commit();
			System.out.println("Do you want to continue (y/n)");
			choice=sc.next();
		}while(choice.equals("y"));
	}
}
