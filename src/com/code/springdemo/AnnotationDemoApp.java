package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
//		Coach myCoach = context.getBean("skiingCoach", Coach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
//		System.out.println(myCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());
//		System.out.println(myCoach.getDailyFortune());
		 
		// close the context
		context.close();
	}
}
