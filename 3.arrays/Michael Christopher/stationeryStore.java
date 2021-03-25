package array.assignment;

import java.util.Scanner;
import java.util.ArrayList;

public class stationeryStore {

    Scanner scan = new Scanner(System.in);
    ArrayList<ArrayList> list = new ArrayList<>();

    public void printStock() {
        System.out.println("==========================================================================================================");
        System.out.println("|| No\t     || Item Name\t\t\t\t|| Price\t ||");
        System.out.println("==========================================================================================================");
        for(int i =0;i<list.size();i++) {
            System.out.format("|| %-5d     || %-20s	|| Rp. %-5d ||\n",i+1,list.get(i).get(0),list.get(i).get(1));
        }
        System.out.println("==========================================================================================================");
    }

    public void addStock(){
        int price;
        String item;

        System.out.println("Insert the name of the item to be inputted : ");
        item = scan.next();

        System.out.println("Insert the price : ");
        price = scan.nextInt();

        ArrayList newItem = new ArrayList();
        newItem.add(item);
        newItem.add(price);
        list.add(newItem);

        System.out.println("New item successfully inputted.");
    }

    public void buyStock(){
        int key;
        String name;
        printStock();

        do {
            System.out.printf("insert the index book that you want to buy [1-%d] 0 for cancel : ",list.size());
            key = scan.nextInt();
        }
        while(key< 0 || key > list.size());


        if(key == 0) {
            return ;
        }
        else if(key > list.size() || key < 0){
            System.out.println("Enter a valid index!!!");
            buyStock();
        }

        System.out.print("insert your name: ");
        name = scan.next();


        System.out.println("This is your receipt");
        System.out.println("======================");
        System.out.println("Buyer's Name    : " + name);;
        System.out.println("Item Name 		: " + list.get(key-1).get(0));
        System.out.println("Total price 	: Rp. " + list.get(key-1).get(1));
        list.remove(key -1);
        System.out.println("Thanks for buying! ");
    }

    public void insertData(){
        ArrayList data1 = new ArrayList<>();
        ArrayList data2 = new ArrayList<>();
        ArrayList data3 = new ArrayList<>();
        ArrayList data4 = new ArrayList<>();
        ArrayList data5 = new ArrayList<>();


        data1.add("Pen");
        data1.add(15000);
        list.add(data1);

        data2.add("Pencil");
        data2.add(5000);
        list.add(data2);

        data3.add("Eraser");
        data3.add(6000);
        list.add(data3);

        data4.add("Correction tape");
        data4.add(18000);
        list.add(data4);

        data5.add("Ruler");
        data5.add(10000);
        list.add(data5);
    }
    public Main() {
        int menu;

        insertData();

        do {
            System.out.println("\nWelcome to X Stationery Store");
            System.out.println("=======================");
            System.out.println("1. View Available Stationery");
            System.out.println("2. Add stationery");
            System.out.println("3. Buy stationery");
            System.out.println("4. Exit");
            System.out.print("Choose : ");
            menu = scan.nextInt();

            if(menu == 1){
                printStock();
            }
            else if(menu == 2){
                addStock();
            }
            else if(menu == 3){
                buyStock();
            }
        }while(menu!= 4);

        System.out.println("Thanks for coming!");
    }

    public static void main(String[] args) {

        new Main();
    }
}