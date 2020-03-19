 package com.salambrosalam.code;

public class TrackCoach implements Coach {
	
	//create a private fields for dependency
		private FortuneService mFortuneService;

	//	
		
		
	@Override
	public String getDailyWorkout(){
		
		return "Hard Work";
	}

	public TrackCoach(FortuneService mFortuneService) {
		this.mFortuneService = mFortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It" +  mFortuneService.getFortune();
	}
	//get an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	//add a destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCOach: inside mathod doMyCleanupStuffYoYo");
	}
}
  