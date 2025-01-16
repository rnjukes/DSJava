//Ryan Jukes
//1-16-24
//AT Java HW 23 A

import java.util.Scanner;

public class JukesHW23A {
    public static String QuizScores(Scanner in) {
        System.out.print("Enter score (1-100): ");
        String cScore = in.next().toLowerCase();

        if (cScore.equals("q")) {
            return cScore;
        } else {
            int cScore2 = Integer.parseInt(cScore);
            if ((cScore2<0 || cScore2>100 ))
            throw new ArithmeticException (cScore+" is an invalid value");
        }
        return cScore;
    }

    public static void main(String[] args) {
        System.out.println("Input scores here (q to quit)");
        while (true) {
            Scanner in = new Scanner(System.in);
            try {
                String qScore = QuizScores(in);
                    if (qScore.equals("q")) {
                  break; }
                System.out.println(qScore+" is a valid score");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } 
    } }
}
