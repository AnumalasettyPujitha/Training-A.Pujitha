package com.jnit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Config {
	public static Session config() {
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		/*Resource r=new ClassPathResource("context.xml");
		BeanFactory factory=new XmlBeanFactory(r);*/
		
		//EmployeeDao dao=(EmployeeDao)factory.getBean("dao");
		EmployeeDao dao=(EmployeeDao) context.getBean("dao");
		SessionFactory sf=(SessionFactory)context.getBean("sessionfactory");
		Session se=sf.openSession();
		return se;
	}
}
