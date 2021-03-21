import java.util.Scanner;

public class BernardW
{
    public static void main(String[] args)
    {
        int i = 0;
        while (i==0)
        {
            System.out.println("Welcome to Basic Calculator");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Input First Number: ");
            float a = scanner.nextFloat();
            System.out.print("Input Second Number: ");
            float b = scanner.nextFloat();

            System.out.println("\n1. Addition\n2. Substraction\n3. Division\n4.Multiplication");
            System.out.print("Pick Your Operator (No.): ");
            int input = scanner.nextInt();

            if (input == 1) {
                float asn = a + b;
                System.out.println("\nYour Answer: " + asn);
            } else if (input == 2) {
                float asn = a - b;
                System.out.println("\nYour Answer: " + asn);
            } else if (input == 3) {
                float asn = a / b;
                System.out.println("\nYour Answer: " + asn);
            } else if (input == 4) {
                float asn = a * b;
                System.out.println("\nYour Answer: " + asn);
            }
            System.out.println("\nDo you want to count again?\n1. Yes\n2. No");
            System.out.print("(No.): ");
            int asn = scanner.nextInt();

            if (asn == 2)
            {
                System.out.println("Thankyou for Using Our Service!");
                i += 1;
            }
            else
            {
                System.out.println("\n");
                continue;
            }
        }
    }
}
