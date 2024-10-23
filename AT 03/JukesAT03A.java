//Ryan Jukes
//10-22-24
//AT 03 Challenge Problems

import java.util.Scanner;
public class JukesAT03A {
    public static void main(String[] args) throws Exception  {
        Scanner in = new Scanner(System.in);
        //Part 1
        
        System.out.print("How much money do you have? $");
        Double priceBalance = in.nextDouble(); 
        
        int priceDollars = (int)(priceBalance-0);
        int priceCents = (int)((priceBalance-priceDollars)*100);

        System.out.println("You have "+priceDollars+" dollars and "+priceCents+" cents.");
    }
}