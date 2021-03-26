import java.util.Arrays;
import java.util.Scanner;

public class ArraysNHeights
{

    public static void main(String[] args) {

        int numberofpeople;
        Scanner input = new Scanner(System.in);

        System.out.print("Insert number of people the data will be taken from: ");
        numberofpeople = Integer.parseInt(input.nextLine());

        int[] heights = new int[numberofpeople];

        System.out.println("Insert the heights of each person (in cm): ");
        for (int j = 0; j < numberofpeople; j++) {
            heights[j] = input.nextInt();
        }

        System.out.println("Number of people: " + numberofpeople);
        System.out.println("List of heights: " + Arrays.toString(heights));

        Arrays.sort(heights);
        System.out.println("Height of the shortest person: " + heights[0] + " cm");
        System.out.println("Height of the tallest person: " + heights[heights.length-1] + " cm");

        System.out.println("Average height: " + Arrays.stream(heights).average().orElse(Double.NaN) + " cm");
            }
        }


