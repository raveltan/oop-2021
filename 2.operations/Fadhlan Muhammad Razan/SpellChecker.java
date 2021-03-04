import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class SpellChecker {
    public static void main(String args[])
    {

        // try-catch block to handle exceptions
        try {

            // specify a file name that is going to be processed
            File wordBank = new File("wordBank.txt");
            Scanner FileReader = new Scanner(wordBank);

            System.out.println("Welcome to the useless spelling checker program.\nThis program \'lol\' can detect whether you have any typo when you input a sentence to this program.\nPlease write a sentence to begin.\n");
            Scanner userText = new Scanner(System.in);

            String Input = userText.nextLine();
            String SplittedInput[] = Input.toLowerCase().split(" ");
            ArrayList<String> Typos = new ArrayList<>();

            for (int i = 0; i < SplittedInput.length; i++) {
                while (FileReader.hasNextLine()) {
                    String toBeChecked = SplittedInput[i];
                    String comparison = FileReader.nextLine().toLowerCase();
                    if (toBeChecked.equals(comparison)) {
                        FileReader = new Scanner(wordBank);
                        break;
                    } else if (!FileReader.hasNextLine()) {
                        Typos.add(toBeChecked);
                        FileReader = new Scanner(wordBank);
                        break;
                    }
                }
            }
            FileReader.close();
            if (Typos.isEmpty()) {
                System.out.println("\nThere are no typos in your sentence.");
            } else {
                System.out.println("\nYou didn't typed these words correctly.\n");
                for (String name:Typos) {
                    System.out.println(name);
                }
                System.out.println("\nIf there are some correct words that you know are correct but flagged as incorrect by this program\nBlame the guy who created the words database lol");
            }
        } catch (FileNotFoundException e) {
            System.out.println("This program is missing the file necessary to check the spelling.\nPlease check that you have all of the files necessary of running this program.");
        }
    }
}