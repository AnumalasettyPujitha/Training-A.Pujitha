package com.jnit;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Update {
	public static void update() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1.update all records 2.update particular record");
		int choice=sc.nextInt();
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		if(choice==1) {
			Transaction tx=se.beginTransaction();
			System.out.println("enter how much salary wanted to add");
			Query qr=se.createQuery("update Employee emp set sal=sal+:sal");
			qr.setParameter("sal", sc.nextInt());
			qr.executeUpdate();
			tx.commit();
			}
		if(choice==2) {
			Transaction tx=se.beginTransaction();
			System.out.println("enter how much salary wanted to add and your id");
			Query qr=se.createQuery("update Employee emp set sal=sal+:esal where id=:eid");
			qr.setParameter("esal", sc.nextInt());
			qr.setParameter("eid", sc.nextInt());
			qr.executeUpdate();
			tx.commit();
		}
	}
}
