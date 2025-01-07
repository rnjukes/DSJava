//Ryan Jukes
//1-6-25
//HW19 Part B

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class JukesHW19B {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("quizzes.txt");
        File outputFile = new File("quizzesMod.txt");
        PrintWriter out = new PrintWriter(outputFile);
        Scanner in = new Scanner(inputFile);

        double totalScores = 0;
        int quizAmt = 0;

        while (in.hasNextDouble()) {
            double currentscore = in.nextDouble();
            totalScores += currentscore;
            out.printf("Quiz %03d: %6.2f%n", quizAmt, currentscore);
            quizAmt++;
        }

        double avg = (totalScores / quizAmt);

        out.println("----------------");
        out.printf("Average:  %6.2f%n", avg);

        in.close();
        out.close();
    } }
