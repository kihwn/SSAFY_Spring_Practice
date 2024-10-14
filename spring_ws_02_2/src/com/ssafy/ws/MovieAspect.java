package com.ssafy.ws;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//어노테이션은 어노테이션 버전을 위한 것. 

public class MovieAspect {
	
	@Pointcut("execution(* *(..))")
	public void mvpt() {
		//pointcut를 지칭하는 메서드 명. 
	}
	
	
	public void before() {
		System.out.println("영화관에 갑니다.");
	}
	
	
	//정상 종료
	public void afterReturning() {
		System.out.println("영화가 끝나고 나온다");
	}
	
	
	//비정상 종료
	public void afterThrowing(Throwable th) {
		System.out.println("전화가 울린다.");
		if (th instanceof CallException) {
			((CallException)th).handleException();
		}
	}
	
	
	public void after() {
		System.out.println("집에 간다.");
	}
	
	// 핵심 관심 사항이 실행 됐을 때의 시점을 가져올 것. 세세하게 하나하나 before after로 나눠서 할 수도 있지만,
	//around로 한 방에 묶을 수도 있음. 
//	@Around("mvpt()")
//	public void around(ProceedingJoinPoint pjt) throws Throwable {
//	
//		pjt.proceed();
//		
//		try {
//			this.afterReturning();
//		}catch(Throwable e) {
//			this.afterThrowing(e);
//		}finally {
//			this.after();
//		}		
//	}
		
}
