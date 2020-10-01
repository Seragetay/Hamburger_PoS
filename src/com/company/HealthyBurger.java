package com.company;

public class HealthyBurger extends Hamburger{
    private String healthChoice1;
    private double healthyPrice1;

    private String healthChoice2;
    private double healthyPrice2;

    public HealthyBurger(double price) {
        super("Healthy", "Veggi", "Whole wheat", price);
    }

    public void addHealthyChoice1(String name, double price){
        this.healthChoice1 = name;
        this.healthyPrice1 = price;
    }

    public void addHealthyChoice2(String name, double price){
        this.healthChoice2 = name;
        this.healthyPrice2 = price;
    }

    @Override
    public double hamburgerPrice() {
        double healthyprice = super.hamburgerPrice();
        System.out.println(healthyprice);
        if (healthChoice1 != null){
            System.out.println("Health Item Added: " + this.healthChoice1 + "\n"+
                                "Price: " + this.healthyPrice1);
            healthyprice += this.healthyPrice1;
        }
        if (healthChoice2 != null){
            System.out.println("Health Item Added: " + this.healthChoice2 + "\n"+
                    "Price: " + this.healthyPrice2);
            healthyprice += this.healthyPrice2;
        }
        System.out.println("Healthy Burger price: " + healthyprice);
        return healthyprice;
    }
}
