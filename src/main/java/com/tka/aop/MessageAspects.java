package com.tka.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MessageAspects {
//	@Before("execution (public void recharge() )")
//	public void beforeMSG () {
//		System.out.println("Your recharge has been expired soon....");
//		
//	}
//		
//			@After("execution (public void recharge() )")
//			public void afeterMSG () {
//				System.out.println("Enjoy your data pack...");
//				
//		
//	}
	@Around("execution(* com.tka.entity.MobileRecharge.*())")
	public void arouudMSG(ProceedingJoinPoint pj) {
		System.out.println("Youur recharge has been expiring soon....");
		
		try {
			pj.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Enjoy your data pack...");
	}
	

}
