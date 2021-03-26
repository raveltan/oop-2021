import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;


public class arraysVarrList {

	public static void main (String []args) {
		
		boolean flag = true; int choice; Scanner scan = new Scanner(System.in);

		
		ArrayList<String> ShopMenu = new ArrayList();
		
		
		// i used arraylist instead of arrays because if the dynamic size thus allowing the user to add a larger number of items to the array
		
		
		ShopMenu.add("Fish and Chips");
		ShopMenu.add("Steak");
		ShopMenu.add("Mac and Cheese");
		
		
		
		while(flag){
	           System.out.println("\nWhat would you like to do:\n");
	           System.out.println("1. Add to Menu");
	           System.out.println("2. Delete item on Menu");
	           System.out.println("3. Display Menu");
	           System.out.println("4. Exit");
	           System.out.println("Choice: ");
	           choice = scan.nextInt();
	           switch(choice){
	               case 1:{
	                   String insert;
	                   System.out.print("What Food / Drink item would you like to add ? \n");
	                   insert = scan.next();
	                   ShopMenu.add(insert);
	                   break;
	               }

	               case 2:{
	            	   String delete;
	            	   System.out.println("Items on the Menu are ");
	            	   System.out.println(ShopMenu);
	                   System.out.println("what would you like to delete ?");
	                   delete = scan.next();
	                   ShopMenu.remove(delete);

	                   break;
	               }

	               case 3:{
	                   System.out.println(ShopMenu);
	                   break;

	               }

	               case 4:{
	            	   System.out.println("Program Exitted");
	                   flag = false;
	               }

	           }
	       }
		
	}
}
