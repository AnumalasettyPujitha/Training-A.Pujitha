package com.jnit;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*import jdbcprogram.Delete;
import jdbcprogram.Display;
import jdbcprogram.Insert;
import jdbcprogram.Update;*/

public class EmployeeTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		Employee emp=new Employee();
		tx.commit();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Insert \n2.Display \n3.Update \n4.Delete \n5.Exit");
		int number=0;
		for(;number<=5;) {
			System.out.println("Enter a number between 1 and 5");
			number=sc.nextInt();
			if(number==1)
				Insert.insert();
			else if(number==2)
				Display.display();
			else if(number==3)
				Update.update();
			else if(number==4)
				Delete.delete();
			else if(number==5) {
				System.out.println("exit");
				System.exit(0);
			}
		
	}

	}
}
