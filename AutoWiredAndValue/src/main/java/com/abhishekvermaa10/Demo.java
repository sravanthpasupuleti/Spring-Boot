package com.abhishekvermaa10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abhishekvermaa10.service.OwnerService;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Demo {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Demo.class);
		OwnerService ownerService = context.getBean("specialOwnerService", OwnerService.class);
		System.out.println(ownerService.findOwner());
		((AnnotationConfigApplicationContext) context).close();
	}
}