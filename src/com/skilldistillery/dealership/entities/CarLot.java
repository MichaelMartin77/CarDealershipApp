package com.skilldistillery.dealership.entities;

public class CarLot {
	// create an private field to hold the cars (10)
	private Car[] cars = new Car[10];

	// Stretch goal
	// Add another constructor to allow DDD to

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

	public CarLot(int moreCars) {
		cars = new Car[moreCars];
	}

	private int findSpecificModelCarInLot(String desiredMake, String desiredModel) {
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] != null) {
				if (desiredMake.equals(cars[i].getMake()) && desiredModel.equals(cars[i].getModel())) {
					return i;
				}
			}

		}

		return -1;

	}

	public Car purchaseCar(String desiredMake, String desiredModel) {
		// Finding the index of the desired car
		int index = findSpecificModelCarInLot(desiredMake, desiredModel);

		// Check if the car was found (index isn't 1 )
		if (index != -1) {
			// Retrieve the car from the lot
			Car carToSell = cars[index];

			// Remove the car from the lot by assigning back to null
			cars[index] = null;

			// Return the car that was sold
			return carToSell;
		} else {
			// If no car was found, return null
			return null;
		}

	}
}
