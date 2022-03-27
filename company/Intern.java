package com.company;

public class Intern extends Employee{
    public String note;


    public Intern(String name, double salary) {
        super(name, salary);
        System.out.println("constructor Employee");
    }
    public void qwe(){
        System.out.println("qwe!!!");
    }


    public void doWork(){
        System.out.println("I am an intern " + getName() + " I work and learn");
    }
    public String toString() {
        return "Intern{" +
                "note='" + note + '\'' +

                '}';
    }

}
