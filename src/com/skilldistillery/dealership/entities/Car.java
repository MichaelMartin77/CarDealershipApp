package com.skilldistillery.dealership.entities;

public class Car {
	// Change the class's fields to have private visibility
	private String make;
	private String model;
	private String color;
	private double purchasePrice;

	// Add a ctor to initialize a car's fields

	// Create a constructor w/ parameters for all 4 fields
	public Car(String make, String model, String color, double purchasePrice) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.purchasePrice = purchasePrice;
	}

	// adding a no-arg constructor
	public Car() {

	}

	// Add getters and setters for the fields
	// Getter and Setter for make
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	// Getter and Setter for model
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	// Getter and Setter for color
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Getter and Setter for purchasePrice
	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	// changed the method "getCardata() to toString() b/c it is not a getter by
	// convention
	public String toString() {
		String output = "make=" + make + ", model=" + model + ", color=" + color + ", purchasePrice=" + purchasePrice;
		return output;
	}

	public void displayCar() {
		String carData = toString();
		System.out.println(carData);
	}
}