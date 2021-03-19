package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    // Assignment: Solve a real problem with a program
    // Proposed solution: A shopping cart tracker
    // Basic features: Counts total Items, displays all items, calculates total price, checks if cart is full, adds new items, type error checking.
    // Requirements fulfilled: post increment, loops and conditionals.

    // Max items in a cart
    private static int max_capacity = 25;
    static boolean end = false;
    static Item[] items = new Item[100];

    public static void main(String[] args) {

        // While end flag is false, continue the program.
        while (!end) {
            // Requests for new item info.
            requestItem();

            // Prints 5 items, for 5 apple added.
            printItems(items);

            // Print total items in cart.
            System.out.println("\nTotal items in the cart: " + countItems(items));

            // Check if the cart is full
            System.out.println("Is the cart full?: " + isFull());

            // Calculate total price
            System.out.println("The current total price is: " + calcTotalPrice(items));

            // Ask whether continue the program.
            System.out.println("\nWould you like to continue the program?\nenter 'yes' to continue\nenter any key to end");
            end = checkEnd();
        }
    }

    static int countItems(Item[] items) {
        int count = 0;
        // Use of Loops
        for (Item i : items) {
            // Use of conditional to check null
            if (i == null)
                break;
            count += i.getQuantity();
        }
        return count;
    }

    static void addItem(Item item) {
        if (isFull()) {
            System.out.println("The cart is full!");
            return;
        }
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return;
            }
        }
        System.out.println("The array is full");
    }

    private static void requestItem() {
        // Create a Scanner object
        Scanner scan = new Scanner(System.in);

        // Requests for item info...
        System.out.println("Please add a new item\nName of item: ");
        String name = scan.nextLine();

        System.out.println("Please add the item's cost in USD\nCost of item: ");
        double cost;

        //Check for incorrect double input
        do {
            while (!scan.hasNextDouble()) {
                System.out.println("That's not a positive double.");
                scan.next();
            }
            cost = scan.nextDouble();
        } while (cost <= 0);

        System.out.println("Please add the quantity of the item\nQuantity of item: ");
        int quantity;

        //Check for incorrect int inputs
        do {
            while (!scan.hasNextInt()) {
                System.out.println("That's not a positive integer.");
                scan.next();
            }
            quantity = scan.nextInt();
        } while (quantity <= 0);

        // Adds item object with info
        Item newItem = new Item(name, cost, quantity);
        addItem(newItem);
    }

    static void printItems(Item[] items) {
        // Use of Loops
        for (Item i : items) {
            // Use of conditional to check null
            if (i == null)
                break;
            System.out.println("All items in cart:\nName: " + i.getName() + "\nQuantity: " + i.getQuantity());
        }
    }

    // Calculates total price
    static double calcTotalPrice(Item[] items) {
        double price = 0;
        // Use of Loops
        for (Item i : items) {
            // Use of conditional to check null
            if (i == null)
                break;
            price += i.getPrice() * i.getQuantity();
        }
        return price;
    }

    // Check if shopping cart is full. Based on quantity of items (eg. 5 apples, 15 tomatoes) vs defined max capacity
    static boolean isFull() {
        // Use of conditionals
        if (countItems(items) > max_capacity)
            return true;

        return false;
    }

    // Sets boolean of 'end' to end application based on user input.
    private static boolean checkEnd() {
        Scanner scan = new Scanner(System.in);
        String response = scan.nextLine().toLowerCase();
        if (response.equals("yes"))
            return false;

        System.out.println("Thank you for using the shopping cart program :)");
        return true;
    }
}
