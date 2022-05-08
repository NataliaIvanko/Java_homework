package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class EmployeeTeamLinkedList {

    private List<Employee> employeeList = new LinkedList<>();

    public EmployeeTeamLinkedList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void add(Employee employee) {
        employeeList.add(employee);
    }

    public void remove(Employee employee) {
        employeeList.remove(employee);
    }

    public void add(int index, Employee employee) {
        if(index >= employeeList.size()) index = employeeList.size();
        if(index <0 ) index = 0;

        employeeList.add(index, employee);
    }

    public void print(Employee employee) {
        System.out.println(employeeList);
    }

    public int findEmployee(Employee employee) {
        if (employee != null)
            for (int i = 0; i < employeeList.size(); i++) {
                if (employeeList.get(i) != null &&
                        employeeList.get(i).hashCode() == employee.hashCode() &&
                        employeeList.get(i).equals(employee))
                    return i;
            }
        return -1;
    }

    public void removeAll() {
        employeeList.clear();
    }
    public EmployeeTeamLinkedList(){

    }
    public EmployeeTeamLinkedList findByName(String name) {
        EmployeeTeamLinkedList employeeTeamLinkedList = new EmployeeTeamLinkedList();
        if (name == null) return employeeTeamLinkedList;
        for (int i = 0; i < employeeTeamLinkedList.employeeList.size(); i++) {
            if (employeeTeamLinkedList.employeeList.get(i).getName().equals(name)) {
                employeeTeamLinkedList.employeeList.add(employeeList.get(i));
            }

        }
        return employeeTeamLinkedList;
    }
    public EmployeeTeamLinkedList findAllBySpeciality(String name){
        EmployeeTeamLinkedList newTeamLL = new EmployeeTeamLinkedList();
        if(name == null) return newTeamLL;
        for (int i = 0; i < this.employeeList.size(); i++) {
            switch(name){
                case "programmer":
                    if (this.employeeList.get(i) instanceof Programmer) newTeamLL.add(this.employeeList.get(i));

                case "qa":
                    if (this.employeeList.get(i) instanceof QAEngineer) newTeamLL.add(this.employeeList.get(i));

            }
        }
        return newTeamLL;
    }

}