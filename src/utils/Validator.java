package utils;

import java.util.Scanner;

public class Validator {

    public static String validateName(Scanner scanner) {
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.println("Empty! Enter product name: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }

    public static int validateQuantityInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - not a number!\n", str);
            System.out.println("Enter quantity: ");
        }
        int quantity = scanner.nextInt();
        while (quantity <= 0) {
            System.out.println("Incorrect value! Enter Quantity: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - not a number!\n", str);
                System.out.println("Enter quantity: ");
            }
            quantity = scanner.nextInt();
        }
        return quantity;
    }

    public static float validatePriceInput(Scanner scanner) {
        while (!scanner.hasNextFloat()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - not a number!\n", str);
            System.out.println("Enter price: ");
        }
        float price = scanner.nextFloat();
        while (price <= 0) {
            System.out.println("Incorrect value! Enter price: ");

            while (!scanner.hasNextFloat()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - not positive value!\n", str);
                System.out.println("Enter price: ");
            }
            price = scanner.nextFloat();
        }
        return price;
    }
}
