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
		    s.setId(118);
		    s.setName("kaveri");
		    s.setAge(28);
		    Boolean status=dao.saveStudent(s); //118 record inserted 
		    System.out.println(status);
		    
		    status=dao.updateStudent(118, 27);
		    System.out.println(status);//118 record updated with age 27
		    
		    System.out.println("=====list of students after addition and updation====");
		    List<Student> list=dao.getAllStudents();//list of all students
		    Iterator it=list.iterator();
		    while(it.hasNext()) {
		    	System.out.println(it.next());
		    }
		    
		   
		    
		    status=dao.deleteStudent(117);//117 is deleted
		    
		    System.out.println("=====list of students after deletion====");
		    if(status==false) {
		    list=dao.getAllStudents();
		    it=list.iterator();
		    while(it.hasNext()) {
		    	System.out.println(it.next());
		    }
		   }
	}

}
