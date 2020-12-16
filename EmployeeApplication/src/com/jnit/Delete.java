package com.jnit;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Delete {
	public static void delete() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1.delete all records 2.delete particular record");
		int choice=sc.nextInt();
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		if(choice==1) {
			Transaction tx=se.beginTransaction();
			Query qr=se.createQuery("delete from Employee emp");
			qr.executeUpdate();
			tx.commit();
			}
		if(choice==2) {
			Transaction tx=se.beginTransaction();
			System.out.println("enter your id");
			Query qr=se.createQuery("delete from Employee where id=:eid");
			qr.setParameter("eid", sc.nextInt());
			qr.executeUpdate();
			tx.commit();
		}
	}
}

