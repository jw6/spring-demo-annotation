package com.code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SkiingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Skiing practice today";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}
