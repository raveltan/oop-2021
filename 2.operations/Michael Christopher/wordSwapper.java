package com.company;

import java.util.Scanner;

public class WordSwapper {

    public static void main(String[] args) {
        System.out.println("Welcome to word swapper simulator!!!");
        System.out.println("First, please enter how many case(s) that you want...(less than or equal to 10)");
        while (0 < 1) {
            Scanner scanCases = new Scanner(System.in);

            System.out.print("How many cases: ");

            int inputCases = scanCases.nextInt();

            if (inputCases > 10) {
                System.out.println("Input number less than or equal to 10");
                continue;
            }
            else if (inputCases < 1) {
                System.out.println("enter number larger than 0");
                continue;
            }
            else {
                for (int i = 0; i < inputCases; i++) {
                    Scanner scanInput = new Scanner(System.in);
                    System.out.printf("Case %d (word less than 4 character will not be swapped, sentence also accepted): ", (i+1));

                    String cases = scanInput.nextLine();
                    String[] newSplit = cases.split(" ");
                    System.out.printf("case %d after swapped: ", (i+1));
                    for (int a = 0; a < newSplit.length; a++){
                        int wordLength = newSplit[a].length();
                        for (int x = 0; x < wordLength; x++){
                            if (wordLength==1){
                                System.out.print(newSplit[a].charAt(x));
                            }
                            else{
                                if (x<1){
                                    System.out.print(newSplit[a].charAt(x));
                                }
                                else if (0 < x && x < wordLength-1){
                                    System.out.print(newSplit[a].charAt(wordLength-1-x));
                                }
                                else{
                                    System.out.print(newSplit[a].charAt(x));
                                    System.out.print(" ");
                                }
                            }
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println("Finished!!");
            break;
        }
    }
}
