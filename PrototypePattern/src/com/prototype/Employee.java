package com.prototype;

public class Employee implements Prototype{
	private int eid;
	private String ename;
	private int esal;
	public Employee(int eid, String ename, int esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	public void showRecord() {
		System.out.println(eid+"\t"+ename+"\t"+esal);
	}
	@Override
	public Prototype getClone() {
		// TODO Auto-generated method stub
		return new Employee(eid,ename,esal);
	}
}
