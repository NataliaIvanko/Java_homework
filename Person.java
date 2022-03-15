package com.company;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String fN, String lN){
        this.firstName = fN;
        this.lastName = lN;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public String toString(){
        return this.firstName + " " + this.lastName;
    }

}
