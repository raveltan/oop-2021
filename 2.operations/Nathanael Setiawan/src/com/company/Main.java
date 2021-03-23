package com.company;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/* Partner is not hungry at a restaurant helper
When you and your partner goes to a restaurant and they say they arent hungry, you already know 100% this is not
true and they will eat all your side dishes and half your meal while not  ordering anything, so to prepare for the
inevitable, you can use this program to order extra food before half of it is gone
 */

public class Main {

    public static void main(String[] args) {
        Scanner Inputter = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<String>();
        System.out.println("Welcome to partner is not hungry helper");
        System.out.println("Please input all the food available to the restaurant, type (Done) when you're finished");
        String b = Inputter.nextLine();
        while (b.equals(new String("Done")) != true){
            foods.add(b);
            b = Inputter.nextLine();
        }
        int i = foods.size();
        System.out.print("Is your partner hungry?(Y/N): ");
        b = Inputter.nextLine();
        if (b.equals(new String("Y"))){
            i = i/2;
        }
        else if (b.equals(new String("N"))){
            i = 1;
        }
        System.out.println("Order more of these:");
        for (int a = 0; a < i; a++){
            int rnd = new Random().nextInt(foods.size());
            System.out.println(foods.get(rnd));
            foods.remove(rnd);
        }
    }
}
