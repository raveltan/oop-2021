import java.util.Arrays;
import java.util.Scanner;

class AverageScore {
    public static void main(String[] args) {
        int size;
        float sum = 0;
        float average = 0;
        Scanner sc = new Scanner(System.in);

        // Number of subjects
        System.out.print("Number of subjects taken: ");
        size = Integer.parseInt(sc.nextLine());

        // Array is used because normally the number of subjects that student take per semester is fix
        String[] subject = new String[size];
        int[] score = new int[size];

        // Subjects
        System.out.println("Subject name: ");
        for (int i = 0; i < size; i++) {
            subject[i] = sc.nextLine();
        }

        // Scores
        System.out.println("Insert score based on the order of the subject");
        System.out.println("Score: ");
        for (int j = 0; j < size; j++) {
            score[j] = sc.nextInt();
        }

        // Average score
        for (int k = 0; k < score.length; k++) {
            sum += score[k];
            average = sum / score.length;
        }
        // Subject list
        System.out.println(Arrays.toString(subject));
        // Score list
        System.out.println(Arrays.toString(score));
        System.out.printf("Average of score: %.2f", average);

    }
}

