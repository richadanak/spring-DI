package com.luv2code.springdemo; 

public class baseballcoach implements coach{
	// define a private field for the dependency
	private happyfortuneservice fortune;
	
	// define th constructor for dependency injection
    public baseballcoach(happyfortuneservice thefortuneservice) {
    	fortune= thefortuneservice;
    }
	
	public String getdailyworkout() {
		return "spend daily 30 min on batting practice";
	}
	public String getdailyfortune() {
		return fortune.getfortune() ;
	}

	
}
