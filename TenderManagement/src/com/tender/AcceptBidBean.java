package com.tender;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class AcceptBidBean {
	public boolean updateStatus(int bid) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Query qr=se.createQuery("update SubmitTender st set st.status=:status where st.bid_id=:bid_id");
		qr.setParameter("status", "Accepted");
		qr.setParameter("bid_id",bid);
		int x=qr.executeUpdate();
		tx.commit();
		if(x!=0)
			return true;
		else
			return false;
	}
	public boolean updateStatus(int bid,int tid) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		Query qr=se.createQuery("update SubmitTender st set st.status=:status where(st.bid_id!=:bid_id AND st.tid=:tid)");
		qr.setParameter("status", "Rejected");
		qr.setParameter("bid_id",bid);
		qr.setParameter("tid", tid);
		int x=qr.executeUpdate();
		tx.commit();
		if(x!=0)
			return true;
		else
			return false;
	}

}
