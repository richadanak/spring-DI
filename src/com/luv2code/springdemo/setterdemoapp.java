package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterdemoapp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext c= new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		//retrieve th bean from spring container
		cricketcoach co= c.getBean("mycricket",cricketcoach.class);
		//call methods on the bean
		System.out.println(co.getdailyfortune());
		System.out.println(co.getdailyworkout());
		System.out.println(co.getemailadd());
		System.out.println(co.getTeam());
		   
      c.close();
	}

}
