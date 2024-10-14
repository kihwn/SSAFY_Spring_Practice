package com.ssafy.ws;

import org.springframework.stereotype.Component;

@Component
public class Comic implements Movie{
	//코드작성
	public Comic() {

	}
	
	public String getInfo() {
		return "코믹";
	}
}
