//Ryan Jukes
//12-9-24
//HW Lesson 16 B

import java.util.Scanner;
import java.util.Arrays;

public class JukesHW16A {
    public static double[] dropScore(double[] scores, int listlength) {
    int minscore = 0;
   
    for (int i = 1; i < listlength; i++) {
        if (scores[i] < scores[minscore]) {
            minscore = i;
        } }
        double[] rlist = new double[listlength-1];
        int x = 0;
        for (int i = 0; i < listlength; i++) {
            if (i != minscore) {
                rlist[x++] = scores[i];
            } } 
            return rlist;
    } 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] lstscores = new double[20];
        int currentSize=0;
        System.out.println("Enter quiz scores (q to quit): ");

        for (int i = 0; i < lstscores.length; i++) {
            if (in.hasNext("q") || in.hasNext("Q")) {
                in.next();
                break;
            } else if (in.hasNextDouble()) {
                lstscores[i] = in.nextDouble();
                currentSize++;
            } else {
                System.out.println("Invalid");
                in.next();
            } }

        System.out.printf("\nQuiz scores: \n");
        for (int i = 0; i < currentSize; i++) {
            System.out.println("Score of quiz "+(i+1)+" was: "+lstscores[i]);
        }
        
        in.nextLine();
        System.out.println("Drop your lowest score? (y/n): ");
        String bolresp = in.nextLine();

        if (bolresp.equals("y")  ||  bolresp.equals("Y")) {
            double[] newScores = dropScore(lstscores, currentSize);
            System.out.printf("\nNew values: \n");
            for (int i = 0; i < newScores.length; i++) {
                System.out.println("Score of quiz "+(i+1)+" is "+newScores[i]);
            } 
        } else {
                System.out.println("N/A - No score dropped");
            }
    }
}
