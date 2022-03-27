package com.company;

import java.util.Arrays;

public class Manager extends Employee{
    private double bonus;
    private Employee[] team;

    public Manager(String name, double salary, double bonus) {
        super(name, 1000); //(name, salary) - can be as well
        this.bonus=bonus;
        this.team = team;

    }

/*
    public void getPaid(){
        double fullSalary = getSalary() + bonus;
        System.out.println("My salary is " + fullSalary);
   }
 */
    @Override
    public void getPaid(){
        double fullSalary = getSalary() + bonus;

        System.out.println(String.format("My salary is %.2f [ salary: %.2f bonus %.2f]", fullSalary, getSalary(), bonus));

}

    public void doWork(){
        System.out.println("I am a manager " + getName() + " I manage the company");
    }

   @Override
    public String toString() {
        return super.toString() + "Manager";
    }

    public Employee[] getTeam() {
        return team;
    }
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
}
