package com.company;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Program to find the occurrences of the maximum value of an array the user inputted
public class arrlist_program {
    public static void main(String[] args) {
        int n, max, index, value = 0, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of elements you want to put into the array: ");
        n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Enter the elements you want to put in the array");
        for (int i = 0; i < n; i++) {
            value = sc.nextInt();
            arr.add(value);
        }
        // sorting the array
        Collections.sort(arr);
        // finding the max value of the arr
        max = arr.get(n-1);

        // looping to find the occurences
        for (int i = 0; i < n; i++) {
            index = arr.get(i);
            if (index == max)
                count++;
        }

        System.out.printf("The maximum element of the array is %d", max);
        System.out.printf(" with %d number of occurrences", count);
    }
}
