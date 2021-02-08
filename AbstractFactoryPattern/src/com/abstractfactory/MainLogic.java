package com.abstractfactory;

import java.util.Scanner;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter bankname where you want to take loan");
		String bankname=sc.next();
		System.out.println("enter loan type like home loan or education loan");
		String loan=sc.next();
		AbstractFactory bankFactory = CreateFactory.getFactory("Bank");  
		Bank b=bankFactory.getBank(bankname);  
		    
		System.out.println("Enter the interest rate for "+b.getBankName()+ ": ");  
		  
		double rate=sc.nextDouble();
		System.out.println("you have taken loan of type "+loan+" from "+b.getBankName()+" with interest rate "+rate);
	}

}
