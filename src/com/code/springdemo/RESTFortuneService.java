package com.code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	private String[] data = new String[]{
			"GET request",
			"POST request",
			"PUT request",
			"DELETE request"
	};
	
	Random rand = new Random();
	
	@Override
	public String getFortune() {
		int index = rand.nextInt(data.length);
		
		return data[index];
	}

}
