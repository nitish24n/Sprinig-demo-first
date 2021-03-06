package com.firstPkg.springDemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it "+fortuneService.getFortune();
	}
	
	//add an init method 
	public void doMyStartupStuff() {
		System.out.println("TrackCoach : inside doMyStartupStuff method");
	}
	
	//add destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach : inside doMyCleanupStuffYoYo method");
	}
	
	
}
