package com.skilldistillery.dealership.app;

import com.skilldistillery.dealership.entities.Car;

public class CarTester {

  public static void main(String[] args) {
    // Create two Cars and assign fields
    Car fredsCar = new Car();
    fredsCar.make = "Kia";
    fredsCar.model = "Sportage";
    fredsCar.color = "Hot Pink";
    fredsCar.purchasePrice = 28565;

    Car bernicesCar = new Car();

    bernicesCar.make = "Toyota";
    bernicesCar.model = "Prius";
    bernicesCar.color = "Neon";
    bernicesCar.purchasePrice = 32199;

    // Have the cars display themselves
    fredsCar.displayCar();
    bernicesCar.displayCar();
    System.out.println();

    String fredCarData = fredsCar.getCarData();
    String bernicesCarData = bernicesCar.getCarData();

    // Get the cars' data and display that
    System.out.println("Fred car data: " + fredCarData);
    System.out.println("Bernices Car data: " + bernicesCarData);
  }

}
