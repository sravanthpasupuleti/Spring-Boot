package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.services.OwnerService;

@SpringBootApplication
public class Demo2Application implements CommandLineRunner{

	@Autowired
	private OwnerService ownerService;

	public static void main(String[] args) {
		System.out.println("START");
		SpringApplication.run(Demo2Application.class, args);
		System.out.println("END");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(ownerService.Serviceid());
	}

}
