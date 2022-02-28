package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	private static final Object[] FoodtArray = null;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		FoodTruck[] foodtArray = new FoodTruck[5];

		for (int i = 0; i < foodtArray.length; i++) {
			System.out.println("Enter the FoodTruck name");
			String truckName = scanner.next();
			scanner.nextLine();

			if (truckName.equals("Quit") || (truckName.equals("quit"))) {
				System.out.println("Thanks \n Bye");
				break;

			} else {
				System.out.println("Enter Type of food please");
				String foodType = scanner.next();
				scanner.nextLine();

				System.out.println("Enter num rating 1-10 for foodtruck");
				int truckRating = scanner.nextInt();
				scanner.nextInt();

				while (truckRating < 10) {
					System.out.println("Great!");
					truckRating = scanner.nextInt();
				}
				foodtArray[i].getcounterId();
				i++;

			}
		}
	}

	private void truckRating() {
		int output = 0;
		int counter = 0;
		for (int i = 0; i < counter; i++) {
			if (i < counter) {
				output = output + ((FoodTruck) FoodtArray[i]).gettruckRating();
			}
		}
		double average;
		average = ((double) output / counter);
		System.out.print("Average rating is: ");
		System.out.printf("%.2f", average);
		System.out.println();
	}

	private void highestRating() {
		FoodTruck highTruck = (FoodTruck) FoodtArray[0];

		for (int i = 0; i < i; i++) {
			if (highTruck.gettruckRating() < ((FoodTruck) FoodtArray[i]).gettruckRating()) {
				highTruck = (FoodTruck) FoodtArray[i];
			}
		}
		System.out.println(highTruck);

	}

	public void truckMenu(Scanner scanner) {
		boolean goOn = true;
		do {

			System.out.println("1. List all existing food trucks");
			System.out.println("2. See the average rating of food trucks");
			System.out.println("3. Display the highest-rated food truck");
			System.out.println("4. Quit the program");
			String optionsmenu = scanner.next();
			switch (optionsmenu) {
			case "1":
				for (int i = 0; i < FoodtArray.length; i++) {
					if (FoodtArray[i] == null) {
						continue;
					} else
						System.out.println(FoodtArray[i].toString());
				}

				break;

			case "2":
				truckRating();
				break;

			case "3":
				highestRating();
				break;

			case "4":
				goOn = false;
				System.out.println("Bye, Bye, have a great day!");
			}

		} while (goOn == true);

	}

}
