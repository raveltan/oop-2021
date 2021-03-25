package com.company;
import java.util.Scanner;

// This simple program uses arrays with a size of 3 to store objects of the Person class, because
// there are only 3 people. In the Person class, ArrayLists are used to manage each person's items,
// because the quantity of items are not predictable,

// Assignment: Create an application that uses array and arraylist, wherever
// possible write a comment about why you choose one or thoe other.

public class Main {

    static Person[] people = new Person[3]; // Use of array. It has immutable size because the size is known beforehand.
    static boolean flag = true;

    public static void main(String[] args) {

        // I use an array of Person class, because the number of people does not change.
        // Meanwhile, because their inventory is a indeterminable size, it is an arraylist.
        people[0] = new Person(askName());
        people[1] = new Person(askName());
        people[2] = new Person(askName());

        Scanner scan = new Scanner(System.in);

        while(flag) {
            System.out.println("1. Add equipment for " + people[0].getName() +
                    "\n2. Add equipment for " + people[1].getName() +
                    "\n3. Add equipment for " + people[2].getName() +
                    "\nOr choose 4 to exit");
            int choice = scan.nextInt();

            chooseMenu(choice);
            printAllItems(people);
        }
    }

    // Prints each person's items.
    public static void printAllItems(Person[] p)
    {
        System.out.println("All people's equipment shown below");
        for (Person person: p)
        {
            System.out.println(person.getName() + " has " + person.getItems());
        }
    }

    // Manages each selection to add item.
    public static void chooseMenu(int choice)
    {
        switch (choice){
            case 1:
                people[0].addItem(askItem());
                break;
            case 2:
                people[1].addItem(askItem());
                break;
            case 3:
                people[2].addItem(askItem());
                break;
            case 4:
                flag=false;
                System.exit(0); // Exits application
                break;
        }
    }

    // Request the name of new equipment
    public static String askItem()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What's the name of the new equipment?");

        String name = scan.nextLine();
        return name;
    }

    // Requests each person's name.
    public static String askName()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose 3 names, for all 3 people)");

        String name = scan.nextLine();
        return name;
    }
}