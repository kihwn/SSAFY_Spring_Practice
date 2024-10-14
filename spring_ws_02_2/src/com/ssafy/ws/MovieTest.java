package com.ssafy.ws;

<<<<<<< HEAD
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
=======
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class MovieTest {
	public static void main(String[] args) {
		
		System.out.println("------------Bean 방식 --------------");
		
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		Audience audi = context.getBean("audience",Audience.class);
		try {
			audi.doSomething();
		}catch(Exception e) {
			
		}
		
		
		System.out.println("------------Annotaion 방식 --------------");
		
		ApplicationContext context2 = new GenericXmlApplicationContext("applicationContext2.xml");
		Person audi2 = context2.getBean("audience2", Audience2.class);
		
		try {
			audi2.doSomething();
		}catch(Exception e) {
			
		}
		
		

	}
>>>>>>> a47fe4f (1011_AOP 과제 완료)
}
