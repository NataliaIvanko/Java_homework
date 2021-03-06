package com.company;

import java.util.Arrays;

public class Manager extends Employee {

    private double bonus;
    EmployeeTeam team;

    public Manager(String name, double salary, double bonus) {
        super(name, 1000); //(name, salary) - can be as well
        this.bonus = bonus;
    }

    @Override
    public void getPaid() {
        double fullSalary = super.getSalary() + bonus;
        System.out.println(String.format("My salary is %.2f [ salary: %.2f bonus %.2f]", fullSalary, getSalary(), bonus));
    }

    public void doWork() {
        System.out.println("I am a manager " + getName() + " I manage the company");
    }

    @Override
    public String toString() {
        return super.toString() + "Manager";
    }

    public void addToTeam(Employee e) {

        if (e != null)
            if(team == null){
                team = new EmployeeTeam();
            }
        team.add(e);
    }


    public void printTeam() {
        team.print();
    }

    public void removeFromTeam(int index) {
        team.remove(index);

    }
    public void removeFromTeam(int index, boolean flag){
        team.remove(index, flag);
    }
    public void removeFromTeam(Employee employee){
        team.remove(employee);
    }
}
    /*
    public void removeEmployee (int n){
        Employee [] arr1 = new Employee[n];
        Employee[] arr2 = new Employee[team.length-n];
        Employee[] dest = new Employee[team.length-1];

        arr1 = Arrays.copyOfRange(team,0,n);
        arr2 = Arrays.copyOfRange(team, n+1, team.length);

        System.arraycopy(arr1, 0, dest, 0, arr1.length);
        System.arraycopy(arr2, 0, dest, arr1.length, arr2.length);

        team = Arrays.copyOf(dest,team.length-1 );
        currentIndex--;

    }
}

     */

/*
public void getPaid(){
        double fullSalary = getSalary() + bonus;
        System.out.println("My salary is " + fullSalary);
        }
        */
  /*
    public void addEmployeeToTeam (Employee newTeamMember) {

        if (team == null) {
            this.team = new Employee[]{newTeamMember};
            //team[0] = newTeamMember;
        } else {
            int n = team.length;
            team = Arrays.copyOf(team, n + 1);
            team[n] = newTeamMember;


        }
    }

     */
       /*
          Employee[] temp = new Employee[capacity*2];
            for (int i = 0; i < capacity; i++) {
                temp[i] = team[i];
            }
            capacity *= 2;
            team = temp;

             */