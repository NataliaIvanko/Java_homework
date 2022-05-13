package com.company;

public class Person {
    private String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
