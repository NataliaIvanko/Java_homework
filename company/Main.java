package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

	Programmer p1 = new Programmer("Ivan", 1000);
    Programmer p2 = new Programmer("Nick", 1500);
    QAEngineer q1 = new QAEngineer("Lena", 1200);
    QAEngineer q2 = new QAEngineer("Max", 1100);
    Manager m1 = new Manager("Jane", 1600, 150);
    BackEndProgrammer ba1 = new BackEndProgrammer("Kevin", 1800);
    FrontEndProgrammer fa1 = new FrontEndProgrammer("Jonas", 2000);
    FullStackProgrammer fullst1 = new FullStackProgrammer("Collin", 1500);
    EmployeeTeam et1 = new EmployeeTeam();

    et1.add(m1);
    et1.add(p1);
    et1.add(q1);
    et1.printTeam();
    et1.remove(1);
    et1.printTeam();
    et1.setTeamManager(m1);
        System.out.println(et1.toString());;

    ba1.doWork();
    ba1.getPaid();
    fa1.doWork();
    fa1.getPaid();
    m1.addEmployeeToTeam(q1);
    m1.addEmployeeToTeam(p1);
    m1.addEmployeeToTeam(fa1);
    m1.addEmployeeToTeam(ba1);
    m1.printTeam();
    m1.removeEmployee(0);
    m1.printTeam();

    ArrayCopyDemo arrayCopyDemo = new ArrayCopyDemo(); //создали объект этого класса
    System.out.println(arrayCopyDemo.toString());
    Object o = new Object(); //о - объект класса Object



/*
    Employee[] employee = {p1, p2, q1, q2, new Intern("Jack", 400), m1, ba1, fa1, fullst1};
        for (int i = 0; i < employee.length; i++) {
            System.out.println( employee[i]);
            //employee[i].getPaid();
            employee[i].doWork();

        }
      */

  //  Employee employee1 = new Employee("qwe", 45);
    }

/*
    Employee[] employee = {p1, p2, q1, q2, new Intern("Jack", 400), m1, ba1, fa1, fullst1};
        for (Employee e: employee) {
            m1.addEmployeeToTeam(e);

        }
        System.out.println(Arrays.toString(m1.getTeam()));

*/

}

/*
    Intern intern1 = new Intern("Mary", 500);
    Employee intern2 = new Intern("Kate", 600);
    Employee intern3 = new Programmer("programmer", 1000);


    intern1.qwe();
  //  Intern intern2 = (Intern)intern2;
        ((Intern)intern2 ).qwe();
     //   ((Intern)intern3 ).qwe();

        intern1.note = "Intern1";
        Intern intern5 = intern1;
        intern5.note = "intern5";
        System.out.println("Intern1: " + intern1);
        System.out.println("Intern5: " + intern5);





    /*
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

/*
    //System.out.println(m1.getTeam());
    m1.addEmployeeToTeam(m1);
    //System.out.println(Arrays.toString(m1.getTeam()));
    m1.addEmployeeToTeam(p1);
*/





