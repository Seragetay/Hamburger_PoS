package com.company;

public class DeluxBurger extends Hamburger{
    public DeluxBurger(String bread, double price) {
        super("Deluxe", "Sausage and Beacon", bread, price);
        super.addAamburgerAddition1("Chips", 1);
        super.addAamburgerAddition2("Drink", 2.5);
    }

    @Override
    public void addAamburgerAddition1(String name, double price) {
        System.out.println("No item can be added to the Deluxe burger!!");
    }

    @Override
    public void addAamburgerAddition2(String name, double price) {
        System.out.println("No item can be added to the Deluxe burger!!");
    }

    @Override
    public void addAamburgerAddition3(String name, double price) {
        System.out.println("No item can be added to the Deluxe burger!!");
    }

    @Override
    public void addAamburgerAddition4(String name, double price) {
        System.out.println("No item can be added to the Deluxe burger!!");
    }
}
