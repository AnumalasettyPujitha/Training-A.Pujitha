package com.transaction;

public class Cheque extends Payment{
	private String cheque_type;
	private int cheque_no;
	public String getCheque_type() {
		return cheque_type;
	}
	public void setCheque_type(String cheque_type) {
		this.cheque_type = cheque_type;
	}
	public int getCheque_no() {
		return cheque_no;
	}
	public void setCheque_no(int cheque_no) {
		this.cheque_no = cheque_no;
	}
	
}
