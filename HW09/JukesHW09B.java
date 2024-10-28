//Ryan Jukes
//10-28-24
//Lesson 09 HW Part B

import java.util.Scanner; 

public class JukesHW09B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter phrase to be scanned: ");
        String bstring = in.nextLine();
        int ecount = 0;

        for (int numb = 0; numb < bstring.length(); numb++) {
            if (bstring.charAt(numb) == 'e') {
                ecount++; 
            }
        }
        System.out.println("The letter e occured "+ecount+" times in your phrase.");

    }
}