package models;


import base.Fiscal;
import base.Income;

public class Product implements Income, Fiscal {

    private String name;
    private int quantity;
    private double price;
    private final static double TAX = 0.05;

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getIncome() {
        return quantity * price;
    }

    @Override
    public double getTax(double income) {
        return income * TAX;
    }

    @Override
    public double getIncome(double income, double taxPrice) {
        return income - taxPrice;
    }

}
