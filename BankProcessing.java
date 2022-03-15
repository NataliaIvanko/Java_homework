package com.company;

public class BankProcessing {
    Account[] bankAccounts;


    public BankProcessing(Account[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public String toString() {
        String strSummary = "";
        for (int i = 0; i < bankAccounts.length; i++) {

            strSummary += bankAccounts[i].toString();
        }
        return strSummary;
    }

    public Person[] getClients() {

        Person[] clients = new Person[bankAccounts.length];

        for (int i = 0; i < bankAccounts.length; i++) {
            clients[i] = bankAccounts[i].client;
        }
        return clients;
    }

    public String secureToString() {
        String strSummary = "";
        for (int i = 0; i < bankAccounts.length; i++) {

            strSummary += bankAccounts[i].secureToString()+" ";
        }
        return strSummary;
    }
    public double sumBalance(){
        double sum = 0;
        for (int i = 0; i < bankAccounts.length; i++) {
            sum += bankAccounts[i].getBalance();
        }
        return sum;
    }
}
