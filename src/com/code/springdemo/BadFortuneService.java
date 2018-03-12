package com.code.springdemo;

import org.springframework.stereotype.Component;

//@Component
public class BadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "bad luck day";
	}


}
