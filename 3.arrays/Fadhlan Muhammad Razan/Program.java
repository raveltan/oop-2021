import java.util.Scanner;
import java.util.ArrayList;

public class Program {

    public static void main(String args[])
    {

        // homework assignment i guess?
        // I choose to you use regular array here because i know that these array are not going to be altered later down the code.
        String menu[] = {"Okky Jelly Drink", "Pocari Sweat", "Teh Gelas", "Teh Kotak", "Sari Roti", "Taro", "Doritos", "Cheetos"};
        int prices[] = {3000, 7000, 1000, 5000, 12000, 2000, 17500, 4500};
        int last_price = 0;
        int total_price = 0;
        // I choose to use arraylist here because i don't know how many items will the user add in advance so i use arraylist so that the size of the array could be dinamycally changed.
        ArrayList<String> Basket = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Alfamart new automated self service system.");
        boolean looping = true;
        boolean added_new = false;
        while (looping)
        {
            System.out.println("\nPlease choose an option");
            System.out.println("1.) Add item to basket\n2.) Remove last item\n3.) Buy items and exit program");
            int choice = input.nextInt();
            char confirm;
            switch(choice)
            {
                case 1:
                    added_new = true;
                    System.out.println("\nPick an item to be added to your basket");
                    show_menu();
                    System.out.println("\nItem choice: ");
                    choice = input.nextInt();
                    if (!Basket.contains(menu[choice-1]))
                    {
                        Basket.add(menu[choice-1]);
                    }
                    total_price += prices[choice-1];
                    last_price = prices[choice-1];
                    break;
                case 2:
                    if (added_new)
                    {
                        Basket.remove(Basket.size()-1);
                        total_price -= last_price;
                        last_price = 0;
                        added_new = false;
                        break;
                    }
                    else
                    {
                        System.out.println("You have removed the last item or the basket is empty.");
                        break;
                    }
                case 3:
                    System.out.println("\nItems in the basket: ");
                    for(String item:Basket)
                    {
                        System.out.println(item);
                    }
                    System.out.printf("\nTotal price: %d", total_price);
                    System.out.println("\n\nConfirm buy? y or n.");
                    confirm = input.next().charAt(0);
                    if (confirm == 'y')
                    {
                        System.out.println("\nthank you for shopping at alfamart.");
                        looping = false;
                        break;
                    }
                    break;
            }
        }
    }

    static void show_menu()
    {
        System.out.println("1.) Okky Jelly Drink\n2.) Pocari Sweat\n3.) Teh Gelas\n4.) Teh Kotak\n5.) Sari Roti\n6.) Taro\n7.) Doritos\n8.) Cheetos");
    }

}