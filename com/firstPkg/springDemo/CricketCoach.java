package com.firstPkg.springDemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("Cricket Coach: no-arg Constructor");
	}
	
	//setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach - Inside setter method : setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practise fast bowling 15 mints. a day.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
