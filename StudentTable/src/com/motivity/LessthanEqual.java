package com.motivity;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class LessthanEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Criteria crt=se.createCriteria(Student.class);
		Criterion cn=Restrictions.le("marks", 430);
		crt.add(cn);
		List li=crt.list();
		Iterator i=li.iterator();
		while(i.hasNext()) {
			Student s=(Student)i.next();
			System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
		}
		se.close();
		sf.close();
	}

}
