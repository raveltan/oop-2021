
import java.util.ArrayList;
import java.util.Scanner;

class LoginRegister{

/* 
This is a login/register program that makes use of array list. The reason why I favored ArrayList for this program
over arrays is because the dynamic size of ArrayLists allows for the registry of technically infinite
amount of users while it would be finite when arrays are used. It also has some useful pre-made functions
such as .contains() 
*/

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> usersList = new ArrayList<String>();
        ArrayList<String> passwordList = new ArrayList<String>();
        String currentUsername = "default"; //Used to store username for comparison with data in list.
        boolean active = true;
        String userInput; // Used as a temporary storage for  
        while (active){
            System.out.print("*** MAIN MENU ***\n1. Login\n2. Register\n3. Check Account Details\n4. Logout\n5. Exit\nEnter your choice: ");
            int userChoice = scanner.nextInt();
            switch(userChoice){
                case 1: //Login
                    System.out.println("Username: ");
                    userInput = scanner.next();
                    int userIndex = 8888; // 8888 is just a default value. 
                    if (!usersList.contains(userInput)){
                        System.out.println("This user does not exist.");
                    } else {
                        for (int i = 0; i < usersList.size(); i++){
                            if (usersList.get(i).equals(userInput)){
                                userIndex = i; // Cant uses .contains() method here since I need to get the index.
                                currentUsername = usersList.get(i);
                            }   
                        }
                        System.out.print("Password: ");
                        userInput = scanner.next();
                        if (userInput.equals(passwordList.get(userIndex))){
                            System.out.printf("User successfully registered. Welcome %s.\n", currentUsername);
                        } else {
                            System.out.println("Incorrect password.");
                        }
                    }
                    break;
                case 2: //Register
                    System.out.print("Username (not allowed to be \"default\"): "); // I need a default value for currentUsername as a value for when there is no user logged in.
                    userInput = scanner.next();

                    if (userInput.equals("default")){
                        System.out.println("Error: username not allowed to be \"default\"");
                    } else if (usersList.contains(userInput)){
                        System.out.println("Username already exists.");
                    } else {
                        usersList.add(userInput);
                        System.out.print("Password: ");
                        userInput = scanner.next();
                        passwordList.add(userInput);
                        System.out.println("User successfully registered.");
                    }

                    break;
                case 3: // Check account settings
                    if (currentUsername.equals("default")){
                        System.out.println("You aren't currently logged in.");
                    } else {
                        System.out.printf("%s is currently logged in.\n", currentUsername);
                    }
                    break;
                case 4: // Log out
                    if (!currentUsername.equals("default")){
                        System.out.printf("User %s has been successfully logged out.\n", currentUsername);
                        currentUsername = "default";
                    }
                    break;
                case 5: // Exit Program
                    active = false;
                    scanner.close();
                    System.out.println("Program has been successfully terminated.");
                    break;
                default: // Invalid input
                    System.out.println("Invalid input. Please try again.");
                    break;
                    
                


            }
        }
    }
}