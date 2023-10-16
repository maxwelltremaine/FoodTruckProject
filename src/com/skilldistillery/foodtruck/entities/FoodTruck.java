package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int nextTruckId = 1;
	public int id;
	private String name;
	private String food;
	private double rating;

	// id/ name /food type/numeric rating data must be private
//here we will create the food truck fields 
//Food truck(String "name", String "food type", int )
	// id = +1 number every loop through
	public FoodTruck() {
	}

	public FoodTruck(String name, String food, double rating) {
		this.id = nextTruckId++;
		this.name = name;
		this.food = food;
		this.rating = rating;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "FoodTruck id: " + id + ", name: " + name + ", food: " + food + ", rating: " + rating + "";
	}

}
