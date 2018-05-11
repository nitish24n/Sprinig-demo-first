package com.firstPkg.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//Retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//check if the above two are same bean
		boolean result = (theCoach == alphaCoach);
		
		//print out the results
		System.out.println("\nPointing out to the same object : "+result);
		
		System.out.println("\nMemory loacation for theCoach : "+theCoach);
		
		System.out.println("\nMemory loacation for alphaCoach : "+alphaCoach);
		
		//close the context
		context.close();
	}

}
