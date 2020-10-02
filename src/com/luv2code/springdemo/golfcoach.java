package com.luv2code.springdemo;

public class golfcoach implements coach {
 public fortuneservice f;
 
	public golfcoach(fortuneservice f) {
	this.f = f;
}

	@Override
	public String getdailyworkout() {
		
		return "practie daily";
	}

	@Override
	public String getdailyfortune() {
		
		return f.getfortune();
	}

}
