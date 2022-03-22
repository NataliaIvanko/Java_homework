package com.company;

public class Manager extends Employee{
    private double bonus;
    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus=bonus;
    }

    public void getPaid(){
        double fullSalary = getSalary() + bonus;
        System.out.println("My salary is " + fullSalary);

    }
    public void doWork(){
        System.out.println("I am a manager " + getName() + " I manage the company");
    }
    public String toString() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }

}
