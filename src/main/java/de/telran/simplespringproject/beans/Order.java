package de.telran.simplespringproject.beans;

import org.springframework.stereotype.Component;

@Component
public class Order {
    private String item = "ItemFromClass";
    private double price = 5.48;

    public Order() {
    }

    public Order(String item, double price) {
        this.item = item;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "item='" + item + '\'' +
                ", price=" + price +
                '}';
    }
}
