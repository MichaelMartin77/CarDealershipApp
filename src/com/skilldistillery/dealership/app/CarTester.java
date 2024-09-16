package com.skilldistillery.dealership.app;

import com.skilldistillery.dealership.entities.Car;

public class CarTester {

  public static void main(String[] args) {
    // Create two Cars and assign fields
    Car fredsCar = new Car("Kia", "Sportage", "Hot Pink", 28565);
//    fredsCar.make = "Kia";
//    fredsCar.model = "Sportage";
//    fredsCar.color = "Hot Pink";
//    fredsCar.purchasePrice = 28565;

    Car bernicesCar = new Car();

    bernicesCar.setMake("Toyota");
    bernicesCar.setModel("Prius");
    bernicesCar.setColor("Neon");
    bernicesCar.setPurchasePrice(32199);

    // Have the cars display themselves
    fredsCar.displayCar();
    bernicesCar.displayCar();
    System.out.println();

    String fredCarData = fredsCar.toString();
    String bernicesCarData = bernicesCar.toString();

    // Get the cars' data and display that
    System.out.println("Fred car data: " + fredCarData);
    System.out.println("Bernices Car data: " + bernicesCarData);
  }

}
