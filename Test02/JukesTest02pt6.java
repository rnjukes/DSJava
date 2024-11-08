//Ryan Jukes
//Test 02 Part 6
//11-8-24
//AT Java

import  java.util.Scanner;
public class JukesTest02pt6 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter first number:  ");
    int numb1 = in.nextInt();

    System.out.print("Enter second number: ");
    int numb2 = in.nextInt();

    System.out.print("Enter third number:  ");
    int numb3 = in.nextInt();

    System.out.println("The numbers in decending order are: ");

    if (numb1 >= numb2 && numb1 >= numb3) {
        if (numb3 <= numb2) {
            System.out.print(numb1+", "+numb2+", "+numb3);
            System.out.println();
        } else {
            System.out.print(numb1+", "+numb3+", "+numb2);
            System.out.println();
        }
    } else if (numb2 >= numb1 && numb2 >= numb3) {
        if (numb3 <= numb1) {
            System.out.print(numb2+", "+numb1+", "+numb3);
            System.out.println();
        } else {
            System.out.print(numb2+", "+numb3+", "+numb1);
            System.out.println();
        }
    } else if (numb3 >= numb1 && numb3 >= numb2) {
        if (numb2 <= numb1) {
            System.out.print(numb3+", "+numb1+", "+numb2);
            System.out.println();
        } else {
            System.out.print(numb3+", "+numb2+", "+numb1);
            System.out.println();
        }
    } 
}
}
