package com.abhishekvermaa10;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import com.abhishekvermaa10.service.OwnerService;

//@Configuration + @EnableAutoConfiguration + @ComponentScan
@PropertySource("messages.properties")
@SpringBootApplication
public class Demo implements CommandLineRunner {
	
	@Autowired
	private OwnerService ownerService;

	private static final Logger LOGGER = LoggerFactory.getLogger(Demo.class);

	public static void main(String[] args) {
		SpringApplication.run(Demo.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		try(Scanner scanner = new Scanner(System.in)){
			LOGGER.info(ownerService.findOwner());
			System.out.println("Enter new Owner id : ");
			int sc = scanner.nextInt();
			ownerService.ModifyOwnerId(sc);
			LOGGER.info(ownerService.findOwner());
		}catch(Exception exc){
			LOGGER.error(exc.getMessage());
		}
	}
}
