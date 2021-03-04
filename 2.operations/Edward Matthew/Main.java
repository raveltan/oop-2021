package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double no, nt, t2;
        int t;
        // taking the input
        System.out.println("==HALF LIFE CALCULATOR==");
        System.out.print("Enter the initial amount of substance here: ");
        no = sc.nextDouble();

        System.out.print("Enter the amount of days elapsed here: ");
        t = sc.nextInt();

        System.out.print("Enter the half life of the substance(in days): ");
        t2 = sc.nextDouble();

        // calculating the remaining substances
        for (int i=1; t>0; i++) {
            double base = no * (0.5);
            double exponent = t/t2;
            nt = Math.pow(base, exponent);
            t--;
            System.out.println("The amount of substance remaining after " + i + " days is: " + nt);
        }
    }
}
