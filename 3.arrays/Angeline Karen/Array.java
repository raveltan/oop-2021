package com.buatkode.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    // Static class variable -> get memory only once, not unique
    // Use int instead of Integer for faster performance
    private static String[] studentName;
    private static int score[];

    public static void main(String[] args){
        String userType;
        String finalIns;

        // Getting user Input for the array size
        Scanner Input2 = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        int sizeInput2 = Input2.nextInt();

        // Make the array
        studentName = new String[sizeInput2];
        score = new int[sizeInput2];

        do {
            // Getting user Input for the user type (teacher/student)
            Scanner typeIn = new Scanner(System.in);
            System.out.print("Sign in as teacher/student: ");
            userType = typeIn.nextLine().toLowerCase();

            // Teacher -> goes in to teacherMenu
            if (userType.equals("teacher")) {
                teacherMenu();
            }

            // Student -> goes in to studentMenu
            else if (userType.equals("student")) {
                studentMenu();
            }

            // Invalid input for user type
            else {
                System.out.println("Invalid input");
            }

            // Asking the user input if they wanted to sign in with different role
            Scanner nextIn = new Scanner(System.in);
            System.out.print("Continue signing in with different role? (y/n): ");
            finalIns = nextIn.nextLine().toLowerCase();
        } while (finalIns.equals("y"));

        System.out.println("Program executed!");
    }

    // Static method -> practically easier and shorter with its static imports
    // Method for the teacher's menu
    static void teacherMenu() {
        String forInput2;
        String nameInput;
        String finalIn2;

        System.out.println("Welcome teacher! ");
        Scanner userInput2 = new Scanner(System.in);
        System.out.print("Enter students name: ");
        forInput2 = userInput2.nextLine();
        // Getting userInput split by a comma
        studentName = forInput2.split(",");

        System.out.println("Student: "+ Arrays.toString(studentName));

        do {
            Scanner userIn = new Scanner(System.in);
            System.out.print("Search name: ");
            nameInput = userIn.nextLine().toLowerCase();
            for (String stud : studentName) {
                if (stud.toLowerCase().equals(nameInput)) {
                    // Find the index for the name input
                    int forIndex = findIndex(studentName, nameInput);
                    Scanner userIns = new Scanner(System.in);
                    System.out.print("Score: ");
                    int studentScore = userIns.nextInt();
                    // Store the score at the same index for the name index
                    score[forIndex] = studentScore;
                    System.out.println("List of score: "+Arrays.toString(score));
                    break;
                }
            }
            System.out.println();
            Scanner nextIn = new Scanner(System.in);
            System.out.print("Continue adding student score? (y/n): ");
            finalIn2 = nextIn.nextLine().toLowerCase();
        } while(finalIn2.equals("y"));
    }

    // Static method -> practically easier and shorter with its static imports
    // Method for the student's menu
    static void studentMenu() {
        String nameIN;
        String finalIn;

        System.out.println("Welcome Student!");
        do {
            Scanner studentIn = new Scanner(System.in);
            System.out.print("Your name: ");
            nameIN = studentIn.nextLine().toLowerCase();
            for (String n : studentName) {
                if (n.toLowerCase().equals(nameIN)) {
                    // Search for the user name input index
                    int nameIndex = findIndex(studentName, nameIN);
                    // Print the student name along with the score
                    System.out.printf("Name: %s, Score: %s", studentName[nameIndex], score[nameIndex]);
                    System.out.println();
                    // Check if the score is below 75, remedial is required
                    if (score[nameIndex] < 75) {
                        System.out.println("Remedial is required");
                    }
                    else {
                        System.out.println("Score passed!");
                    }
                    break;
                }
            }
            System.out.println();
            Scanner nextIn = new Scanner(System.in);
            System.out.print("Do you want to continue(y/n): ");
            finalIn = nextIn.nextLine().toLowerCase();
        } while(finalIn.equals("y"));

    }

    // Static method -> practically easier and shorter with its static imports
    // Method to find the index
    static int findIndex(String studentName[], String name) {
        int len = studentName.length;
        int i =0;
        while (i<len) {
            // Check for the index when name meets the name inside the array
            if (studentName[i].equals(name)) {
                return i;
            }
            else {
                i++;
            }
        }
        return 0;
    }
}
