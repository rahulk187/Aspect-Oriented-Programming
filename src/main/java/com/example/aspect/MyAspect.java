package com.example.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("execution(* com.example.services.PaymentServiceImpl.makePayment())")
	public void before() {
		System.out.println("Payment started...");
	}
	
	@After("execution(* com.example.services.PaymentServiceImpl.makePayment())")
	public void after() {
		System.out.println("Payment done...");
	}
}
