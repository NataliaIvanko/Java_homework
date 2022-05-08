package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTeamTest {
    EmployeeTeam et = new EmployeeTeam();
    Employee e1 = new Manager("Jasper", 1000, 200);
    Employee e2 = new Manager("Kasper", 1000, 200);
    Employee e3 = new Manager("Basper", 1000, 200);
    Employee e4 = new Manager("Dasper", 1000, 200);

    @BeforeEach
    public void init(){
        this.et = new EmployeeTeam();
    }
    //1. Массив пустой
    //2. несколько элементов, но рост не предполагается
    //3. несколько элементов, рост редполагается
    //4. может сать пустым
    @Test
    void sizeOfEmployeeTeam(){
        this.et.add(new Programmer("Gera", 10));
        Assertions.assertEquals(1, et.size());
        this.et.add(new Programmer("Sarah", 100));
        Assertions.assertEquals(2, et.size()); //If the first test fails the second is impossible to check

    } //checks the same as the one below

    @Test
    void addEmployeeToTeam() {

        Employee e = new Manager("Jasper", 1000, 200);
        et.add(e);
        int expected = 1;
        int given = et.size();
        Assertions.assertEquals(expected, given);

    }
    @Test
    void findEmployeeNormalCase(){
        this.et.add(new Programmer("Gera", 10));
        Assertions.assertEquals(0, et.findEmployee(new Programmer("Gera", 10)));
    }
    @Test
    void addEmployeeCheckIfSizeIncreased(){
        int previousSize = et.size();
        et.add(new Programmer("Alex", 1200));
        Assertions.assertEquals(1, et.size());

    }
    @Test
    void addEmployeeCheckIfSizeDecreased() {//size does not change
        int previousSize = et.size();
        et.add(new Programmer("Alex", 1200));
        et.remove(new Programmer("Alex", 1200));
        Assertions.assertEquals(previousSize, 0);
    }
    @Test
    void addEmployeeCheckAddedEmployeeInTeamIfNull(){
        int previousSize = et.size();
        et.add(null);
        Assertions.assertEquals(previousSize, et.size());
    }
    @Test
    void addEmployeeCheckAddedEmployeeInTeam(){
        et.add(new Programmer("Alex", 1200));
        Employee e = et.get(0);
        Assertions.assertEquals(new Programmer("Alex", 1200), e);
    }
    @Test
    void getEmployeeIfIndexIsIncorrect(){//
        this.et.add(new Programmer("Gera", 10));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> this.et.get(2));
    }
    @Test
    void removeEmployeeCheckRemovedEmployeeIsNotInTeam(){
        et.add(new Programmer("Alex", 1200));
        et.remove(new Programmer("Alex", 1200));
        int indexOfEmployee = et.findEmployee(new Programmer("Alex", 1200));
        Assertions.assertEquals(-1, indexOfEmployee);
    }

    @Test
    void CapacityGrowsWhenCurrentIndexIsGreaterThanCapacity() {

        et.add(e1);
        et.add(e2);
        et.add(e3);
        et.add(e4);
       int expected = 4;
       int given = et.capacity;
        Assertions.assertEquals(expected, given);
    }

    @Test
    void EmployeeIsRemoved() {
        et.add(e1);
        et.add(e2);
        et.add(e3);
        et.add(e4);
        et.remove(e1);
        et.remove(e2);
        et.remove(e3);

        int expected = 1;
        int given = et.size();
        Assertions.assertEquals(expected, given);
    }
   @Test
   void EmployeeIsRemovedByIndex() {
       et.add(e1);
       et.add(e2);
       et.add(e3);
       et.remove(0);
       et.remove(1);
       Assertions.assertEquals(1, et.size());

   }
   }