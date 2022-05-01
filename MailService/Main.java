package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Sender sender = new Sender();
        Scanner sc = new Scanner(System.in);
        System.out.println("Which way would you prefer to use to send your mail?");
        String name = sc.nextLine();
        name = name.toLowerCase();
        switch(name){

            case "dhl":sender.send(new DHL());
                break;
            case "pigeon": sender.send(new Pigeon());
                break;
            case "email": sender.send(new Email());
                break;
            default: System.out.println("Enter something");
                break;
         }
        sc.close();








        }
}
