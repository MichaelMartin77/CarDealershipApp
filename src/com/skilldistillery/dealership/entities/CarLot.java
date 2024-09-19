package com.skilldistillery.dealership.entities;

public class CarLot {
	// create an private field to hold the cars (10)
	private Car[] cars = new Car[10];
	// creating a private field that tracks how many cars are currently parked in
	// the lot
	private int parkedCars = 0;

	// create a no arg ctor
	public CarLot() {

	}

	public String addCar(Car car) {
		if (parkedCars >= cars.length) {
			return "This lot is full. NO MORE CARS ALLOWED...";
		} else {
			cars[parkedCars] = car;
			parkedCars++;
			return "Car has been succesfully added!";
		}
	}
	
	// Creating a list of all parked cars 

	public String getListOfCarsInInventory() {
		StringBuilder carList = new StringBuilder();

		for (int i = 0; i < cars.length; i++) {
			if (cars[i] != null) {

				String carDetails = "Make: " + cars[i].getMake() + ", Model: " + cars[i].getModel() + ", Color: "
						+ cars[i].getColor() + ". Price: " + cars[i].getPurchasePrice();
				carList.append(carDetails).append("\n");
			} 
		}

		return carList.toString(); 
	}
}
