package controllers;

import models.Product;
import utils.Rounder;
import views.SalesView;

public class ProductController extends Rounder {

    Product model;
    SalesView view;

    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        String name = model.getName();
        double income = model.getIncome();
        double tax = model.getTax(income);
        double netIncome = model.getIncome(income, tax);

        String output = "Product name: " + name +
                "\nAll income (uah): " + roundPrice(income) +
                "\nTax (uah): " + roundPrice(tax) +
                "\nNet Income (uah): " + roundPrice(netIncome);

        view.getOutput(output);
    }
}
