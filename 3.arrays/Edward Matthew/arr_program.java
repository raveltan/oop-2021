package com.company;
import java.util.Arrays;
import java.util.Scanner;

// program to find the maximum sum and minimum sum of the elements - 1 in an array
public class arr_program {
    public static void main(String[] args) {
        int n, val, min, max, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            val = sc.nextInt();
            arr[i] = val;
        }

        // sorting the array
        Arrays.sort(arr, 0, n);
        // getting the min and max sum of the array
        for (int i = 0; i < n; i++)
            sum += arr[i];

        max = sum - arr[0];
        min = sum - arr[n-1];

        System.out.printf("The maximum sum of the elements in the array is %d, the minimum sum is %d", max, min);
    }
}
