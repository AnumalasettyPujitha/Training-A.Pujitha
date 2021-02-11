package com.employee;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Functions {
	
	static Session se;
	public static Session getSession() {
	ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
	EmployeeDao dao=(EmployeeDao) context.getBean("dao");
	SessionFactory sf=(SessionFactory)context.getBean("sessionfactory");
	se=sf.openSession();
	return se;
	}
	
	public static void saveEmployee(Employee e) {
		se.save(e);
	}
	
	public static int updateEmployeeById(int id,int esal) {
		String q="update Employee e set e.esal="+esal+"where e.eid="+id;
		Query qr=se.createQuery(q);
		int x=qr.executeUpdate();
		return x;
	}
	
	public static int deleteEmployeeById(int id) {
		String q="delete from Employee e where e.eid="+id;
		Query qr=se.createQuery(q);
		int x=qr.executeUpdate();
		return x;
	}
	
	public static int deleteEmployee() {
		String q="delete * from Employee";
		Query qr=se.createQuery(q);
		int x=qr.executeUpdate();
		return x;
	}
	
	public static List getEmployeeById(int id) {
		String q="from Employee e where e.eid="+id;
		Query qr=se.createQuery(q);
		List li=qr.getResultList();
		return li;
	}
	
	public static List<Employee> getAllEmployees(){
		String q="from Employee e";
		Query qr=se.createQuery(q);
		List li=qr.getResultList();
		return li;
	}
}
