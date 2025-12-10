package com.abhishekvermaa10.util;

import java.util.Scanner;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class InputUtil {

	public static int acceptMenuOption(Scanner scanner) {
		// System.out.println("Press 1 to add new owner.");
		// System.out.println("Press 2 to fetch owner details.");
		// System.out.println("Press 3 to update pet details of owner.");
		// System.out.println("Press 4 to delete owner details.");
		// System.out.println("Press 5 to fetch all owners.");
		// System.out.println("Press 6 to fetch pet details.");
		System.out.println("Press 1 to fetch owner details.");
		System.out.println("Press 2 to fetch pet details.");
		System.out.println("Press 3 to fetch owner by initials of first name of owner.");
		System.out.println("Press 4 to fetch owner details by pet id.");
		int menuOption = scanner.nextInt();
		if (menuOption >= 1 && menuOption <= 4) {
			return menuOption;
		} else {
			System.out.println("Invalid option entered.");
			return acceptMenuOption(scanner);
		}
	}

	public static boolean wantToContinue(Scanner scanner) {
		System.out.println("Press Y to continue and N to exit.");
		char choice = scanner.next().toUpperCase().charAt(0);
		return 'Y' == choice;
	}

	
	public static int acceptOwnerIdToOperate(Scanner scanner) {
		System.out.println("Enter id of owner:");
		return scanner.nextInt();
	}

	public static int acceptPetIdToOperate(Scanner scanner) {
		System.out.println("Enter id of pet:");
		return scanner.nextInt();
	}

	public static String acceptOwnerFirstNameToOperate(Scanner scanner){
		System.out.println("Enter owner first name to fetch owner details");
		return scanner.next();
	}

	// private static LocalDate convertStringToDate(String stringDate) {
	// 	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	// 	return LocalDate.parse(stringDate, format);
	// }

}
