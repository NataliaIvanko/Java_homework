package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Students s1 = new Students("Billy", 1985, 4);
    Students s2 = new Students("Willy", 1986, 4.8);
    Students s3 = new Students("Dilly", 1987, 5);


    Students[] students = {s1, s2, s3};
        Scanner sc = new Scanner(System.in);
        System.out.println("How would you prefer to sort out the students?");
        System.out.println("1. By name");
        System.out.println("2. By age");
        System.out.println("3. By GPA");

        String name = sc.nextLine();
        name = name.toLowerCase();
        switch(name){

            case "1":
                Arrays.sort(students, new StudentsComparatorByName());
                break;
            case "2": Arrays.sort(students, new StudentsComparatorByAge());
                break;
            case "3": Arrays.sort(students, new StudentsComparatorByGPA());
                break;
            default: System.out.println("Enter something");
                break;

        }

        sc.close();
        print(students);
    }
    public static void print(Students[] students){
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

}
