package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Employee implements Comparable<Employee>{ //abstract - ограничить создание разных классов
    //In the Employee you need to implement new feature assign a Task(id, status, description) to each Employee.
    // Think how you can implement it. NOTE each employee can solve more than one task,
    // and each task can be solved by more than one employee.
    private String name;
    private double salary;
    private List<Task> tasks;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;

    }
    public Employee(String name, double salary, List<Task> tasks) {
        this.name = name;
        this.salary = salary;
        this.tasks = tasks;
    }
    public Employee(String name, double salary, Task tasks) {
        this.name = name;
        this.salary = salary;
        this.tasks.add(tasks);
    }
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public void addTask(Task task){
        List<Task>tasks = new ArrayList<Task>();
       this.tasks.add(task);
    }
    public void printTasks(){
       tasks.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return String.format("Employee %s [%.2f]", name, salary);
    }

    public void getPaid(){
        System.out.println("My salary is " + salary);

    }
    public abstract void doWork();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salary, salary) != 0) return false;
        return name != null ? name.equals(employee.name) : employee.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public int compareTo (Employee e){
        return name.compareTo(e.name);
    }
}
