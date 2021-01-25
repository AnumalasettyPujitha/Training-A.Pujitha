package com.companyapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.companyapp.Employee;

public class LeftJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		
		Department dept1=new Department();
		dept1.setDept_id(4);
		dept1.setDepartmentName("ECE");
		
		Employee emp=new Employee();
		
		emp.setEmpId(101);
		emp.setName("Kamala");
		emp.setSal(21500);
		
		Employee emp1=new Employee();
		
		emp1.setEmpId(102);
		emp1.setName("Kiran");
		emp1.setSal(21000);
		
		Employee emp3=new Employee();
		
		emp3.setEmpId(103);
		emp3.setName("Kajal");
		emp3.setSal(21000);
		
		Set<Employee> set=new HashSet<Employee>();
		set.add(emp);
		set.add(emp1);
		
		dept1.setEmployee(set);
		
		Department dept2=new Department();
		dept2.setDept_id(5);
		dept2.setDepartmentName("CSE");
		
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		se.save(dept1);
		se.save(dept2);
		se.save(emp3);
		tx.commit();
		Query qr=se.createQuery("select d.departmentName,e.name from Department d LEFT JOIN d.employees e");
		List<Object[]> list = qr.list();
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Object rows[] = (Object[])it.next();
			System.out.println(rows[0]+ " -- " +rows[1]);
		}
	}

}
