package com.skilldistillery.foodtruck;

public class FoodTruck {
	
	
	private static int counterId = 0;
	private int foodtruckid;
	private String truckName;
	private String foodType;
	private int truckRating;
	int  i;
	private FoodTruck[] FoodtArray;
		

	public FoodTruck(String truckName, String foodType, int truckRating) {
		this.truckName = truckName;
		this.foodType = foodType;
		this.truckRating = truckRating;
		this.foodtruckid = counterId;
		counterId = counterId++;
	}

	public String gettruckName() {
		return truckName;
	}

	public void settruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getfoodType() {
		return foodType;
	}

	public void setfoodType(String foodType) {
		this.foodType = foodType;
	}

	public int gettruckRating() {
		return truckRating;
	}

	public void settruckRating(int truckRating) {
		this.truckRating = truckRating;
	}

	public int getcounterId() {
		return counterId;
	}

	public void setcounterId(int counterId) {
		this.counterId = counterId;
		counterId++;
	}

	public FoodTruck[] getFoodtArray() {
		return getFoodtArray();
	}

	public void setFoodtArray(FoodTruck[] FoodtArray) {
		this.FoodtArray = FoodtArray;
	}

	public FoodTruck(String truckName, String foodType, int truckRating,int counterId, FoodTruck[] FoodtArray) {
		this.truckName = truckName;
		this.foodType = foodType;
		this.truckRating = truckRating;
		this.counterId = counterId;
		this.FoodtArray = FoodtArray;
	}

	public FoodTruck() {
		
	}

	
	public String toString() {
		return "FoodTruck [truckName=" + truckName + ", foodType=" + foodType + ", truckRating=" + truckRating + ", counterId="
				+ counterId + "FoodtArray=" + FoodtArray;
		
		
	
	
	}
}