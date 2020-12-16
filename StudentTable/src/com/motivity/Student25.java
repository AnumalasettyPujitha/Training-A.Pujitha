package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Student25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Configuration cf=new Configuration();
				cf.configure("configuration.xml");
				SessionFactory sf=cf.buildSessionFactory();
				Session se=sf.openSession();
				Student puja=new Student();
				puja.setId(1023);
				puja.setName("bhanu");
				puja.setMarks(490);
				Transaction tx=se.beginTransaction();
				se.save(puja);
				tx.commit();
				se.close();
				sf.close();

	}

}
