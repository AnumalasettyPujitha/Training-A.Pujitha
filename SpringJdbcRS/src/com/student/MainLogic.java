package com.student;


import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext ctx=new ClassPathXmlApplicationContext("student.xml");  
	      
		    StudentDao dao=(StudentDao)ctx.getBean("sdao"); 
		    System.out.println("======list of students=====");
		    List<Student> list=dao.getAllStudents();
		    Iterator it=list.iterator();
		    while(it.hasNext()) {
		    	Student s=(Student)it.next();
		    	System.out.println(s.getId()+" "+s.getName()+" "+s.getAge());
		    }
	}

}
