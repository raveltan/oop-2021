package com.company;
import java.util.Scanner;

public class Main {

    static void calculateLoan(int runs){
        Scanner userDetails = new Scanner(System.in);

        float interest;

        // Asking for the loan amount
        System.out.print("\nLoan amount: ");
        float loan = userDetails.nextFloat();

        // Asking for the amount of months
        System.out.print("\nAmount of months: ");
        int months = userDetails.nextInt();

        // Interest based on amount
        if (loan > 1000) {
            interest = (float) 0.1;
        } else if (loan > 5000) {
            interest = (float) 0.2;
        } else if (loan > 10000) {
            interest = (float) 0.5;
        } else {
            interest = (float) 0;
        }

        // payment plan per month
        if (interest > 0) {
            loan = loan * interest;
        } else {
            loan = loan * 1;
        }

        float paymentPlan = loan / months;

        // Amount of loan calculations
        System.out.println("\nCalculations Done: " + runs);

        // Loan details
        System.out.println("\nHere are your current details:");
        System.out.println("\nLoan amount: " + loan);
        System.out.println("\nPayment per month: " + paymentPlan);
    }


    public static void main(String[] args) {
        // initializing scanner for user input
        Scanner option = new Scanner(System.in);

        // Keeping count of the amount of runs done
        int calculationsDone = 0;

        // creating while loop
        boolean start = true;


        // initializing while loop
        while (start) {
            System.out.println("\nGreetings, welcome to Loan calculator\n What would you like to do:\n1.Loan\n2.Exit");
            System.out.print("\nWhat would you like to do: ");
            int whatToDO = option.nextInt();
            if (whatToDO == 1) {
                calculationsDone++;
                calculateLoan(calculationsDone);

            }else if(whatToDO == 2){
               start=false;

            }else{
                System.out.print("\nInvalid option");
                break;
            }
        }
    }
}