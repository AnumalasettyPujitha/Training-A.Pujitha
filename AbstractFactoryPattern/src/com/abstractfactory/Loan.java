package com.abstractfactory;

public abstract class Loan {
	protected double rate;
	abstract void getInterestRate(double rate);
}
