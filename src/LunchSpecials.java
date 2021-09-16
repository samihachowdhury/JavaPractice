package com.company;

public class LunchSpecials {
    public int priceAdjustment1;
    public int priceAdjustment2;
    public int portionAdjustment1;
    public int portionAdjustment2;
    public MenuItems item1;
    public MenuItems item2;

    public LunchSpecials(MenuItems item1, MenuItems item2) {
        this.item1 = item1;
        this.item2 = item2;
        this.priceAdjustment1 = 60;
        this.priceAdjustment2 = 70;
        this.portionAdjustment1 = 80;
        this.portionAdjustment2 = 80;

    }

    public String toString() {
        return "Lunch Special: " + this.item1 + " and " + this.item2;
    }
}