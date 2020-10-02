package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class hellospringapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		coach thecoach=context.getBean("mycoachid",coach.class);
		//baseballcoach thecoach2=context.getBean("mycoachid1",baseballcoach.class);
		
		//call methods on the bean
		System.out.println(thecoach.getdailyworkout());
		//System.out.println(thecoach2.getdailyworkout());
		
		
		
		// lets call our new method  for fortunes
		System.out.println(thecoach.getdailyfortune());
		
		//close the context
		context.close();
	}

}
