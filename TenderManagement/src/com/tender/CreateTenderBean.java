package com.tender;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class CreateTenderBean {
	private int tid,amount;
	private String tname,starting_date,closing_date,construction_type;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getStarting_date() {
		return starting_date;
	}
	public void setStarting_date(String starting_date) {
		this.starting_date = starting_date;
	}
	public String getClosing_date() {
		return closing_date;
	}
	public void setClosing_date(String closing_date) {
		this.closing_date = closing_date;
	}
	public String getConstruction_type() {
		return construction_type;
	}
	public void setConstruction_type(String construction_type) {
		this.construction_type = construction_type;
	}
	
	public boolean createTender(String tname,String starting_date,String closing_date,String construction_type,int amount) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		CreateTenderBean ctb=new CreateTenderBean();
		ctb.setTname(tname);
		ctb.setStarting_date(starting_date);
		ctb.setClosing_date(closing_date);
		ctb.setConstruction_type(construction_type);
		ctb.setAmount(amount);
		se.save(ctb);
		tx.commit();

		if(ctb!=null) {
			System.out.println("record inserted");
			return true;
		}
		else
			return false;
	}
	public List<CreateTenderBean> view(){
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		CreateTenderBean ctb=new CreateTenderBean();
		Query qr=se.createQuery("from CreateTenderBean ctb");
		List<CreateTenderBean> list=qr.list();
		ArrayList<CreateTenderBean> al=new ArrayList<>();
		Iterator it=list.iterator();
		while(it.hasNext()) {
			ctb=(CreateTenderBean)it.next();
			al.add(ctb);
		}
		tx.commit();
		return al;
	}

}
