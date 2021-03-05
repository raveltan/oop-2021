package com.google.week2;

import java.util.Scanner;

public class WeightCalc{

    public static void main(String[] args) {

        System.out.println("Weight Loss Calculator by Rafian Athallah Marchansyah");

        Scanner WeightLoss = new Scanner(System.in);
        System.out.println("Kilograms lost per week: ");
        int LostWeight = WeightLoss.nextInt();

        Scanner WeightGain = new Scanner(System.in);
        System.out.println("Kilograms gained per week: ");
        int GainedWeight = WeightGain.nextInt();

        Scanner CurrentWeight = new Scanner(System.in);
        System.out.println("Enter your current weight: ");
        int WeightNow = CurrentWeight.nextInt();

        Scanner TargetWeight = new Scanner(System.in);
        System.out.println("Enter your desired weight: ");
        int WeightGoal = TargetWeight.nextInt();

        int WeekCount = 0;
        int WeightNeeded = WeightNow - WeightGoal;

        while(WeightNow > WeightGoal){
            WeightNow += GainedWeight;
            WeightNow -= LostWeight;
            WeekCount ++;
        }

        if (WeekCount != 0) {
            System.out.println("You are going to lose " + WeightNeeded + " kilograms in " + WeekCount + "weeks in order to reach your desired weight!");
        } else {
            System.out.println("You are at your desired weight!");
        }

    }
}