package com.company;

public class Intern extends Employee{
    public Intern(String name, double salary) {
        super(name, salary);
    }
    public void doWork(){
        System.out.println("I am an intern " + getName() + " I work and learn");
    }
    public String toString() {
        return "Intern{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
