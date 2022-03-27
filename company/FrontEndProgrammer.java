package com.company;

public class FrontEndProgrammer extends Employee {
    public FrontEndProgrammer(String name, double salary) {
        super(name, salary);
    }

    public void doWork() {
        System.out.println("I am a frontend programmer " + getName() + " I write code and implement new features");
    }

    @Override
    public String toString() {
        return super.toString() + "Frontend programmer";
    }
}
