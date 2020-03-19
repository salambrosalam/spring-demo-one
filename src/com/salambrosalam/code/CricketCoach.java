package com.salambrosalam.code;

import java.util.Random;

public class CricketCoach implements Coach{
	
	private FortuneService mFortuneService;
	//create int array
	String a = "First lucky string";
	String b = "Second lucky string";
	String c = "Third lucky string";
	String d;

	String[] my_array = {a,b,c};
	
	int index;
	
	
	
	Random my_random = new Random();
	
	//create fields for email address and team
	
	private String emailAddress;
	private String team;
	
	
	//create no-arg constructor
	public CricketCoach() {
		System.out.println("this no arg constractor");
	}
	
	
	
	public void setmFortuneService(FortuneService mFortuneService) {
		System.out.println("this is setter method");
		this.mFortuneService = mFortuneService;
	}



	@Override
	public String getDailyWorkout(){
		
		return "Practice fast bowling";
	}
	
	@Override
	public String getDailyFortune() {
		
		index = my_random.nextInt(3);
		d = my_array[index];
		
		
		return mFortuneService.getFortune(d);
	}


	//Setter methods
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: this is setter method (SetEmailAddress)");
		this.emailAddress = emailAddress;
	}



	public void setTeam(String team) {
		System.out.println("CricketCoach: this is setter method (SetTeam)");
		this.team = team;
	}

	//Getter methods

	public String getEmailAddress() {
		return emailAddress;
	}



	public String getTeam() {
		return team;
	}
	
	
	
	

}
