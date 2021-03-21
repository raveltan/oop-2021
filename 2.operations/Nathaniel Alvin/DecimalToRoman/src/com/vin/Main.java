package com.vin;

public class Main {

    public static void decimal2roman(int num) {

        int [] decimal = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String [] symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int i = 0;

        while(num != 0) {
            while(num/decimal[i] > 0){ // largest base value
                System.out.printf(symbol[i]); // roman symbol of the largest base value
                num -= decimal[i]; // subtract number with largest base value
            }
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println("250 --> ");
        decimal2roman(250);
        System.out.println('\n' + "1500 --> ");
        decimal2roman(1500);
    }
}
