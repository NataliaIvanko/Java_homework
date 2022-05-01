package com.company;

public class Email implements MailDeliveryService{
    public void sendMail() {
        System.out.println("Send by internet");
    }
}
