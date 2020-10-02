package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class practicehellospringapp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c= new ClassPathXmlApplicationContext("application.xml");
		golfcoach g =c.getBean("mygolf",golfcoach.class);
		System.out.println(g.getdailyfortune());
		System.out.println(g.getdailyworkout());
		c.close();
	}

}
        