package com.company;

public class Main {

    public static void main(String[] args) {
	Programmer p1 = new Programmer("Ivan", 1000);
    Programmer p2 = new Programmer("Nick", 1500);
    QAEngineer q1 = new QAEngineer("Lena", 1200);
    QAEngineer q2 = new QAEngineer("Max", 1100);
    Manager m1 = new Manager("Jane", 1600, 150);
        System.out.println(p1);
        p1.getPaid();
        p1.doWork();

        System.out.println(p2);
        System.out.println(q1);
        q1.getPaid();
        q1.doWork();
        System.out.println(q2);

        System.out.println(m1);
        m1.getPaid();



        Employee[] employee = {p1, p2, q1, q2, new Intern("Jack", 400), m1};
        for (int i = 0; i < employee.length; i++) {
         //   System.out.println( employee[i]);
        //    employee[i].getPaid();
            employee[i].doWork();

        }

    }
}
