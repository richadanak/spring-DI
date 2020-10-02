package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanlifecycledemoapp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c= new ClassPathXmlApplicationContext("beanlifecycle-appcontext.xml");
		coach co= c.getBean("mycoachid",coach.class);
		System.out.println(co.getdailyworkout());
		c.close();

	}

}
      