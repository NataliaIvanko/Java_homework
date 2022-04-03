package com.company;

public final class BackEndProgrammer extends Programmer{

    public BackEndProgrammer(String name, double salary){
        super(name, salary);
    }

    @Override
    public void doWork() {
        System.out.println("I am a backend programmer " + getName() + " I write code and improve backend");;
    }

    @Override
    public String toString() {
        return super.toString() + "Backend Programmer";
    }
}
