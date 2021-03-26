package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<String> delItem(ArrayList<String> cart){
        Scanner option = new Scanner(System.in);
        String remItem;

        System.out.print("What would you like to delete: ");
        remItem = option.nextLine();
        cart.remove(remItem);
        return cart;
    }


    public static void main(String[] args) {
       boolean cont = true;
       int toDo;//What to do
       String[] itemOptions = {"milk", "coke", "lays", "cheetos", "popcorn"};//option to add to cart
       ArrayList<String> cart = new ArrayList<>();
       Scanner option = new Scanner(System.in);

       while(cont){
           System.out.println("\nWhat would you like to do:\n");
           System.out.println("1.Add to cart:");
           System.out.println("2.Delete item:");
           System.out.println("3.Display cart:");
           System.out.println("4.Exit:");
           System.out.print("\nRequest input: ");
           toDo = option.nextInt();
           switch(toDo){
               case 1:{
                   int addCartInd;//add item to cart
                   String addCart;
                   System.out.println("Here are the snack options:\n");
                   for(int i = 0; i<itemOptions.length; i++) {
                       System.out.println(i + 1 + "." + itemOptions[i]);
                   }
                   System.out.print("What snack would you like to pick: ");
                   addCartInd = option.nextInt();
                   addCart = itemOptions[addCartInd-1];
                   cart.add(addCart);
                   break;
               }

               case 2:{
                   ArrayList<String> newCart;
                   System.out.println(cart);
                   newCart = delItem(cart);
                   cart = newCart;

                   break;
               }

               case 3:{
                   System.out.println(cart);
                   break;

               }

               case 4:{
                   cont = false;
               }

           }
       }

    }
}
