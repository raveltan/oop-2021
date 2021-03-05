import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class SpellChecker {
    public static void main(String args[])
    {

        // try-catch statement to handle FileNotFoundExceptionError
        try {

            // specify the file name that is going to be processed
            File wordBank = new File("wordBank.txt");

            // Search the file in the directory that the java file is located. If there is none, It will result in FileNotFoundException error.
            Scanner FileReader = new Scanner(wordBank);

            System.out.println("Welcome to the useless spelling checker program.\nThis Program \"lol\" can detect whether you have any typo when you input a sentence to this program.\nPlease write a sentence to begin.\n");
            // create a scanner object called userText.
            Scanner userText = new Scanner(System.in);

            // reads a user given input and assign it to the variable input.
            String Input = userText.nextLine();

            // Make all the user given input to be put each word as an element in an array
            String SplittedInput[] = Input.toLowerCase().split(" ");

            // Initialize an array list so that detected typos could be easily appended to it.
            ArrayList<String> Typos = new ArrayList<>();

            // Algorithm for the spell checker. It will loop through all of the user given words and compare them one by one to the words database words.
            for (int i = 0; i < SplittedInput.length; i++) {
                // will read the word bank until it reached the end or stopped when it detects a word that exists in the database
                while (FileReader.hasNextLine()) {
                    // Put each of the words to be compared into a new variable
                    // User given word
                    String toBeChecked = SplittedInput[i];
                    // Words in the database (also in lowercase to avoid wrongly flagging a correct word.)
                    String comparison = FileReader.nextLine().toLowerCase();
                    // When it detects an existing word in the database, the loop will break and reset to reader to read from the first line.
                    if (toBeChecked.equals(comparison)) {
                        FileReader = new Scanner(wordBank);
                        break;
                    // When it reached the end of the line and that no word is equivalent to any in the words database, that word would be appended to the Typos array list and break the loop and then the reader will also be resetted.
                    } else if (!FileReader.hasNextLine()) {
                        Typos.add(toBeChecked);
                        FileReader = new Scanner(wordBank);
                        break;
                    }
                }
            }
            // Close the file after the spell checking is complete
            FileReader.close();

            // Tells the user information based on their result.
            if (Typos.isEmpty()) {
                System.out.println("\nThere are no typos in your sentence.");
            } else {
                System.out.println("\nYou didn't typed these words correctly.\n");
                for (String name:Typos) {
                    System.out.println(name);
                }
                System.out.println("\nIf there are some correct words that you know are correct but flagged as incorrect by this program\nBlame the guy who created the words database lol");
            }

        // A catch statement when the program throws out a FileNotFoundException error when the words database is not detected.
        } catch (FileNotFoundException e) {
            System.out.println("This program is missing the file necessary to check the spelling.\nPlease check that you have all of the files necessary of running this program.");
        }
    }
}