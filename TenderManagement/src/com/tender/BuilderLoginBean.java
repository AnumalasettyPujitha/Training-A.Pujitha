package com.tender;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class BuilderLoginBean {
	private String email,password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public ApplyBuilder loginValidate(String email,String password) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		ApplyBuilder ab=new ApplyBuilder();
		Query qr=se.createQuery("from ApplyBuilder ab where (ab.email=:email AND ab.password=:password)");
		qr.setParameter("email", email);
		qr.setParameter("password",password);
		List<ApplyBuilder> list=qr.list();
		Iterator it=list.iterator();
		while(it.hasNext()) {
			ab=(ApplyBuilder)it.next();
		}
		tx.commit();
		return ab;
	}
	public List<ApplyBuilder> viewBuilder(){
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		ApplyBuilder ab=new ApplyBuilder();
		Query qr=se.createQuery("from ApplyBuilder ab");
		List<ApplyBuilder> list=qr.list();
		ArrayList<ApplyBuilder> al=new ArrayList<>();
		Iterator it=list.iterator();
		while(it.hasNext()) {
			ab=(ApplyBuilder)it.next();
			al.add(ab);
		}
		tx.commit();
		return al;
	}
}
