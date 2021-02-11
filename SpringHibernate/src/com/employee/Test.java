package com.employee;

import java.util.Iterator;
import java.util.List;

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
		
		Session se=Functions.getSession();
		Transaction tx=se.beginTransaction();
		Employee e=new Employee();
		e.setEid(105);
		e.setEname("Bhaskar");
		e.setEsal(23000);
		//Functions.saveEmployee(e);
		
		int x=Functions.updateEmployeeById(105, 24000);
		System.out.println(x);
		
		x=Functions.deleteEmployeeById(104);
		System.out.println(x);
		
		List li=Functions.getEmployeeById(101);
		Iterator it=li.iterator();
		while(it.hasNext()) {
			e=(Employee)it.next();
			System.out.println(e.getEid()+" "+e.getEname()+" "+e.getEsal());
		}
		
		li=Functions.getAllEmployees();
		it=li.iterator();
		while(it.hasNext()) {
			e=(Employee)it.next();
			System.out.println(e.getEid()+" "+e.getEname()+" "+e.getEsal());
		}
		tx.commit();
		
	}

}
