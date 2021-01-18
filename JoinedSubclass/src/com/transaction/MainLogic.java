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
		CreditCard cc=new CreditCard();
		cc.setPayment_id(1011);
		cc.setAmount(10000);
		cc.setCard_number(12345);
		cc.setCard_type("Rupay");
		
		se.save(cc);
		
		tx.commit();
		se.close();
	}

}
