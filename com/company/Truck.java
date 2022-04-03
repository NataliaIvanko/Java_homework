package com.company;

public class Truck extends FleetVehicles{

    private int loadCapacity;

    public Truck(String registrationNUmber, int yearOfIssue, int loadCapacity) {
        super(registrationNUmber, yearOfIssue);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public void goToRace(){
        System.out.println(        String.format("Truck of %d year of issue with the registration number %s  transports %d tons of grain", getYearOfIssue(),getRegistrationNUmber(),loadCapacity));
      }

}
