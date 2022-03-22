package com.company;

public class Employee {
    private String name;
    private double salary;
    private double monthlyBonus;

    public Employee(String name, double salary,double monthlyBonus) {
        this.name = name;
        this.salary = salary;
        this.monthlyBonus = monthlyBonus;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public double getBonus (){
        return monthlyBonus;
    }
    public void getPaid(){
        double fullSalary = salary + monthlyBonus;
        System.out.println("My salary is " + fullSalary);

    }
    public String toString(){
        double fullSalary = salary + monthlyBonus;
        return "Employee: " + name + ", salary is " + salary + ", bonus is " + monthlyBonus +
                " full salary is " + fullSalary;

    }
}
