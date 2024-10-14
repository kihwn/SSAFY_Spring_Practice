package com.ssafy.ws;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class Audience2 implements Person{

	@Override
	public void doSomething() throws CallException {
		System.out.println("영화를 즐겁게 본다.");
		if (new Random().nextBoolean()) {
			throw new CallException();
		}
		
	}
	
}
