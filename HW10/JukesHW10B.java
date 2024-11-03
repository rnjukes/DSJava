//Ryan Jukes
//11-3-24
//Lesson 10 HW Part A

import java.util.Scanner;

public class JukesHW10B {

/*
Scanner in = new Scanner(System.in);
System.out.print("Enter number of cookies: ");
int num = in.nextInt();
double discount;
if (num > 6) {
discount = 0.05;
} else if (num > 12) {
discount = 0.10;
}
System.out.println("Discount = " + discount);  
*/

public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("Enter number of cookies: ");
int num = in.nextInt();
double discount = 0.0;
if (num > 12) {
discount = 0.10;
} else if (num > 6) {
discount = 0.05;
}
System.out.println("Discount = " + discount);  

//This code had both compile time and logic errors. Intially, double "discount" was never initialized, therefore creating a
//compile time error. Additionally, the most restrictive condition was not placed first in the if statement, and this had to 
//be further corrected to avoid a logic error in the final output.
}
}