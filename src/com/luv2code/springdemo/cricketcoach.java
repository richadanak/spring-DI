package com.luv2code.springdemo;

public class cricketcoach implements coach {
 public fortuneservice f;
 public String emailadd;
 public String team;
 
 
 // create a no-arg constructor
 public cricketcoach() {
 System.out.println("cricket coach constructor");
 
}
 //setter method for injection
 
 public void setF(fortuneservice f) {
	 System.out.println("cricket coach setter method");
		this.f = f;
	}
 
 
	public String getTeam() {
	return team;
}

public void setTeam(String team) {
	System.out.println("set team");
	this.team = team;
}

public void setEmailadd(String emailadd) {
	System.out.println("set email add");
	this.emailadd = emailadd;
}

	@Override
	public String getdailyworkout() {
	
		return "practise fast bowling";
	}

	


	@Override
	public String getdailyfortune() {
	
		return f.getfortune();
	}

	public String getemailadd() {
		// TODO Auto-generated method stub
		return emailadd;
	}

}
