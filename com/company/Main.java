package com.company;

public class Main {

    public static void main(String[] args) {
	Bus bus1 = new Bus("AB123", 2005, 58);
    Truck truck1 = new Truck("BC 456", 2015, 500);
    Car car1 = new Car ("CD 789", 2019, 5, 150);


    bus1.goToRace();
    truck1.goToRace();
    car1.goToRace();
    System.out.println(bus1);
    System.out.println(truck1);
    System.out.println(car1);


    }
}
