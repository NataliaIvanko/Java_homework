package com.company;

public class QAEngineer extends Employee{


    public QAEngineer(String name, double salary) {
      super(name, salary);
    }

    public void doWork(){
        System.out.println("I am a QA Engineer " + getName() + " I check programmes");
    }

    public String toString() {
        return "QA Engineer{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
