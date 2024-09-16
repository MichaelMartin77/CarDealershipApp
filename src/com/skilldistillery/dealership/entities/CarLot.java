package com.skilldistillery.dealership.entities;

public class CarLot {
	// create an private field to hold the cars (10)
	private Car[] car = new Car[10]; 
	// creating a private field that tracks how many cars are currently parked in the lot
	private int parkedCars = 0; 
	
	// create a no arg ctor 
	public CarLot() {
		
	}
}
