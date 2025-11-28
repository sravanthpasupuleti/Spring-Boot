package com.example;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.services.OwnerService;

@SpringBootApplication
public class Demo2Application implements CommandLineRunner{

	@Autowired
	private OwnerService ownerService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Demo2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
		LOGGER.warn("END");
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("START");
		System.out.println(ownerService.Serviceid());
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tell me Owner id : ");
		int id = scanner.nextInt();
		ownerService.getid(id);
		System.out.println(ownerService.Serviceid());
		LOGGER.info(ownerService.Serviceid());
	}

}
