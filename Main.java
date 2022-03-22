package com.company;

public class Main {

    public static void main(String[] args) {
        Manager m1 = new Manager("Jane", 3000, 150, 300);
        Manager m2 = new Manager("John", 3500, 200, 320);
        SalesAssistant sa1 = new SalesAssistant("Kate", 1500, 200);
        SalesAssistant sa2 = new SalesAssistant("Kai", 1400, 420);

        Books book1 = new Books("Misery", "Stephen King", 15, 280);
        Books book2 = new Books("The painted Veil", "Somerset Maugham", 18, 350);

        Poster p1 = new Poster("Happy day", "A family on the beach", 12);
        Poster p2 = new Poster("Laziness", "A sleeping cat", 10);


        Employee[] employee = {m1, m2, sa1, sa2};
        for (int i = 0; i < employee.length; i++) {

            System.out.println(employee[i].toString());

        }
        Goods[] goods = {book1, book2, p1, p2};
        for (int i = 0; i < goods.length; i++) {
            System.out.println(goods[i].toString());

        }
    }
}




