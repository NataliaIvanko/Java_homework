package com.company;

public abstract class FleetVehicles {
    private String registrationNUmber;
    private int yearOfIssue;

    public FleetVehicles(String registrationNUmber, int yearOfIssue){
        this.registrationNUmber = registrationNUmber;
        this.yearOfIssue = yearOfIssue;
    }

    public String getRegistrationNUmber() {
        return registrationNUmber;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setRegistrationNUmber(String registrationNUmber) {
        this.registrationNUmber = registrationNUmber;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return String.format("Transport vehicle: registration number is %s, year of issue is %d",
                registrationNUmber, yearOfIssue);
    }
    public abstract void goToRace();
}
