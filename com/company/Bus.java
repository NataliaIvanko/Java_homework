package com.company;

public class Bus extends FleetVehicles{

    private int passengerCapacity;

    public Bus(String registrationNumber, int yearOfIssue, int passengerCapacity) {
        super(registrationNumber, yearOfIssue);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public void goToRace() {
        System.out.println(String.format("The bus of %d year of issue with the registration number %s carries %d passengers",getYearOfIssue(), getRegistrationNUmber(), passengerCapacity));
    }
}
