package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //1.Есть два класса: Address  с полями улица и номер дома  и Person с полями
        // имя  и Address. Нужно написать метод, который по списку persons  возвращает
        // список их адресов

        //2. Есть список с именами Ivan, Maria, Stephan, John, Amalia. Написать
        // метод, возвращающий список в котором не содержатся имена исходного листа длиной 4

        //3.Есть два листа одинковой длины с числами. Написать метод, который вернет лист с элементами Yes or No
        //где значение на i-ом месте зависит от того, равны ли элемениы двух спсиков под номером i
        // {1,2,3,4} and {5,2,3,0}->{No,Yes,Yes,No}

        //4.Написать метод, реверсирующий лист целых чисел. возвращает его в обратном порядке. Можно решать любым
        // способом, какой вам нравится.



        Address a1 = new Address("Leizigerstr.", 15);
        Address a2 = new Address("Wilhelmstr.", 45);

        Person p1 = new Person("Jack", a1);
        Person p2 = new Person("Jack", a2);


        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);

        List<Address> addresses = new ArrayList<>();
        addresses = getAddress(persons);

        System.out.println(addresses);


    }
    public static List<Address> getAddress(List<Person>persons){
        List<Address> addresses = new ArrayList<>();
        for(Person p : persons){
            addresses.add(p.getAddress());
        }
        return addresses;
    }
}
