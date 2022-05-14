package com.company;

public interface Observable {
    void notifyObserevers();
    void add(Observer observer);
    void remove(Observer observer);
}
