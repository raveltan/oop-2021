import java.util.Scanner;

public class AlifsyahSeriesCalculator {
    public static void main (String[] args){
        
        boolean active = true;
        Scanner input = new Scanner(System.in);
        
        System.out.println("This is an arithmetic/geometric series calculator which can find the sum of n terms in an arithmetic/geometric series.");

        while (active) {
            double result = 0;
            double tempTerm = 0;

            System.out.print("What would you like to calculate?\n1. Arithmetic Series\n2. Geometric Series\n3. Exit the program\nEnter your choice: ");
            int userChoice = input.nextInt();
            switch (userChoice){
                case 1:
                    System.out.println("What is the first term of the series?");
                    double firstArithTerm = input.nextDouble();

                    System.out.println("How many terms are in your arithmetic series?");
                    int nArith = input.nextInt();

                    System.out.println("What is the difference in your arithmetic series?");
                    double difference = input.nextDouble();

                    for (int i = 0; i < nArith; i++){
                        if (i==0){
                            tempTerm = firstArithTerm;
                        } else {
                            tempTerm += difference;
                        }
                        result += tempTerm;
                    }
                    System.out.println("\nThe sum of " + nArith + " terms in your arithmetic series is " + result + ".\n");
                    break;
                case 2:
                    System.out.println("What is the first term of the series?");
                    double firstGeoTerm = input.nextDouble();

                    System.out.println("How many terms are in the geometric series?");
                    int nGeo = input.nextInt();

                    System.out.println("What is the ratio of your geometric series?");
                    double ratio = input.nextDouble();

            
                    for (int i = 0; i < nGeo; i++){
                        if (i == 0) {
                            tempTerm = firstGeoTerm;
                        } else {
                            tempTerm = tempTerm * ratio;
                        }
                        result += tempTerm;
                    }
                    System.out.println("\nThe sum of " + nGeo + " terms in your geometric series is " + result + ".\n");
                    break;  
                case 3:
                    System.out.println("Program has been successfully terminated.");
                    active = false;
                    input.close();
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }
    }
}
