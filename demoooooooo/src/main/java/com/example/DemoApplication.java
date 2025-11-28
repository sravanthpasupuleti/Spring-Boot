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
public class DemoApplication implements CommandLineRunner{

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

    @Autowired
    private OwnerService ownerService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @Override
    public void run(String... args) {
        try(Scanner scanner = new Scanner(System.in)){
            LOGGER.info("Before modification id");
            System.out.println(ownerService.serviceid());
            System.out.println("Enter owner id : ");
            int idd = scanner.nextInt();
            ownerService.modifyid(idd);
            LOGGER.info("After modification id");
            System.out.println(ownerService.serviceid());
        }catch(Exception exception){
            LOGGER.warn("exception is : "+exception.getMessage());
        }
    }
}