import java.util.Scanner;

class Auth {
    public static void main(String[] args) {
        int i = 0;
        String register_password, register_email, email, password;
        Scanner obj = new Scanner(System.in); // Create Scanner Object

        // Register
        System.out.println("Register");
        // Email
        System.out.print("Input email: ");
        register_email = obj.nextLine(); // Read user input
        // Password
        System.out.print("Input password: ");
        register_password = obj.nextLine();

        while(i < 3) { // 3 times
            i++;
            // Login
            System.out.println("Login");
            // Email
            System.out.print("Email: ");
            email = obj.nextLine();

            if(register_email.equals(email)) { // .equals() -> comparison values in objects
                // Password
                System.out.print("Password: ");
                password = obj.nextLine();

                if(register_password.equals(password)) {
                    System.out.println("You are logged in");
                    break;
                }
                else {
                    System.out.println("You have inputted the wrong password");
                }
            }
            else {
                System.out.println("The email is not registered");
            }
        }
    }
}
