package com.company;

public class Account {
   private String IBAN;
   Person client;
   private double balance;

    public Account(String iban, Person client, double balance){
        this.IBAN = iban;
        this.client = client;
        this.balance = balance;
    }

    public String getIBAN() {
        return IBAN;
    }
    public double getBalance(){
        return  balance;
    }

    public String toString(){
        return this.IBAN + " " + this.client + " " + this.balance;
    }

    public String secureToString(){
        String output = "";

        for (int i = 0; i < this.IBAN.length(); i++) {
            if((i < 4) || (i > this.IBAN.length()-3)){
                char ch = this.IBAN.charAt(i);
                output= output+ch;
            }else{
                output += "*";
            }
        }
        return output;
    }

}
