package com.tender;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class CreatePWDBean {
	private int id;
	private long mobile;
	private String name,email,password,construction_type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public String getConstruction_type() {
		return construction_type;
	}
	public void setConstruction_type(String construction_type) {
		this.construction_type = construction_type;
	}
	public boolean registerValidate(String name,String password,String construction_type) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		CreatePWDBean cpb=new CreatePWDBean();
		cpb.setName(name);
		cpb.setPassword(password);
		cpb.setConstruction_type(construction_type);
		se.save(cpb);
		tx.commit();

		if(cpb!=null) {
			System.out.println("record inserted");
			return true;
		}
		else
			return false;
	}
	public List<CreatePWDBean> viewPWD(){
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		CreatePWDBean cpb=new CreatePWDBean();
		Query qr=se.createQuery("from CreatePWDBean cpb");
		List<ApplyBuilder> list=qr.list();
		ArrayList<CreatePWDBean> al=new ArrayList<>();
		Iterator it=list.iterator();
		while(it.hasNext()) {
			cpb=(CreatePWDBean)it.next();
			al.add(cpb);
		}
		tx.commit();
		return al;
	}
}
