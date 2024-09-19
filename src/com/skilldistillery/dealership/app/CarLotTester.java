package com.skilldistillery.dealership.app;

import com.skilldistillery.dealership.entities.Car;
import com.skilldistillery.dealership.entities.CarLot;

public class CarLotTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarLotTester test = new CarLotTester();
		
		test.launch();
	}
	
	public void launch() {
		// Create a CarLot Instance 
		CarLot carLot = new CarLot();
		// Add 2 cars to the CarLot 
		Car car1 = new Car("Ford", "F150", "Blue", 90_000.0);
		Car car2 = new Car("Chevy", "Blazer", "Red", 100_000.0);
		carLot.addCar(car1); // added car 1 
		carLot.addCar(car2); // added car 2 
		// Call getListOfCarsInInventory and display all the cars currently in inventory.
		System.out.println(carLot.getListOfCarsInInventory());
		
		// Add a couple more cars and park them in the CarLot 
		Car car3 = new Car("Nissan", "Altima", "Navy Blue", 20_000.0);
		Car car4 = new Car("Ford", "Focus", "Silver", 45_000.00);
		carLot.addCar(car3);
		carLot.addCar(car4);
		
		// Calling getListOfCarsInInventory to get and display the latest inventory of parked cars
		System.out.println(carLot.getListOfCarsInInventory());
	}

}
