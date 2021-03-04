package mainapp;
import java.util.Scanner;
import java.util.*;

public class converter {
	
	static void toConvert(String stringInput){
		
		//Character array
		char[] Cyrillic = {' ','а','б','в','г','д','е','ё','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я'};
		String[] Latin = {" ", "a","b","v","g","d","ye","yo","zh","z","i","y","k","l","m","n","o","p","r","s","t","u","f","kh","ts","ch","sh","ts",",","ie",",","e","yu","ya"};
		
		//Check user input
		boolean isLatin = ((String) stringInput).matches("\\w+?");
		boolean isCyrillic = ((String)stringInput).matches("\\p{IsCyrillic}+ ?");
		
		//Create the list for output
		StringBuilder output = new StringBuilder();
		
		if(isLatin && isCyrillic) {
			System.out.println("Please put one type of alphabet at a time");
		}
		else if(isLatin) {
			//Convert to cyrillic
			for (int i = 0; i < ((String) stringInput).length(); i++) {
				for(int e = 0; e < Latin.length; e++) {
					if(Character.toString(stringInput.charAt(i)).equals(Latin[e])){
						output.append(Cyrillic[e]);

					}
				}
			}
		}
		else if(isCyrillic) {
			//Convert to latin
			for (int i = 0; i < ((String) stringInput).length(); i++) {
				for(int e = 0; e < Cyrillic.length; e++) {
					System.out.println(stringInput.charAt(i) == (Cyrillic[e]));
					if(stringInput.charAt(i) == (Cyrillic[e])){
						output.append(Latin[e]);

					}
				}
			}
			
		}
		else{
			System.out.println("Program did not recognize the character");
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("[WARNING]: This translator will ignore some rules in \ncyrillic, some output can possibly will lost several\ncharactersand whitespace is not a valid input\n");
		System.out.print("Enter sentence that you want to convert: ");
		String stringInput= sc.nextLine();
		toConvert(stringInput);
		
	}

}
