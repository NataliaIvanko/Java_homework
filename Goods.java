package com.company;

public class Goods {
    String title;
    double price;

    public Goods(String title, double price){
        this.title = title;
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
