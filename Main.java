package com.company;

public class Main {

    public static void main(String[] args) {
	Person person1 = new Person("John", "Doe");
    Person person2 = new Person ("Jane", "Dow");



    Account account1 = new Account("DE8535689456", person1, 12);
    Account account2 = new Account("DE853", person1, 12);
    Account account3 = new Account("DE853", person1, 12);


    Account[] accounts = {account1, account2, account3};

    BankProcessing bp = new BankProcessing(accounts);

    System.out.println(bp.toString());

    System.out.println(account1.secureToString());
    System.out.println(bp.secureToString());
    System.out.println(bp.sumBalance());

    }
}
