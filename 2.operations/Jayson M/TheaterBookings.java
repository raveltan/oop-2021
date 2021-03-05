
import java.util.Scanner;

public class TheaterBookings {
	
	public static void main(String[]args) {
		
		int[][] seats = {{0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}};
		int row, column; 
		Scanner scan = new Scanner(System.in);
		
		
		while (true) { 
			System.out.println("--------------welcome to the theater--------------");
			System.out.println("Current available seats: ");
			System.out.println("    1  2  3  4  5 ");
			for ( int i = 0 ; i<5 ; i++) {
				System.out.print((i+1)+ ". (");
				for (int j = 0 ; j<5 ; j++) {
					if ( j < 4) { 
						System.out.print(seats[i][j]+ ", ");
					}else {
						System.out.print(seats[i][j]);
					}
				
				}
				System.out.print(") \n");
			}
			
			
			System.out.println("\nWhat would you like to do ? ");
			System.out.println("1. Book a Seat");
			System.out.println("2. cancel a booked seat");
			System.out.println("3. exit");
			System.out.print("please input a NUMBER : ");
			int choice = scan.nextInt();
		
			if (choice == 1) {
				System.out.println("\nPlease select a row and column of the seat that you would like to book");
				System.out.print("Row:");
				row = scan.nextInt();
				System.out.print("Column:");
				column = scan.nextInt();
				System.out.print("Are you Sure ? ( y/n )");
				String sure = scan.next();
				if (seats[row-1][column-1] == 1) {
					System.out.println("Seat already taken");
				}else if (sure.toLowerCase().equals("y")) {
					seats[row-1][column-1] = 1;
					System.out.println("Booking Success");
				}else if (sure.toLowerCase().equals("n")){
					System.out.println("Book Cancelled");
				}
			}
			
			else if (choice == 2 ) {
				System.out.println("\nPlease select a row and column of the seat that you would like to cancel");
				System.out.print("Row:");
				row = scan.nextInt();
				System.out.print("Column:");
				column = scan.nextInt();
				System.out.print("Are you Sure ? ( y/n )");
				String sure = scan.next();
				if (seats[row-1][column-1] == 0) {
					System.out.println("Seat is already open");
				}else if (sure.toLowerCase().equals("y")) {
					seats[row-1][column-1] = 0;
					System.out.println("Book Cancelled");
				}else if (sure.toLowerCase().equals("n")){
					System.out.println("Cancelled");
				}
			}
			
			else if (choice == 3) { 
				System.out.println("\nPROGRAM EXITTED");
				break; }
		}
	}
}

