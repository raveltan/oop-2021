import javax.naming.Name;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class arraylist_practice
{
    public static void main(String[] args)
    {
        System.out.println("We need people who are using Python!");
        Scanner input = new Scanner(System.in);
       System.out.println("Print out your name");
       String Name = input.nextLine();
       ArrayList<String> PL_database = new ArrayList<>();
       // I was using arraylist to automatically add the database with
        // the data inserted, while arrays  need a longer code through add the element.
        // This is because I made a program that checks whether this person can do python programming
        //language.
       System.out.println("How many programming languages can you do?");
       int number_of_PL = input.nextInt();
       // adding the programming languages to the arraylist
       for(int i = 0 ; i<= number_of_PL; i++)
        {
            System.out.println("Insert your programming language");
            String PL = input.nextLine();
            PL_database.add(PL);
        }
       //for traversing the arraylist to check whether the python language exists
        boolean is_python;
        for(int j = 0 ; j<= number_of_PL; j++)
         {
             if (PL_database.get(j).toLowerCase(Locale.ROOT) == "python")
             {
                 is_python = true;
             }
             else
             {
                 is_python= false;
             }
         }
        if (is_python= true)
        {
            System.out.println("This candidate can do Python!");
        }
        else
        {
            System.out.println("This candidate cannot do Python!");
        }
        System.out.println("Have a nice day!");

        //I initialise an array to store the available data from the arraylist.
        String[] database = new String[number_of_PL+1];
        database[0] = Name;
        for(int k = 1; k <= number_of_PL ; k++)
        {
            database[k] = PL_database.get(k);
        }

        System.out.println("Here is your data!");
        for (String l:database)
        {
            System.out.println(l);
        }

    }
}

