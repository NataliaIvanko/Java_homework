package com.company;

public class Main {

    public static void main(String[] args) {
        //5. Print the average of three numbers by creating a class named "Average" having a method to calculate and
        // print the average. The class should have a constructor

        Average aver = new Average(1, 2, 3);
        System.out.println(aver.average());

	// 1.Create a class named "Student" containing  variable String  'name' and  integer variable 'number'.
        //    //Assign the value of number =2 and value of name is "Petr" by creating an object of the class Student
        //    //Create two more objects of the class Student
        Student student = new Student();
        student.name = "Piotr";
        student.number = 2;

        Student student1 = new Student();
        student1.name = "Ivan";
        student1.number = 3;

        Student student2 = new Student();
        student2.name = "Vasily";
        student2.number = 3;

        //2.Write a program to print perimenter of a triangle with sides 3,4,5 by creating a class 'Triangle' without
        // any parameter in constructor


        Triangle triangle = new Triangle(2, 5, 6);

      /*  triangle.a = 2;
        triangle.b = 5;
        triangle.c = 6;

       */

        System.out.println(triangle.getPerimeter());

        //3.Write a program to print area and  perimenter of a triangle with sides 3,4,5 by creating a
        // class 'Triangle' with constructor having the three sides as its parameters
        //4.Write a program to print the area and perimenter of a rectangle by creating a class named "Rectangle" .
        //Create methods getArea and getPerimenter to calculate area and perimenter in that class. Length and breadth
        // should be variables of the class passed via constructor. Create two objects with sides(4,5) and (5,8) and
        // calculate their perimenter and area





        //6, Write a program by creating an "Employee" class having the following methods and print the final salary.
        // - constructor which accepts the salary, numbers of employee's working hours  per day as parameters
        // - 'addSalary()' method which adds $10 to the salary of the employee if it is less than $500
        // - "addWork()" method which adds $5 to the employee's salary if the number of working hours per day is
        // more than 6 hours

    }
}
