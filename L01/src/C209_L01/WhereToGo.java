package C209_L01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 20039060, 21 Apr 2021 9:26:54 pm
 */

public class WhereToGo {
	public static void main(String[] args) {

		ArrayList<Country> countryList = new ArrayList<Country>();
		countryList.add(new Country("Thailand", 26.30, "Food, Massage, Shopping "));
		countryList.add(new Country("Singapore", 26.45, "Food, Shopping"));
		countryList.add(new Country("France", 10.70, "Skiing, Sight Seeing"));
		countryList.add(new Country("Iceland", 1.75, "Hot Spring, Aurora"));
		countryList.add(new Country("Japan", 11.15, "Food, Mount Fuji"));

		// Refer to the sample flow and write code to match the requirements.
		// Hint: Refer to section F of your worksheet.

		int option = -1;
		while (option != 4) {

			menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				Helper.line(30, "-");
				System.out.println("COUNTRIES");
				Helper.line(30, "-");
				countriesByTemp(countryList, 1);

			} else if (option == 2) {
				Helper.line(30, "-");
				System.out.println("COUNTRIES");
				Helper.line(30, "-");
				countriesByTemp(countryList, 2);

			} else if (option == 3) {
				searchString(countryList);

			} else if (option == 4) {
				System.out.println("GoodBye!");

			} else {
				System.out.println("Invalid option");
			}
		}
	}

	public static void menu() {
		// Write code to display current date and menu here
		Helper.line(30, "-");
		DateTimeFormatter ft = DateTimeFormatter.ofPattern("EEEE d MMMM u");
		System.out.println(LocalDateTime.now().format(ft));
		System.out.println("WHERE TO GO?");
		Helper.line(30, "-");
		System.out.println("1. Warmer countries");
		System.out.println("2. Cooler countries");
		System.out.println("3. Search for recommendations by activity");
		System.out.println("4. Quit");
	}

	public static void countriesByTemp(ArrayList<Country> countryList, int choice) {
		// Write code here to display warm or cold countries depending on the choice by
		// the user.
		if (choice == 1) {
			for (int i = 0; i < countryList.size(); i++) {
				if (countryList.get(i).averageYearlyTempC > 25) {
					countryList.get(i).display();
				}
			}
		}

		else if (choice == 2) {
			for (int i = 0; i < countryList.size(); i++) {
				if (countryList.get(i).averageYearlyTempC < 25) {
					countryList.get(i).display();
				}
			}
		}
	}

	public static void searchString(ArrayList<Country> countryList) {
		// Write code here to prompt user to enter an activity
		// and display countries that have that activity.
		boolean found = false;
		String term = Helper.readString("Enter a search term > ");
		System.out.println("Countries related to your search term: ");

		for (int i = 0; i < countryList.size(); i++) {
			if (countryList.get(i).thingsToDo.toLowerCase().contains(term.toLowerCase())) {
				countryList.get(i).display();
				found = true;
			}
		}
		if (found == false) {
			System.out.println("None");
		}
	}
}
