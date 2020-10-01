package com.company;

public class Hamburger {
    private final String name;
    private final String meat;
    private final String bread;
    private final double price;


    private String additionalItem1;
    private double add1Price;
    private String additionalItem2;
    private double add2Price;
    private String additionalItem3;
    private double add3Price;
    private String additionalItem4;
    private double add4Price;

    public void addAamburgerAddition1(String name, double price){
        this.additionalItem1 = name;
        this.add1Price = price;
    }
    public void addAamburgerAddition2(String name, double price){
        this.additionalItem2 = name;
        this.add2Price = price;
    }
    public void addAamburgerAddition3(String name, double price){
        this.additionalItem3 = name;
        this.add3Price = price;
    }
    public void addAamburgerAddition4(String name, double price){
        this.additionalItem4 = name;
        this.add4Price = price;
    }

    public Hamburger(String name, String meat, String bread, double price) {
        this.name = name;
        this.meat = meat;
        this.bread = bread;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBread() {
        return bread;
    }

    public double getPrice() {
        return price;
    }

    public double hamburgerPrice(){
        final double taxRate = 0.06;
        double hamburgerPrice = this.price;
        System.out.println("Burger Name: " + this.name + "\n" +
                            "Bread type: " + this.bread + "\n" +
                            "The price is: " + this.price);
        if (this.additionalItem1 != null){
            System.out.println(this.additionalItem1 + " item added" + "\n" +
                               "item Price " + this.add1Price);
            hamburgerPrice += add1Price;
        }
        if (this.additionalItem2 != null){
            System.out.println(this.additionalItem2 + " item added" + "\n" +
                    "item Price " + this.add2Price);
            hamburgerPrice += add2Price;
        }
        if (this.additionalItem3 != null){
            System.out.println(this.additionalItem3 + " item added" + "\n" +
                    "item Price " + this.add3Price);
            hamburgerPrice += add3Price;
        }
        if (this.additionalItem4 != null){
            System.out.println(this.additionalItem4 + " item added" + "\n" +
                    "item Price " + this.add4Price);
            hamburgerPrice += add4Price;
        }

        System.out.println("Order Price: " + hamburgerPrice + "\n" +
                            "Tax: " + (taxRate * hamburgerPrice )+ "\n" +
                            "Total price: " + ((hamburgerPrice) + (hamburgerPrice * taxRate)) );
        return hamburgerPrice;

    }

}
