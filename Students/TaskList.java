package com.company;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements Observable{

    private List<Task> tasks = new ArrayList<>();

    private List<Observer> list = new ArrayList<>();


    @Override
    public void add(Observer observer) { //предоставил вовне возм-ть подписаться на его события.
        // все, кто подписывается на его событие, обязаны реализовывать интерфейс Observer
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        list.remove(observer);
    }
    public void addTask(Task task){
        this.tasks.add(task);
        this.notifyObserevers();
    }

    @Override
    public void notifyObserevers() {
        for (Observer observer : list) { //observer - в эу переменную кладет. list - откуда берет
            observer.handleEvent();
        }
    }

    public void removeTask(Task task){
        this.tasks.remove(task);
        this.notifyObserevers();
    }
}
