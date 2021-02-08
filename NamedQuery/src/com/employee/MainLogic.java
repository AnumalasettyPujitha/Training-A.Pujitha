package com.employee;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 Resource r=new ClassPathResource("configuration.xml");  
		    BeanFactory factory=new XmlBeanFactory(r);  
		      
		    EmployeeDao dao=(EmployeeDao)factory.getBean("edao");  
		    //dao.save(new Employee(1,"carona",25000));
		    List<Employee> li=dao.getAllEmployees(1);
		    Iterator it=li.iterator();
		    while(it.hasNext()) {
		    	Employee e=(Employee)it.next();
		    	System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		    }
	}

}
