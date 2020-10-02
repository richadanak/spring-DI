/**
 * 
 */
package com.luv2code.springdemo;

/**
 * @author Samir
 *
 */
public class trackcoach implements coach {
 private fortuneservice fortuneservice;
  
 public trackcoach() {
	 
 }
 
	public trackcoach(com.luv2code.springdemo.fortuneservice fortuneservice) {
	this.fortuneservice = fortuneservice;
}

	@Override
	public String getdailyworkout() {
		// TODO Auto-generated method stub
		return "run a hard 5k";
	}

	@Override
	public String getdailyfortune() {
	
		return "just do it: "+fortuneservice.getfortune();
	}
	
	// add an init method
	public void domywork() {
		System.out.println("init method");
	}
	
	// add a destroy method
	public void dontdomywork() {
		System.out.println("destroy method");
	}
	   

}
