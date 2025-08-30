package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.services.OwnerService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

    @Autowired
    private OwnerService ownerService;


	public static void main(String[] args) {
        System.out.println("1");
		SpringApplication.run(DemoApplication.class, args);
        System.out.println("2");
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("3");
        System.out.println(ownerService.serviceid());
        System.out.println("4");
    }

}
