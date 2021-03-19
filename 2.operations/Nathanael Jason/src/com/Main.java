package com;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int temp = 24;
        int input;

        System.out.println("Hello! The current temperature is " + temp + " Degrees Celsius.");
        System.out.println("Do you want the temperature to be hotter or cooler");
        System.out.println("1. Hotter");
        System.out.println("2. Cooler");

        Scanner S = new Scanner(System.in);
        input = S.nextInt();

        if (input == 1) {
            temp++;
            System.out.println("The current temperature is " + temp + " Degrees Celsius.");
        }
        else if (input == 2) {
            temp--;
            System.out.println("The current temperature is " + temp + " Degrees Celsius.");
        }
        else {
            return;
        }
    }
}

