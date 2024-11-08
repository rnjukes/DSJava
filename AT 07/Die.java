//Ryan Jukes
//11-6-24
//AT07 Part A

//Ryan Jukes
//10-28-24
//Lesson 09 HW Part D

import java.util.Scanner; 
import java.util.Random;

//Methods needed
// 1. roll() - Random int from 1 to 6
// 2. int dieValue() - TRacks the value of the most recent roll
// 3. showart() - prints the art of the die to the user in the terminal

public class Die {
public Die(){
    faceValue = 6;
}
private Random rand = new Random();

    private int faceValue;

    public void roll() {
        faceValue = rand.nextInt(6);
        System.out.printf("Die has been rolled!\n\n");
    }
    public int dieValue() {
        return faceValue;
    }
    public void showart() {
        if (faceValue == 1) {
            System.out.println("+-------+");
            System.out.println("|       |");
            System.out.println("|   0   |");
            System.out.println("|       |");
            System.out.printf("+-------+\n\n");

        } else if (faceValue == 2) {
            System.out.println("+-------+");
            System.out.println("| 0     |");
            System.out.println("|       |");
            System.out.println("|     0 |");
            System.out.printf("+-------+\n\n");
        } else if (faceValue == 3) {
            System.out.println("+-------+");
            System.out.println("| 0     |");
            System.out.println("|   0   |");
            System.out.println("|     0 |");
            System.out.printf("+-------+\n\n");
        } else if (faceValue == 4) {
            System.out.println("+-------+");
            System.out.println("| 0   0 |");
            System.out.println("|       |");
            System.out.println("| 0   0 |");
            System.out.printf("+-------+\n\n");
        } else if (faceValue == 5) {
            System.out.println("+-------+");
            System.out.println("| 0   0 |");
            System.out.println("|   0   |");
            System.out.println("| 0   0 |");
            System.out.printf("+-------+\n\n");
        } else if (faceValue == 6) {
            System.out.println("+-------+");
            System.out.println("| 0   0 |");
            System.out.println("| 0   0 |");
            System.out.println("| 0   0 |");
            System.out.printf("+-------+\n\n");
    }
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Die die = new Die(); 
        int numb = 1;

        while (numb == 1) {
            String sr = "r" ;
            String sd = "d" ;
            String sq = "q" ;

            System.out.print("Welcome to die roller! Enter r to roll the die, d to display the result, and q to quit. ");
            String userInputFull = in.nextLine();
            char userInput = userInputFull.charAt(0);
            char r = sr.charAt(0);
            char d = sd.charAt(0);
            char q = sq.charAt(0);

            if (userInput == r) {
                die.roll();
            } else if (userInput == d) {
                die.showart();
            } else if (userInput == q) {
                numb++;
            } else {
                System.out.printf("Try again with a valid command\n\n");
            }

        }


    } 
} 
