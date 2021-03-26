package com.company;

// Finding the maximum and minimum differences of the numbers user inputted
// I use array for this problem because the user has to input the number of elements they want
// to insert the elements so we don't really need a dynamic size array,
// a fixed size array would suffice

import java.util.Scanner;

public class ArrayDifferences {
    public static void main(String[] args){
        // User input for number of elements
        Scanner obj = new Scanner(System.in);
        System.out.print("How many elements do you want to insert? (enter after each element) ");
        int numOfElement = obj.nextInt();

        // Creating array
        int[] arr = new int[numOfElement];

        // Inserting element in array
        System.out.println("Enter elements: ");
        for(int i  = 0; i < numOfElement; i++){
            int val = obj.nextInt();
            arr[i] = val;
        }

        // Sort array and get the highest num, second lowest num and lowest num
        java.util.Arrays.sort(arr);
        int highest = arr[arr.length - 1]; // last index
        int secondLow = arr[1];
        int lowest = arr[0];
        int maxDiff = highest - lowest;
        int minDiff = secondLow - lowest;
        System.out.printf("The max difference is %d \n", maxDiff);
        System.out.printf("The min difference is %d", minDiff);
    }
}
