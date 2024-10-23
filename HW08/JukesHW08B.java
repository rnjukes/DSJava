//Ryan Jukes
//10-23-24
//Java HW08B

import java.util.Scanner;

public class JukesHW08B {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    //Part B
   System.out.printf("What is the interest rate (APR)? \n");
   Double apr = in.nextDouble();
   System.out.print("What is the balance in your account? \n");
   Double intBalance = in.nextDouble();
    
   Double realRate = apr/100;

   System.out.println("Year  |      Int Earned ($)      |           Balance ($)");
   System.out.println("----------------------------------------------------------------------");

   for (int year = 1; year <= 5; year++) {
    double earnedGain = intBalance*realRate;
    intBalance += earnedGain;
   

   System.out.printf("  %-2d  |   %20.2f   | %18.2f%n", year, earnedGain, intBalance);
   }
}   
}

    