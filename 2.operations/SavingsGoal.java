package com.company;

import java.util.Scanner;

public class SavingsGoal {

    public static void main(String[] args) {
        // calculating how many months it takes to reach your goal in savings
        // creating scanner obj
        Scanner obj = new Scanner(System.in);
        Scanner obj2 = new Scanner(System.in);
        Scanner obj3 = new Scanner(System.in);
        Scanner obj4 = new Scanner(System.in);

        // for user input and reading the input
        System.out.print("Enter your salary per month ");
        int salary = obj.nextInt();
        System.out.print("Enter your expense per month ");
        int expense = obj2.nextInt();
        System.out.print("Enter your current savings ");
        int savings = obj3.nextInt();
        System.out.print("Enter your savings goal ");
        int goal = obj4.nextInt();

        int month = 0;

        // loop while goal is not reached
        while(savings < goal){
            savings += salary;
            savings -= expense;
            month ++;
        }

        if(month != 0){
            System.out.println("You at least need " + month + " month(s) to reach your goal.");
        } else{
            System.out.println("You have reached your goal!"); // if the goal has already been reached
        }

    }
}

