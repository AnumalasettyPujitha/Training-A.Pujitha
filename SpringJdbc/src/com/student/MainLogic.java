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
		    Student s=new Student();
		    s.setId(107);
		    s.setName("kali");
		    s.setAge(30);
		    int status=dao.saveStudent(s); //107 record inserted 
		    System.out.println(status);
		    
		    List<Student> list=dao.getAllStudents();//list of all students
		    Iterator it=list.iterator();
		    while(it.hasNext()) {
		    	System.out.println(it.next());
		    }
		    
		    status=dao.updateStudent(107, 25);
		    System.out.println(status);//107 record updated with age 25
		    
		    status=dao.deleteStudent(104);//104 is deleted
		    
		    if(status!=0) {
		    list=dao.getAllStudents();
		    it=list.iterator();
		    while(it.hasNext()) {
		    	System.out.println(it.next());
		    }
		   }
	}

}
