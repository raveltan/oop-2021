package com;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int weap;
        int weap1;
        int weap2;
        int points;
        points = 0;

        System.out.println("We're having a zombie apocalypse!! Get ready to grab your weapon!");

        String weapons[] = {"Sword", "Rifle", "Sniper"};
        String zombies[] = {"Close-Ranged Zombie", "Mid-Ranged Zombie", "Long-Ranged Zombie"};

        System.out.println("Your first encounter is the " + zombies[0]);
        System.out.println("Please Select your weapon!");
        System.out.println("1. " + weapons[0]);
        System.out.println("2. " + weapons[1]);
        System.out.println("3. " + weapons[2]);

        Scanner input = new Scanner(System.in);
        weap = input.nextInt();

        if (weap==1) {
            System.out.println("You've Selected " + weapons[0] + " as your weapon. Nice Choice!");
            System.out.println("You've earned 1 point for choosing the right weapon!");
            points = points + 1;
            System.out.println("Your current point is: " + points + "!\n");
        }
        else if (weap==2) {
            System.out.println("You've Selected " + weapons[1] + " as your weapon.");
            System.out.println("You've earned 0 point for choosing the wrong weapon!");
            System.out.println("Your current point is: " + points + "!\n");
        }
        else if (weap==3) {
            System.out.println("You've Selected " + weapons[2] + " as your weapon.");
            System.out.println("You've earned 0 point for choosing the wrong weapon!");
            System.out.println("Your current point is: " + points + "!\n");
        }
        else {
            System.out.println("I don't think you have it on your inventory.\n");
        }


        System.out.println("Your Second encounter is the " + zombies[1]);
        System.out.println("Please Select your weapon!");
        System.out.println("1. " + weapons[0]);
        System.out.println("2. " + weapons[1]);
        System.out.println("3. " + weapons[2]);

        Scanner input1 = new Scanner(System.in);
        weap1 = input1.nextInt();


        if (weap1==1) {
            System.out.println("You've Selected " + weapons[0] + " as your weapon.");
            System.out.println("You've earned 0 point for choosing the wrong weapon!");
            System.out.println("Your current point is: " + points + "!\n");
        }
        else if (weap1==2) {
            System.out.println("You've Selected " + weapons[1] + " as your weapon. Nice Choice!");
            System.out.println("You've earned 1 point for choosing the right weapon!");
            points = points + 1;
            System.out.println("Your current point is: " + points + "!\n");

        }
        else if (weap1==3) {
            System.out.println("You've Selected " + weapons[2] + " as your weapon.");
            System.out.println("You've earned 0 point for choosing the wrong weapon!");
            System.out.println("Your current point is: " + points + "!\n");
        }
        else {
            System.out.println("I don't think you have it on your inventory.\n");
        }


        System.out.println("Your Last encounter is the " + zombies[2]);
        System.out.println("Please Select your weapon!");
        System.out.println("1. " + weapons[0]);
        System.out.println("2. " + weapons[1]);
        System.out.println("3. " + weapons[2]);

        Scanner input2 = new Scanner(System.in);
        weap2 = input2.nextInt();

        if (weap2==1) {
            System.out.println("You've Selected " + weapons[0] + " as your weapon.");
            System.out.println("You've earned 0 point for choosing the wrong weapon!");
            System.out.println("Your current point is: " + points + "!\n");
        }
        else if (weap2==2) {
            System.out.println("You've Selected " + weapons[1] + " as your weapon.");
            System.out.println("You've earned 0 point for choosing the wrong weapon!");
            System.out.println("Your current point is: " + points + "!\n");
        }
        else if (weap2==3) {
            System.out.println("You've Selected " + weapons[2] + " as your weapon. Nice Choice!");
            System.out.println("You've earned 1 point for choosing the right weapon!");
            points = points + 1;
            System.out.println("Your current point is: " + points + "!\n");
        }
        else {
            System.out.println("I don't think you have it on your inventory.\n");
        }
    }
}
