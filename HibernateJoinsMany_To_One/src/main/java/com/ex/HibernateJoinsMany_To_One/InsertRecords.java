package com.ex.HibernateJoinsMany_To_One;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class InsertRecords {
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void insert() {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		Vendor v1 = new Vendor();
		v1.setVendor_id(101);
		v1.setVendor_name("Snapdeal");
		
		Vendor v2 = new Vendor();
		v2.setVendor_id(102);
		v2.setVendor_name("Amazon");
		
		Customer c1 = new Customer();
		c1.setCname("Ramesh");
		c1.setVendor(v1);

		Customer c2 = new Customer();
		c2.setCname("Lalli");
		c2.setVendor(v1);
		
		/*Customer c3 = new Customer();
		c3.setCname("Ramu");*/
		

		
		
		
		Object obj1=session.save(c1);
		Object obj2 = session.save(c2);
		tx.commit();
		session.close();
		/*if(obj1!=null && obj2!=null)
			System.out.println("inserted");*/
	}
}
