package com.ex.maven_hibernate;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext cont=new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDao dao=(EmployeeDao) cont.getBean("dao");
		int option;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1.Insertion 2.Display 3.Update 4.Delete 5.Exit");
			option=sc.nextInt();
			switch(option)
			{
			case 1:
			{
				System.out.println("Enter id");
				int id=sc.nextInt();
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("Enter salary");
				int sal=sc.nextInt();
				Employee emp=new Employee();
				emp.setEid(id);
				emp.setEname(name);
				emp.setEsal(sal);
				System.out.println(dao.insertEmployee(emp));
				break;
			}
			case 2:
			{
				System.out.println("Enter id of employee");
				int id=sc.nextInt();
				Employee emp=dao.searchEmployee(id);
				System.out.println(emp.getEid()+"-"+emp.getEname()+"-"+emp.getEsal());
				break;
			}
			case 3:
			{
				System.out.println("Enter id you want to update");
				int id=sc.nextInt();

			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("enter salary");
			int sal=sc.nextInt();
			Employee bean=new Employee();
			bean.setEid(id);
			bean.setEname(name);
			bean.setEsal(sal);
			System.out.println(dao.updateEmployee(bean));
			break;
			}
			case 4:
			{
				System.out.println("Enter id");
				int i=sc.nextInt();
				System.out.println(dao.deleteEmployee(i));
			}
			}	
		}while(option!=5);
		
	}

}
