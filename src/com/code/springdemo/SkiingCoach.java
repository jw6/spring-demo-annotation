package com.code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SkiingCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public SkiingCoach(
			@Qualifier("RESTFortuneService")
			FortuneService fortuneService) {
		System.out.println("Testing from REST");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Skiing practice today";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}
}
