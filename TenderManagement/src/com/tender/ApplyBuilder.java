package com.tender;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ApplyBuilder {
	private String bname,cname,email,password,status;
	private int bid;
	private long mobile;
	
	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public boolean registerValidate(String bname,String cname,String email,String password,long mobile) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		ApplyBuilder st=new ApplyBuilder();
		st.setBname(bname);
		st.setCname(cname);
		st.setEmail(email);
		st.setPassword(password);
		st.setMobile(mobile);
		se.save(st);
		tx.commit();

		if(st!=null) {
			System.out.println("record inserted");
			return true;
		}
		else
			return false;
		
	}
	
}
