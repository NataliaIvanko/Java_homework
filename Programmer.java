package com.company;

import org.w3c.dom.ls.LSOutput;

public class Programmer extends Employee{

    public Programmer(String name, double salary) {
        super(name, salary); //calls the constructor of the Employee class
    }

    public void doWork(){
        System.out.println("I am a programmer " + getName() + " I write programmes");
    }
    public String toString() {
        return "Programmer{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }

}
