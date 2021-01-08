package com.motivity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
				Student s=new Student();
				SimpleDateFormat sdf=new SimpleDateFormat("mm-dd-yyyy");
				String str="02-12-2021";
				try {
					Date date = sdf.parse(str);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				s.setId(1025);
				s.setName("Sai");
				s.setMarks(480);
				se.save(s);
				tx.commit();
				se.close();
				sf.close();

	}

}
