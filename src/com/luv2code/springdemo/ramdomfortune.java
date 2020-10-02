package com.luv2code.springdemo;

import java.util.Random;

public class ramdomfortune implements fortuneservice {
	public String[] data ={"today is lucky day","tomm will be lucky day","yesterday was luck day"};
// random output on the run time
	public Random r=new Random();
	@Override
	public String getfortune() {
		 int i= r.nextInt(data.length);
		 String s= data[i];
		return s;
	}

}
