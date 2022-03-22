package com.company;

public class SalesAssistant extends Employee{
    public SalesAssistant(String name, double salary, double bonus){
        super(name, salary, bonus);
    }
    public String toString(){
        double fullSalary = getSalary() + getBonus();
        return "Sales assistant: " + getName() + ", salary is " + getSalary() + ", bonus is " + getBonus() +
                " full salary is " + fullSalary;
    }
}
