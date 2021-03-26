package com.vin;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in); // scanner definition
    private static ArrayList<String> languages = new ArrayList<>(); // Create array list

    public static void main(String[] args) {
        while (true) {
            int input = menu(); // calling menu method
            switch (input) {
                case 1:
                    printContent();
                    break;
                case 2:
                    addLang();
                    break;
                case 3:
                    removeLang();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Please enter a number from 1-4.");
                    break;
            }
        }
    }

    public static int menu() {
        System.out.println("1. Print\n2. Add\n3. Remove\n4. Exit");

        System.out.println("Enter a number: ");
        int input = sc.nextInt();
        sc.nextLine();
        return input;
    }

    public static void printContent() {
        if (languages.isEmpty()) {
            System.out.println("The array is empty.");
        } else
            for (String language : languages) {
                System.out.println(language);
            }
    }

    public static void addLang() {
        System.out.println("Enter a language: ");

        String lang = sc.nextLine();
        languages.add(lang);
        System.out.println("You added " + lang);
    }

    public static void removeLang() {
        System.out.println("Enter a language: ");
        String lang = sc.nextLine();
        if (!languages.contains(lang))
            System.out.println("Language not found.");
        else {
            languages.remove(lang);
            System.out.println("You removed " + lang);
        }
    }
}