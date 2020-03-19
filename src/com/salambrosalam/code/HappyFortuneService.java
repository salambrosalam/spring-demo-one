package com.salambrosalam.code;

public class HappyFortuneService implements FortuneService {
	
	@Override
	public String getFortune() {
		
		return "Today is your lucky day";
		
	}

	@Override
	public String getFortune(String d) {
		// TODO Auto-generated method stub
		return d;
	}
}
