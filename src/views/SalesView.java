package views;


import models.Product;
import utils.Validator;

import java.util.Scanner;

public class SalesView {

    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;

    Product product;

    public SalesView(Product product) {
        this.product = product;
    }

    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Enter product name: ";
        System.out.println(title);
        name = Validator.validateName(scanner);
        product.setName(name);


        title = "Enter Quantity: ";
        System.out.println(title);
        quantity = Validator.validateQuantityInput(scanner);
        product.setQuantity(quantity);

        title = "Enter price: ";
        System.out.println(title);
        price = Validator.validatePriceInput(scanner);
        product.setPrice(price);

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }

}
