import java.util.Arrays;
import java.util.Scanner;

public class Arrayz
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Inventory");
        String inventory[]= {"Shovel","Gold","Axe","Carrot"};
        System.out.println("Your Inventory: "+Arrays.toString(inventory));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Which Item Do You Want To Take Out?: ");
        String a = scanner.next();

        if (a.equals("Shovel"))
        {
            inventory[0]=inventory[inventory.length-1];
            String[] newInv = new String[inventory.length-1];

            for(int i=0;i<newInv.length;i++)
            {
                newInv[i]=inventory[i];
            }
            System.out.print("Your Inventory: "+Arrays.toString(newInv));
        }
        else if(a.equals("Axe"))
        {
            inventory[2]=inventory[inventory.length-1];
            String[] newInv = new String[inventory.length-1];

            for(int i=0;i<newInv.length;i++)
            {
                newInv[i]=inventory[i];
            }
            System.out.print("Your Inventory: "+Arrays.toString(newInv));
        }
        else if(a.equals("Carrot"))
        {
            inventory[3]=inventory[inventory.length-1];
            String[] newInv = new String[inventory.length-1];

            for(int i=0;i<newInv.length;i++)
            {
                newInv[i]=inventory[i];
            }
            System.out.print("Your Inventory: "+Arrays.toString(newInv));
        }
        else if(a.equals("Gold"))
        {
            inventory[1]=inventory[inventory.length-1];
            String[] newInv = new String[inventory.length-1];

            for(int i=0;i<newInv.length;i++)
            {
                newInv[i]=inventory[i];
            }
            System.out.print("Your Inventory: "+Arrays.toString(newInv));
        }
    }
}
