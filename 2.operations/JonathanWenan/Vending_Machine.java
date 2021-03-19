import java.util.Scanner;
class VM
{
    public void order(int number)
    {
        switch(number)
        {
            case 1:
                System.out.println("Please pay $5 \n");
                break;
            case 2 :
                System.out.println("Please pay $4.50 \n");
                break;
            case 3:
                System.out.println("Please pay $3 \n");
                break;
            case 4:
                System.out.println("Please pay $1.50\n");
                break;
            default:
                System.out.println("You pay nothing, because you ordered nothing");
                break;
        }
    }
}


public class Vending_Machine
{
    public static void main(String args[])
    {
        VM Drinks = new VM();
        Scanner VM_input = new Scanner(System.in);
        System.out.println("Welcome to the vending machine! Do you want to buy some drinks?");
        System.out.println("Menu") ;
        System.out.println("1.Coca cola($5)  2.Sprite($4.50)  3.Lemonade($3)  4. Mineral Water($1.50)");
        String Choice =  VM_input.nextLine();
        int Choice_Converted = Integer.parseInt(Choice);
        Drinks.order(Choice_Converted);
        System.out.println("Do you want to order something else? Answer 1(for yes)/0(for no)");
        String Last = VM_input.nextLine();
        int Last_Converted =  Integer.parseInt(Last);
        while(Last_Converted == 1)
        {
            Drinks.order(Choice_Converted);
            break;
        }
            System.out.println("Thank you for your service");
    }
}
