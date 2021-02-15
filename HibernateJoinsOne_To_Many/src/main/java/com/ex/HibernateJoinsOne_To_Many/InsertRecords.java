package com.ex.HibernateJoinsOne_To_Many;

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
		
		Customer c1 = new Customer();
		c1.setCname("Ramesh");
		

		Customer c2 = new Customer();
		c2.setCname("Lalli");
		
		Customer c3 = new Customer();
		c3.setCname("Ramu");
		

		Set<Customer> s1 = new HashSet<Customer>();
		s1.add(c1);
		s1.add(c2);
		
		Set<Customer> s2 = new HashSet<Customer>();
		s2.add(c3);
		

		Vendor v1 = new Vendor();
		v1.setVendor_id(101);
		v1.setVendor_name("Snapdeal");
		v1.setCustomers(s1);
		
		Vendor v2 = new Vendor();
		v2.setVendor_id(102);
		v2.setVendor_name("Amazon");
		v2.setCustomers(s2);
		
		Object obj1=session.save(v1);
		Object obj2 = session.save(v2);
		tx.commit();
		session.close();
		if(obj1!=null && obj2!=null)
			System.out.println("inserted");
	}
}
