package arithmetic;
import java.util.Scanner;
import java.util.*;

public class CaesarCipher{
	
	static void toConvert(String stringInput, int option){
		
		//Char array
		//I use array because the length of the array is fixed
		StringBuilder output = new StringBuilder();
		char[] Plain = {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] Cipher = {'z',' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y'};
		
		switch(option) {
		case(1):
			for (int i = 0; i < ((String) stringInput).length(); i++) {
				for(int e = 0; e < Plain.length; e++) {
					if(stringInput.charAt(i)==(Plain[e])){
						output.append(Cipher[e]);
			
					}
				}
			}
		break;
		case(2):
			for (int i = 0; i < ((String) stringInput).length(); i++) {
				for(int e = 0; e < Plain.length; e++) {
					if(stringInput.charAt(i)==(Cipher[e])){
						output.append(Plain[e]);
			
					}
				}
			}
		break;
		}
		
		System.out.print(output);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Scanner sc2= new Scanner(System.in);
		System.out.print("Caesar  shift, is one  of  the  simplest  and  most widely known  encryption"
				+ " \ntechniques. It is a type of substitution cipher in  which each letter in the "
				+ "\nplaintext is replaced  by a letter some  fixed number of positions  down the "
				+ "\nalphabet.  For example, with  a left shift of 3, D would be replaced by A, E "
				+ "\nwould become B, and so on.\n \n");
		System.out.print("\n[1]Encrypt"
				+ "\n[2]Decrypt\n"
				+ "Reading option:");
		int option = sc.nextInt();
		System.out.print("Text input: ");
		String stringInput = sc2.nextLine();
		toConvert(stringInput, option);
		
	}

}
