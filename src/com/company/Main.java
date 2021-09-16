package com.company;
// We dont need to import when its in the same package
//import com.company.MenuItem;
public class Main {
    public static void main(String[] args) {
        MenuItems mongBeef = new MenuItems(25, "Mongolian Beef");
        System.out.println(mongBeef);
        MenuItems kPChick = new MenuItems(20, "Kung Pao Chicken");
        System.out.println(kPChick);
        LunchSpecials myLunchSpecial = new LunchSpecials(mongBeef, kPChick);
        System.out.println(myLunchSpecial);
    }
}