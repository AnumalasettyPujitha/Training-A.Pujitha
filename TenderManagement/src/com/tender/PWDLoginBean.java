package com.tender;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class PWDLoginBean {
	private int id;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public CreatePWDBean loginValidate(int id,String password) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		CreatePWDBean cpb=new CreatePWDBean();
		Query qr=se.createQuery("from CreatePWDBean cpb where(cpb.id=:id AND cpb.password=:password)");
		qr.setParameter("id", id);
		qr.setParameter("password",password);
		List<CreatePWDBean> list=qr.list();
		Iterator it=list.iterator();
		while(it.hasNext()) {
			cpb=(CreatePWDBean)it.next();
		}
		tx.commit();
		return cpb;
	}
}
