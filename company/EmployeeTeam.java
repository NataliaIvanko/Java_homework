package com.company;

import java.util.Arrays;

public class EmployeeTeam {
    private Employee[] team;
    private Manager teamManager;
    int currentIndex = 0;
    int capacity = 2;




    public Manager getTeamManager() {
        return teamManager;
    }

    public void setTeamManager(Manager teamManager) {
        this.teamManager = teamManager;
    }

    @Override
    public String toString() {
        return "EmployeeTeam: " +
                "team=" + Arrays.toString(team) +
                "manager: " + teamManager.toString();
    }

    public void add (Employee e) {

        if (team == null) {
            this.team = new Employee[capacity]; //
            currentIndex = 0;
        }
        if (currentIndex >= capacity) {
            capacity *= 2;
            team = Arrays.copyOf(team, capacity); //указываем, откуда хотим копировать и задаем длину
        }
        team[currentIndex++] = e;
    }
    public void printTeam(){
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(team[i] + "   ");

        }
        System.out.println();
    }
    public void remove (int n){
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
