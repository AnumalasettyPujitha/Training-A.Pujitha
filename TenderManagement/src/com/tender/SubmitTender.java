package com.tender;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class SubmitTender {
	private String builder_name,company_name,tname,construction_type,date,bid_file,path,status;
	private int bid_id,tid,bid_amount;
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getBuilder_name() {
		return builder_name;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getConstruction_type() {
		return construction_type;
	}
	public void setConstruction_type(String construction_type) {
		this.construction_type = construction_type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getBid_id() {
		return bid_id;
	}
	public void setBid_id(int bid_id) {
		this.bid_id = bid_id;
	}
	public int getBid_amount() {
		return bid_amount;
	}
	public void setBid_amount(int bid_amount) {
		this.bid_amount = bid_amount;
	}
	public String getBid_file() {
		return bid_file;
	}
	public void setBid_file(String bid_file) {
		this.bid_file = bid_file;
	}
	public void setBuilder_name(String builder_name) {
		this.builder_name = builder_name;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	
	public boolean registerValidate(String builder_name,String company_name,int tid,String tname,String construction_type,String date,int bid_amount,String bid_file,String path) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		SubmitTender st=new SubmitTender();
		st.setBuilder_name(builder_name);
		st.setCompany_name(company_name);
		st.setTid(tid);
		st.setTname(tname);
		st.setConstruction_type(construction_type);
		st.setDate(date);
		st.setBid_amount(bid_amount);
		st.setBid_file(bid_file);
		st.setPath(path);
		se.save(st);
		tx.commit();

		if(st!=null) {
			System.out.println("record inserted");
			return true;
		}
		else
			return false;
		
	}
	public List<SubmitTender> view(){
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		SubmitTender st=new SubmitTender();
		Query qr=se.createQuery("from SubmitTender st");
		List<SubmitTender> list=qr.list();
		ArrayList<SubmitTender> al=new ArrayList<>();
		Iterator it=list.iterator();
		while(it.hasNext()) {
			st=(SubmitTender)it.next();
			al.add(st);
		}
		tx.commit();
		return al;
	}
	public List<SubmitTender> view(String construction_type){
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		SubmitTender st=new SubmitTender();
		Query qr=se.createQuery("from SubmitTender st where st.construction_type=:construct");
		qr.setParameter("construct", construction_type);
		List<SubmitTender> list=qr.list();
		ArrayList<SubmitTender> al=new ArrayList<>();
		Iterator it=list.iterator();
		while(it.hasNext()) {
			st=(SubmitTender)it.next();
			al.add(st);
		}
		tx.commit();
		return al;
	}

}

