//Ryan Jukes
//12-14-24
//HW 18 Part B
//AT Java

import java.util.Scanner;
import java.util.ArrayList;

public class JukesHW18B {
   public static void main(String[] args) {
    ArrayList<Double> scores = new ArrayList<>();
    Scanner in = new Scanner(System.in); 

    System.out.println("Enter tests (q to quit): ");
    for (String scoreinp = ""; !scoreinp.equalsIgnoreCase("q"); ) {
        System.out.print("Next: ");
        scoreinp = in.nextLine();
        if (scoreinp.equalsIgnoreCase("q")) {
            break;
        } else {
            scores.add(Double.parseDouble(scoreinp)); 
        }
    }

    System.out.printf("\nScores: ");
    System.out.println("");
    double allScores =  0;
    for (int x = 0; x < scores.size(); x++) {
        System.out.printf("%.2f%n" , scores.get(x));
        allScores += scores.get(x); 
    }

    if (scores.size() > 0) {
        double avg = allScores/scores.size();
        System.out.printf("\nAverage score: %.2f%n" , avg);
    } else {
        System.out.println("\nN/A");
    }

   }
}
