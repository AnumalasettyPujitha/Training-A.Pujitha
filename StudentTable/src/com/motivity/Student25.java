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
				Transaction tx=se.beginTransaction();
				Student x=(Student)se.load(Student.class, 1020);
				System.out.println(x.getId()+" "+x.getName()+" "+x.getMarks());
				x.setMarks(490);
				se.update(x);
				tx.commit();
				se.close();
				sf.close();

	}

}
