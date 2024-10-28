//Ryan Jukes
//10-28-24
//Lesson 09 HW Part A

import java.util.Scanner; 

public class JukesHW09A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double scoreInput;
        double scoreAmt = 0;
        int scoresGiven = 0;

        while (true) {
            System.out.println("Give each test score one at a time. When finished, -1.");
            System.out.print("Enter test score here: ");    
            scoreInput = in.nextDouble();
            if (scoreInput < 0) {
                break;
            }
            scoreAmt += scoreInput; 
                scoresGiven++;
            

            if (scoresGiven > 0) {
                double scoreAvg = scoreAmt/scoresGiven; 
                System.out.println("The average of your "+scoresGiven+" scores is "+scoreAvg); 
            }
        }
    }

}
