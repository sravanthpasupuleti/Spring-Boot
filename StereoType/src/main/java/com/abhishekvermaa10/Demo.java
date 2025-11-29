package com.abhishekvermaa10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abhishekvermaa10.config.SpringConfig;
import com.abhishekvermaa10.repository.OwnerRepository;
import com.abhishekvermaa10.service.OwnerService;
import com.abhishekvermaa10.service.impl.OwnerServiceImpl;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		OwnerService ownerService = context.getBean("ownerServiceImpl", OwnerService.class);
		OwnerRepository ownerRepository = context.getBean("ownerRepositoryImpl", OwnerRepository.class);
		((OwnerServiceImpl)ownerService).setOwnerRepository(ownerRepository);
		((OwnerServiceImpl)ownerService).setOwnerId(7);
		System.out.println(ownerService.findOwner());
		((AnnotationConfigApplicationContext) context).close();
	}
}