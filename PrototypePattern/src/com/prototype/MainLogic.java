package com.prototype;
import java.util.Scanner;

public class MainLogic {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter employye id:");
	int eid=sc.nextInt();
	System.out.println("enter employee name");
	String ename=sc.next();
	System.out.println("Enter salary");
	int esal=sc.nextInt();
	Employee e=new Employee(eid,ename,esal);
	e.showRecord();
	Employee e1=(Employee) e.getClone();
	e1.showRecord();
	}
}
