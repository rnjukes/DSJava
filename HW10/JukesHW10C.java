//Ryan Jukes
//11-3-24
//Lesson 10 HW Part A

import java.util.Scanner; 

public class JukesHW10C {
/*
 * The Cougar Baking Company is growing and has expanded their offerings.  Write a program that calculates and displays the total cost for cookies:
 * Cookies are $0.99 apiece.
 * If you purchase > 6 cookies, you get a 2.5% discount on your total order.
 * If you purchase > 12 cookies, you get a 5% discount on your total order.
 * If you purchase > 24 cookies you get a 15% discount on your total order
 * Write and test your program.  Submit your source file for grading using MSA or GitHub.
 * 
 * Test with 4 cookies.     Total should be $3.96
 * Test with 10 cookies.    Total should be $9.65
 * Test with 13 cookies.    Total should be $12.23
 * Test with 25 cookies.    Total should be $21.04
 * 
 * There are issues with this program.  
 * Some are compile-time issues that will
 * prevent the program from compiling.
 * Other issues are logic errors that will
 * produce the wrong results.
 * 
 * Use your debugging techniques and tools
 * to find and correct these issues.
 */

    public static void main(String[] args) throws Exception {
    
        final double COST_OF_COOKIE = 0.99;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of cookies: ");
        int num = in.nextInt();

        double cost = num * COST_OF_COOKIE;
        double discount = 0.0;
        if (num > 24) {
            discount = 0.15;
        } else if (num > 12) {
            discount = 0.05;
        } else if (num > 6) {
            discount = 0.025;
        }
        cost = cost * (1 - discount);
        System.out.printf("For %d cookies, your total cost is $%.2f", num, cost);
    }
}   
//The code had the compile time errors of the incomplete statement of int num = in.next which should have been int num = in.nextInt();
//Another compile time error was that double "discount" was not initialized. The final error was a logic error that misordered
//the discounts in the if statemnt that made any discount given 0.025.