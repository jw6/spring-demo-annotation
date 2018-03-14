package com.code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Calling from HappyFortuneService";
	}

	@PostConstruct
	public void testCusInit() {
		System.out.println("testing inside of HFS");
	}
	
	@PreDestroy
	public void testCusDes() {
		System.out.println("test ended");
	}
}
