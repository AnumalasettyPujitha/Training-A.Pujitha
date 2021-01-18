package com.transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		
		Transaction tx=se.beginTransaction();
		Cheque cq=new Cheque();
		cq.setPayment_id(1012);
		cq.setAmount(15000);
		cq.setCheque_no(102654);
		cq.setCheque_type("ICICI");
		
		se.save(cq);
		
		tx.commit();
		se.close();
	}

}
