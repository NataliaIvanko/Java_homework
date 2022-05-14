package com.company;

public class Students implements Observer {
    String name;
    int YearOfBirth;
    double gpa;

    public Students(String name, int yearOfBirth, double gpa) {
        this.name = name;
        YearOfBirth = yearOfBirth;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return YearOfBirth;
    }

    public double getGpa() {
        return gpa;
    }
    @Override
    public String toString(){
        return String.format("%s [%d] %5.2f", name, YearOfBirth, gpa);

    }
    @Override
    public void handleEvent() {
        System.out.println("I have seen the task ");
    }
}
