package com.buatkode.assignment;

import java.util.ArrayList;
import java.util.Scanner;

// Define account class
class Account {
    // Declaring class variables
    private String name;
    private Integer age;
    private String gender;
    private Integer allowance;

    // Constructor
    public Account() {
        this.name = "";
        this.age = 0;
        this.gender = "";
        this.allowance = 0;
    }

    // Use this keyword to distinguish local variables and instance variables
    // Since I used a same name, I need to use 'this' keyword. Else, it's not needed
    public Account(String name, Integer age, String gender, Integer allowance) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.allowance = allowance;
    }

    // Declaring setter and getter
    // Requires the use of Integer instead of int
    // Arraylist (generic types) method must be of type Object
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAllowance(Integer allowance) {
        this.allowance = allowance;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public Integer getAllowance() {
        return this.allowance;
    }
}

class AccountStore {
    // Create an arraylist that store the account
    private ArrayList<Account> listOfAccount = new ArrayList<>();

    // Method to add account
    public void addAccount(Account a) {
        if (a.equals("")&&a==null) {
            System.out.println("Arraylist is empty");
        }
        else {
            // Create new account and append it to the arraylist
            listOfAccount.add(new Account(a.getName(), a.getAge(), a.getGender(), a.getAllowance()));
        }
    }

    // Method to get the account details by inputting the user name
    public Account getAccountDetails(String name)  {
        for(Account acc : listOfAccount) {
            if (acc.getName().equals(name)) {
                return acc;
            }
            else {
                System.out.println("No account with that name existed");
                break;
            }
        }
        return null;
    }

    // Method to print all the account available inside the arraylist
    public void printAccountList(){
        if (listOfAccount.isEmpty()){
            System.out.println("empty.");
        } else {
            for(int i=0; i<listOfAccount.size(); i++){
                System.out.print("Index: " + i + "; ");
                System.out.print("Name: " + listOfAccount.get(i).getName() + "; ");
                System.out.print("Age: " + listOfAccount.get(i).getAge() + "; ");
                System.out.print("Gender: " + listOfAccount.get(i).getGender() + "; ");
                System.out.print("Current Allowance: $" + listOfAccount.get(i).getAllowance() + "; ");
                System.out.println();
            }
        }
    }

    // Method to topup the allowance for certain account
    public Account topAllowance(String name, Integer money) {
        for(Account acc : listOfAccount) {
            if (acc.getName().equals(name)) {
                Integer allowanceUser = acc.getAllowance();
                // Increment the recent allowance with the input money
                allowanceUser += money;
                // Set the allowance inside the user account allowance
                acc.setAllowance(allowanceUser);
                return acc;
            }
            else {
                System.out.println("No account with that name existed");
                break;
            }
        }
        return null;
    }


}

public class ArrayListAssignment {
    // Create a static object class
    static AccountStore accPeople = new AccountStore();
    static Account acc = new Account();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int userChoice;
        Scanner scan = new Scanner(System.in);
        String s1;
        System.out.println("Storing Account Program");
        do {
            System.out.println("[1] Add Account\n [2] Print Account List\n [3] Search Account\n [4] Top up\n [5] Exit");
            System.out.print(">> ");
            userChoice = s.nextInt();
            switch (userChoice) {
                case 1:
                    // Adding new account
                    // Set the name, age, gender as an account object
                    Scanner input = new Scanner(System.in);
                    System.out.print("Enter your name: ");
                    String i = input.nextLine();
                    acc.setName(i);

                    Scanner input2 = new Scanner(System.in);
                    System.out.print("Enter your age: ");
                    int i2 = input2.nextInt();
                    acc.setAge(i2);

                    Scanner input3 = new Scanner(System.in);
                    System.out.print("Enter your gender: ");
                    String i3 = input3.nextLine();
                    acc.setGender(i3);

                    // Add the account object to accountstore list
                    // It appends everytime we create an account and store it inside the accountstore arraylist
                    accPeople.addAccount(acc);
                    break;
                case 2:
                    // Print all the account list inside the accountstore arraylist
                    System.out.println("Here are the account list: ");
                    accPeople.printAccountList();
                    break;
                case 3:
                    // Get the account details of an account inside the arraylist
                    Scanner inputUser = new Scanner(System.in);
                    System.out.print("Enter name: ");
                    String inputs = inputUser.nextLine();
                    getAccountDetails(inputs, accPeople);
                    break;
                case 4:
                    // Top up the allowance of a specific user account
                    // Default allowance when creating an account: 0 -> then increment
                    Scanner inputUser2 = new Scanner(System.in);
                    System.out.print("Enter name: ");
                    String userIn = inputUser2.nextLine();
                    Scanner scans = new Scanner(System.in);
                    System.out.print("Enter value of money: ");

                    Integer userMoney = scans.nextInt();
                    accPeople.topAllowance(userIn, userMoney);
                    break;
                case 5:
                    System.out.println("Program terminated. Bye!");
                    java.lang.System.exit(0);
                    break;
            }
            System.out.print("Do you want to continue? (y/n): ");
            s1 = scan.nextLine().toLowerCase();
        } while (s1.equals("y"));

        System.out.println("Program terminated. Bye!");
    }

    // Method to get the account details
    static void getAccountDetails(String name, AccountStore acc) {
        // Getting the account from the arraylist, search by name, and print that account details
        Account accountDetails = acc.getAccountDetails(name);
        System.out.println("The account details you're searching for:");
        System.out.println("Name: " + accountDetails.getName());
        System.out.println("Age: " + accountDetails.getAge());
        System.out.println("Gender: " + accountDetails.getGender());
        System.out.println("Allowance: $" + accountDetails.getAllowance());
    }
}
