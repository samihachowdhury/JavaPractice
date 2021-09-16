package com.company;

public class MenuItems {
    //Instance Variables
    public int priceInDollars;
    public String name;
    public boolean available;

    //    Constructors
    public MenuItems (int priceInDollars, String name) {
        this.priceInDollars = priceInDollars;
        this.name = name;

    }
    // Try to override toString()
    public String toString() {
        return name;
    }
}