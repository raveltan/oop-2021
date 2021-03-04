package com.example.gradeconversion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;

        System.out.println("-----GRADE CONVERSION (NUMERICAL TO LETTER)-----");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of grades you want to convert: ");
        n = scanner.nextInt();

        int[] grades = new int[10];

        System.out.println("Enter your numerical grades: ");
        for (int i = 0; i < n; i++) {
            grades[i] = scanner.nextInt();
        }


        System.out.println("\nList of letter grades:");
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 90) {
                System.out.println("A");
            } else if (grades[i] >= 85) {
                System.out.println("A-");
            } else if (grades[i] >= 80) {
                System.out.println("B+");
            } else if (grades[i] >= 75) {
                System.out.println("B");
            } else if (grades[i] >= 70) {
                System.out.println("B-");
            } else if (grades[i] >= 65) {
                System.out.println("C");
            } else if (grades[i] >= 50) {
                System.out.println("D");
            } else if (grades[i] >= 1) {
                System.out.println("E");
            } else {
                System.out.print("");
            }
        }
    }
}
