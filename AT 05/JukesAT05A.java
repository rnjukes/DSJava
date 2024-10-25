//Ryan Jukes
//10-23-24
//AT 05

import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
public class JukesAT05A {
    public static void main(String[] args) throws Exception  {
        Scanner in = new Scanner(System.in);

        //Part A
        Random randomNumb = new Random();

        for (int refNumb = 0; refNumb < 100; refNumb++) {
            int trueRandomNumb = randomNumb.nextInt(100);
            System.out.println(trueRandomNumb);
        }
        
    }
}