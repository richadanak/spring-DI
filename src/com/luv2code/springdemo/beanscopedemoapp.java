package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
     
public class beanscopedemoapp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c= new ClassPathXmlApplicationContext("applicationcontext2.xml");
		coach co= c.getBean("mycoachid",coach.class);
		coach cd= c.getBean("mycoachid",coach.class);
		// check if this two beans are same
		Boolean r=(co==cd);
		System.out.println("pointing to the same obj "+r);
		System.out.println("memory location for the co"+co);
		System.out.println("memory location for the cd"+cd);
		c.close();
	}

}
