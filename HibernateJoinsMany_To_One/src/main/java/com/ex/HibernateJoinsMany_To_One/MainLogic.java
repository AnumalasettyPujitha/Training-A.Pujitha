package com.ex.HibernateJoinsMany_To_One;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLogic {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Object o = applicationContext.getBean(InsertRecords.class);
		InsertRecords ir = (InsertRecords) o;
		ir.insert();
	}
}
