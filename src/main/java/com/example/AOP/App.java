package com.example.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.services.PaymentService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/AOP/config.xml");
		PaymentService paymentObject = context.getBean("payment", PaymentService.class);
		paymentObject.makePayment();
	}
}
