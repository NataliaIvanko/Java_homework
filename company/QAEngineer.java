package com.company;

public class QAEngineer extends Employee{


    public QAEngineer(String name, double salary) {
         super(name, salary);
    }

    @Override
    public void doWork(){
        System.out.println("I am a QA Engineer " + getName() + " I check programmes");
    }


        @Override
        public String toString() {
            return super.toString() + " QA Engineer";
        }
}
