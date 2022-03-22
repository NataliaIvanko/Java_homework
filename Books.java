package com.company;

public class Books extends Goods{
    private String author;
    double pageQuantity;

    public Books(String title, String author, double price, double pageQuantity){
        super(title, price);
        this.author = author;
        this.pageQuantity = pageQuantity;
    }

    @Override
    public String toString() {
        return "Books{" +
                "pageQuantity=" + pageQuantity +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
