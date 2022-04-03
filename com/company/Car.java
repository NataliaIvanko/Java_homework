package com.company;

public class Car extends FleetVehicles {

    private int passengerCapacity;
    private int loadCapacity;

    public Car(String registrationNumber, int yearOfIssue, int passengerCapacity, int loadCapacity) {
        super(registrationNumber, yearOfIssue);
        this.passengerCapacity = passengerCapacity;
        this.loadCapacity = loadCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void goToRace() {
        System.out.println(String.format("The car of  %d year of issue with the registration number %s having %d load capacity " +
                "carries %d people", getYearOfIssue(), getRegistrationNUmber(), loadCapacity, passengerCapacity));
    }
}
