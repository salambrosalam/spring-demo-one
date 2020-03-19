package com.salambrosalam.code;

public class BaseballCoach implements Coach {
	
	
	//create a private fields for dependency
	private FortuneService mFortuneService;
	
	
	public  BaseballCoach(FortuneService mFortuneService ) {
		this.mFortuneService = mFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Spending 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return mFortuneService.getFortune();
	}

}
