package com.example;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.services.OwnerService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

    @Autowired
    private OwnerService ownerService1;

    @Autowired
    private OwnerService ownerService2;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Before modification id");
        System.out.println(ownerService1.serviceid());
        System.out.println(ownerService2.serviceid());
        // ownerService1.modifyid(14);
        System.out.println("Enter owner id : ");
        int idd = scanner.nextInt();
        ownerService1.modifyid(idd);
        System.out.println("After modification id");
        System.out.println(ownerService1.serviceid());
        System.out.println(ownerService2.serviceid());
    }

}
