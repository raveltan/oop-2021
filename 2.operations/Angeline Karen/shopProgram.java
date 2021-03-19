package com.buatkode.programassignment;


import java.util.*;


public class shopProgram {
	private static Integer walletCount;
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = "y";
		Dictionary store = new Hashtable();
		
		store.put("Shirt", "400000");
		store.put("Skirt", "100000");
		store.put("Hat", "50000");
		store.put("Jeans", "300000");

		walletCount = 1000000;
		
		String[] members = {"leo", "shannon", "sieren", "vania"};
		
		do {
			Scanner myInput = new Scanner(System.in);
			System.out.println("What would you like to buy?");
			System.out.println("All items are 20% off");
			System.out.println("1. Shirt");
			System.out.println("2. Skirt");
			System.out.println("3. Hat");
			System.out.println("4. Jeans");
			System.out.println("1/2/3/4");
			System.out.print(">> ");
			Integer userInput = myInput.nextInt();
			switch(userInput) {
			case 1:
				System.out.println("You chose to buy a shirt");
				System.out.printf("The cost will be %s. ", store.get("Shirt"));
				Scanner myAns = new Scanner(System.in);
				System.out.print("Do you have a member? (Yes/No): ");
				String userAns = myAns.nextLine().toLowerCase();
				if (userAns.equals("yes")) {
					Scanner myName = new Scanner(System.in);
					System.out.print("Name>> ");
					String userName = myName.nextLine().toLowerCase();
					for (int i=0; i<members.length; i++) {
						if (userName.equals(members[i])) {
							System.out.println("Yes, you are a member!");
							System.out.println("Every member got extra 20% off");
							Integer price = Integer.parseInt((String) store.get("Shirt"))*400/10000;
							System.out.printf("The cost will be %s after discount", price);	
							System.out.println();
							walletCount -= price;
							System.out.printf("Your current money %d", walletCount);
							System.out.println();
							break;
						}					
					}
				}
				else {
					System.out.println("No, you are not registered yet. No extra discount!");
					Integer price2 = Integer.parseInt((String) store.get("Shirt"))*200/10000;
					System.out.printf("The cost will be %s after discount", price2);
					System.out.println();
					walletCount -= price2;
					System.out.printf("Your current money %d", walletCount);
					System.out.println();	
				}				
				break;	
			case 2:
				System.out.println("You chose to buy a skirt");
				System.out.printf("The cost will be %s. ", store.get("Skirt"));
				Scanner myAns1 = new Scanner(System.in);
				System.out.print("Do you have a member? (Yes/No): ");
				String userAns1 = myAns1.nextLine().toLowerCase();
				if (userAns1.equals("yes")) {
					Scanner myName = new Scanner(System.in);
					System.out.print("Name>> ");
					String userName = myName.nextLine().toLowerCase();
					for (int i=0; i<members.length; i++) {
						if (userName.equals(members[i])) {
							System.out.println("Yes, you are a member!");
							System.out.println("Every member got extra 20% off");
							Integer price = Integer.parseInt((String) store.get("Skirt"))*400/10000;
							System.out.printf("The cost will be %s after discount", price);	
							System.out.println();
							walletCount -= price;
							System.out.printf("Your current money %d", walletCount);
							System.out.println();
							break;		
						}						
					}	
				}
				else {
					System.out.println("No, you are not registered yet. No extra discount!");
					Integer price2 = Integer.parseInt((String) store.get("Skirt"))*200/10000;
					System.out.printf("The cost will be %s after discount", price2);
					System.out.println();
					walletCount -= price2;
					System.out.printf("Your current money %d", walletCount);
					System.out.println();	
				}
				break;		
			case 3:
				System.out.println("You chose to buy a hat");
				System.out.printf("The cost will be %s. ", store.get("Hat"));
				Scanner myAns2 = new Scanner(System.in);
				System.out.print("Do you have a member? (Yes/No): ");
				String userAns2 = myAns2.nextLine().toLowerCase();
				if (userAns2.equals("yes")) {
					Scanner myName = new Scanner(System.in);
					System.out.print("Name>> ");
					String userName = myName.nextLine().toLowerCase();
					for (int i=0; i<members.length; i++) {
						if (userName.equals(members[i])) {
							System.out.println("Yes, you are a member!");
							System.out.println("Every member got extra 20% off");
							Integer price = Integer.parseInt((String) store.get("Hat"))*400/10000;
							System.out.printf("The cost will be %s after discount", price);	
							System.out.println();
							walletCount -= price;
							System.out.printf("Your current money %d", walletCount);
							System.out.println();
							break;							
						}						
					}					
				} 
				else {
					System.out.println("No, you are not registered yet. No extra discount!");
					Integer price2 = Integer.parseInt((String) store.get("Hat"))*200/10000;
					System.out.printf("The cost will be %s after discount", price2);
					System.out.println();
					walletCount -= price2;
					System.out.printf("Your current money %d", walletCount);
					System.out.println();		
				}
				break;
			case 4:
				System.out.println("You chose to buy a jeans");
				System.out.printf("The cost will be %s. ", store.get("Jeans"));
				Scanner myAns3 = new Scanner(System.in);
				System.out.print("Do you have a member? (Yes/No): ");
				String userAns3 = myAns3.nextLine().toLowerCase();
				if (userAns3.equals("yes")) {
					Scanner myName = new Scanner(System.in);
					System.out.print("Name>> ");
					String userName = myName.nextLine().toLowerCase();
					for (int i=0; i<members.length;i++) {
						if (userName.equals(members[i])) {
							System.out.println("Yes, you are a member!");
							System.out.println("Every member got extra 20% off");
							Integer price = Integer.parseInt((String) store.get("Jeans"))*400/10000;
							System.out.printf("The cost will be %s after discount", price);	
							System.out.println();
							walletCount -= price;
							System.out.printf("Your current money %d", walletCount);
							System.out.println();
							break;				
						}						
					}					
				} 
				else {
					System.out.println("No, you are not registered yet. No extra discount!");
					Integer price2 = Integer.parseInt((String) store.get("Jeans"))*200/10000;
					System.out.printf("The cost will be %s after discount", price2);
					System.out.println();
					walletCount -= price2;
					System.out.printf("Your current money %d", walletCount);
					System.out.println();					
				}
				break;		
			}
			System.out.print("Do you want to continue? (y/n): ");
			s1 = scan.nextLine().toLowerCase();
			
		} while (s1.equalsIgnoreCase("y"));
		
		System.out.println("Thankyou for shopping here!");
	}
}