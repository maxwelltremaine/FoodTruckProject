package com.skilldistillery.foodtruck.app;

import com.skilldistillery.foodtruck.entities.*;
import java.util.Scanner;

public class FoodTruckApp {
	private Scanner sc = new Scanner(System.in);
	private FoodTruck[] fleet = new FoodTruck[5];
	// food truck app will not tell the food truck what its id is

	public static void main(String[] args) {
		FoodTruckApp fTA = new FoodTruckApp();
		fTA.run();
	}

	public void run() {
		createTrucks();
		while (true) {
			menu();
			int userInput2 = sc.nextInt();
			sc.nextLine();
			if (userInput2 == 1) {
				for (int i = 0; i < fleet.length; i++) {
					if (fleet[i] != null) {
						System.out.println(fleet[i]);
					}

				}
			}

			if (userInput2 == 2) {
				double average, total =0.0,  divider =0.0;
				for (int i = 0; i < fleet.length; i++) {
					if (fleet[i] != null) {
						divider++;
						total+=fleet[i].getRating();
					}
				}
			average = total/divider;
			System.out.println("The average rating of the food trucks is: "+ average);
			}
//create int or double set to current highest 
			if (userInput2 == 3) {
				double highestRating = 0.0;
				FoodTruck bestRatedTruck = null;
				for (int i = 0; i < fleet.length; i++) {
					if (fleet[i] != null) {
						if (fleet[i].getRating() > highestRating) {
							highestRating = fleet[i].getRating();
							bestRatedTruck = fleet[i];

						}
					}

				}
				System.out.println(bestRatedTruck);
			}
			if (userInput2 == 4) {
				System.out.println("Thanks for using our service!");
				System.out.println("Have a nice day!");
				break;
			}
		}

	}

	public void createTrucks() {
		String foodTruckName;
		String foodType;
		double truckRating;
		for (int i = 0; i < fleet.length; i++) {
			System.out.println("please enter the name of the food truck or quit");
			foodTruckName = sc.nextLine();
			if (foodTruckName.equalsIgnoreCase("quit")) {
				break;
			}
			System.out.println("Please enter the food type");
			foodType = sc.nextLine();
			System.out.println("Please enter the truck rating");
			truckRating = sc.nextDouble();
			sc.nextLine();
			FoodTruck newTruck = new FoodTruck(foodTruckName, foodType, truckRating);
			fleet[i] = newTruck;

		}
	}

	public void menu() {
		System.out.println("--------------------------------------------------");
		System.out.println("Press 1 to see all existing food trucks");
		System.out.println("Press 2 to see the average rating of food trucks");
		System.out.println("Press 3 to display the highest-rated food trucks");
		System.out.println("input 4 to quit the program");
		System.out.println("--------------------------------------------------");
	}

}
