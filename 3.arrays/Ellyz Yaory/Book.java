import java.util.ArrayList;
import java.util.Scanner;

class Book {
    // ArrayList is used instead of Arrays because the length of an ArrayList can be changed
    private static ArrayList<String> list = new ArrayList<>();

    // Create book title
    public static void addBookTitle() {
        String add;
        Scanner b = new Scanner(System.in);
        System.out.print("Add Book Title: ");
        add = b.nextLine(); // Take input and is assigned to create
        list.add(add); // add the element to the ArrayList
    }

    // Delete book title
    public static void deleteBookTitle() {
        String del;
        Scanner b = new Scanner(System.in);
        System.out.print("Delete Book Title: ");
        del = b.nextLine(); // Take input and is assigned to del
        list.remove(String.valueOf(del)); // remove the value in the ArrayList
    }

    // Display the elements in the array list
    public static void displayBookTitles() {
        System.out.println("Title of books: ");
        list.forEach(System.out::println); // prints each of the elements in the ArrayList
        System.out.println("");
    }

    public static void main(String[] args) {
        int choice;
        boolean flag = true;
        Scanner b = new Scanner(System.in);

        // The program will continue until number 4 is picked -> EXIT
        while (flag) {
            System.out.print("Choose: \n 1. Add \n 2. Delete \n 3. Display \n 4. " +
                    "EXIT \n Number: ");
            choice = b.nextInt();
            switch (choice) {
                case 1:
                    addBookTitle();
                    break;
                case 2:
                    deleteBookTitle();
                    break;
                case 3:
                    displayBookTitles();
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }
    }
}
