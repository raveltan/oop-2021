package com.example.classstudents;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        boolean active = true;  // variable for the while loop
        int input;  // user input in the main menu
        String name;    // user input after choosing one of the choices
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        String[] bestStudents = new String[3];
        ArrayList<String> students = new ArrayList<>();

        while (active) {
            System.out.println("*** MENU ***");
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. View all students");
            System.out.println("4. Add best students");
            System.out.println("5. Remove best students");
            System.out.println("6. View all best students");
            System.out.println("7. Exit\n");

            System.out.print(">> ");
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    // Adds a student to ArrayList
                    System.out.print("\nEnter name of student to be added: ");
                    name = scanner2.nextLine();
                    students.add(name);
                    Collections.sort(students); // Automatically sorts alphabetically after every addition
                    break;

                case 2:
                    // Removes a student from ArrayList
                    System.out.print("\nEnter name of student to be removed: ");
                    name = scanner2.nextLine();
                    students.remove(name);
                    Collections.sort(students);
                    break;

                case 3:
                    // Display all the students in the ArrayList
                    System.out.println("");
                    for (String i : students) {
                        System.out.println(i);
                    }
                    System.out.println("");
                    break;

                case 4:
                    // Add students to Array called bestStudents
                    // Checks if Array is filled with names
                    if (bestStudents[0] != null && bestStudents[1] != null && bestStudents[2] != null) {
                        System.out.println("\nCannot add more students, list is full.\n");
                    } else {
                        System.out.println("\nEnter student name from the list of students: ");
                        for (String i : students) {
                            System.out.println(i);
                        }
                        System.out.print(">> ");
                        name = scanner2.nextLine();
                        if (students.contains(name)) {  // Checks if the name input by user is available in ArrayList
                            for (int i = 0; i < bestStudents.length; i++) {
                                if (bestStudents[i] == null) {
                                    bestStudents[i] = name;
                                    break;
                                }
                            }
                        } else {
                            System.out.println("\nName does not exist.\n");
                        }
                    }
                    break;

                case 5:
                    // Remove a student from Array of bestStudents
                    // Checks if Array is empty
                    if (bestStudents[0] == null && bestStudents[1] == null && bestStudents[2] == null) {
                        System.out.println("\nNo one to be removed.\n");
                    } else {
                        System.out.println("\nBest students:");
                        for (String i : bestStudents) {
                            System.out.println(i);
                        }
                        System.out.println("");
                        System.out.print("Enter the name of the student to be removed: ");
                        name = scanner2.nextLine();
                        for (int i = 0; i < bestStudents.length; i++) {
                            if (name.equals(bestStudents[i])) {
                                bestStudents[i] = null;
                            }
                        }
                    }
                    break;

                case 6:
                    // Displays all the best students
                    System.out.println("");
                    for (String i : bestStudents) {
                        if (i == null) {
                            break;
                        }
                        System.out.println(i);
                    }
                    System.out.println("");
                    break;

                case 7:
                    active = false;
                    break;
            }
        }
    }
}
