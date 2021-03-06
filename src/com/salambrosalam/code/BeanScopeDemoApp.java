package com.salambrosalam.code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");	
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alpha = context.getBean("myCoach", Coach.class);
		//check is this bean are the same or not
		
		boolean result = (theCoach == alpha);
		
		System.out.println("Pointing to the same object " + result);
		
		System.out.println("/nMemory address for theCoach " + theCoach);
		
		System.out.println("/nMemory address for alphacoach " + alpha);
		
		//context close
		context.close();
	}

}
