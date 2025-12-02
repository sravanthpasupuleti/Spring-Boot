package com.abhishekvermaa10;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.abhishekvermaa10.service.OwnerService;

//@Configuration + @EnableAutoConfiguration + @ComponentScan
@SpringBootApplication
public class Demo implements CommandLineRunner {
	@Autowired
	private OwnerService ownerService1;

	@Autowired
	private OwnerService ownerService2;

	// @Autowired
	// private OwnerService ownerService2;

	public static void main(String[] args) {
		SpringApplication.run(Demo.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("OwnerId Before modifying :"+ownerService1.findOwner());
			System.out.println("OwnerId Before modifying :"+ownerService2.findOwner());
			System.out.println("Enter new Owner id : ");
			int sc = scanner.nextInt();
			ownerService1.ModifyOwnerId(sc);
			System.out.println("OwnerId After modifying :"+ownerService1.findOwner());
			System.out.println("OwnerId After modifying :"+ownerService2.findOwner());
		}catch(Exception exc){
			System.out.println(exc.getMessage());
		}
	}
}
