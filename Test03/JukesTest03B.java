//Ryan Jukes
//1-21-25
//AT Java Test Practical Part A

import java.util.Scanner;

public class JukesTest03B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] scores = new double[20];
        int arrayLength = 0 ;
        double totalScore = 0;
        System.out.println("Enter quiz scores (q to quit): ");

        for (int x = 0; x < scores.length; x++) {
            if (in.hasNext("q") || in.hasNext("Q")) {
                in.next();
                break;
            } else if (in.hasNextDouble()) {
                scores[x] = in.nextDouble();
                totalScore += scores[x];
                arrayLength++;
            } else {
                System.out.println("Invalid");
                in.next();
            } }

        System.out.printf("\nQuiz scores: \n");
        for (int y = 0; y < arrayLength; y++) {
            System.out.println("Score of quiz "+(y+1)+" was: "+scores[y]);

            if (arrayLength > 0) {
            double avg = (totalScore / arrayLength);
            System.out.println("Average: "+avg);
        }
    }
    }
}
