package com.tender;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class DeletePWDBean {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public boolean deletePWD(int id) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Query qr=se.createQuery("delete from CreatePWDBean cpb where id=:id");
		qr.setParameter("id",id);
		int x=qr.executeUpdate();
		tx.commit();
		if(x!=0)
			return true;
		else
			return false;
	}
}
