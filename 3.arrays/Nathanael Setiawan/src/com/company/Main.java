package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/*
MMORPG Spell manager

This is a very similar concept to an MMORPG hotbar where there is a total of 10 different slots to put spells
into but there is a lot of spells you can choose from from inside of the system to put into those slots.
*/

public class Main {
    static void Display_Spells(ArrayList<String> a){
        System.out.println("Spells:");
        for (int i = 0; i < a.toArray().length; i++){
            System.out.println((i+1) +". "+a.get(i));
        }
        System.out.println("\n");
    }
    static void Display_Hotbar(String[] a, int b){
        System.out.println("Hotbar:");
        for (int i = 0; i < b; i++){
            System.out.println((i+1) +". "+a[i]);
        }
        System.out.println("\n");
    }
    static boolean In_Array(String[] a, String b){
        boolean x = Arrays.asList(a).contains(b);
        return x;
    }
    static String[] Remove_from_arr(String[] a, int b){
        String[] temp = new String[a.length-1];
        for (int i = 0, j = 0; i < a.length;i++){
            if (i == b){
                continue;
            }
            temp[j++] = a[i];
        }
        return temp;
    }

    static void Menu(){
        System.out.print("Menu:\n1.Display hotbar\n2.Display all Spells\n3.Insert spell to hotbar\n4.Remove spell from hotbar\n5.New spell\n6.Remove spell\n7.Exit\nInput:");
    }

    public static void main(String[] args){
//      The hotbar array needs to be an array because it is a fixed size in game
        String[] Hotbar = new String[10];
        int Hotbar_len = 0;
//      The spell list arraylist needs to be an arraylist because new spells can be added to the list
        ArrayList<String> Spell_List = new ArrayList<String>(Arrays.asList("Fire ball","Electric storm","Ice breath","Rock throw","Healing light","Dark blast","Air slice","Power punch","Arcane beam","Undead hand","Water wave"));
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Random rand = new Random();

        String y;
        int Switch_case;
        for (int x = 0; x < 5; x++){
            y = Spell_List.get(rand.nextInt(Spell_List.toArray().length));
            if(In_Array(Hotbar,y)){
                x--;
            }
            else {
                Hotbar[Hotbar_len++] = y;
            }
        }

        while (true){
            Menu();
            Switch_case = scanner.nextInt();
            System.out.println("\n");
            switch (Switch_case){
                case 1:
                    Display_Hotbar(Hotbar, Hotbar_len);
                    break;
                case 2:
                    Display_Spells(Spell_List);
                    break;
                case 3:
                    System.out.print("Which spell? (Insert index): ");
                    Switch_case = scanner1.nextInt();
                    y = Spell_List.get(Switch_case-1);
                    if (In_Array(Hotbar, y)){
                        System.out.println("Already in hotbar!");
                    }
                    else {
                        if(Hotbar_len < Hotbar.length){
                            Hotbar[Hotbar_len++] = y;
                        }
                        else {
                            System.out.println("Hotbar is full!");
                        }
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.print("Index of spell: ");
                    Switch_case = scanner1.nextInt();
                    if(Switch_case <= Hotbar_len){
                        Remove_from_arr(Hotbar,Switch_case);
                        Hotbar_len--;
                    }
                    else {
                        System.out.println("Not in hotbar!");
                    }
                    break;
                case 5:
                    System.out.print("Name of spell: ");
                    y = scanner1.nextLine();
                    if(Spell_List.contains(y)){
                        System.out.println("Spell already exists!");
                    }
                    else {
                        Spell_List.add(y);
                    }
                    System.out.println("\n");
                    break;
                case 6:
                    System.out.print("Index of spell: ");
                    Switch_case = scanner1.nextInt();
                    if(Switch_case <= Spell_List.toArray().length){
                        Spell_List.remove(Switch_case-1);
                    }
                    else {
                        System.out.println("Spell doesn't exist!");
                    }
                    System.out.println("\n");
                    break;
                case 7:
                    System.out.println("Goodbye");
                    System.exit(0);
                default:
                    System.out.println("Not recognized");
                    break;
            }
        }
    }
}
