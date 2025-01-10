//Ryan Jukes
//1-8-25
//HW 20 Part A

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class JukesHW20B {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("characters.txt"); 
        Scanner in = new Scanner(inputFile);

        in.useDelimiter("");

        int digits = 0;
        int letters = 0;
        int x = 0;

        while (in.hasNext()) {
            char a = in.next().charAt(0);
            System.out.print(a);
            if (Character.isDigit(a)) {
                digits++;
            } else if (Character.isLetter(a)){
                letters++;
            }
            x++;
        }

        System.out.printf("Count = %d%nLetters = %d%nDigits = %d%n", x, letters, digits);

    } }
