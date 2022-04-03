package com.company;

public abstract class Employee { //abstract - ограничить создание разных классов
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Employee %s [%.2f]", name, salary);
    }

    public void getPaid(){
        System.out.println("My salary is " + salary);

    }
    public abstract void doWork();

}
