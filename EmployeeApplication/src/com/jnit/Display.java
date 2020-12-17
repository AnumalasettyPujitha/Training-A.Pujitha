package com.jnit;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Display {
	public static void display() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1.display all records 2.display particular record");
		int choice=sc.nextInt();
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		if(choice==1) {
			Query qr=se.createQuery("from Employee emp");
			List<Employee> list=qr.list();
			Iterator it=list.iterator();
			while(it.hasNext()) {
				Employee emp=(Employee) it.next();
				System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSal()+" "+emp.getDepartment()+" "+emp.getExperience());
			}
		}
		if(choice==2) {
			System.out.println("Enter id to show details");
			Query qr=se.createQuery("from Employee emp where id=:eid");
			qr.setParameter("eid",sc.nextInt());
			List<Employee> list=qr.list();
			Iterator it=list.iterator();
			while(it.hasNext()) {
				Employee emp=(Employee) it.next();
				System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSal()+" "+emp.getDepartment()+emp.getExperience());
			}
		}
	}
}
