package com.beer;

/**
 *
 * @author PC17
 */
public class Beer {
    private String name;
    private double price;

    public Beer() {
    }

    public Beer(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
