package com.latihan.robot;
import java.util.*;
import java.util.Scanner;

public class Generator {
    public static void main(String[] args) {
        System.out.println("\n\n=== Password Generator ===");
        do {

            // writing the ascii in String class then converts it to char array cuz lazy lol
            String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String digit = "0123456789";
            String punctuations = "~`!@#$%^&*()-_=+;:'<,>.?/|[]{}";
            char[] alphabet_final = alphabet.toCharArray();
            char[] digit_final = digit.toCharArray();
            char[] punctuations_final = punctuations.toCharArray();

            int length, digit_length, punc_length, index = 0;
            Scanner input = new Scanner(System.in);
            System.out.print("\n\nPassword length (min 6, max 20, 0 to exit) = ");
            length = input.nextInt();

            char[] password = new char[length];
            double checker = (double)length*25/100;
            long checker_int = Math.round(checker);

            if (length >= 0 && length <= 20){
                if (length == 0){
                    System.out.println("Finished executing");
                    System.exit(0);
                } else if (length < 6){
                    System.out.println("Password length cannot be less than 6");
                } else {

                    // randomize digits
                    do {
                        System.out.print("Digit length (0 - " + checker_int + ") = ");
                        digit_length = input.nextInt();
                        if (digit_length > checker_int){
                            System.out.println("Digit population too many, should be less than " + checker_int);
                        } else if (digit_length == 0){break;}
                        else {
                            for (int j = 0; j < digit_length; j++){
                                int rdn = new Random().nextInt(digit_final.length);
                                password[index] = digit_final[rdn];
                                index++;
                            }
                        }
                    } while (digit_length > checker_int || digit_length < 0);

                    // randomize punctuations
                    do {
                        System.out.print("Punctuations length (0 - " + checker_int + ") = ");
                        punc_length = input.nextInt();
                        if (punc_length > checker_int){
                            System.out.println("Punctuation population too many, should be less than " + checker_int);
                        } else if (punc_length == 0){break;}
                        else {
                            for (int j = 0; j < punc_length; j++){
                                int rdn = new Random().nextInt(punctuations_final.length);
                                password[index] = punctuations_final[rdn];
                                index++;
                            }
                        }
                    } while (punc_length > checker_int || punc_length < 0);

                    // randomize alphabet
                    for (int j = 1; j <= length-(digit_length+punc_length); j++){
                        int rdn = new Random().nextInt(alphabet_final.length);
                        password[index] = alphabet_final[rdn];
                        index++;
                    }
                    char[] password_final = randomize(password, length);
                    System.out.print("Your password is = ");
                    for(Object value : password_final){
                        System.out.print(value);
                    }
                    System.out.println("\nDon't forget to save it somewhere save.");
                }
            } else {
                if (length < 6){
                    System.out.println("Password length cannot be less than 6");
                } else {
                    System.out.println("Password length cannot be greater than 20");
                }
            }
        } while (true);
    }

    public static char[] randomize(char[] password, int length){
        char[] password_final = new char[length];
        int index = 0;
        do{
           int rdn = new Random().nextInt(length);
           if (password[rdn] != '\u0000') {
               password_final[index] = password[rdn];
               password[rdn] = '\u0000';    // \u0000 is a NULL character, since there's no way to remove an element from an array
               index++;
           }
        } while (index < length);
        return password_final;
    }
}
