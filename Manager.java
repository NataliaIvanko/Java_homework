package com.company;

public class Manager extends Employee{
    private double yearBonus;
   public Manager(String name, double salary, double monthlyBonus, double yearBonus){
       super(name, salary, monthlyBonus);
       this.yearBonus = yearBonus;
   }
   public String toString(){
       double fullSalary = getSalary() + getBonus() + yearBonus;

       return "Manager: " + getName() + ", salary is " + getSalary() + ", monthly bonus is " + getBonus() + ", year bonus is " +
               yearBonus + " full salary is " + fullSalary;
   }
}
