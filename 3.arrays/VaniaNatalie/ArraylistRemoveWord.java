package com.company;

// Eliminate words that are less than the desired number of letters and ask user if they want
// to add more words
// I use arraylist for this problem because I need a dynamic size array as I allow users to insert
// more words if they desire, so there is no fixed size

import java.util.Scanner;
import java.util.ArrayList;

public class ArraylistRemoveWord {
    public static void main(String[] args){
        // Creating arraylist
        ArrayList<String> arr = new ArrayList<String>();
        char yesNo;

        do {
            // User input
            Scanner obj = new Scanner(System.in);
            System.out.print("How many words do you want to insert? "); // Total words
            int total = obj.nextInt();

            System.out.println("What do you want to insert? (enter after each word) "); // Words inserted
            // Adding words into arraylist
            for (int i = 0; i < total; i++) {
                String val = obj.next();
                arr.add(val);
            }

            // Removing words that do not meet the minimal letters
            System.out.print("What is the minimal number of letters you want to have in your list? "); // Minimal letter number
            int minNum = obj.nextInt();
            arr.removeIf(e -> e.length() < minNum);

            // Printing arraylist
            System.out.print("The contain of arraylist is ");
            for (String e : arr) {
                System.out.print(e + " ");
            }

            // User input
            System.out.print("\nDo you want to add more more words? (y/n) ");
            yesNo = obj.next().charAt(0);

        } while (yesNo == 'y' || yesNo == 'Y');
    }
}
