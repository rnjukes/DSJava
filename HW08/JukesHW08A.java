//Ryan Jukes
//10-23-24
//Java HW08A

import java.util.Scanner;

public class JukesHW08A {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    //Part A
    //Test condition for this code is to simply run it
    double pcValue = 100;
    int yearValue = 0;

    while (pcValue>=1){
        yearValue=(yearValue+30);
        pcValue=(pcValue/2);
    }
    System.out.println(yearValue+" years will elapse before "+pcValue+"% remains.");
}   
}