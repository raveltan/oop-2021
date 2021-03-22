import java.util.Arrays;
import java.util.Scanner;

public class Arraylizt
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Inventory");
        int capt = 4;
        String inventory[]= new String[capt];

        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (i<=4)
        {
            System.out.print("\nMenu\n1. Add\n2. Quit\nPick a number: ");
            int input = scanner.nextInt();

            if (input==1)
            {
                System.out.print("\nPut in any item: ");
                String inv = scanner.next();
                inventory[i] = inv;
                System.out.println("Your Inventory: "+Arrays.toString(inventory));
                i++;
            }

            else if (input==2)
            {
                break;
            }

        }

        System.out.println("Thankyou for using our service!");
        System.out.println("Your Inventory: "+Arrays.toString(inventory)+"\n");

    }
}
