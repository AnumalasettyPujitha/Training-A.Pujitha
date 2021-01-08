package com.tender;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class AcceptStatusBean {
	int bid;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}
	public boolean updateStatus(int bid) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Query qr=se.createQuery("update ApplyBuilder ab set ab.status=:status where ab.bid=:bid");
		qr.setParameter("status", "Accepted");
		qr.setParameter("bid",bid);
		int x=qr.executeUpdate();
		tx.commit();
		if(x!=0)
			return true;
		else
			return false;
	}
}
