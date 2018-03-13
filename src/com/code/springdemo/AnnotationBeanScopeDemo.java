package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {
	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach Bob = context.getBean("tennisCoach", Coach.class);
		Coach Tom = context.getBean("tennisCoach", Coach.class);
		
		// compare bean in singleton scope
		System.out.println("Compare Tom and Bob " + (Bob == Tom));
	
		// close context
		context.close();
	}
}
