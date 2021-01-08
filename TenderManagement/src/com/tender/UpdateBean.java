package com.tender;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class UpdateBean {
	public boolean update(int id,String email,long mobile) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Query qr=se.createQuery("update CreatePWDBean cpb set cpb.email=:email,cpb.mobile=:mobile where cpb.id=:id");
		qr.setParameter("email",email);
		qr.setParameter("mobile",mobile);
		qr.setParameter("id",id);
		int x=qr.executeUpdate();
		tx.commit();
		if(x!=0)
			return true;
		else
			return false;
	}
}
