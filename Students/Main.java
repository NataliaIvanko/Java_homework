package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Students s1 = new Students("Billy", 1985, 4);
    Students s2 = new Students("Willy", 1986, 4.8);
    Students s3 = new Students("Dilly", 1987, 5);

    Teacher teacher = new Teacher();

    Task task1 = new Task(1, "Write semester paper");
    Task task2 = new Task(15, "Get ready for the group discussion");



    TaskList tasklist = new TaskList();
   TaskList.add(s1);

    teacher.addTaskToList(task1, tasklist);





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
            case "2": Arrays.sort(students,  Comparator.nullsFirst(new StudentsComparatorByAge()));
                break;
            case "3": Arrays.sort(students, Comparator.nullsLast(new StudentsComparatorByGPA()));
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
