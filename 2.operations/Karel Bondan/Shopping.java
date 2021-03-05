package com.latihan.shopping;
import java.util.*;
import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        Scanner userOpt = new Scanner(System.in);
        int option;
        do {
            System.out.print("What do you want to do?\n1. Add items\n2. Remove items\n3. View items\n4. Exit\nEnter your choice: ");
            option = userOpt.nextInt();
            if (option >= 1 && option <= 4) {
                if (option == 1) {
                    System.out.print("What do you want to add to your shopping list? ");
                    String userInput = input.nextLine();
                    while (!userInput.toLowerCase(Locale.ROOT).equals("exit")) {
                        shoppingList.add(userInput.toLowerCase(Locale.ROOT));
                        System.out.print("Another one? (Type 'exit' to finish): ");
                        userInput = input.nextLine();
                    }
                } else if (option == 2) {
                    if (shoppingList.isEmpty()){
                        System.out.println("\nYour list is empty. Add something first.\n");
                    } else {
                        System.out.println("Your current items are: ");
                        int index = 1;
                        for (int i = 0; i <= shoppingList.size()-1; i++){
                            System.out.println(index + "." + shoppingList.get(i));
                            index++;
                        }
                        System.out.print("What do you want to remove? (type the item name) ");
                        String userInput = input.nextLine().toLowerCase(Locale.ROOT);
                        for (int i = 0; i <= shoppingList.size()-1; i++){
                            if (shoppingList.get(i).equals(userInput)){
                                shoppingList.remove(userInput);
                                System.out.println("Removed \"" + userInput + "\" from your shopping list.");
                                break;
                            } else if (!shoppingList.contains(userInput)){
                                System.out.println("No such item exist in your shopping list. Please check again");
                            }
                        }
                    }
                } else if (option == 3){
                    if (shoppingList.isEmpty()) {
                        System.out.println("\nYour list is empty. Add something first.\n");
                    } else {
                        System.out.println("Your shopping items are:");
                        int index = 1;
                        for (int i = 0; i <= shoppingList.size() - 1; i++) {
                            System.out.println(index + ". " + shoppingList.get(i));
                            index++;
                        }
                        System.out.println(" ");
                    }
                }
            }
        } while (option != 4) ;
    }
}