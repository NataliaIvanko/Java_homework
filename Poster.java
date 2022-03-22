package com.company;

public class Poster extends Goods{
   private String pictureDescription;
    public Poster(String title, String pictureDescription, double price){
        super(title, price);
        this.pictureDescription = pictureDescription;

    }

    @Override
    public String toString() {
        return "Poster{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", pictureDescription='" + pictureDescription + '\'' +
                '}';
    }
}
