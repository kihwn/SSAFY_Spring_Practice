package com.ssafy.ws;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MovieTest {
    public static void main(String[] args) {
        //문제 발생 :처음에 resources가 source class path에 등록되지 않아 applicationContext.xml을 찾지 못함.
    	//문제 원인 찾기 위해 아래 문장 체크. 
        //System.out.println(MovieTest.class.getClassLoader().getResource("applicationContext.xml"));

        // Spring 컨텍스트를 로드
        ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
        
        ApplicationContext context2 = new GenericXmlApplicationContext("applicationContext2.xml");

        Audience audience = context.getBean("audience", Audience.class);
        
        Audience audience2 = context2.getBean("audience2",Audience.class);
        
        audience.watching();
        audience2.watching();
    }
}
